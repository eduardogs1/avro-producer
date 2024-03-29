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

/** Class that holds item's information. */
@org.apache.avro.specific.AvroGenerated
public class ExtendedInfoItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7943363280257794957L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ExtendedInfoItem\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that holds item's information.\",\"fields\":[{\"name\":\"item_id\",\"type\":\"long\",\"doc\":\"Item's identifier.\"},{\"name\":\"item_composition_id\",\"type\":[\"null\",\"long\"],\"doc\":\"Id of the item composition\",\"default\":null},{\"name\":\"additional_info\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\",\"default\":{}}],\"doc\":\"Optional with dynamic additional information.\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ExtendedInfoItem> ENCODER =
      new BinaryMessageEncoder<ExtendedInfoItem>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ExtendedInfoItem> DECODER =
      new BinaryMessageDecoder<ExtendedInfoItem>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ExtendedInfoItem> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ExtendedInfoItem> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ExtendedInfoItem> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ExtendedInfoItem>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ExtendedInfoItem to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ExtendedInfoItem from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ExtendedInfoItem instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ExtendedInfoItem fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Item's identifier. */
  @Deprecated public long item_id;
  /** Id of the item composition */
  @Deprecated public java.lang.Long item_composition_id;
  /** Optional with dynamic additional information. */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> additional_info;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ExtendedInfoItem() {}

  /**
   * All-args constructor.
   * @param item_id Item's identifier.
   * @param item_composition_id Id of the item composition
   * @param additional_info Optional with dynamic additional information.
   */
  public ExtendedInfoItem(java.lang.Long item_id, java.lang.Long item_composition_id, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> additional_info) {
    this.item_id = item_id;
    this.item_composition_id = item_composition_id;
    this.additional_info = additional_info;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return item_id;
    case 1: return item_composition_id;
    case 2: return additional_info;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: item_id = (java.lang.Long)value$; break;
    case 1: item_composition_id = (java.lang.Long)value$; break;
    case 2: additional_info = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'item_id' field.
   * @return Item's identifier.
   */
  public long getItemId() {
    return item_id;
  }


  /**
   * Sets the value of the 'item_id' field.
   * Item's identifier.
   * @param value the value to set.
   */
  public void setItemId(long value) {
    this.item_id = value;
  }

  /**
   * Gets the value of the 'item_composition_id' field.
   * @return Id of the item composition
   */
  public java.lang.Long getItemCompositionId() {
    return item_composition_id;
  }


  /**
   * Sets the value of the 'item_composition_id' field.
   * Id of the item composition
   * @param value the value to set.
   */
  public void setItemCompositionId(java.lang.Long value) {
    this.item_composition_id = value;
  }

  /**
   * Gets the value of the 'additional_info' field.
   * @return Optional with dynamic additional information.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getAdditionalInfo() {
    return additional_info;
  }


  /**
   * Sets the value of the 'additional_info' field.
   * Optional with dynamic additional information.
   * @param value the value to set.
   */
  public void setAdditionalInfo(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.additional_info = value;
  }

  /**
   * Creates a new ExtendedInfoItem RecordBuilder.
   * @return A new ExtendedInfoItem RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder();
  }

  /**
   * Creates a new ExtendedInfoItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ExtendedInfoItem RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder(other);
    }
  }

  /**
   * Creates a new ExtendedInfoItem RecordBuilder by copying an existing ExtendedInfoItem instance.
   * @param other The existing instance to copy.
   * @return A new ExtendedInfoItem RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder(other);
    }
  }

  /**
   * RecordBuilder for ExtendedInfoItem instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ExtendedInfoItem>
    implements org.apache.avro.data.RecordBuilder<ExtendedInfoItem> {

    /** Item's identifier. */
    private long item_id;
    /** Id of the item composition */
    private java.lang.Long item_composition_id;
    /** Optional with dynamic additional information. */
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> additional_info;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.item_id)) {
        this.item_id = data().deepCopy(fields()[0].schema(), other.item_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.item_composition_id)) {
        this.item_composition_id = data().deepCopy(fields()[1].schema(), other.item_composition_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.additional_info)) {
        this.additional_info = data().deepCopy(fields()[2].schema(), other.additional_info);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing ExtendedInfoItem instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.item_id)) {
        this.item_id = data().deepCopy(fields()[0].schema(), other.item_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.item_composition_id)) {
        this.item_composition_id = data().deepCopy(fields()[1].schema(), other.item_composition_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.additional_info)) {
        this.additional_info = data().deepCopy(fields()[2].schema(), other.additional_info);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'item_id' field.
      * Item's identifier.
      * @return The value.
      */
    public long getItemId() {
      return item_id;
    }


    /**
      * Sets the value of the 'item_id' field.
      * Item's identifier.
      * @param value The value of 'item_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder setItemId(long value) {
      validate(fields()[0], value);
      this.item_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'item_id' field has been set.
      * Item's identifier.
      * @return True if the 'item_id' field has been set, false otherwise.
      */
    public boolean hasItemId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'item_id' field.
      * Item's identifier.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder clearItemId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'item_composition_id' field.
      * Id of the item composition
      * @return The value.
      */
    public java.lang.Long getItemCompositionId() {
      return item_composition_id;
    }


    /**
      * Sets the value of the 'item_composition_id' field.
      * Id of the item composition
      * @param value The value of 'item_composition_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder setItemCompositionId(java.lang.Long value) {
      validate(fields()[1], value);
      this.item_composition_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'item_composition_id' field has been set.
      * Id of the item composition
      * @return True if the 'item_composition_id' field has been set, false otherwise.
      */
    public boolean hasItemCompositionId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'item_composition_id' field.
      * Id of the item composition
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder clearItemCompositionId() {
      item_composition_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'additional_info' field.
      * Optional with dynamic additional information.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getAdditionalInfo() {
      return additional_info;
    }


    /**
      * Sets the value of the 'additional_info' field.
      * Optional with dynamic additional information.
      * @param value The value of 'additional_info'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder setAdditionalInfo(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.additional_info = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'additional_info' field has been set.
      * Optional with dynamic additional information.
      * @return True if the 'additional_info' field has been set, false otherwise.
      */
    public boolean hasAdditionalInfo() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'additional_info' field.
      * Optional with dynamic additional information.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.ExtendedInfoItem.Builder clearAdditionalInfo() {
      additional_info = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ExtendedInfoItem build() {
      try {
        ExtendedInfoItem record = new ExtendedInfoItem();
        record.item_id = fieldSetFlags()[0] ? this.item_id : (java.lang.Long) defaultValue(fields()[0]);
        record.item_composition_id = fieldSetFlags()[1] ? this.item_composition_id : (java.lang.Long) defaultValue(fields()[1]);
        record.additional_info = fieldSetFlags()[2] ? this.additional_info : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ExtendedInfoItem>
    WRITER$ = (org.apache.avro.io.DatumWriter<ExtendedInfoItem>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ExtendedInfoItem>
    READER$ = (org.apache.avro.io.DatumReader<ExtendedInfoItem>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.item_id);

    if (this.item_composition_id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.item_composition_id);
    }

    if (this.additional_info == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.additional_info.size();
      out.writeMapStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> e0: this.additional_info.entrySet()) {
        actualSize0++;
        out.startItem();
        out.writeString(e0.getKey());
        java.lang.CharSequence v0 = e0.getValue();
        out.writeString(v0);
      }
      out.writeMapEnd();
      if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.item_id = in.readLong();

      if (in.readIndex() != 1) {
        in.readNull();
        this.item_composition_id = null;
      } else {
        this.item_composition_id = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.additional_info = null;
      } else {
        long size0 = in.readMapStart();
        java.util.Map<java.lang.CharSequence,java.lang.CharSequence> m0 = this.additional_info; // Need fresh name due to limitation of macro system
        if (m0 == null) {
          m0 = new java.util.HashMap<java.lang.CharSequence,java.lang.CharSequence>((int)size0);
          this.additional_info = m0;
        } else m0.clear();
        for ( ; 0 < size0; size0 = in.mapNext()) {
          for ( ; size0 != 0; size0--) {
            java.lang.CharSequence k0 = null;
            k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
            java.lang.CharSequence v0 = null;
            v0 = in.readString(v0 instanceof Utf8 ? (Utf8)v0 : null);
            m0.put(k0, v0);
          }
        }
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.item_id = in.readLong();
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.item_composition_id = null;
          } else {
            this.item_composition_id = in.readLong();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.additional_info = null;
          } else {
            long size0 = in.readMapStart();
            java.util.Map<java.lang.CharSequence,java.lang.CharSequence> m0 = this.additional_info; // Need fresh name due to limitation of macro system
            if (m0 == null) {
              m0 = new java.util.HashMap<java.lang.CharSequence,java.lang.CharSequence>((int)size0);
              this.additional_info = m0;
            } else m0.clear();
            for ( ; 0 < size0; size0 = in.mapNext()) {
              for ( ; size0 != 0; size0--) {
                java.lang.CharSequence k0 = null;
                k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
                java.lang.CharSequence v0 = null;
                v0 = in.readString(v0 instanceof Utf8 ? (Utf8)v0 : null);
                m0.put(k0, v0);
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










