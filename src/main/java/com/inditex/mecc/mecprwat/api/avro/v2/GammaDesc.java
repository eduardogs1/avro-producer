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

/** Class that holds gamma's information. */
@org.apache.avro.specific.AvroGenerated
public class GammaDesc extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -956902675446271209L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GammaDesc\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that holds gamma's information.\",\"fields\":[{\"name\":\"id\",\"type\":\"long\",\"doc\":\"Gamma's identifier.\"},{\"name\":\"gamma_name\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"I18NText\",\"doc\":\"Class that holds a text and its locale ISO code.\",\"fields\":[{\"name\":\"iso_code\",\"type\":\"string\",\"doc\":\"Locale ISO code.\"},{\"name\":\"text\",\"type\":\"string\",\"doc\":\"Internationalized text.\"}]}},\"doc\":\"Size's name in a bunch of locales.\",\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GammaDesc> ENCODER =
      new BinaryMessageEncoder<GammaDesc>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GammaDesc> DECODER =
      new BinaryMessageDecoder<GammaDesc>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GammaDesc> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GammaDesc> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GammaDesc> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GammaDesc>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GammaDesc to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GammaDesc from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GammaDesc instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GammaDesc fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Gamma's identifier. */
  @Deprecated public long id;
  /** Size's name in a bunch of locales. */
  @Deprecated public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> gamma_name;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GammaDesc() {}

  /**
   * All-args constructor.
   * @param id Gamma's identifier.
   * @param gamma_name Size's name in a bunch of locales.
   */
  public GammaDesc(java.lang.Long id, java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> gamma_name) {
    this.id = id;
    this.gamma_name = gamma_name;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return gamma_name;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: gamma_name = (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return Gamma's identifier.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * Gamma's identifier.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'gamma_name' field.
   * @return Size's name in a bunch of locales.
   */
  public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> getGammaName() {
    return gamma_name;
  }


  /**
   * Sets the value of the 'gamma_name' field.
   * Size's name in a bunch of locales.
   * @param value the value to set.
   */
  public void setGammaName(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> value) {
    this.gamma_name = value;
  }

  /**
   * Creates a new GammaDesc RecordBuilder.
   * @return A new GammaDesc RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder();
  }

  /**
   * Creates a new GammaDesc RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GammaDesc RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder(other);
    }
  }

  /**
   * Creates a new GammaDesc RecordBuilder by copying an existing GammaDesc instance.
   * @param other The existing instance to copy.
   * @return A new GammaDesc RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder(other);
    }
  }

  /**
   * RecordBuilder for GammaDesc instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GammaDesc>
    implements org.apache.avro.data.RecordBuilder<GammaDesc> {

    /** Gamma's identifier. */
    private long id;
    /** Size's name in a bunch of locales. */
    private java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> gamma_name;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.gamma_name)) {
        this.gamma_name = data().deepCopy(fields()[1].schema(), other.gamma_name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing GammaDesc instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.gamma_name)) {
        this.gamma_name = data().deepCopy(fields()[1].schema(), other.gamma_name);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * Gamma's identifier.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * Gamma's identifier.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * Gamma's identifier.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * Gamma's identifier.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'gamma_name' field.
      * Size's name in a bunch of locales.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> getGammaName() {
      return gamma_name;
    }


    /**
      * Sets the value of the 'gamma_name' field.
      * Size's name in a bunch of locales.
      * @param value The value of 'gamma_name'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder setGammaName(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> value) {
      validate(fields()[1], value);
      this.gamma_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'gamma_name' field has been set.
      * Size's name in a bunch of locales.
      * @return True if the 'gamma_name' field has been set, false otherwise.
      */
    public boolean hasGammaName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'gamma_name' field.
      * Size's name in a bunch of locales.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.GammaDesc.Builder clearGammaName() {
      gamma_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GammaDesc build() {
      try {
        GammaDesc record = new GammaDesc();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.gamma_name = fieldSetFlags()[1] ? this.gamma_name : (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GammaDesc>
    WRITER$ = (org.apache.avro.io.DatumWriter<GammaDesc>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GammaDesc>
    READER$ = (org.apache.avro.io.DatumReader<GammaDesc>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    long size0 = this.gamma_name.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.inditex.mecc.mecprwat.api.avro.v2.I18NText e0: this.gamma_name) {
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
      this.id = in.readLong();

      long size0 = in.readArrayStart();
      java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> a0 = this.gamma_name;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>((int)size0, SCHEMA$.getField("gamma_name").schema());
        this.gamma_name = a0;
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
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          long size0 = in.readArrayStart();
          java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> a0 = this.gamma_name;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>((int)size0, SCHEMA$.getField("gamma_name").schema());
            this.gamma_name = a0;
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









