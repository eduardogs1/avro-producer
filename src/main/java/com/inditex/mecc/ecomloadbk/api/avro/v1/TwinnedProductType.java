/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.inditex.mecc.ecomloadbk.api.avro.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Class that holds availability changes in a base product component. */
@org.apache.avro.specific.AvroGenerated
public class TwinnedProductType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5147426523837959278L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TwinnedProductType\",\"namespace\":\"com.inditex.mecc.ecomloadbk.api.avro.v1\",\"doc\":\"Class that holds availability changes in a base product component.\",\"fields\":[{\"name\":\"main_reference\",\"type\":{\"type\":\"record\",\"name\":\"TwinnedProductReferenceType\",\"doc\":\"Class that holds the reference info\",\"fields\":[{\"name\":\"brand_id\",\"type\":\"int\",\"doc\":\"The master brand id\"},{\"name\":\"type\",\"type\":\"string\",\"doc\":\"The 1 digit product type\"},{\"name\":\"model\",\"type\":\"string\",\"doc\":\"The 4 digits model\"},{\"name\":\"quality\",\"type\":\"string\",\"doc\":\"The 3 digits quality\"},{\"name\":\"product_key\",\"type\":\"string\",\"doc\":\"Internal Ecomload Key of the product\"}]},\"doc\":\"The Main reference of the article, the parent\"},{\"name\":\"twinned_info\",\"type\":{\"type\":\"record\",\"name\":\"TwinnedInfoType\",\"doc\":\"Class that holds the twinned type\",\"fields\":[{\"name\":\"kind\",\"type\":{\"type\":\"enum\",\"name\":\"KindEnum\",\"symbols\":[\"COM\",\"COMERCIAL\",\"DISTRIBUCION\",\"OTHER\"]},\"doc\":\"Type of twinned\"}]},\"doc\":\"Kind of twinned product\"},{\"name\":\"twinned_references\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"TwinnedProductReferenceType\"}],\"doc\":\"List of twinned references\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TwinnedProductType> ENCODER =
      new BinaryMessageEncoder<TwinnedProductType>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TwinnedProductType> DECODER =
      new BinaryMessageDecoder<TwinnedProductType>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TwinnedProductType> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TwinnedProductType> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TwinnedProductType> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TwinnedProductType>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TwinnedProductType to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TwinnedProductType from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TwinnedProductType instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TwinnedProductType fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The Main reference of the article, the parent */
  @Deprecated public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType main_reference;
  /** Kind of twinned product */
  @Deprecated public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType twinned_info;
  /** List of twinned references */
  @Deprecated public java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> twinned_references;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TwinnedProductType() {}

  /**
   * All-args constructor.
   * @param main_reference The Main reference of the article, the parent
   * @param twinned_info Kind of twinned product
   * @param twinned_references List of twinned references
   */
  public TwinnedProductType(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType main_reference, com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType twinned_info, java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> twinned_references) {
    this.main_reference = main_reference;
    this.twinned_info = twinned_info;
    this.twinned_references = twinned_references;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return main_reference;
    case 1: return twinned_info;
    case 2: return twinned_references;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: main_reference = (com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType)value$; break;
    case 1: twinned_info = (com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType)value$; break;
    case 2: twinned_references = (java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'main_reference' field.
   * @return The Main reference of the article, the parent
   */
  public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType getMainReference() {
    return main_reference;
  }


  /**
   * Sets the value of the 'main_reference' field.
   * The Main reference of the article, the parent
   * @param value the value to set.
   */
  public void setMainReference(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType value) {
    this.main_reference = value;
  }

  /**
   * Gets the value of the 'twinned_info' field.
   * @return Kind of twinned product
   */
  public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType getTwinnedInfo() {
    return twinned_info;
  }


  /**
   * Sets the value of the 'twinned_info' field.
   * Kind of twinned product
   * @param value the value to set.
   */
  public void setTwinnedInfo(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType value) {
    this.twinned_info = value;
  }

  /**
   * Gets the value of the 'twinned_references' field.
   * @return List of twinned references
   */
  public java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> getTwinnedReferences() {
    return twinned_references;
  }


  /**
   * Sets the value of the 'twinned_references' field.
   * List of twinned references
   * @param value the value to set.
   */
  public void setTwinnedReferences(java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> value) {
    this.twinned_references = value;
  }

  /**
   * Creates a new TwinnedProductType RecordBuilder.
   * @return A new TwinnedProductType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder newBuilder() {
    return new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder();
  }

  /**
   * Creates a new TwinnedProductType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TwinnedProductType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder(other);
    }
  }

  /**
   * Creates a new TwinnedProductType RecordBuilder by copying an existing TwinnedProductType instance.
   * @param other The existing instance to copy.
   * @return A new TwinnedProductType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder(other);
    }
  }

  /**
   * RecordBuilder for TwinnedProductType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TwinnedProductType>
    implements org.apache.avro.data.RecordBuilder<TwinnedProductType> {

    /** The Main reference of the article, the parent */
    private com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType main_reference;
    private com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType.Builder main_referenceBuilder;
    /** Kind of twinned product */
    private com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType twinned_info;
    private com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType.Builder twinned_infoBuilder;
    /** List of twinned references */
    private java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> twinned_references;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.main_reference)) {
        this.main_reference = data().deepCopy(fields()[0].schema(), other.main_reference);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasMainReferenceBuilder()) {
        this.main_referenceBuilder = com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType.newBuilder(other.getMainReferenceBuilder());
      }
      if (isValidValue(fields()[1], other.twinned_info)) {
        this.twinned_info = data().deepCopy(fields()[1].schema(), other.twinned_info);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasTwinnedInfoBuilder()) {
        this.twinned_infoBuilder = com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType.newBuilder(other.getTwinnedInfoBuilder());
      }
      if (isValidValue(fields()[2], other.twinned_references)) {
        this.twinned_references = data().deepCopy(fields()[2].schema(), other.twinned_references);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing TwinnedProductType instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.main_reference)) {
        this.main_reference = data().deepCopy(fields()[0].schema(), other.main_reference);
        fieldSetFlags()[0] = true;
      }
      this.main_referenceBuilder = null;
      if (isValidValue(fields()[1], other.twinned_info)) {
        this.twinned_info = data().deepCopy(fields()[1].schema(), other.twinned_info);
        fieldSetFlags()[1] = true;
      }
      this.twinned_infoBuilder = null;
      if (isValidValue(fields()[2], other.twinned_references)) {
        this.twinned_references = data().deepCopy(fields()[2].schema(), other.twinned_references);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'main_reference' field.
      * The Main reference of the article, the parent
      * @return The value.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType getMainReference() {
      return main_reference;
    }


    /**
      * Sets the value of the 'main_reference' field.
      * The Main reference of the article, the parent
      * @param value The value of 'main_reference'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder setMainReference(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType value) {
      validate(fields()[0], value);
      this.main_referenceBuilder = null;
      this.main_reference = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'main_reference' field has been set.
      * The Main reference of the article, the parent
      * @return True if the 'main_reference' field has been set, false otherwise.
      */
    public boolean hasMainReference() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'main_reference' field and creates one if it doesn't exist yet.
     * The Main reference of the article, the parent
     * @return This builder.
     */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType.Builder getMainReferenceBuilder() {
      if (main_referenceBuilder == null) {
        if (hasMainReference()) {
          setMainReferenceBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType.newBuilder(main_reference));
        } else {
          setMainReferenceBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType.newBuilder());
        }
      }
      return main_referenceBuilder;
    }

    /**
     * Sets the Builder instance for the 'main_reference' field
     * The Main reference of the article, the parent
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder setMainReferenceBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType.Builder value) {
      clearMainReference();
      main_referenceBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'main_reference' field has an active Builder instance
     * The Main reference of the article, the parent
     * @return True if the 'main_reference' field has an active Builder instance
     */
    public boolean hasMainReferenceBuilder() {
      return main_referenceBuilder != null;
    }

    /**
      * Clears the value of the 'main_reference' field.
      * The Main reference of the article, the parent
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder clearMainReference() {
      main_reference = null;
      main_referenceBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'twinned_info' field.
      * Kind of twinned product
      * @return The value.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType getTwinnedInfo() {
      return twinned_info;
    }


    /**
      * Sets the value of the 'twinned_info' field.
      * Kind of twinned product
      * @param value The value of 'twinned_info'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder setTwinnedInfo(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType value) {
      validate(fields()[1], value);
      this.twinned_infoBuilder = null;
      this.twinned_info = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'twinned_info' field has been set.
      * Kind of twinned product
      * @return True if the 'twinned_info' field has been set, false otherwise.
      */
    public boolean hasTwinnedInfo() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'twinned_info' field and creates one if it doesn't exist yet.
     * Kind of twinned product
     * @return This builder.
     */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType.Builder getTwinnedInfoBuilder() {
      if (twinned_infoBuilder == null) {
        if (hasTwinnedInfo()) {
          setTwinnedInfoBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType.newBuilder(twinned_info));
        } else {
          setTwinnedInfoBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType.newBuilder());
        }
      }
      return twinned_infoBuilder;
    }

    /**
     * Sets the Builder instance for the 'twinned_info' field
     * Kind of twinned product
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder setTwinnedInfoBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType.Builder value) {
      clearTwinnedInfo();
      twinned_infoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'twinned_info' field has an active Builder instance
     * Kind of twinned product
     * @return True if the 'twinned_info' field has an active Builder instance
     */
    public boolean hasTwinnedInfoBuilder() {
      return twinned_infoBuilder != null;
    }

    /**
      * Clears the value of the 'twinned_info' field.
      * Kind of twinned product
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder clearTwinnedInfo() {
      twinned_info = null;
      twinned_infoBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'twinned_references' field.
      * List of twinned references
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> getTwinnedReferences() {
      return twinned_references;
    }


    /**
      * Sets the value of the 'twinned_references' field.
      * List of twinned references
      * @param value The value of 'twinned_references'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder setTwinnedReferences(java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> value) {
      validate(fields()[2], value);
      this.twinned_references = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'twinned_references' field has been set.
      * List of twinned references
      * @return True if the 'twinned_references' field has been set, false otherwise.
      */
    public boolean hasTwinnedReferences() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'twinned_references' field.
      * List of twinned references
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductType.Builder clearTwinnedReferences() {
      twinned_references = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TwinnedProductType build() {
      try {
        TwinnedProductType record = new TwinnedProductType();
        if (main_referenceBuilder != null) {
          try {
            record.main_reference = this.main_referenceBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("main_reference"));
            throw e;
          }
        } else {
          record.main_reference = fieldSetFlags()[0] ? this.main_reference : (com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType) defaultValue(fields()[0]);
        }
        if (twinned_infoBuilder != null) {
          try {
            record.twinned_info = this.twinned_infoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("twinned_info"));
            throw e;
          }
        } else {
          record.twinned_info = fieldSetFlags()[1] ? this.twinned_info : (com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType) defaultValue(fields()[1]);
        }
        record.twinned_references = fieldSetFlags()[2] ? this.twinned_references : (java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TwinnedProductType>
    WRITER$ = (org.apache.avro.io.DatumWriter<TwinnedProductType>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TwinnedProductType>
    READER$ = (org.apache.avro.io.DatumReader<TwinnedProductType>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.main_reference.customEncode(out);

    this.twinned_info.customEncode(out);

    if (this.twinned_references == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.twinned_references.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType e0: this.twinned_references) {
        actualSize0++;
        out.startItem();
        e0.customEncode(out);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.main_reference == null) {
        this.main_reference = new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType();
      }
      this.main_reference.customDecode(in);

      if (this.twinned_info == null) {
        this.twinned_info = new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType();
      }
      this.twinned_info.customDecode(in);

      if (in.readIndex() != 1) {
        in.readNull();
        this.twinned_references = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> a0 = this.twinned_references;
        if (a0 == null) {
          a0 = new SpecificData.Array<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType>((int)size0, SCHEMA$.getField("twinned_references").schema().getTypes().get(1));
          this.twinned_references = a0;
        } else a0.clear();
        SpecificData.Array<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType e0 = (ga0 != null ? ga0.peek() : null);
            if (e0 == null) {
              e0 = new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType();
            }
            e0.customDecode(in);
            a0.add(e0);
          }
        }
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.main_reference == null) {
            this.main_reference = new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType();
          }
          this.main_reference.customDecode(in);
          break;

        case 1:
          if (this.twinned_info == null) {
            this.twinned_info = new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedInfoType();
          }
          this.twinned_info.customDecode(in);
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.twinned_references = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> a0 = this.twinned_references;
            if (a0 == null) {
              a0 = new SpecificData.Array<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType>((int)size0, SCHEMA$.getField("twinned_references").schema().getTypes().get(1));
              this.twinned_references = a0;
            } else a0.clear();
            SpecificData.Array<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType e0 = (ga0 != null ? ga0.peek() : null);
                if (e0 == null) {
                  e0 = new com.inditex.mecc.ecomloadbk.api.avro.v1.TwinnedProductReferenceType();
                }
                e0.customDecode(in);
                a0.add(e0);
              }
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









