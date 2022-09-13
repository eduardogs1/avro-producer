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

/** Class that holds product brand. */
@org.apache.avro.specific.AvroGenerated
public class ProductBrand extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9094281874802469273L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductBrand\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that holds product brand.\",\"fields\":[{\"name\":\"brand_id\",\"type\":\"long\",\"doc\":\"Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque.\"},{\"name\":\"brand_group_id\",\"type\":\"long\",\"doc\":\"Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR.\"},{\"name\":\"brand_group_name\",\"type\":\"string\",\"doc\":\"Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ProductBrand> ENCODER =
      new BinaryMessageEncoder<ProductBrand>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ProductBrand> DECODER =
      new BinaryMessageDecoder<ProductBrand>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ProductBrand> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ProductBrand> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ProductBrand> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ProductBrand>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ProductBrand to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ProductBrand from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ProductBrand instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ProductBrand fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque. */
  @Deprecated public long brand_id;
  /** Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR. */
  @Deprecated public long brand_group_id;
  /** Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear. */
  @Deprecated public java.lang.CharSequence brand_group_name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProductBrand() {}

  /**
   * All-args constructor.
   * @param brand_id Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque.
   * @param brand_group_id Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR.
   * @param brand_group_name Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear.
   */
  public ProductBrand(java.lang.Long brand_id, java.lang.Long brand_group_id, java.lang.CharSequence brand_group_name) {
    this.brand_id = brand_id;
    this.brand_group_id = brand_group_id;
    this.brand_group_name = brand_group_name;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return brand_id;
    case 1: return brand_group_id;
    case 2: return brand_group_name;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: brand_id = (java.lang.Long)value$; break;
    case 1: brand_group_id = (java.lang.Long)value$; break;
    case 2: brand_group_name = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'brand_id' field.
   * @return Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque.
   */
  public long getBrandId() {
    return brand_id;
  }


  /**
   * Sets the value of the 'brand_id' field.
   * Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque.
   * @param value the value to set.
   */
  public void setBrandId(long value) {
    this.brand_id = value;
  }

  /**
   * Gets the value of the 'brand_group_id' field.
   * @return Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR.
   */
  public long getBrandGroupId() {
    return brand_group_id;
  }


  /**
   * Sets the value of the 'brand_group_id' field.
   * Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR.
   * @param value the value to set.
   */
  public void setBrandGroupId(long value) {
    this.brand_group_id = value;
  }

  /**
   * Gets the value of the 'brand_group_name' field.
   * @return Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear.
   */
  public java.lang.CharSequence getBrandGroupName() {
    return brand_group_name;
  }


  /**
   * Sets the value of the 'brand_group_name' field.
   * Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear.
   * @param value the value to set.
   */
  public void setBrandGroupName(java.lang.CharSequence value) {
    this.brand_group_name = value;
  }

  /**
   * Creates a new ProductBrand RecordBuilder.
   * @return A new ProductBrand RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder();
  }

  /**
   * Creates a new ProductBrand RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProductBrand RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder(other);
    }
  }

  /**
   * Creates a new ProductBrand RecordBuilder by copying an existing ProductBrand instance.
   * @param other The existing instance to copy.
   * @return A new ProductBrand RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder(other);
    }
  }

  /**
   * RecordBuilder for ProductBrand instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductBrand>
    implements org.apache.avro.data.RecordBuilder<ProductBrand> {

    /** Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque. */
    private long brand_id;
    /** Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR. */
    private long brand_group_id;
    /** Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear. */
    private java.lang.CharSequence brand_group_name;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.brand_id)) {
        this.brand_id = data().deepCopy(fields()[0].schema(), other.brand_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.brand_group_id)) {
        this.brand_group_id = data().deepCopy(fields()[1].schema(), other.brand_group_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.brand_group_name)) {
        this.brand_group_name = data().deepCopy(fields()[2].schema(), other.brand_group_name);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing ProductBrand instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.brand_id)) {
        this.brand_id = data().deepCopy(fields()[0].schema(), other.brand_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.brand_group_id)) {
        this.brand_group_id = data().deepCopy(fields()[1].schema(), other.brand_group_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.brand_group_name)) {
        this.brand_group_name = data().deepCopy(fields()[2].schema(), other.brand_group_name);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'brand_id' field.
      * Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque.
      * @return The value.
      */
    public long getBrandId() {
      return brand_id;
    }


    /**
      * Sets the value of the 'brand_id' field.
      * Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque.
      * @param value The value of 'brand_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder setBrandId(long value) {
      validate(fields()[0], value);
      this.brand_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'brand_id' field has been set.
      * Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque.
      * @return True if the 'brand_id' field has been set, false otherwise.
      */
    public boolean hasBrandId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'brand_id' field.
      * Brand identifier, e.g., 1: Zara, 16: Zara Sur, 18: Uterque.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder clearBrandId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'brand_group_id' field.
      * Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR.
      * @return The value.
      */
    public long getBrandGroupId() {
      return brand_group_id;
    }


    /**
      * Sets the value of the 'brand_group_id' field.
      * Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR.
      * @param value The value of 'brand_group_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder setBrandGroupId(long value) {
      validate(fields()[1], value);
      this.brand_group_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'brand_group_id' field has been set.
      * Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR.
      * @return True if the 'brand_group_id' field has been set, false otherwise.
      */
    public boolean hasBrandGroupId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'brand_group_id' field.
      * Brand group id, e.g., 1: ZARA: , 2: PULL_AND_BEAR.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder clearBrandGroupId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'brand_group_name' field.
      * Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear.
      * @return The value.
      */
    public java.lang.CharSequence getBrandGroupName() {
      return brand_group_name;
    }


    /**
      * Sets the value of the 'brand_group_name' field.
      * Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear.
      * @param value The value of 'brand_group_name'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder setBrandGroupName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.brand_group_name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'brand_group_name' field has been set.
      * Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear.
      * @return True if the 'brand_group_name' field has been set, false otherwise.
      */
    public boolean hasBrandGroupName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'brand_group_name' field.
      * Brand group name, e.g. ZARA: zara, PULL_AND_BEAR: pullandbear.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductBrand.Builder clearBrandGroupName() {
      brand_group_name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProductBrand build() {
      try {
        ProductBrand record = new ProductBrand();
        record.brand_id = fieldSetFlags()[0] ? this.brand_id : (java.lang.Long) defaultValue(fields()[0]);
        record.brand_group_id = fieldSetFlags()[1] ? this.brand_group_id : (java.lang.Long) defaultValue(fields()[1]);
        record.brand_group_name = fieldSetFlags()[2] ? this.brand_group_name : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ProductBrand>
    WRITER$ = (org.apache.avro.io.DatumWriter<ProductBrand>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ProductBrand>
    READER$ = (org.apache.avro.io.DatumReader<ProductBrand>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.brand_id);

    out.writeLong(this.brand_group_id);

    out.writeString(this.brand_group_name);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.brand_id = in.readLong();

      this.brand_group_id = in.readLong();

      this.brand_group_name = in.readString(this.brand_group_name instanceof Utf8 ? (Utf8)this.brand_group_name : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.brand_id = in.readLong();
          break;

        case 1:
          this.brand_group_id = in.readLong();
          break;

        case 2:
          this.brand_group_name = in.readString(this.brand_group_name instanceof Utf8 ? (Utf8)this.brand_group_name : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










