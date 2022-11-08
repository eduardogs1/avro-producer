/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.inditex.mecc.ecomloadbk.api.avro.v2;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Avro envelope that holds the price information of a product without season */
@org.apache.avro.specific.AvroGenerated
public class SeasonLessProductPriceChangeEnvelope extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9085147932936512349L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SeasonLessProductPriceChangeEnvelope\",\"namespace\":\"com.inditex.mecc.ecomloadbk.api.avro.v2\",\"doc\":\"Avro envelope that holds the price information of a product without season\",\"fields\":[{\"name\":\"metadata\",\"type\":{\"type\":\"record\",\"name\":\"Metadata\",\"namespace\":\"com.inditex.aqsw.pipe.v1\",\"doc\":\"Message context attributes\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Unique name of the entity contained in the payload. I.e. 'cart'\"},{\"name\":\"domain\",\"type\":\"string\",\"doc\":\"Functional domain of the entity contained in the payload. I.e. 'purchase'\"},{\"name\":\"version\",\"type\":\"string\",\"doc\":\"Version of the entity contained in the payload\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"doc\":\"Unique identifier of the the event\",\"default\":null},{\"name\":\"timestamp\",\"type\":\"string\",\"doc\":\"Timestamp of the occurrence of the business event\"},{\"name\":\"action\",\"type\":\"string\",\"doc\":\"Identifier of the action that generated the event. I.e. 'modified'\"},{\"name\":\"envelope\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Envelope\",\"doc\":\"Data relative to the message container used to envelop the event\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of the message container used. I.e. 'pipe-event'\"},{\"name\":\"version\",\"type\":\"string\",\"doc\":\"Specific container version\"}]}],\"doc\":\"Data relative to the message container used to envelop the event\",\"default\":null},{\"name\":\"classifiers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Classifier\",\"doc\":\"Defines the identity of a message using a set of keys extracted from the message payload\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of the classifier in order to make comparisons between events with the same classifier defined\"},{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Ordered values that define the final classifier value\"}]}}],\"doc\":\"Set of classifiers to define different identities related with the event\",\"default\":null},{\"name\":\"extensions\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Extensions\",\"namespace\":\"com.inditex.aqsw.pipe.v1.extensions\",\"doc\":\"Set of attributes for attaching common information to the event with analytic purposes\",\"fields\":[{\"name\":\"flows\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LifecycleExtension\",\"doc\":\"Information about the transition represented by the event in the life cycle of a process model or artifact\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Process model or artifact related to the event\"},{\"name\":\"domain\",\"type\":[\"null\",\"string\"],\"doc\":\"Domain of the process model or artifact related to the event\",\"default\":null},{\"name\":\"instance\",\"type\":[\"null\",\"string\"],\"doc\":\"Specific instance of the process model or artifact, if it's known\",\"default\":null},{\"name\":\"correlation\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Correlation identifiers between states of a flow. They will be defined for each functional case with the Data Architecture Analytics team.\",\"default\":null},{\"name\":\"transition\",\"type\":[\"null\",\"string\"],\"doc\":\"Lifecycle transition represented by the event\",\"default\":null},{\"name\":\"state\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the state reached within the process model or the artifact lifecycle that triggered the event\",\"default\":null}]}}],\"doc\":\"Information about process models or artifacts the event is related to\",\"default\":null},{\"name\":\"geo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GeoExtension\",\"doc\":\"Information about geographical points and shapes related with an event\",\"fields\":[{\"name\":\"point\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GeoPoint\",\"doc\":\"Information about geographical points in WGS84 reference system\",\"fields\":[{\"name\":\"lon\",\"type\":\"double\",\"doc\":\"Longitude of the geopoint\"},{\"name\":\"lat\",\"type\":\"double\",\"doc\":\"Latitude of the geopoint\"}]}],\"doc\":\"Geographical point related to the event in WGS84 reference system\",\"default\":null},{\"name\":\"features\",\"type\":[\"null\",\"string\"],\"doc\":\"Geographical features related to the event in GeoJSON format\",\"default\":null}]}],\"doc\":\"Information about location related to the event\",\"default\":null}]}],\"doc\":\"Data relative to the business context that the message belongs to\",\"default\":null},{\"name\":\"relationships\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Relationship\",\"doc\":\"Represents a relationship between the message and a specific business entity\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Unique name of the entity\"},{\"name\":\"domain\",\"type\":\"string\",\"doc\":\"Functional domain. I.e. 'ECommerce'\"},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"doc\":\"Version of the entity definition\",\"default\":null},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"RelationshipType\",\"symbols\":[\"createdBy\",\"causes\",\"dependsOn\",\"hasA\",\"partOf\",\"memberOf\"]},\"doc\":\"Specific type of the relationship between the event and the business entity\"},{\"name\":\"data\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Specific data of the related entity at the moment the event is triggered\",\"default\":null}]}}],\"doc\":\"Relationship between the message and different business entities\",\"default\":null},{\"name\":\"context\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Context data of the message that does not belong in the definition of the main entity\",\"default\":null}]},\"doc\":\"Avro's metadata information.\"},{\"name\":\"payload\",\"type\":[{\"type\":\"record\",\"name\":\"SeasonLessProductPriceType\",\"doc\":\"Class that holds availability changes in a base product component.\",\"fields\":[{\"name\":\"updated_at\",\"type\":\"long\",\"doc\":\"The strings ISO UTC of the update date\"},{\"name\":\"reference\",\"type\":{\"type\":\"record\",\"name\":\"ProductPriceReferenceType\",\"doc\":\"Class that holds the reference info\",\"fields\":[{\"name\":\"brand_id\",\"type\":\"int\",\"doc\":\"The master brand id\"},{\"name\":\"type\",\"type\":\"string\",\"doc\":\"The 1 digit product type\"},{\"name\":\"model\",\"type\":\"string\",\"doc\":\"The 4 digits model\"},{\"name\":\"quality\",\"type\":\"string\",\"doc\":\"The 3 digits quality\"},{\"name\":\"color\",\"type\":\"string\",\"doc\":\"The 3 digits color\"},{\"name\":\"size\",\"type\":\"string\",\"doc\":\"The 3 digits size\"},{\"name\":\"bar_code\",\"type\":\"string\",\"doc\":\"sku barcode without season\"}]},\"doc\":\"The reference details of the article\"},{\"name\":\"ecommerce_trade_pos_info\",\"type\":{\"type\":\"record\",\"name\":\"EcommerceTradePosInfoType\",\"doc\":\"Class that holds the current ecommerce trade info\",\"fields\":[{\"name\":\"tradeposcn_id\",\"type\":\"long\",\"doc\":\"Internal ecommerce trade id\"},{\"name\":\"member_id\",\"type\":\"long\",\"doc\":\"Internal member id\"},{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Internal ecommerce trade name\"}]},\"doc\":\"Ecommerce trade por info\"},{\"name\":\"country_iso\",\"type\":\"string\",\"doc\":\"The country ISO \"},{\"name\":\"online_store_id\",\"type\":\"int\",\"doc\":\"The online store id\"},{\"name\":\"online_store_Code\",\"type\":\"string\",\"doc\":\"Descripcion of the online store store\"},{\"name\":\"time_line_prices\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TimeLinePriceType\",\"doc\":\"Class that holds the twinned type\",\"fields\":[{\"name\":\"start_date\",\"type\":\"long\",\"doc\":\"The UTC for the price activation\"},{\"name\":\"end_date\",\"type\":\"long\",\"doc\":\"The  UTC for the price end date.\"},{\"name\":\"price_list\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"TimeLinePriceInfoType\",\"doc\":\"Class that holds the currencuy, price, and comparePrice type\",\"fields\":[{\"name\":\"price\",\"type\":\"long\",\"doc\":\"The price amount\"},{\"name\":\"compare_price\",\"type\":[\"null\",\"long\"],\"doc\":\"The amount of the compare price / previous price\",\"default\":null},{\"name\":\"currency_iso\",\"type\":\"string\",\"doc\":\"The currency iso\"},{\"name\":\"currency_exponent\",\"type\":\"int\",\"doc\":\"The currency iso\"}]}},\"doc\":\"List of currency and prices.\"},{\"name\":\"observation\",\"type\":{\"type\":\"record\",\"name\":\"ObservationType\",\"doc\":\"Class that holds observatios/descriptions about a price\",\"fields\":[{\"name\":\"description\",\"type\":\"string\",\"doc\":\"Description of the price info\"},{\"name\":\"kind\",\"type\":{\"type\":\"enum\",\"name\":\"KindTypeEnum\",\"symbols\":[\"REGULAR\",\"SALES\",\"EVENT\"]},\"doc\":\"Enum to catalog the price type\"},{\"name\":\"ecomload_promo_info\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EcomloadPromoInfoType\",\"doc\":\"Class that holds the reference info\",\"fields\":[{\"name\":\"ecomload_promo_name\",\"type\":\"st","ring\",\"doc\":\"The promo name created by EcomLoad\"}]}],\"doc\":\"Ecomload promos data description\",\"default\":null}]},\"doc\":\"The Object for storing the observation details\"}]}},\"doc\":\"List of prices by utc date\"}]}],\"doc\":\"Content of message\"}],\"subject\":\"meccano.productandcatalog.seasonlessproductprices.v6-value\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SeasonLessProductPriceChangeEnvelope> ENCODER =
      new BinaryMessageEncoder<SeasonLessProductPriceChangeEnvelope>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SeasonLessProductPriceChangeEnvelope> DECODER =
      new BinaryMessageDecoder<SeasonLessProductPriceChangeEnvelope>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SeasonLessProductPriceChangeEnvelope> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SeasonLessProductPriceChangeEnvelope> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SeasonLessProductPriceChangeEnvelope> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SeasonLessProductPriceChangeEnvelope>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SeasonLessProductPriceChangeEnvelope to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SeasonLessProductPriceChangeEnvelope from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SeasonLessProductPriceChangeEnvelope instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SeasonLessProductPriceChangeEnvelope fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Avro's metadata information. */
  @Deprecated public com.inditex.aqsw.pipe.v1.Metadata metadata;
  /** Content of message */
  @Deprecated public java.lang.Object payload;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SeasonLessProductPriceChangeEnvelope() {}

  /**
   * All-args constructor.
   * @param metadata Avro's metadata information.
   * @param payload Content of message
   */
  public SeasonLessProductPriceChangeEnvelope(com.inditex.aqsw.pipe.v1.Metadata metadata, java.lang.Object payload) {
    this.metadata = metadata;
    this.payload = payload;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return metadata;
    case 1: return payload;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: metadata = (com.inditex.aqsw.pipe.v1.Metadata)value$; break;
    case 1: payload = value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'metadata' field.
   * @return Avro's metadata information.
   */
  public com.inditex.aqsw.pipe.v1.Metadata getMetadata() {
    return metadata;
  }


  /**
   * Sets the value of the 'metadata' field.
   * Avro's metadata information.
   * @param value the value to set.
   */
  public void setMetadata(com.inditex.aqsw.pipe.v1.Metadata value) {
    this.metadata = value;
  }

  /**
   * Gets the value of the 'payload' field.
   * @return Content of message
   */
  public java.lang.Object getPayload() {
    return payload;
  }


  /**
   * Sets the value of the 'payload' field.
   * Content of message
   * @param value the value to set.
   */
  public void setPayload(java.lang.Object value) {
    this.payload = value;
  }

  /**
   * Creates a new SeasonLessProductPriceChangeEnvelope RecordBuilder.
   * @return A new SeasonLessProductPriceChangeEnvelope RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder newBuilder() {
    return new com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder();
  }

  /**
   * Creates a new SeasonLessProductPriceChangeEnvelope RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SeasonLessProductPriceChangeEnvelope RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder(other);
    }
  }

  /**
   * Creates a new SeasonLessProductPriceChangeEnvelope RecordBuilder by copying an existing SeasonLessProductPriceChangeEnvelope instance.
   * @param other The existing instance to copy.
   * @return A new SeasonLessProductPriceChangeEnvelope RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder(other);
    }
  }

  /**
   * RecordBuilder for SeasonLessProductPriceChangeEnvelope instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SeasonLessProductPriceChangeEnvelope>
    implements org.apache.avro.data.RecordBuilder<SeasonLessProductPriceChangeEnvelope> {

    /** Avro's metadata information. */
    private com.inditex.aqsw.pipe.v1.Metadata metadata;
    private com.inditex.aqsw.pipe.v1.Metadata.Builder metadataBuilder;
    /** Content of message */
    private java.lang.Object payload;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.metadata)) {
        this.metadata = data().deepCopy(fields()[0].schema(), other.metadata);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasMetadataBuilder()) {
        this.metadataBuilder = com.inditex.aqsw.pipe.v1.Metadata.newBuilder(other.getMetadataBuilder());
      }
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing SeasonLessProductPriceChangeEnvelope instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.metadata)) {
        this.metadata = data().deepCopy(fields()[0].schema(), other.metadata);
        fieldSetFlags()[0] = true;
      }
      this.metadataBuilder = null;
      if (isValidValue(fields()[1], other.payload)) {
        this.payload = data().deepCopy(fields()[1].schema(), other.payload);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'metadata' field.
      * Avro's metadata information.
      * @return The value.
      */
    public com.inditex.aqsw.pipe.v1.Metadata getMetadata() {
      return metadata;
    }


    /**
      * Sets the value of the 'metadata' field.
      * Avro's metadata information.
      * @param value The value of 'metadata'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder setMetadata(com.inditex.aqsw.pipe.v1.Metadata value) {
      validate(fields()[0], value);
      this.metadataBuilder = null;
      this.metadata = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'metadata' field has been set.
      * Avro's metadata information.
      * @return True if the 'metadata' field has been set, false otherwise.
      */
    public boolean hasMetadata() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'metadata' field and creates one if it doesn't exist yet.
     * Avro's metadata information.
     * @return This builder.
     */
    public com.inditex.aqsw.pipe.v1.Metadata.Builder getMetadataBuilder() {
      if (metadataBuilder == null) {
        if (hasMetadata()) {
          setMetadataBuilder(com.inditex.aqsw.pipe.v1.Metadata.newBuilder(metadata));
        } else {
          setMetadataBuilder(com.inditex.aqsw.pipe.v1.Metadata.newBuilder());
        }
      }
      return metadataBuilder;
    }

    /**
     * Sets the Builder instance for the 'metadata' field
     * Avro's metadata information.
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder setMetadataBuilder(com.inditex.aqsw.pipe.v1.Metadata.Builder value) {
      clearMetadata();
      metadataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'metadata' field has an active Builder instance
     * Avro's metadata information.
     * @return True if the 'metadata' field has an active Builder instance
     */
    public boolean hasMetadataBuilder() {
      return metadataBuilder != null;
    }

    /**
      * Clears the value of the 'metadata' field.
      * Avro's metadata information.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder clearMetadata() {
      metadata = null;
      metadataBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'payload' field.
      * Content of message
      * @return The value.
      */
    public java.lang.Object getPayload() {
      return payload;
    }


    /**
      * Sets the value of the 'payload' field.
      * Content of message
      * @param value The value of 'payload'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder setPayload(java.lang.Object value) {
      validate(fields()[1], value);
      this.payload = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'payload' field has been set.
      * Content of message
      * @return True if the 'payload' field has been set, false otherwise.
      */
    public boolean hasPayload() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'payload' field.
      * Content of message
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.SeasonLessProductPriceChangeEnvelope.Builder clearPayload() {
      payload = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SeasonLessProductPriceChangeEnvelope build() {
      try {
        SeasonLessProductPriceChangeEnvelope record = new SeasonLessProductPriceChangeEnvelope();
        if (metadataBuilder != null) {
          try {
            record.metadata = this.metadataBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("metadata"));
            throw e;
          }
        } else {
          record.metadata = fieldSetFlags()[0] ? this.metadata : (com.inditex.aqsw.pipe.v1.Metadata) defaultValue(fields()[0]);
        }
        record.payload = fieldSetFlags()[1] ? this.payload :  defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SeasonLessProductPriceChangeEnvelope>
    WRITER$ = (org.apache.avro.io.DatumWriter<SeasonLessProductPriceChangeEnvelope>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SeasonLessProductPriceChangeEnvelope>
    READER$ = (org.apache.avro.io.DatumReader<SeasonLessProductPriceChangeEnvelope>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









