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

/** Class that holds color information such names and identifier. */
@org.apache.avro.specific.AvroGenerated
public class Color extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7169747536850835994L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Color\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that holds color information such names and identifier.\",\"fields\":[{\"name\":\"color_id\",\"type\":\"string\",\"doc\":\"Color's identifier.\"},{\"name\":\"color_names\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"I18NText\",\"doc\":\"Class that holds a text and its locale ISO code.\",\"fields\":[{\"name\":\"iso_code\",\"type\":\"string\",\"doc\":\"Locale ISO code.\"},{\"name\":\"text\",\"type\":\"string\",\"doc\":\"Internationalized text.\"}]}},\"doc\":\"Color's name in a bunch of locales.\",\"default\":[]},{\"name\":\"gammas\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"GammaDesc\",\"doc\":\"Class that holds gamma's information.\",\"fields\":[{\"name\":\"id\",\"type\":\"long\",\"doc\":\"Gamma's identifier.\"},{\"name\":\"gamma_name\",\"type\":{\"type\":\"array\",\"items\":\"I18NText\"},\"doc\":\"Size's name in a bunch of locales.\",\"default\":[]}]}},\"doc\":\"List of color gammas.\",\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Color> ENCODER =
      new BinaryMessageEncoder<Color>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Color> DECODER =
      new BinaryMessageDecoder<Color>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Color> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Color> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Color> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Color>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Color to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Color from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Color instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Color fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Color's identifier. */
  @Deprecated public java.lang.CharSequence color_id;
  /** Color's name in a bunch of locales. */
  @Deprecated public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> color_names;
  /** List of color gammas. */
  @Deprecated public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> gammas;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Color() {}

  /**
   * All-args constructor.
   * @param color_id Color's identifier.
   * @param color_names Color's name in a bunch of locales.
   * @param gammas List of color gammas.
   */
  public Color(java.lang.CharSequence color_id, java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> color_names, java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> gammas) {
    this.color_id = color_id;
    this.color_names = color_names;
    this.gammas = gammas;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return color_id;
    case 1: return color_names;
    case 2: return gammas;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: color_id = (java.lang.CharSequence)value$; break;
    case 1: color_names = (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>)value$; break;
    case 2: gammas = (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'color_id' field.
   * @return Color's identifier.
   */
  public java.lang.CharSequence getColorId() {
    return color_id;
  }


  /**
   * Sets the value of the 'color_id' field.
   * Color's identifier.
   * @param value the value to set.
   */
  public void setColorId(java.lang.CharSequence value) {
    this.color_id = value;
  }

  /**
   * Gets the value of the 'color_names' field.
   * @return Color's name in a bunch of locales.
   */
  public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> getColorNames() {
    return color_names;
  }


  /**
   * Sets the value of the 'color_names' field.
   * Color's name in a bunch of locales.
   * @param value the value to set.
   */
  public void setColorNames(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> value) {
    this.color_names = value;
  }

  /**
   * Gets the value of the 'gammas' field.
   * @return List of color gammas.
   */
  public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> getGammas() {
    return gammas;
  }


  /**
   * Sets the value of the 'gammas' field.
   * List of color gammas.
   * @param value the value to set.
   */
  public void setGammas(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> value) {
    this.gammas = value;
  }

  /**
   * Creates a new Color RecordBuilder.
   * @return A new Color RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder();
  }

  /**
   * Creates a new Color RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Color RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder(other);
    }
  }

  /**
   * Creates a new Color RecordBuilder by copying an existing Color instance.
   * @param other The existing instance to copy.
   * @return A new Color RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.Color other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder(other);
    }
  }

  /**
   * RecordBuilder for Color instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Color>
    implements org.apache.avro.data.RecordBuilder<Color> {

    /** Color's identifier. */
    private java.lang.CharSequence color_id;
    /** Color's name in a bunch of locales. */
    private java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> color_names;
    /** List of color gammas. */
    private java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> gammas;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.color_id)) {
        this.color_id = data().deepCopy(fields()[0].schema(), other.color_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.color_names)) {
        this.color_names = data().deepCopy(fields()[1].schema(), other.color_names);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.gammas)) {
        this.gammas = data().deepCopy(fields()[2].schema(), other.gammas);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Color instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.Color other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.color_id)) {
        this.color_id = data().deepCopy(fields()[0].schema(), other.color_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.color_names)) {
        this.color_names = data().deepCopy(fields()[1].schema(), other.color_names);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.gammas)) {
        this.gammas = data().deepCopy(fields()[2].schema(), other.gammas);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'color_id' field.
      * Color's identifier.
      * @return The value.
      */
    public java.lang.CharSequence getColorId() {
      return color_id;
    }


    /**
      * Sets the value of the 'color_id' field.
      * Color's identifier.
      * @param value The value of 'color_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder setColorId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.color_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'color_id' field has been set.
      * Color's identifier.
      * @return True if the 'color_id' field has been set, false otherwise.
      */
    public boolean hasColorId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'color_id' field.
      * Color's identifier.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder clearColorId() {
      color_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'color_names' field.
      * Color's name in a bunch of locales.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> getColorNames() {
      return color_names;
    }


    /**
      * Sets the value of the 'color_names' field.
      * Color's name in a bunch of locales.
      * @param value The value of 'color_names'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder setColorNames(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> value) {
      validate(fields()[1], value);
      this.color_names = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'color_names' field has been set.
      * Color's name in a bunch of locales.
      * @return True if the 'color_names' field has been set, false otherwise.
      */
    public boolean hasColorNames() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'color_names' field.
      * Color's name in a bunch of locales.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder clearColorNames() {
      color_names = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'gammas' field.
      * List of color gammas.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> getGammas() {
      return gammas;
    }


    /**
      * Sets the value of the 'gammas' field.
      * List of color gammas.
      * @param value The value of 'gammas'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder setGammas(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> value) {
      validate(fields()[2], value);
      this.gammas = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'gammas' field has been set.
      * List of color gammas.
      * @return True if the 'gammas' field has been set, false otherwise.
      */
    public boolean hasGammas() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'gammas' field.
      * List of color gammas.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Color.Builder clearGammas() {
      gammas = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Color build() {
      try {
        Color record = new Color();
        record.color_id = fieldSetFlags()[0] ? this.color_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.color_names = fieldSetFlags()[1] ? this.color_names : (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>) defaultValue(fields()[1]);
        record.gammas = fieldSetFlags()[2] ? this.gammas : (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Color>
    WRITER$ = (org.apache.avro.io.DatumWriter<Color>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Color>
    READER$ = (org.apache.avro.io.DatumReader<Color>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.color_id);

    long size0 = this.color_names.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.inditex.mecc.mecprwat.api.avro.v2.I18NText e0: this.color_names) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    long size1 = this.gammas.size();
    out.writeArrayStart();
    out.setItemCount(size1);
    long actualSize1 = 0;
    for (com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc e1: this.gammas) {
      actualSize1++;
      out.startItem();
      e1.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize1 != size1)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size1 + ", but element count was " + actualSize1 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.color_id = in.readString(this.color_id instanceof Utf8 ? (Utf8)this.color_id : null);

      long size0 = in.readArrayStart();
      java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> a0 = this.color_names;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>((int)size0, SCHEMA$.getField("color_names").schema());
        this.color_names = a0;
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

      long size1 = in.readArrayStart();
      java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> a1 = this.gammas;
      if (a1 == null) {
        a1 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc>((int)size1, SCHEMA$.getField("gammas").schema());
        this.gammas = a1;
      } else a1.clear();
      SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc>)a1 : null);
      for ( ; 0 < size1; size1 = in.arrayNext()) {
        for ( ; size1 != 0; size1--) {
          com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc e1 = (ga1 != null ? ga1.peek() : null);
          if (e1 == null) {
            e1 = new com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc();
          }
          e1.customDecode(in);
          a1.add(e1);
        }
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.color_id = in.readString(this.color_id instanceof Utf8 ? (Utf8)this.color_id : null);
          break;

        case 1:
          long size0 = in.readArrayStart();
          java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> a0 = this.color_names;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>((int)size0, SCHEMA$.getField("color_names").schema());
            this.color_names = a0;
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

        case 2:
          long size1 = in.readArrayStart();
          java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> a1 = this.gammas;
          if (a1 == null) {
            a1 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc>((int)size1, SCHEMA$.getField("gammas").schema());
            this.gammas = a1;
          } else a1.clear();
          SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc>)a1 : null);
          for ( ; 0 < size1; size1 = in.arrayNext()) {
            for ( ; size1 != 0; size1--) {
              com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc e1 = (ga1 != null ? ga1.peek() : null);
              if (e1 == null) {
                e1 = new com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc();
              }
              e1.customDecode(in);
              a1.add(e1);
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










