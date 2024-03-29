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

/** Class that holds product subfamily. */
@org.apache.avro.specific.AvroGenerated
public class ProductSubfamily extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4184617090902995282L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ProductSubfamily\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that holds product subfamily.\",\"fields\":[{\"name\":\"subfamily_id\",\"type\":\"long\",\"doc\":\"Id of the subfamily the product belongs.\"},{\"name\":\"subfamily_name\",\"type\":\"string\",\"doc\":\"Product subfamily, e.g. trousers-jeans.\"},{\"name\":\"subfamily_code\",\"type\":\"long\",\"doc\":\"AS400 subfamily code the product belongs to.\"},{\"name\":\"subfamily_name_translations\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"I18NText\",\"doc\":\"Class that holds a text and its locale ISO code.\",\"fields\":[{\"name\":\"iso_code\",\"type\":\"string\",\"doc\":\"Locale ISO code.\"},{\"name\":\"text\",\"type\":\"string\",\"doc\":\"Internationalized text.\"}]}},\"doc\":\"List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is)\",\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ProductSubfamily> ENCODER =
      new BinaryMessageEncoder<ProductSubfamily>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ProductSubfamily> DECODER =
      new BinaryMessageDecoder<ProductSubfamily>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ProductSubfamily> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ProductSubfamily> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ProductSubfamily> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ProductSubfamily>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ProductSubfamily to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ProductSubfamily from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ProductSubfamily instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ProductSubfamily fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Id of the subfamily the product belongs. */
  @Deprecated public long subfamily_id;
  /** Product subfamily, e.g. trousers-jeans. */
  @Deprecated public java.lang.CharSequence subfamily_name;
  /** AS400 subfamily code the product belongs to. */
  @Deprecated public long subfamily_code;
  /** List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is) */
  @Deprecated public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> subfamily_name_translations;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ProductSubfamily() {}

  /**
   * All-args constructor.
   * @param subfamily_id Id of the subfamily the product belongs.
   * @param subfamily_name Product subfamily, e.g. trousers-jeans.
   * @param subfamily_code AS400 subfamily code the product belongs to.
   * @param subfamily_name_translations List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is)
   */
  public ProductSubfamily(java.lang.Long subfamily_id, java.lang.CharSequence subfamily_name, java.lang.Long subfamily_code, java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> subfamily_name_translations) {
    this.subfamily_id = subfamily_id;
    this.subfamily_name = subfamily_name;
    this.subfamily_code = subfamily_code;
    this.subfamily_name_translations = subfamily_name_translations;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return subfamily_id;
    case 1: return subfamily_name;
    case 2: return subfamily_code;
    case 3: return subfamily_name_translations;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: subfamily_id = (java.lang.Long)value$; break;
    case 1: subfamily_name = (java.lang.CharSequence)value$; break;
    case 2: subfamily_code = (java.lang.Long)value$; break;
    case 3: subfamily_name_translations = (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'subfamily_id' field.
   * @return Id of the subfamily the product belongs.
   */
  public long getSubfamilyId() {
    return subfamily_id;
  }


  /**
   * Sets the value of the 'subfamily_id' field.
   * Id of the subfamily the product belongs.
   * @param value the value to set.
   */
  public void setSubfamilyId(long value) {
    this.subfamily_id = value;
  }

  /**
   * Gets the value of the 'subfamily_name' field.
   * @return Product subfamily, e.g. trousers-jeans.
   */
  public java.lang.CharSequence getSubfamilyName() {
    return subfamily_name;
  }


  /**
   * Sets the value of the 'subfamily_name' field.
   * Product subfamily, e.g. trousers-jeans.
   * @param value the value to set.
   */
  public void setSubfamilyName(java.lang.CharSequence value) {
    this.subfamily_name = value;
  }

  /**
   * Gets the value of the 'subfamily_code' field.
   * @return AS400 subfamily code the product belongs to.
   */
  public long getSubfamilyCode() {
    return subfamily_code;
  }


  /**
   * Sets the value of the 'subfamily_code' field.
   * AS400 subfamily code the product belongs to.
   * @param value the value to set.
   */
  public void setSubfamilyCode(long value) {
    this.subfamily_code = value;
  }

  /**
   * Gets the value of the 'subfamily_name_translations' field.
   * @return List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is)
   */
  public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> getSubfamilyNameTranslations() {
    return subfamily_name_translations;
  }


  /**
   * Sets the value of the 'subfamily_name_translations' field.
   * List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is)
   * @param value the value to set.
   */
  public void setSubfamilyNameTranslations(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> value) {
    this.subfamily_name_translations = value;
  }

  /**
   * Creates a new ProductSubfamily RecordBuilder.
   * @return A new ProductSubfamily RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder();
  }

  /**
   * Creates a new ProductSubfamily RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ProductSubfamily RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder(other);
    }
  }

  /**
   * Creates a new ProductSubfamily RecordBuilder by copying an existing ProductSubfamily instance.
   * @param other The existing instance to copy.
   * @return A new ProductSubfamily RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder(other);
    }
  }

  /**
   * RecordBuilder for ProductSubfamily instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ProductSubfamily>
    implements org.apache.avro.data.RecordBuilder<ProductSubfamily> {

    /** Id of the subfamily the product belongs. */
    private long subfamily_id;
    /** Product subfamily, e.g. trousers-jeans. */
    private java.lang.CharSequence subfamily_name;
    /** AS400 subfamily code the product belongs to. */
    private long subfamily_code;
    /** List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is) */
    private java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> subfamily_name_translations;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.subfamily_id)) {
        this.subfamily_id = data().deepCopy(fields()[0].schema(), other.subfamily_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.subfamily_name)) {
        this.subfamily_name = data().deepCopy(fields()[1].schema(), other.subfamily_name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.subfamily_code)) {
        this.subfamily_code = data().deepCopy(fields()[2].schema(), other.subfamily_code);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.subfamily_name_translations)) {
        this.subfamily_name_translations = data().deepCopy(fields()[3].schema(), other.subfamily_name_translations);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing ProductSubfamily instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.subfamily_id)) {
        this.subfamily_id = data().deepCopy(fields()[0].schema(), other.subfamily_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.subfamily_name)) {
        this.subfamily_name = data().deepCopy(fields()[1].schema(), other.subfamily_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.subfamily_code)) {
        this.subfamily_code = data().deepCopy(fields()[2].schema(), other.subfamily_code);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.subfamily_name_translations)) {
        this.subfamily_name_translations = data().deepCopy(fields()[3].schema(), other.subfamily_name_translations);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'subfamily_id' field.
      * Id of the subfamily the product belongs.
      * @return The value.
      */
    public long getSubfamilyId() {
      return subfamily_id;
    }


    /**
      * Sets the value of the 'subfamily_id' field.
      * Id of the subfamily the product belongs.
      * @param value The value of 'subfamily_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder setSubfamilyId(long value) {
      validate(fields()[0], value);
      this.subfamily_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'subfamily_id' field has been set.
      * Id of the subfamily the product belongs.
      * @return True if the 'subfamily_id' field has been set, false otherwise.
      */
    public boolean hasSubfamilyId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'subfamily_id' field.
      * Id of the subfamily the product belongs.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder clearSubfamilyId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'subfamily_name' field.
      * Product subfamily, e.g. trousers-jeans.
      * @return The value.
      */
    public java.lang.CharSequence getSubfamilyName() {
      return subfamily_name;
    }


    /**
      * Sets the value of the 'subfamily_name' field.
      * Product subfamily, e.g. trousers-jeans.
      * @param value The value of 'subfamily_name'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder setSubfamilyName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.subfamily_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'subfamily_name' field has been set.
      * Product subfamily, e.g. trousers-jeans.
      * @return True if the 'subfamily_name' field has been set, false otherwise.
      */
    public boolean hasSubfamilyName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'subfamily_name' field.
      * Product subfamily, e.g. trousers-jeans.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder clearSubfamilyName() {
      subfamily_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'subfamily_code' field.
      * AS400 subfamily code the product belongs to.
      * @return The value.
      */
    public long getSubfamilyCode() {
      return subfamily_code;
    }


    /**
      * Sets the value of the 'subfamily_code' field.
      * AS400 subfamily code the product belongs to.
      * @param value The value of 'subfamily_code'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder setSubfamilyCode(long value) {
      validate(fields()[2], value);
      this.subfamily_code = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'subfamily_code' field has been set.
      * AS400 subfamily code the product belongs to.
      * @return True if the 'subfamily_code' field has been set, false otherwise.
      */
    public boolean hasSubfamilyCode() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'subfamily_code' field.
      * AS400 subfamily code the product belongs to.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder clearSubfamilyCode() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'subfamily_name_translations' field.
      * List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is)
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> getSubfamilyNameTranslations() {
      return subfamily_name_translations;
    }


    /**
      * Sets the value of the 'subfamily_name_translations' field.
      * List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is)
      * @param value The value of 'subfamily_name_translations'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder setSubfamilyNameTranslations(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> value) {
      validate(fields()[3], value);
      this.subfamily_name_translations = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'subfamily_name_translations' field has been set.
      * List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is)
      * @return True if the 'subfamily_name_translations' field has been set, false otherwise.
      */
    public boolean hasSubfamilyNameTranslations() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'subfamily_name_translations' field.
      * List of all internationalized subfamily's name. Although this is an internationalization, this field doesn't depend on the store, because all internationalized names are retrieved (whathever its store is)
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ProductSubfamily.Builder clearSubfamilyNameTranslations() {
      subfamily_name_translations = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProductSubfamily build() {
      try {
        ProductSubfamily record = new ProductSubfamily();
        record.subfamily_id = fieldSetFlags()[0] ? this.subfamily_id : (java.lang.Long) defaultValue(fields()[0]);
        record.subfamily_name = fieldSetFlags()[1] ? this.subfamily_name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.subfamily_code = fieldSetFlags()[2] ? this.subfamily_code : (java.lang.Long) defaultValue(fields()[2]);
        record.subfamily_name_translations = fieldSetFlags()[3] ? this.subfamily_name_translations : (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ProductSubfamily>
    WRITER$ = (org.apache.avro.io.DatumWriter<ProductSubfamily>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ProductSubfamily>
    READER$ = (org.apache.avro.io.DatumReader<ProductSubfamily>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.subfamily_id);

    out.writeString(this.subfamily_name);

    out.writeLong(this.subfamily_code);

    long size0 = this.subfamily_name_translations.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.inditex.mecc.mecprwat.api.avro.v2.I18NText e0: this.subfamily_name_translations) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.subfamily_id = in.readLong();

      this.subfamily_name = in.readString(this.subfamily_name instanceof Utf8 ? (Utf8)this.subfamily_name : null);

      this.subfamily_code = in.readLong();

      long size0 = in.readArrayStart();
      java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> a0 = this.subfamily_name_translations;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>((int)size0, SCHEMA$.getField("subfamily_name_translations").schema());
        this.subfamily_name_translations = a0;
      } else a0.clear();
      SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.inditex.mecc.mecprwat.api.avro.v2.I18NText e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.inditex.mecc.mecprwat.api.avro.v2.I18NText();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.subfamily_id = in.readLong();
          break;

        case 1:
          this.subfamily_name = in.readString(this.subfamily_name instanceof Utf8 ? (Utf8)this.subfamily_name : null);
          break;

        case 2:
          this.subfamily_code = in.readLong();
          break;

        case 3:
          long size0 = in.readArrayStart();
          java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> a0 = this.subfamily_name_translations;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>((int)size0, SCHEMA$.getField("subfamily_name_translations").schema());
            this.subfamily_name_translations = a0;
          } else a0.clear();
          SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.inditex.mecc.mecprwat.api.avro.v2.I18NText e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.inditex.mecc.mecprwat.api.avro.v2.I18NText();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










