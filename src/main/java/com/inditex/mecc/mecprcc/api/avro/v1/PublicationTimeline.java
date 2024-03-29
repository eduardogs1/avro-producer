/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.inditex.mecc.mecprcc.api.avro.v1;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Class that holds a publication timeline information for a Commercial Component that includes the store where it applies as well as the list of publication segments */
@org.apache.avro.specific.AvroGenerated
public class PublicationTimeline extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7788694251473356983L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PublicationTimeline\",\"namespace\":\"com.inditex.mecc.mecprcc.api.avro.v1\",\"doc\":\"Class that holds a publication timeline information for a Commercial Component that includes the store where it applies as well as the list of publication segments\",\"fields\":[{\"name\":\"store_id\",\"type\":\"long\",\"doc\":\"Store unique identifier\"},{\"name\":\"segments\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PublicationSegment\",\"doc\":\"Class that holds a publication segment with both the initial and final timestamps\",\"fields\":[{\"name\":\"start_date\",\"type\":\"long\",\"doc\":\"Commercial Component initial timestamp expressed in microseconds since when the Commercial Component is visible\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"end_date\",\"type\":[\"null\",\"long\"],\"doc\":\"Commercial Component ending timestamp expressed in microseconds until when the Commercial Component is visible\",\"logicalType\":\"timestamp-millis\"}]}}},{\"name\":\"blocked\",\"type\":\"boolean\",\"doc\":\"Whether the timeline is blocked or not\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PublicationTimeline> ENCODER =
      new BinaryMessageEncoder<PublicationTimeline>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PublicationTimeline> DECODER =
      new BinaryMessageDecoder<PublicationTimeline>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PublicationTimeline> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PublicationTimeline> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PublicationTimeline>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PublicationTimeline to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PublicationTimeline from a ByteBuffer. */
  public static PublicationTimeline fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Store unique identifier */
  @Deprecated public long store_id;
  @Deprecated public java.util.List<com.inditex.mecc.mecprcc.api.avro.v1.PublicationSegment> segments;
  /** Whether the timeline is blocked or not */
  @Deprecated public boolean blocked;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PublicationTimeline() {}

  /**
   * All-args constructor.
   * @param store_id Store unique identifier
   * @param segments The new value for segments
   * @param blocked Whether the timeline is blocked or not
   */
  public PublicationTimeline(java.lang.Long store_id, java.util.List<com.inditex.mecc.mecprcc.api.avro.v1.PublicationSegment> segments, java.lang.Boolean blocked) {
    this.store_id = store_id;
    this.segments = segments;
    this.blocked = blocked;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return store_id;
    case 1: return segments;
    case 2: return blocked;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: store_id = (java.lang.Long)value$; break;
    case 1: segments = (java.util.List<com.inditex.mecc.mecprcc.api.avro.v1.PublicationSegment>)value$; break;
    case 2: blocked = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'store_id' field.
   * @return Store unique identifier
   */
  public java.lang.Long getStoreId() {
    return store_id;
  }

  /**
   * Sets the value of the 'store_id' field.
   * Store unique identifier
   * @param value the value to set.
   */
  public void setStoreId(java.lang.Long value) {
    this.store_id = value;
  }

  /**
   * Gets the value of the 'segments' field.
   * @return The value of the 'segments' field.
   */
  public java.util.List<com.inditex.mecc.mecprcc.api.avro.v1.PublicationSegment> getSegments() {
    return segments;
  }

  /**
   * Sets the value of the 'segments' field.
   * @param value the value to set.
   */
  public void setSegments(java.util.List<com.inditex.mecc.mecprcc.api.avro.v1.PublicationSegment> value) {
    this.segments = value;
  }

  /**
   * Gets the value of the 'blocked' field.
   * @return Whether the timeline is blocked or not
   */
  public java.lang.Boolean getBlocked() {
    return blocked;
  }

  /**
   * Sets the value of the 'blocked' field.
   * Whether the timeline is blocked or not
   * @param value the value to set.
   */
  public void setBlocked(java.lang.Boolean value) {
    this.blocked = value;
  }

  /**
   * Creates a new PublicationTimeline RecordBuilder.
   * @return A new PublicationTimeline RecordBuilder
   */
  public static com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder newBuilder() {
    return new com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder();
  }

  /**
   * Creates a new PublicationTimeline RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PublicationTimeline RecordBuilder
   */
  public static com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder newBuilder(com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder other) {
    return new com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder(other);
  }

  /**
   * Creates a new PublicationTimeline RecordBuilder by copying an existing PublicationTimeline instance.
   * @param other The existing instance to copy.
   * @return A new PublicationTimeline RecordBuilder
   */
  public static com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder newBuilder(com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline other) {
    return new com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder(other);
  }

  /**
   * RecordBuilder for PublicationTimeline instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PublicationTimeline>
    implements org.apache.avro.data.RecordBuilder<PublicationTimeline> {

    /** Store unique identifier */
    private long store_id;
    private java.util.List<com.inditex.mecc.mecprcc.api.avro.v1.PublicationSegment> segments;
    /** Whether the timeline is blocked or not */
    private boolean blocked;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.store_id)) {
        this.store_id = data().deepCopy(fields()[0].schema(), other.store_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.segments)) {
        this.segments = data().deepCopy(fields()[1].schema(), other.segments);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.blocked)) {
        this.blocked = data().deepCopy(fields()[2].schema(), other.blocked);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PublicationTimeline instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.store_id)) {
        this.store_id = data().deepCopy(fields()[0].schema(), other.store_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.segments)) {
        this.segments = data().deepCopy(fields()[1].schema(), other.segments);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.blocked)) {
        this.blocked = data().deepCopy(fields()[2].schema(), other.blocked);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'store_id' field.
      * Store unique identifier
      * @return The value.
      */
    public java.lang.Long getStoreId() {
      return store_id;
    }

    /**
      * Sets the value of the 'store_id' field.
      * Store unique identifier
      * @param value The value of 'store_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder setStoreId(long value) {
      validate(fields()[0], value);
      this.store_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'store_id' field has been set.
      * Store unique identifier
      * @return True if the 'store_id' field has been set, false otherwise.
      */
    public boolean hasStoreId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'store_id' field.
      * Store unique identifier
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder clearStoreId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'segments' field.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprcc.api.avro.v1.PublicationSegment> getSegments() {
      return segments;
    }

    /**
      * Sets the value of the 'segments' field.
      * @param value The value of 'segments'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder setSegments(java.util.List<com.inditex.mecc.mecprcc.api.avro.v1.PublicationSegment> value) {
      validate(fields()[1], value);
      this.segments = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'segments' field has been set.
      * @return True if the 'segments' field has been set, false otherwise.
      */
    public boolean hasSegments() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'segments' field.
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder clearSegments() {
      segments = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'blocked' field.
      * Whether the timeline is blocked or not
      * @return The value.
      */
    public java.lang.Boolean getBlocked() {
      return blocked;
    }

    /**
      * Sets the value of the 'blocked' field.
      * Whether the timeline is blocked or not
      * @param value The value of 'blocked'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder setBlocked(boolean value) {
      validate(fields()[2], value);
      this.blocked = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'blocked' field has been set.
      * Whether the timeline is blocked or not
      * @return True if the 'blocked' field has been set, false otherwise.
      */
    public boolean hasBlocked() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'blocked' field.
      * Whether the timeline is blocked or not
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.PublicationTimeline.Builder clearBlocked() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PublicationTimeline build() {
      try {
        PublicationTimeline record = new PublicationTimeline();
        record.store_id = fieldSetFlags()[0] ? this.store_id : (java.lang.Long) defaultValue(fields()[0]);
        record.segments = fieldSetFlags()[1] ? this.segments : (java.util.List<com.inditex.mecc.mecprcc.api.avro.v1.PublicationSegment>) defaultValue(fields()[1]);
        record.blocked = fieldSetFlags()[2] ? this.blocked : (java.lang.Boolean) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PublicationTimeline>
    WRITER$ = (org.apache.avro.io.DatumWriter<PublicationTimeline>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PublicationTimeline>
    READER$ = (org.apache.avro.io.DatumReader<PublicationTimeline>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
