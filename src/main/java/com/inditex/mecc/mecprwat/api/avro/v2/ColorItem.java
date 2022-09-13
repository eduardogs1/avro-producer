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

/** Holds colors of the commercial component. */
@org.apache.avro.specific.AvroGenerated
public class ColorItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3978944376914103763L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ColorItem\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Holds colors of the commercial component.\",\"fields\":[{\"name\":\"color_id\",\"type\":\"string\",\"doc\":\"Child commercial component color id.\"},{\"name\":\"gammas\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Gamma\",\"doc\":\"Class that holds gamma information.\",\"fields\":[{\"name\":\"gamma_id\",\"type\":\"long\",\"doc\":\"Gamma id of color.\"},{\"name\":\"position\",\"type\":\"long\",\"doc\":\"Correlation index of the gamma.\"},{\"name\":\"hex_code\",\"type\":\"string\",\"doc\":\"Hexadecimal code of the gamma.\"}]}},\"doc\":\"Gammas info of the color.\",\"default\":[]},{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Item\",\"doc\":\"Holds basic data of a child commercial component.\",\"fields\":[{\"name\":\"item_id\",\"type\":\"long\",\"doc\":\"Child commercial component unique id.\"},{\"name\":\"size_id\",\"type\":\"long\",\"doc\":\"Child commercial component size id.\"},{\"name\":\"is_buyable\",\"type\":\"boolean\",\"doc\":\"Indicates whether the item is buyable or not.\"},{\"name\":\"reference\",\"type\":\"string\",\"doc\":\"Child commercial component partnumber.\"},{\"name\":\"hscode\",\"type\":[\"null\",\"long\"],\"doc\":\"Tariff heading code used by finances.\",\"default\":null},{\"name\":\"country_manufacture\",\"type\":[\"null\",\"string\"],\"doc\":\"Code indicating the country of manufacture\",\"default\":null},{\"name\":\"join_life\",\"type\":[\"null\",\"string\"],\"doc\":\"Join life code.\"},{\"name\":\"marks\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Marks at item level\",\"default\":[]},{\"name\":\"measures\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Measure\",\"doc\":\"Class that holds the information about an individual measure.\",\"fields\":[{\"name\":\"kind\",\"type\":\"string\",\"doc\":\"Kind of measure [weight, length, width, height]\"},{\"name\":\"unit\",\"type\":\"string\",\"doc\":\"Unit of the measure\"},{\"name\":\"value\",\"type\":\"double\",\"doc\":\"Measure value\"},{\"name\":\"store_id\",\"type\":[\"null\",\"long\"],\"doc\":\"StoreId of the measure\",\"default\":null}]}},\"doc\":\"Indicates measures for an item\",\"default\":[]},{\"name\":\"additional_info\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\",\"default\":{}}],\"doc\":\"Optional with dynamic additional information.\",\"default\":null}]}},\"doc\":\"Items contained by this color.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ColorItem> ENCODER =
      new BinaryMessageEncoder<ColorItem>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ColorItem> DECODER =
      new BinaryMessageDecoder<ColorItem>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ColorItem> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ColorItem> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ColorItem> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ColorItem>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ColorItem to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ColorItem from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ColorItem instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ColorItem fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Child commercial component color id. */
  @Deprecated public java.lang.CharSequence color_id;
  /** Gammas info of the color. */
  @Deprecated public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> gammas;
  /** Items contained by this color. */
  @Deprecated public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item> items;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ColorItem() {}

  /**
   * All-args constructor.
   * @param color_id Child commercial component color id.
   * @param gammas Gammas info of the color.
   * @param items Items contained by this color.
   */
  public ColorItem(java.lang.CharSequence color_id, java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> gammas, java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item> items) {
    this.color_id = color_id;
    this.gammas = gammas;
    this.items = items;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return color_id;
    case 1: return gammas;
    case 2: return items;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: color_id = (java.lang.CharSequence)value$; break;
    case 1: gammas = (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma>)value$; break;
    case 2: items = (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'color_id' field.
   * @return Child commercial component color id.
   */
  public java.lang.CharSequence getColorId() {
    return color_id;
  }


  /**
   * Sets the value of the 'color_id' field.
   * Child commercial component color id.
   * @param value the value to set.
   */
  public void setColorId(java.lang.CharSequence value) {
    this.color_id = value;
  }

  /**
   * Gets the value of the 'gammas' field.
   * @return Gammas info of the color.
   */
  public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> getGammas() {
    return gammas;
  }


  /**
   * Sets the value of the 'gammas' field.
   * Gammas info of the color.
   * @param value the value to set.
   */
  public void setGammas(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> value) {
    this.gammas = value;
  }

  /**
   * Gets the value of the 'items' field.
   * @return Items contained by this color.
   */
  public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item> getItems() {
    return items;
  }


  /**
   * Sets the value of the 'items' field.
   * Items contained by this color.
   * @param value the value to set.
   */
  public void setItems(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item> value) {
    this.items = value;
  }

  /**
   * Creates a new ColorItem RecordBuilder.
   * @return A new ColorItem RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder();
  }

  /**
   * Creates a new ColorItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ColorItem RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder(other);
    }
  }

  /**
   * Creates a new ColorItem RecordBuilder by copying an existing ColorItem instance.
   * @param other The existing instance to copy.
   * @return A new ColorItem RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ColorItem other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder(other);
    }
  }

  /**
   * RecordBuilder for ColorItem instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ColorItem>
    implements org.apache.avro.data.RecordBuilder<ColorItem> {

    /** Child commercial component color id. */
    private java.lang.CharSequence color_id;
    /** Gammas info of the color. */
    private java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> gammas;
    /** Items contained by this color. */
    private java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item> items;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.color_id)) {
        this.color_id = data().deepCopy(fields()[0].schema(), other.color_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.gammas)) {
        this.gammas = data().deepCopy(fields()[1].schema(), other.gammas);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.items)) {
        this.items = data().deepCopy(fields()[2].schema(), other.items);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing ColorItem instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ColorItem other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.color_id)) {
        this.color_id = data().deepCopy(fields()[0].schema(), other.color_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.gammas)) {
        this.gammas = data().deepCopy(fields()[1].schema(), other.gammas);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.items)) {
        this.items = data().deepCopy(fields()[2].schema(), other.items);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'color_id' field.
      * Child commercial component color id.
      * @return The value.
      */
    public java.lang.CharSequence getColorId() {
      return color_id;
    }


    /**
      * Sets the value of the 'color_id' field.
      * Child commercial component color id.
      * @param value The value of 'color_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder setColorId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.color_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'color_id' field has been set.
      * Child commercial component color id.
      * @return True if the 'color_id' field has been set, false otherwise.
      */
    public boolean hasColorId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'color_id' field.
      * Child commercial component color id.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder clearColorId() {
      color_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'gammas' field.
      * Gammas info of the color.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> getGammas() {
      return gammas;
    }


    /**
      * Sets the value of the 'gammas' field.
      * Gammas info of the color.
      * @param value The value of 'gammas'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder setGammas(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> value) {
      validate(fields()[1], value);
      this.gammas = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'gammas' field has been set.
      * Gammas info of the color.
      * @return True if the 'gammas' field has been set, false otherwise.
      */
    public boolean hasGammas() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'gammas' field.
      * Gammas info of the color.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder clearGammas() {
      gammas = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'items' field.
      * Items contained by this color.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item> getItems() {
      return items;
    }


    /**
      * Sets the value of the 'items' field.
      * Items contained by this color.
      * @param value The value of 'items'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder setItems(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item> value) {
      validate(fields()[2], value);
      this.items = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'items' field has been set.
      * Items contained by this color.
      * @return True if the 'items' field has been set, false otherwise.
      */
    public boolean hasItems() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'items' field.
      * Items contained by this color.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ColorItem.Builder clearItems() {
      items = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ColorItem build() {
      try {
        ColorItem record = new ColorItem();
        record.color_id = fieldSetFlags()[0] ? this.color_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.gammas = fieldSetFlags()[1] ? this.gammas : (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma>) defaultValue(fields()[1]);
        record.items = fieldSetFlags()[2] ? this.items : (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ColorItem>
    WRITER$ = (org.apache.avro.io.DatumWriter<ColorItem>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ColorItem>
    READER$ = (org.apache.avro.io.DatumReader<ColorItem>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.color_id);

    long size0 = this.gammas.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.inditex.mecc.mecprwat.api.avro.v2.Gamma e0: this.gammas) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    long size1 = this.items.size();
    out.writeArrayStart();
    out.setItemCount(size1);
    long actualSize1 = 0;
    for (com.inditex.mecc.mecprwat.api.avro.v2.Item e1: this.items) {
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
      java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> a0 = this.gammas;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Gamma>((int)size0, SCHEMA$.getField("gammas").schema());
        this.gammas = a0;
      } else a0.clear();
      SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Gamma>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.inditex.mecc.mecprwat.api.avro.v2.Gamma e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.inditex.mecc.mecprwat.api.avro.v2.Gamma();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

      long size1 = in.readArrayStart();
      java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item> a1 = this.items;
      if (a1 == null) {
        a1 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Item>((int)size1, SCHEMA$.getField("items").schema());
        this.items = a1;
      } else a1.clear();
      SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Item> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Item>)a1 : null);
      for ( ; 0 < size1; size1 = in.arrayNext()) {
        for ( ; size1 != 0; size1--) {
          com.inditex.mecc.mecprwat.api.avro.v2.Item e1 = (ga1 != null ? ga1.peek() : null);
          if (e1 == null) {
            e1 = new com.inditex.mecc.mecprwat.api.avro.v2.Item();
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
          java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> a0 = this.gammas;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Gamma>((int)size0, SCHEMA$.getField("gammas").schema());
            this.gammas = a0;
          } else a0.clear();
          SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Gamma> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Gamma>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.inditex.mecc.mecprwat.api.avro.v2.Gamma e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.inditex.mecc.mecprwat.api.avro.v2.Gamma();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        case 2:
          long size1 = in.readArrayStart();
          java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.Item> a1 = this.items;
          if (a1 == null) {
            a1 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Item>((int)size1, SCHEMA$.getField("items").schema());
            this.items = a1;
          } else a1.clear();
          SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Item> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.Item>)a1 : null);
          for ( ; 0 < size1; size1 = in.arrayNext()) {
            for ( ; size1 != 0; size1--) {
              com.inditex.mecc.mecprwat.api.avro.v2.Item e1 = (ga1 != null ? ga1.peek() : null);
              if (e1 == null) {
                e1 = new com.inditex.mecc.mecprwat.api.avro.v2.Item();
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









