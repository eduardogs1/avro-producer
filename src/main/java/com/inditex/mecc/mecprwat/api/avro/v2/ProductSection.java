/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.inditex.mecc.mecprwat.api.avro.v2;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Class that holds product section. */
@org.apache.avro.specific.AvroGenerated
public class ProductSection extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1608279395735291745L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductSection\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that holds product section.\",\"fields\":[{\"name\":\"section_id\",\"type\":\"long\",\"doc\":\"Section id of product, e.g., 1: woman, 2: man, 3: kid.\"},{\"name\":\"section_name\",\"type\":\"string\",\"doc\":\"Product section (e.g. man, woman, etc).\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ProductSection> ENCODER =
      new BinaryMessageEncoder<ProductSection>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ProductSection> DECODER =
      new BinaryMessageDecoder<ProductSection>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ProductSection> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ProductSection> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ProductSection> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ProductSection>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ProductSection to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ProductSection from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ProductSection instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ProductSection fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Section id of product, e.g., 1: woman, 2: man, 3: kid. */
  @Deprecated public long section_id;
  /** Product section (e.g. man, woman, etc). */
  @Deprecated public java.lang.CharSequence section_name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProductSection() {}

  /**
   * All-args constructor.
   * @param section_id Section id of product, e.g., 1: woman, 2: man, 3: kid.
   * @param section_name Product section (e.g. man, woman, etc).
   */
  public ProductSection(java.lang.Long section_id, java.lang.CharSequence section_name) {
    this.section_id = section_id;
    this.section_name = section_name;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return section_id;
    case 1: return section_name;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: section_id = (java.lang.Long)value$; break;
    case 1: section_name = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'section_id' field.
   * @return Section id of product, e.g., 1: woman, 2: man, 3: kid.
   */
  public long getSectionId() {
    return section_id;
  }


  /**
   * Sets the value of the 'section_id' field.
   * Section id of product, e.g., 1: woman, 2: man, 3: kid.
   * @param value the value to set.
   */
  public void setSectionId(long value) {
    this.section_id = value;
  }

  /**
   * Gets the value of the 'section_name' field.
   * @return Product section (e.g. man, woman, etc).
   */
  public java.lang.CharSequence getSectionName() {
    return section_name;
  }


  /**
   * Sets the value of the 'section_name' field.
   * Product section (e.g. man, woman, etc).
   * @param value the value to set.
   */
  public void setSectionName(java.lang.CharSequence value) {
    this.section_name = value;
  }

  /**
   * Creates a new ProductSection RecordBuilder.
   * @return A new ProductSection RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder();
  }

  /**
   * Creates a new ProductSection RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProductSection RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder(other);
    }
  }

  /**
   * Creates a new ProductSection RecordBuilder by copying an existing ProductSection instance.
   * @param other The existing instance to copy.
   * @return A new ProductSection RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ProductSection other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder(other);
    }
  }

  /**
   * RecordBuilder for ProductSection instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductSection>
    implements org.apache.avro.data.RecordBuilder<ProductSection> {

    /** Section id of product, e.g., 1: woman, 2: man, 3: kid. */
    private long section_id;
    /** Product section (e.g. man, woman, etc). */
    private java.lang.CharSequence section_name;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.section_id)) {
        this.section_id = data().deepCopy(fields()[0].schema(), other.section_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.section_name)) {
        this.section_name = data().deepCopy(fields()[1].schema(), other.section_name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing ProductSection instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ProductSection other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.section_id)) {
        this.section_id = data().deepCopy(fields()[0].schema(), other.section_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.section_name)) {
        this.section_name = data().deepCopy(fields()[1].schema(), other.section_name);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'section_id' field.
      * Section id of product, e.g., 1: woman, 2: man, 3: kid.
      * @return The value.
      */
    public long getSectionId() {
      return section_id;
    }


    /**
      * Sets the value of the 'section_id' field.
      * Section id of product, e.g., 1: woman, 2: man, 3: kid.
      * @param value The value of 'section_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder setSectionId(long value) {
      validate(fields()[0], value);
      this.section_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'section_id' field has been set.
      * Section id of product, e.g., 1: woman, 2: man, 3: kid.
      * @return True if the 'section_id' field has been set, false otherwise.
      */
    public boolean hasSectionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'section_id' field.
      * Section id of product, e.g., 1: woman, 2: man, 3: kid.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder clearSectionId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'section_name' field.
      * Product section (e.g. man, woman, etc).
      * @return The value.
      */
    public java.lang.CharSequence getSectionName() {
      return section_name;
    }


    /**
      * Sets the value of the 'section_name' field.
      * Product section (e.g. man, woman, etc).
      * @param value The value of 'section_name'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder setSectionName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.section_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'section_name' field has been set.
      * Product section (e.g. man, woman, etc).
      * @return True if the 'section_name' field has been set, false otherwise.
      */
    public boolean hasSectionName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'section_name' field.
      * Product section (e.g. man, woman, etc).
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSection.Builder clearSectionName() {
      section_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProductSection build() {
      try {
        ProductSection record = new ProductSection();
        record.section_id = fieldSetFlags()[0] ? this.section_id : (java.lang.Long) defaultValue(fields()[0]);
        record.section_name = fieldSetFlags()[1] ? this.section_name : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ProductSection>
    WRITER$ = (org.apache.avro.io.DatumWriter<ProductSection>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ProductSection>
    READER$ = (org.apache.avro.io.DatumReader<ProductSection>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.section_id);

    out.writeString(this.section_name);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.section_id = in.readLong();

      this.section_name = in.readString(this.section_name instanceof Utf8 ? (Utf8)this.section_name : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.section_id = in.readLong();
          break;

        case 1:
          this.section_name = in.readString(this.section_name instanceof Utf8 ? (Utf8)this.section_name : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









