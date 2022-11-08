package com.edu.avroproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface PipeStreamChannels {

  String PRODUCT_KAFKA_OUTPUT = "product-watcher-kafka-output";

  @Output(PRODUCT_KAFKA_OUTPUT)
  SubscribableChannel productKafkaOutput();

  String COMMAND_KAFKA_OUTPUT = "command-kafka-output";

  @Output(COMMAND_KAFKA_OUTPUT)
  SubscribableChannel commandKafkaOutput();

  String SUBSCRIPTIONS_KAFKA_OUTPUT = "subscriptions-kafka-output";

  @Output(SUBSCRIPTIONS_KAFKA_OUTPUT)
  SubscribableChannel subscriptionsKafkaOutput();

  String PRICES_KAFKA_OUTPUT = "prices-kafka-output";

  @Output(PRICES_KAFKA_OUTPUT)
  SubscribableChannel pricesKafkaOutput();

}
