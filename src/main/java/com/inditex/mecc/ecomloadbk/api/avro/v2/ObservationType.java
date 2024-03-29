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

/** Class that holds observatios/descriptions about a price */
@org.apache.avro.specific.AvroGenerated
public class ObservationType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8915223159395287897L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ObservationType\",\"namespace\":\"com.inditex.mecc.ecomloadbk.api.avro.v2\",\"doc\":\"Class that holds observatios/descriptions about a price\",\"fields\":[{\"name\":\"description\",\"type\":\"string\",\"doc\":\"Description of the price info\"},{\"name\":\"kind\",\"type\":{\"type\":\"enum\",\"name\":\"KindTypeEnum\",\"symbols\":[\"REGULAR\",\"SALES\",\"EVENT\"]},\"doc\":\"Enum to catalog the price type\"},{\"name\":\"ecomload_promo_info\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EcomloadPromoInfoType\",\"doc\":\"Class that holds the reference info\",\"fields\":[{\"name\":\"ecomload_promo_name\",\"type\":\"string\",\"doc\":\"The promo name created by EcomLoad\"}]}],\"doc\":\"Ecomload promos data description\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ObservationType> ENCODER =
      new BinaryMessageEncoder<ObservationType>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ObservationType> DECODER =
      new BinaryMessageDecoder<ObservationType>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ObservationType> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ObservationType> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ObservationType> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ObservationType>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ObservationType to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ObservationType from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ObservationType instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ObservationType fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Description of the price info */
  @Deprecated public java.lang.CharSequence description;
  /** Enum to catalog the price type */
  @Deprecated public com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum kind;
  /** Ecomload promos data description */
  @Deprecated public com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType ecomload_promo_info;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ObservationType() {}

  /**
   * All-args constructor.
   * @param description Description of the price info
   * @param kind Enum to catalog the price type
   * @param ecomload_promo_info Ecomload promos data description
   */
  public ObservationType(java.lang.CharSequence description, com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum kind, com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType ecomload_promo_info) {
    this.description = description;
    this.kind = kind;
    this.ecomload_promo_info = ecomload_promo_info;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return description;
    case 1: return kind;
    case 2: return ecomload_promo_info;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: description = (java.lang.CharSequence)value$; break;
    case 1: kind = (com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum)value$; break;
    case 2: ecomload_promo_info = (com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'description' field.
   * @return Description of the price info
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * Description of the price info
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'kind' field.
   * @return Enum to catalog the price type
   */
  public com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum getKind() {
    return kind;
  }


  /**
   * Sets the value of the 'kind' field.
   * Enum to catalog the price type
   * @param value the value to set.
   */
  public void setKind(com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum value) {
    this.kind = value;
  }

  /**
   * Gets the value of the 'ecomload_promo_info' field.
   * @return Ecomload promos data description
   */
  public com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType getEcomloadPromoInfo() {
    return ecomload_promo_info;
  }


  /**
   * Sets the value of the 'ecomload_promo_info' field.
   * Ecomload promos data description
   * @param value the value to set.
   */
  public void setEcomloadPromoInfo(com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType value) {
    this.ecomload_promo_info = value;
  }

  /**
   * Creates a new ObservationType RecordBuilder.
   * @return A new ObservationType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder newBuilder() {
    return new com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder();
  }

  /**
   * Creates a new ObservationType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ObservationType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder(other);
    }
  }

  /**
   * Creates a new ObservationType RecordBuilder by copying an existing ObservationType instance.
   * @param other The existing instance to copy.
   * @return A new ObservationType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder(other);
    }
  }

  /**
   * RecordBuilder for ObservationType instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ObservationType>
    implements org.apache.avro.data.RecordBuilder<ObservationType> {

    /** Description of the price info */
    private java.lang.CharSequence description;
    /** Enum to catalog the price type */
    private com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum kind;
    /** Ecomload promos data description */
    private com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType ecomload_promo_info;
    private com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType.Builder ecomload_promo_infoBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.description)) {
        this.description = data().deepCopy(fields()[0].schema(), other.description);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.kind)) {
        this.kind = data().deepCopy(fields()[1].schema(), other.kind);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.ecomload_promo_info)) {
        this.ecomload_promo_info = data().deepCopy(fields()[2].schema(), other.ecomload_promo_info);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasEcomloadPromoInfoBuilder()) {
        this.ecomload_promo_infoBuilder = com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType.newBuilder(other.getEcomloadPromoInfoBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing ObservationType instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.description)) {
        this.description = data().deepCopy(fields()[0].schema(), other.description);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.kind)) {
        this.kind = data().deepCopy(fields()[1].schema(), other.kind);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ecomload_promo_info)) {
        this.ecomload_promo_info = data().deepCopy(fields()[2].schema(), other.ecomload_promo_info);
        fieldSetFlags()[2] = true;
      }
      this.ecomload_promo_infoBuilder = null;
    }

    /**
      * Gets the value of the 'description' field.
      * Description of the price info
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * Description of the price info
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.description = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * Description of the price info
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'description' field.
      * Description of the price info
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder clearDescription() {
      description = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'kind' field.
      * Enum to catalog the price type
      * @return The value.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum getKind() {
      return kind;
    }


    /**
      * Sets the value of the 'kind' field.
      * Enum to catalog the price type
      * @param value The value of 'kind'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder setKind(com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum value) {
      validate(fields()[1], value);
      this.kind = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'kind' field has been set.
      * Enum to catalog the price type
      * @return True if the 'kind' field has been set, false otherwise.
      */
    public boolean hasKind() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'kind' field.
      * Enum to catalog the price type
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder clearKind() {
      kind = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ecomload_promo_info' field.
      * Ecomload promos data description
      * @return The value.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType getEcomloadPromoInfo() {
      return ecomload_promo_info;
    }


    /**
      * Sets the value of the 'ecomload_promo_info' field.
      * Ecomload promos data description
      * @param value The value of 'ecomload_promo_info'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder setEcomloadPromoInfo(com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType value) {
      validate(fields()[2], value);
      this.ecomload_promo_infoBuilder = null;
      this.ecomload_promo_info = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ecomload_promo_info' field has been set.
      * Ecomload promos data description
      * @return True if the 'ecomload_promo_info' field has been set, false otherwise.
      */
    public boolean hasEcomloadPromoInfo() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'ecomload_promo_info' field and creates one if it doesn't exist yet.
     * Ecomload promos data description
     * @return This builder.
     */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType.Builder getEcomloadPromoInfoBuilder() {
      if (ecomload_promo_infoBuilder == null) {
        if (hasEcomloadPromoInfo()) {
          setEcomloadPromoInfoBuilder(com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType.newBuilder(ecomload_promo_info));
        } else {
          setEcomloadPromoInfoBuilder(com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType.newBuilder());
        }
      }
      return ecomload_promo_infoBuilder;
    }

    /**
     * Sets the Builder instance for the 'ecomload_promo_info' field
     * Ecomload promos data description
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder setEcomloadPromoInfoBuilder(com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType.Builder value) {
      clearEcomloadPromoInfo();
      ecomload_promo_infoBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'ecomload_promo_info' field has an active Builder instance
     * Ecomload promos data description
     * @return True if the 'ecomload_promo_info' field has an active Builder instance
     */
    public boolean hasEcomloadPromoInfoBuilder() {
      return ecomload_promo_infoBuilder != null;
    }

    /**
      * Clears the value of the 'ecomload_promo_info' field.
      * Ecomload promos data description
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v2.ObservationType.Builder clearEcomloadPromoInfo() {
      ecomload_promo_info = null;
      ecomload_promo_infoBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ObservationType build() {
      try {
        ObservationType record = new ObservationType();
        record.description = fieldSetFlags()[0] ? this.description : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.kind = fieldSetFlags()[1] ? this.kind : (com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum) defaultValue(fields()[1]);
        if (ecomload_promo_infoBuilder != null) {
          try {
            record.ecomload_promo_info = this.ecomload_promo_infoBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("ecomload_promo_info"));
            throw e;
          }
        } else {
          record.ecomload_promo_info = fieldSetFlags()[2] ? this.ecomload_promo_info : (com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType) defaultValue(fields()[2]);
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
  private static final org.apache.avro.io.DatumWriter<ObservationType>
    WRITER$ = (org.apache.avro.io.DatumWriter<ObservationType>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ObservationType>
    READER$ = (org.apache.avro.io.DatumReader<ObservationType>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.description);

    out.writeEnum(this.kind.ordinal());

    if (this.ecomload_promo_info == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.ecomload_promo_info.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.description = in.readString(this.description instanceof Utf8 ? (Utf8)this.description : null);

      this.kind = com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum.values()[in.readEnum()];

      if (in.readIndex() != 1) {
        in.readNull();
        this.ecomload_promo_info = null;
      } else {
        if (this.ecomload_promo_info == null) {
          this.ecomload_promo_info = new com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType();
        }
        this.ecomload_promo_info.customDecode(in);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.description = in.readString(this.description instanceof Utf8 ? (Utf8)this.description : null);
          break;

        case 1:
          this.kind = com.inditex.mecc.ecomloadbk.api.avro.v2.KindTypeEnum.values()[in.readEnum()];
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ecomload_promo_info = null;
          } else {
            if (this.ecomload_promo_info == null) {
              this.ecomload_promo_info = new com.inditex.mecc.ecomloadbk.api.avro.v2.EcomloadPromoInfoType();
            }
            this.ecomload_promo_info.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










