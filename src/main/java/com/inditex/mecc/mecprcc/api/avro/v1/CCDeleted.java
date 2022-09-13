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
/** Class that holds the basic information of the Commercial Component that has been deleted */
@org.apache.avro.specific.AvroGenerated
public class CCDeleted extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 564713568673841171L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CCDeleted\",\"namespace\":\"com.inditex.mecc.mecprcc.api.avro.v1\",\"doc\":\"Class that holds the basic information of the Commercial Component that has been deleted\",\"fields\":[{\"name\":\"id\",\"type\":\"long\",\"doc\":\"Commercial Component unique identifier\"},{\"name\":\"deleted_at\",\"type\":\"long\",\"doc\":\"Timestamp expressed in microseconds when the Commercial Component was deleted\",\"logicalType\":\"timestamp-micros\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CCDeleted> ENCODER =
      new BinaryMessageEncoder<CCDeleted>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CCDeleted> DECODER =
      new BinaryMessageDecoder<CCDeleted>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<CCDeleted> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<CCDeleted> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CCDeleted>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this CCDeleted to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a CCDeleted from a ByteBuffer. */
  public static CCDeleted fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Commercial Component unique identifier */
  @Deprecated public long id;
  /** Timestamp expressed in microseconds when the Commercial Component was deleted */
  @Deprecated public long deleted_at;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CCDeleted() {}

  /**
   * All-args constructor.
   * @param id Commercial Component unique identifier
   * @param deleted_at Timestamp expressed in microseconds when the Commercial Component was deleted
   */
  public CCDeleted(java.lang.Long id, java.lang.Long deleted_at) {
    this.id = id;
    this.deleted_at = deleted_at;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return deleted_at;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: deleted_at = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return Commercial Component unique identifier
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * Commercial Component unique identifier
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'deleted_at' field.
   * @return Timestamp expressed in microseconds when the Commercial Component was deleted
   */
  public java.lang.Long getDeletedAt() {
    return deleted_at;
  }

  /**
   * Sets the value of the 'deleted_at' field.
   * Timestamp expressed in microseconds when the Commercial Component was deleted
   * @param value the value to set.
   */
  public void setDeletedAt(java.lang.Long value) {
    this.deleted_at = value;
  }

  /**
   * Creates a new CCDeleted RecordBuilder.
   * @return A new CCDeleted RecordBuilder
   */
  public static com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder newBuilder() {
    return new com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder();
  }

  /**
   * Creates a new CCDeleted RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CCDeleted RecordBuilder
   */
  public static com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder newBuilder(com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder other) {
    return new com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder(other);
  }

  /**
   * Creates a new CCDeleted RecordBuilder by copying an existing CCDeleted instance.
   * @param other The existing instance to copy.
   * @return A new CCDeleted RecordBuilder
   */
  public static com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder newBuilder(com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted other) {
    return new com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder(other);
  }

  /**
   * RecordBuilder for CCDeleted instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CCDeleted>
    implements org.apache.avro.data.RecordBuilder<CCDeleted> {

    /** Commercial Component unique identifier */
    private long id;
    /** Timestamp expressed in microseconds when the Commercial Component was deleted */
    private long deleted_at;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.deleted_at)) {
        this.deleted_at = data().deepCopy(fields()[1].schema(), other.deleted_at);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CCDeleted instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.deleted_at)) {
        this.deleted_at = data().deepCopy(fields()[1].schema(), other.deleted_at);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * Commercial Component unique identifier
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * Commercial Component unique identifier
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * Commercial Component unique identifier
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * Commercial Component unique identifier
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'deleted_at' field.
      * Timestamp expressed in microseconds when the Commercial Component was deleted
      * @return The value.
      */
    public java.lang.Long getDeletedAt() {
      return deleted_at;
    }

    /**
      * Sets the value of the 'deleted_at' field.
      * Timestamp expressed in microseconds when the Commercial Component was deleted
      * @param value The value of 'deleted_at'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder setDeletedAt(long value) {
      validate(fields()[1], value);
      this.deleted_at = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'deleted_at' field has been set.
      * Timestamp expressed in microseconds when the Commercial Component was deleted
      * @return True if the 'deleted_at' field has been set, false otherwise.
      */
    public boolean hasDeletedAt() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'deleted_at' field.
      * Timestamp expressed in microseconds when the Commercial Component was deleted
      * @return This builder.
      */
    public com.inditex.mecc.mecprcc.api.avro.v1.CCDeleted.Builder clearDeletedAt() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CCDeleted build() {
      try {
        CCDeleted record = new CCDeleted();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.deleted_at = fieldSetFlags()[1] ? this.deleted_at : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CCDeleted>
    WRITER$ = (org.apache.avro.io.DatumWriter<CCDeleted>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CCDeleted>
    READER$ = (org.apache.avro.io.DatumReader<CCDeleted>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}