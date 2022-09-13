/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.inditex.mecc.mecprsku.api.avro.v2;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Class that holds the availability of a sku. */
@org.apache.avro.specific.AvroGenerated
public class AvailabilityInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3228349250560740946L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvailabilityInfo\",\"namespace\":\"com.inditex.mecc.mecprsku.api.avro.v2\",\"doc\":\"Class that holds the availability of a sku.\",\"fields\":[{\"name\":\"is_available\",\"type\":\"boolean\",\"doc\":\"Indicates if the sku is available to bid in the indicated store\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvailabilityInfo> ENCODER =
      new BinaryMessageEncoder<AvailabilityInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvailabilityInfo> DECODER =
      new BinaryMessageDecoder<AvailabilityInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AvailabilityInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AvailabilityInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvailabilityInfo>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AvailabilityInfo to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AvailabilityInfo from a ByteBuffer. */
  public static AvailabilityInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Indicates if the sku is available to bid in the indicated store */
  @Deprecated public boolean is_available;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvailabilityInfo() {}

  /**
   * All-args constructor.
   * @param is_available Indicates if the sku is available to bid in the indicated store
   */
  public AvailabilityInfo(java.lang.Boolean is_available) {
    this.is_available = is_available;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return is_available;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: is_available = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'is_available' field.
   * @return Indicates if the sku is available to bid in the indicated store
   */
  public java.lang.Boolean getIsAvailable() {
    return is_available;
  }

  /**
   * Sets the value of the 'is_available' field.
   * Indicates if the sku is available to bid in the indicated store
   * @param value the value to set.
   */
  public void setIsAvailable(java.lang.Boolean value) {
    this.is_available = value;
  }

  /**
   * Creates a new AvailabilityInfo RecordBuilder.
   * @return A new AvailabilityInfo RecordBuilder
   */
  public static com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder newBuilder() {
    return new com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder();
  }

  /**
   * Creates a new AvailabilityInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvailabilityInfo RecordBuilder
   */
  public static com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder newBuilder(com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder other) {
    return new com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder(other);
  }

  /**
   * Creates a new AvailabilityInfo RecordBuilder by copying an existing AvailabilityInfo instance.
   * @param other The existing instance to copy.
   * @return A new AvailabilityInfo RecordBuilder
   */
  public static com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder newBuilder(com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo other) {
    return new com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder(other);
  }

  /**
   * RecordBuilder for AvailabilityInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvailabilityInfo>
    implements org.apache.avro.data.RecordBuilder<AvailabilityInfo> {

    /** Indicates if the sku is available to bid in the indicated store */
    private boolean is_available;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.is_available)) {
        this.is_available = data().deepCopy(fields()[0].schema(), other.is_available);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvailabilityInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.is_available)) {
        this.is_available = data().deepCopy(fields()[0].schema(), other.is_available);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'is_available' field.
      * Indicates if the sku is available to bid in the indicated store
      * @return The value.
      */
    public java.lang.Boolean getIsAvailable() {
      return is_available;
    }

    /**
      * Sets the value of the 'is_available' field.
      * Indicates if the sku is available to bid in the indicated store
      * @param value The value of 'is_available'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder setIsAvailable(boolean value) {
      validate(fields()[0], value);
      this.is_available = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'is_available' field has been set.
      * Indicates if the sku is available to bid in the indicated store
      * @return True if the 'is_available' field has been set, false otherwise.
      */
    public boolean hasIsAvailable() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'is_available' field.
      * Indicates if the sku is available to bid in the indicated store
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.AvailabilityInfo.Builder clearIsAvailable() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvailabilityInfo build() {
      try {
        AvailabilityInfo record = new AvailabilityInfo();
        record.is_available = fieldSetFlags()[0] ? this.is_available : (java.lang.Boolean) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvailabilityInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvailabilityInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvailabilityInfo>
    READER$ = (org.apache.avro.io.DatumReader<AvailabilityInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
