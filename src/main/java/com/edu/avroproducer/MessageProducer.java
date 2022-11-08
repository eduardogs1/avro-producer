package com.edu.avroproducer;

import java.util.Collections;

import com.inditex.aqsw.framework.common.stream.schema.SchemaStore;
import com.inditex.aqsw.pipe.v1.Metadata;
import com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope;
import com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceType;
import com.inditex.mecc.mecpcoco.api.avro.v1.ProductAction;
import com.inditex.mecc.mecpcoco.api.avro.v1.ProductChanged;
import com.inditex.mecc.mecpcoco.api.avro.v1.ProductCommandEnvelope;
import com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentDeleted;
import com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType;
import com.inditex.mecc.mecprwat.api.avro.v2.Environment;
import com.inditex.mecc.mecprwat.api.avro.v2.ProductChangesEnvelope;
import com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated;
import com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope;

import com.edu.avroproducer.utils.TestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

  private static final String METADATA = "/json/prices/ecomload_metadata.json";
  private static final String UPSERT_SKU_PRICES = "/json/prices/upsert_sku_prices_request_ok.json";

  @Autowired
  @Qualifier("watcher")
  private MessageChannel productWatcherKafkaChannel;

  @Autowired
  @Qualifier("command")
  private MessageChannel commandKafkaOutput;

  @Autowired
  @Qualifier("subscriptions")
  private MessageChannel subscriptionsKafkaChannel;

  @Autowired
  @Qualifier("prices")
  private MessageChannel pricesKafkaChannel;

  @Autowired
  SchemaStore schemaStore;

  public void sendPrices() {
    SeasonLessProductPriceChangeEnvelope payload = getPricesEnvelope(UPSERT_SKU_PRICES);

    Message<SeasonLessProductPriceChangeEnvelope> message = MessageBuilder
        .withPayload(payload).setHeader("contentType", "application/*+avro").setHeader("deliveryAttempt", 0)
        .build();

    pricesKafkaChannel.send(message);
  }

  private SeasonLessProductPriceChangeEnvelope getPricesEnvelope(final String payloadFile) {
    return SeasonLessProductPriceChangeEnvelope.newBuilder()
        .setMetadata(TestUtil.jsonDecodeToAvro(METADATA, Metadata.class, Metadata.getClassSchema()))
        .setPayload(TestUtil.jsonDecodeToAvro(payloadFile, SeasonLessProductPriceType.class,
            SeasonLessProductPriceType.getClassSchema()))
        .build();
  }

  public void sendWatcher() {
    Metadata metadata = Metadata.newBuilder().setClassifiers(Collections.EMPTY_LIST).setName("ecomload").setVersion("e").setDomain("ALL")
        .setTimestamp("1646036522").setAction("action")
        .build();
    CommercialComponentDeleted delete = CommercialComponentDeleted.newBuilder().setCommercialComponentId(11)
        .setCommercialComponentType(CommercialComponentType.BUNDLE_COMPONENT).setDeletedAt(1646036522L).setEnvironment(Environment.LIVE)
        .build();

    ProductChangesEnvelope payload = ProductChangesEnvelope.newBuilder().setMetadata(metadata).setPayload(delete).build();
    Message<ProductChangesEnvelope> message = MessageBuilder
        .withPayload(payload).setHeader("contentType", "application/*+avro").setHeader("deliveryAttempt", 0)
        .build();
    productWatcherKafkaChannel.send(message);
  }

  public void sendCommand() {
    Metadata metadata = Metadata.newBuilder().setClassifiers(Collections.EMPTY_LIST).setName("ecomload").setVersion("e").setDomain("ALL")
        .setTimestamp("1646036522").setAction("action")
        .build();
    ProductChanged productChanged =
        ProductChanged.newBuilder().setActionAt(1646036522L).setAction(ProductAction.CREATED).setProductId(1L).build();
    ProductCommandEnvelope payload = ProductCommandEnvelope.newBuilder().setMetadata(metadata).setPayload(productChanged).build();
    Message<ProductCommandEnvelope> message = MessageBuilder
        .withPayload(payload).setHeader("contentType", "application/*+avro").setHeader("deliveryAttempt", 0)
        .build();
    commandKafkaOutput.send(message);
  }

  public void sendSubscription() {
    Metadata metadata = Metadata.newBuilder().setClassifiers(null).setName("ComingSoonAvailability")
        .setVersion("v1").setDomain("mecpsept").setTimestamp("2022-05-05T10:32:21.292502Z").setAction("Coming Soon availability updated")
        .build();
    ComingSoonAvailabilityUpdated comingSoonAvailabilityUpdated = ComingSoonAvailabilityUpdated.newBuilder().setAvailable(true)
        .setStoreId(-1).setBrandId(-1).setProductItemReference("").setUpdatedAt(1651746741292L).build();
    ComingSoonAvailabilityUpdatedEnvelope payload =
        ComingSoonAvailabilityUpdatedEnvelope.newBuilder().setMetadata(metadata).setPayload(comingSoonAvailabilityUpdated).build();

    Message<ComingSoonAvailabilityUpdatedEnvelope> message = MessageBuilder
        .withPayload(payload).setHeader("contentType", "application/*+avro").setHeader("deliveryAttempt", 0)
        .build();

    subscriptionsKafkaChannel.send(message);
  }
}
