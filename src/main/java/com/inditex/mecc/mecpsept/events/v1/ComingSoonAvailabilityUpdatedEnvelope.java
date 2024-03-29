/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.inditex.mecc.mecpsept.events.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ComingSoonAvailabilityUpdatedEnvelope extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1261656983674232091L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ComingSoonAvailabilityUpdatedEnvelope\",\"namespace\":\"com.inditex.mecc.mecpsept.events.v1\",\"fields\":[{\"name\":\"metadata\",\"type\":{\"type\":\"record\",\"name\":\"Metadata\",\"namespace\":\"com.inditex.aqsw.pipe.v1\",\"doc\":\"Message context attributes\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Unique name of the entity contained in the payload. I.e. 'cart'\"},{\"name\":\"domain\",\"type\":\"string\",\"doc\":\"Functional domain of the entity contained in the payload. I.e. 'purchase'\"},{\"name\":\"version\",\"type\":\"string\",\"doc\":\"Version of the entity contained in the payload\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"doc\":\"Unique identifier of the the event\",\"default\":null},{\"name\":\"timestamp\",\"type\":\"string\",\"doc\":\"Timestamp of the occurrence of the business event\"},{\"name\":\"action\",\"type\":\"string\",\"doc\":\"Identifier of the action that generated the event. I.e. 'modified'\"},{\"name\":\"envelope\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Envelope\",\"doc\":\"Data relative to the message container used to envelop the event\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of the message container used. I.e. 'pipe-event'\"},{\"name\":\"version\",\"type\":\"string\",\"doc\":\"Specific container version\"}]}],\"doc\":\"Data relative to the message container used to envelop the event\",\"default\":null},{\"name\":\"classifiers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Classifier\",\"doc\":\"Defines the identity of a message using a set of keys extracted from the message payload\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of the classifier in order to make comparisons between events with the same classifier defined\"},{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Ordered values that define the final classifier value\"}]}}],\"doc\":\"Set of classifiers to define different identities related with the event\",\"default\":null},{\"name\":\"extensions\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Extensions\",\"namespace\":\"com.inditex.aqsw.pipe.v1.extensions\",\"doc\":\"Set of attributes for attaching common information to the event with analytic purposes\",\"fields\":[{\"name\":\"flows\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"LifecycleExtension\",\"doc\":\"Information about the transition represented by the event in the life cycle of a process model or artifact\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Process model or artifact related to the event\"},{\"name\":\"domain\",\"type\":[\"null\",\"string\"],\"doc\":\"Domain of the process model or artifact related to the event\",\"default\":null},{\"name\":\"instance\",\"type\":[\"null\",\"string\"],\"doc\":\"Specific instance of the process model or artifact, if it's known\",\"default\":null},{\"name\":\"correlation\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Correlation identifiers between states of a flow. They will be defined for each functional case with the Data Architecture Analytics team.\",\"default\":null},{\"name\":\"transition\",\"type\":[\"null\",\"string\"],\"doc\":\"Lifecycle transition represented by the event\",\"default\":null},{\"name\":\"state\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the state reached within the process model or the artifact lifecycle that triggered the event\",\"default\":null}]}}],\"doc\":\"Information about process models or artifacts the event is related to\",\"default\":null},{\"name\":\"geo\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GeoExtension\",\"doc\":\"Information about geographical points and shapes related with an event\",\"fields\":[{\"name\":\"point\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"GeoPoint\",\"doc\":\"Information about geographical points in WGS84 reference system\",\"fields\":[{\"name\":\"lon\",\"type\":\"double\",\"doc\":\"Longitude of the geopoint\"},{\"name\":\"lat\",\"type\":\"double\",\"doc\":\"Latitude of the geopoint\"}]}],\"doc\":\"Geographical point related to the event in WGS84 reference system\",\"default\":null},{\"name\":\"features\",\"type\":[\"null\",\"string\"],\"doc\":\"Geographical features related to the event in GeoJSON format\",\"default\":null}]}],\"doc\":\"Information about location related to the event\",\"default\":null}]}],\"doc\":\"Data relative to the business context that the message belongs to\",\"default\":null},{\"name\":\"relationships\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Relationship\",\"doc\":\"Represents a relationship between the message and a specific business entity\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Unique name of the entity\"},{\"name\":\"domain\",\"type\":\"string\",\"doc\":\"Functional domain. I.e. 'ECommerce'\"},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"doc\":\"Version of the entity definition\",\"default\":null},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"RelationshipType\",\"symbols\":[\"createdBy\",\"causes\",\"dependsOn\",\"hasA\",\"partOf\",\"memberOf\"]},\"doc\":\"Specific type of the relationship between the event and the business entity\"},{\"name\":\"data\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Specific data of the related entity at the moment the event is triggered\",\"default\":null}]}}],\"doc\":\"Relationship between the message and different business entities\",\"default\":null},{\"name\":\"context\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Context data of the message that does not belong in the definition of the main entity\",\"default\":null}]},\"doc\":\"Metadata object provided by Inditex to include on envelopes\"},{\"name\":\"payload\",\"type\":{\"type\":\"record\",\"name\":\"ComingSoonAvailabilityUpdated\",\"fields\":[{\"name\":\"storeId\",\"type\":\"int\",\"doc\":\"The identifier of the store\"},{\"name\":\"brandId\",\"type\":\"int\",\"doc\":\"The identifier of the brand\"},{\"name\":\"productItemReference\",\"type\":\"string\",\"doc\":\" Product item reference without season\"},{\"name\":\"updatedAt\",\"type\":\"long\",\"doc\":\" Modification date \",\"logicalType\":\"timestamp-millis\"},{\"name\":\"available\",\"type\":\"boolean\",\"doc\":\"Whether or not a sku has coming soon availability\"}]},\"doc\":\"Event triggered by Coming soon availability changes\"}],\"subject\":\"meccano.mecpsept.coming-soon-availability-updated.v1-value\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ComingSoonAvailabilityUpdatedEnvelope> ENCODER =
      new BinaryMessageEncoder<ComingSoonAvailabilityUpdatedEnvelope>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ComingSoonAvailabilityUpdatedEnvelope> DECODER =
      new BinaryMessageDecoder<ComingSoonAvailabilityUpdatedEnvelope>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ComingSoonAvailabilityUpdatedEnvelope> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ComingSoonAvailabilityUpdatedEnvelope> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ComingSoonAvailabilityUpdatedEnvelope> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ComingSoonAvailabilityUpdatedEnvelope>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ComingSoonAvailabilityUpdatedEnvelope to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ComingSoonAvailabilityUpdatedEnvelope from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ComingSoonAvailabilityUpdatedEnvelope instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ComingSoonAvailabilityUpdatedEnvelope fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Metadata object provided by Inditex to include on envelopes */
  @Deprecated public com.inditex.aqsw.pipe.v1.Metadata metadata;
  /** Event triggered by Coming soon availability changes */
  @Deprecated public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated payload;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ComingSoonAvailabilityUpdatedEnvelope() {}

  /**
   * All-args constructor.
   * @param metadata Metadata object provided by Inditex to include on envelopes
   * @param payload Event triggered by Coming soon availability changes
   */
  public ComingSoonAvailabilityUpdatedEnvelope(com.inditex.aqsw.pipe.v1.Metadata metadata, com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated payload) {
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
    case 1: payload = (com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'metadata' field.
   * @return Metadata object provided by Inditex to include on envelopes
   */
  public com.inditex.aqsw.pipe.v1.Metadata getMetadata() {
    return metadata;
  }


  /**
   * Sets the value of the 'metadata' field.
   * Metadata object provided by Inditex to include on envelopes
   * @param value the value to set.
   */
  public void setMetadata(com.inditex.aqsw.pipe.v1.Metadata value) {
    this.metadata = value;
  }

  /**
   * Gets the value of the 'payload' field.
   * @return Event triggered by Coming soon availability changes
   */
  public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated getPayload() {
    return payload;
  }


  /**
   * Sets the value of the 'payload' field.
   * Event triggered by Coming soon availability changes
   * @param value the value to set.
   */
  public void setPayload(com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated value) {
    this.payload = value;
  }

  /**
   * Creates a new ComingSoonAvailabilityUpdatedEnvelope RecordBuilder.
   * @return A new ComingSoonAvailabilityUpdatedEnvelope RecordBuilder
   */
  public static com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder newBuilder() {
    return new com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder();
  }

  /**
   * Creates a new ComingSoonAvailabilityUpdatedEnvelope RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ComingSoonAvailabilityUpdatedEnvelope RecordBuilder
   */
  public static com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder newBuilder(com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder();
    } else {
      return new com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder(other);
    }
  }

  /**
   * Creates a new ComingSoonAvailabilityUpdatedEnvelope RecordBuilder by copying an existing ComingSoonAvailabilityUpdatedEnvelope instance.
   * @param other The existing instance to copy.
   * @return A new ComingSoonAvailabilityUpdatedEnvelope RecordBuilder
   */
  public static com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder newBuilder(com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope other) {
    if (other == null) {
      return new com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder();
    } else {
      return new com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder(other);
    }
  }

  /**
   * RecordBuilder for ComingSoonAvailabilityUpdatedEnvelope instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ComingSoonAvailabilityUpdatedEnvelope>
    implements org.apache.avro.data.RecordBuilder<ComingSoonAvailabilityUpdatedEnvelope> {

    /** Metadata object provided by Inditex to include on envelopes */
    private com.inditex.aqsw.pipe.v1.Metadata metadata;
    private com.inditex.aqsw.pipe.v1.Metadata.Builder metadataBuilder;
    /** Event triggered by Coming soon availability changes */
    private com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated payload;
    private com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated.Builder payloadBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder other) {
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
      if (other.hasPayloadBuilder()) {
        this.payloadBuilder = com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated.newBuilder(other.getPayloadBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing ComingSoonAvailabilityUpdatedEnvelope instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope other) {
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
      this.payloadBuilder = null;
    }

    /**
      * Gets the value of the 'metadata' field.
      * Metadata object provided by Inditex to include on envelopes
      * @return The value.
      */
    public com.inditex.aqsw.pipe.v1.Metadata getMetadata() {
      return metadata;
    }


    /**
      * Sets the value of the 'metadata' field.
      * Metadata object provided by Inditex to include on envelopes
      * @param value The value of 'metadata'.
      * @return This builder.
      */
    public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder setMetadata(com.inditex.aqsw.pipe.v1.Metadata value) {
      validate(fields()[0], value);
      this.metadataBuilder = null;
      this.metadata = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'metadata' field has been set.
      * Metadata object provided by Inditex to include on envelopes
      * @return True if the 'metadata' field has been set, false otherwise.
      */
    public boolean hasMetadata() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'metadata' field and creates one if it doesn't exist yet.
     * Metadata object provided by Inditex to include on envelopes
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
     * Metadata object provided by Inditex to include on envelopes
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder setMetadataBuilder(com.inditex.aqsw.pipe.v1.Metadata.Builder value) {
      clearMetadata();
      metadataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'metadata' field has an active Builder instance
     * Metadata object provided by Inditex to include on envelopes
     * @return True if the 'metadata' field has an active Builder instance
     */
    public boolean hasMetadataBuilder() {
      return metadataBuilder != null;
    }

    /**
      * Clears the value of the 'metadata' field.
      * Metadata object provided by Inditex to include on envelopes
      * @return This builder.
      */
    public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder clearMetadata() {
      metadata = null;
      metadataBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'payload' field.
      * Event triggered by Coming soon availability changes
      * @return The value.
      */
    public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated getPayload() {
      return payload;
    }


    /**
      * Sets the value of the 'payload' field.
      * Event triggered by Coming soon availability changes
      * @param value The value of 'payload'.
      * @return This builder.
      */
    public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder setPayload(com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated value) {
      validate(fields()[1], value);
      this.payloadBuilder = null;
      this.payload = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'payload' field has been set.
      * Event triggered by Coming soon availability changes
      * @return True if the 'payload' field has been set, false otherwise.
      */
    public boolean hasPayload() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'payload' field and creates one if it doesn't exist yet.
     * Event triggered by Coming soon availability changes
     * @return This builder.
     */
    public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated.Builder getPayloadBuilder() {
      if (payloadBuilder == null) {
        if (hasPayload()) {
          setPayloadBuilder(com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated.newBuilder(payload));
        } else {
          setPayloadBuilder(com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated.newBuilder());
        }
      }
      return payloadBuilder;
    }

    /**
     * Sets the Builder instance for the 'payload' field
     * Event triggered by Coming soon availability changes
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder setPayloadBuilder(com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated.Builder value) {
      clearPayload();
      payloadBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'payload' field has an active Builder instance
     * Event triggered by Coming soon availability changes
     * @return True if the 'payload' field has an active Builder instance
     */
    public boolean hasPayloadBuilder() {
      return payloadBuilder != null;
    }

    /**
      * Clears the value of the 'payload' field.
      * Event triggered by Coming soon availability changes
      * @return This builder.
      */
    public com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdatedEnvelope.Builder clearPayload() {
      payload = null;
      payloadBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ComingSoonAvailabilityUpdatedEnvelope build() {
      try {
        ComingSoonAvailabilityUpdatedEnvelope record = new ComingSoonAvailabilityUpdatedEnvelope();
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
        if (payloadBuilder != null) {
          try {
            record.payload = this.payloadBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("payload"));
            throw e;
          }
        } else {
          record.payload = fieldSetFlags()[1] ? this.payload : (com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ComingSoonAvailabilityUpdatedEnvelope>
    WRITER$ = (org.apache.avro.io.DatumWriter<ComingSoonAvailabilityUpdatedEnvelope>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ComingSoonAvailabilityUpdatedEnvelope>
    READER$ = (org.apache.avro.io.DatumReader<ComingSoonAvailabilityUpdatedEnvelope>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.metadata.customEncode(out);

    this.payload.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.metadata == null) {
        this.metadata = new com.inditex.aqsw.pipe.v1.Metadata();
      }
      this.metadata.customDecode(in);

      if (this.payload == null) {
        this.payload = new com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated();
      }
      this.payload.customDecode(in);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.metadata == null) {
            this.metadata = new com.inditex.aqsw.pipe.v1.Metadata();
          }
          this.metadata.customDecode(in);
          break;

        case 1:
          if (this.payload == null) {
            this.payload = new com.inditex.mecc.mecpsept.events.v1.ComingSoonAvailabilityUpdated();
          }
          this.payload.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










