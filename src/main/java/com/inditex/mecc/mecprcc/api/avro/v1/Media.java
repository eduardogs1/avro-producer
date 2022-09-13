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
/** Class that holds a information about a Media */
@org.apache.avro.specific.AvroGenerated
public class Media extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2261020398876325846L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Media\",\"namespace\":\"com.inditex.mecc.mecprcc.api.avro.v1\",\"doc\":\"Class that holds a information about a Media\",\"fields\":[{\"name\":\"data\",\"type\":\"string\",\"doc\":\"JSON with Media's data in String format\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Media> ENCODER =
      new BinaryMessageEncoder<Media>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Media> DECODER =
      new BinaryMessageDecoder<Media>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Media> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Media> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Media>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Media to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Media from a ByteBuffer. */
  public static Media fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** JSON with Media's data in String format */
  @Deprecated public java.lang.CharSequence data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Media() {}

  /**
   * All-args constructor.
   * @param data JSON with Media's data in String format
   */
  public Media(java.lang.CharSequence data) {
    this.data = data;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return data;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: data = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'data' field.
   * @return JSON with Media's data in String format
   */
  public java.lang.CharSequence getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * JSON with Media's data in String format
   * @param value the value to set.
   */
  public void setData(java.lang.CharSequence value) {
    this.data = value;
  }

  /**
   * Creates a new Media RecordBuilder.
   * @return A new Media RecordBuilder
   */
  public static com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder newBuilder() {
    return new com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder();
  }

  /**
   * Creates a new Media RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Media RecordBuilder
   */
  public static com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder newBuilder(com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder other) {
    return new com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder(other);
  }

  /**
   * Creates a new Media RecordBuilder by copying an existing Media instance.
   * @param other The existing instance to copy.
   * @return A new Media RecordBuilder
   */
  public static com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder newBuilder(com.inditex.mecc.mecprcc.api.avro.v1.Media other) {
    return new com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder(other);
  }

  /**
   * RecordBuilder for Media instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Media>
    implements org.apache.avro.data.RecordBuilder<Media> {

    /** JSON with Media's data in String format */
    private java.lang.CharSequence data;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Media instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprcc.api.avro.v1.Media other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'data' field.
      * JSON with Media's data in String format
      * @return The value.
      */
    public java.lang.CharSequence getData() {
      return data;
    }

    /**
      * Sets the value of the 'data' field.
      * JSON with Media's data in String format
      * @param value The value of 'data'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder setData(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.data = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * JSON with Media's data in String format
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'data' field.
      * JSON with Media's data in String format
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.Media.Builder clearData() {
      data = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Media build() {
      try {
        Media record = new Media();
        record.data = fieldSetFlags()[0] ? this.data : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Media>
    WRITER$ = (org.apache.avro.io.DatumWriter<Media>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Media>
    READER$ = (org.apache.avro.io.DatumReader<Media>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
