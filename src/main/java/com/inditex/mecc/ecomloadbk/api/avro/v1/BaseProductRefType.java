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

/** Class that holds the reference information of a base product */
@org.apache.avro.specific.AvroGenerated
public class BaseProductRefType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6480392878858086722L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BaseProductRefType\",\"namespace\":\"com.inditex.mecc.ecomloadbk.api.avro.v1\",\"doc\":\"Class that holds the reference information of a base product\",\"fields\":[{\"name\":\"brand_id\",\"type\":\"int\",\"doc\":\"The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur)\"},{\"name\":\"type\",\"type\":\"int\",\"doc\":\"type of the product\"},{\"name\":\"model\",\"type\":\"int\",\"doc\":\"model of the product\"},{\"name\":\"quality\",\"type\":\"int\",\"doc\":\"quality of the product\"},{\"name\":\"season\",\"type\":\"string\",\"doc\":\"Season of the product\"},{\"name\":\"article_master_id\",\"type\":\"long\",\"doc\":\"db2 master article id from table maestros.articulo\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BaseProductRefType> ENCODER =
      new BinaryMessageEncoder<BaseProductRefType>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BaseProductRefType> DECODER =
      new BinaryMessageDecoder<BaseProductRefType>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<BaseProductRefType> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<BaseProductRefType> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<BaseProductRefType> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BaseProductRefType>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this BaseProductRefType to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a BaseProductRefType from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a BaseProductRefType instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static BaseProductRefType fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur) */
  @Deprecated public int brand_id;
  /** type of the product */
  @Deprecated public int type;
  /** model of the product */
  @Deprecated public int model;
  /** quality of the product */
  @Deprecated public int quality;
  /** Season of the product */
  @Deprecated public java.lang.CharSequence season;
  /** db2 master article id from table maestros.articulo */
  @Deprecated public long article_master_id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BaseProductRefType() {}

  /**
   * All-args constructor.
   * @param brand_id The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur)
   * @param type type of the product
   * @param model model of the product
   * @param quality quality of the product
   * @param season Season of the product
   * @param article_master_id db2 master article id from table maestros.articulo
   */
  public BaseProductRefType(java.lang.Integer brand_id, java.lang.Integer type, java.lang.Integer model, java.lang.Integer quality, java.lang.CharSequence season, java.lang.Long article_master_id) {
    this.brand_id = brand_id;
    this.type = type;
    this.model = model;
    this.quality = quality;
    this.season = season;
    this.article_master_id = article_master_id;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return brand_id;
    case 1: return type;
    case 2: return model;
    case 3: return quality;
    case 4: return season;
    case 5: return article_master_id;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: brand_id = (java.lang.Integer)value$; break;
    case 1: type = (java.lang.Integer)value$; break;
    case 2: model = (java.lang.Integer)value$; break;
    case 3: quality = (java.lang.Integer)value$; break;
    case 4: season = (java.lang.CharSequence)value$; break;
    case 5: article_master_id = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'brand_id' field.
   * @return The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur)
   */
  public int getBrandId() {
    return brand_id;
  }


  /**
   * Sets the value of the 'brand_id' field.
   * The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur)
   * @param value the value to set.
   */
  public void setBrandId(int value) {
    this.brand_id = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return type of the product
   */
  public int getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * type of the product
   * @param value the value to set.
   */
  public void setType(int value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'model' field.
   * @return model of the product
   */
  public int getModel() {
    return model;
  }


  /**
   * Sets the value of the 'model' field.
   * model of the product
   * @param value the value to set.
   */
  public void setModel(int value) {
    this.model = value;
  }

  /**
   * Gets the value of the 'quality' field.
   * @return quality of the product
   */
  public int getQuality() {
    return quality;
  }


  /**
   * Sets the value of the 'quality' field.
   * quality of the product
   * @param value the value to set.
   */
  public void setQuality(int value) {
    this.quality = value;
  }

  /**
   * Gets the value of the 'season' field.
   * @return Season of the product
   */
  public java.lang.CharSequence getSeason() {
    return season;
  }


  /**
   * Sets the value of the 'season' field.
   * Season of the product
   * @param value the value to set.
   */
  public void setSeason(java.lang.CharSequence value) {
    this.season = value;
  }

  /**
   * Gets the value of the 'article_master_id' field.
   * @return db2 master article id from table maestros.articulo
   */
  public long getArticleMasterId() {
    return article_master_id;
  }


  /**
   * Sets the value of the 'article_master_id' field.
   * db2 master article id from table maestros.articulo
   * @param value the value to set.
   */
  public void setArticleMasterId(long value) {
    this.article_master_id = value;
  }

  /**
   * Creates a new BaseProductRefType RecordBuilder.
   * @return A new BaseProductRefType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder newBuilder() {
    return new com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder();
  }

  /**
   * Creates a new BaseProductRefType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BaseProductRefType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder(other);
    }
  }

  /**
   * Creates a new BaseProductRefType RecordBuilder by copying an existing BaseProductRefType instance.
   * @param other The existing instance to copy.
   * @return A new BaseProductRefType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder(other);
    }
  }

  /**
   * RecordBuilder for BaseProductRefType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BaseProductRefType>
    implements org.apache.avro.data.RecordBuilder<BaseProductRefType> {

    /** The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur) */
    private int brand_id;
    /** type of the product */
    private int type;
    /** model of the product */
    private int model;
    /** quality of the product */
    private int quality;
    /** Season of the product */
    private java.lang.CharSequence season;
    /** db2 master article id from table maestros.articulo */
    private long article_master_id;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.brand_id)) {
        this.brand_id = data().deepCopy(fields()[0].schema(), other.brand_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.model)) {
        this.model = data().deepCopy(fields()[2].schema(), other.model);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.quality)) {
        this.quality = data().deepCopy(fields()[3].schema(), other.quality);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.season)) {
        this.season = data().deepCopy(fields()[4].schema(), other.season);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.article_master_id)) {
        this.article_master_id = data().deepCopy(fields()[5].schema(), other.article_master_id);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing BaseProductRefType instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.brand_id)) {
        this.brand_id = data().deepCopy(fields()[0].schema(), other.brand_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.model)) {
        this.model = data().deepCopy(fields()[2].schema(), other.model);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.quality)) {
        this.quality = data().deepCopy(fields()[3].schema(), other.quality);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.season)) {
        this.season = data().deepCopy(fields()[4].schema(), other.season);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.article_master_id)) {
        this.article_master_id = data().deepCopy(fields()[5].schema(), other.article_master_id);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'brand_id' field.
      * The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur)
      * @return The value.
      */
    public int getBrandId() {
      return brand_id;
    }


    /**
      * Sets the value of the 'brand_id' field.
      * The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur)
      * @param value The value of 'brand_id'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder setBrandId(int value) {
      validate(fields()[0], value);
      this.brand_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'brand_id' field has been set.
      * The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur)
      * @return True if the 'brand_id' field has been set, false otherwise.
      */
    public boolean hasBrandId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'brand_id' field.
      * The attribute represents the item ' brandId, Zara, will have, (Zara,ZaraHome,ZaraSur)
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder clearBrandId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * type of the product
      * @return The value.
      */
    public int getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * type of the product
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder setType(int value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * type of the product
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * type of the product
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder clearType() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'model' field.
      * model of the product
      * @return The value.
      */
    public int getModel() {
      return model;
    }


    /**
      * Sets the value of the 'model' field.
      * model of the product
      * @param value The value of 'model'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder setModel(int value) {
      validate(fields()[2], value);
      this.model = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'model' field has been set.
      * model of the product
      * @return True if the 'model' field has been set, false otherwise.
      */
    public boolean hasModel() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'model' field.
      * model of the product
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder clearModel() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'quality' field.
      * quality of the product
      * @return The value.
      */
    public int getQuality() {
      return quality;
    }


    /**
      * Sets the value of the 'quality' field.
      * quality of the product
      * @param value The value of 'quality'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder setQuality(int value) {
      validate(fields()[3], value);
      this.quality = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'quality' field has been set.
      * quality of the product
      * @return True if the 'quality' field has been set, false otherwise.
      */
    public boolean hasQuality() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'quality' field.
      * quality of the product
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder clearQuality() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'season' field.
      * Season of the product
      * @return The value.
      */
    public java.lang.CharSequence getSeason() {
      return season;
    }


    /**
      * Sets the value of the 'season' field.
      * Season of the product
      * @param value The value of 'season'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder setSeason(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.season = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'season' field has been set.
      * Season of the product
      * @return True if the 'season' field has been set, false otherwise.
      */
    public boolean hasSeason() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'season' field.
      * Season of the product
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder clearSeason() {
      season = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'article_master_id' field.
      * db2 master article id from table maestros.articulo
      * @return The value.
      */
    public long getArticleMasterId() {
      return article_master_id;
    }


    /**
      * Sets the value of the 'article_master_id' field.
      * db2 master article id from table maestros.articulo
      * @param value The value of 'article_master_id'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder setArticleMasterId(long value) {
      validate(fields()[5], value);
      this.article_master_id = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'article_master_id' field has been set.
      * db2 master article id from table maestros.articulo
      * @return True if the 'article_master_id' field has been set, false otherwise.
      */
    public boolean hasArticleMasterId() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'article_master_id' field.
      * db2 master article id from table maestros.articulo
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.BaseProductRefType.Builder clearArticleMasterId() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BaseProductRefType build() {
      try {
        BaseProductRefType record = new BaseProductRefType();
        record.brand_id = fieldSetFlags()[0] ? this.brand_id : (java.lang.Integer) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.lang.Integer) defaultValue(fields()[1]);
        record.model = fieldSetFlags()[2] ? this.model : (java.lang.Integer) defaultValue(fields()[2]);
        record.quality = fieldSetFlags()[3] ? this.quality : (java.lang.Integer) defaultValue(fields()[3]);
        record.season = fieldSetFlags()[4] ? this.season : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.article_master_id = fieldSetFlags()[5] ? this.article_master_id : (java.lang.Long) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BaseProductRefType>
    WRITER$ = (org.apache.avro.io.DatumWriter<BaseProductRefType>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BaseProductRefType>
    READER$ = (org.apache.avro.io.DatumReader<BaseProductRefType>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.brand_id);

    out.writeInt(this.type);

    out.writeInt(this.model);

    out.writeInt(this.quality);

    out.writeString(this.season);

    out.writeLong(this.article_master_id);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.brand_id = in.readInt();

      this.type = in.readInt();

      this.model = in.readInt();

      this.quality = in.readInt();

      this.season = in.readString(this.season instanceof Utf8 ? (Utf8)this.season : null);

      this.article_master_id = in.readLong();

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.brand_id = in.readInt();
          break;

        case 1:
          this.type = in.readInt();
          break;

        case 2:
          this.model = in.readInt();
          break;

        case 3:
          this.quality = in.readInt();
          break;

        case 4:
          this.season = in.readString(this.season instanceof Utf8 ? (Utf8)this.season : null);
          break;

        case 5:
          this.article_master_id = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










