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

/** Class that holds a text and its locale ISO code. */
@org.apache.avro.specific.AvroGenerated
public class I18NText extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5451392955639102004L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"I18NText\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that holds a text and its locale ISO code.\",\"fields\":[{\"name\":\"iso_code\",\"type\":\"string\",\"doc\":\"Locale ISO code.\"},{\"name\":\"text\",\"type\":\"string\",\"doc\":\"Internationalized text.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<I18NText> ENCODER =
      new BinaryMessageEncoder<I18NText>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<I18NText> DECODER =
      new BinaryMessageDecoder<I18NText>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<I18NText> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<I18NText> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<I18NText> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<I18NText>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this I18NText to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a I18NText from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a I18NText instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static I18NText fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Locale ISO code. */
  @Deprecated public java.lang.CharSequence iso_code;
  /** Internationalized text. */
  @Deprecated public java.lang.CharSequence text;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public I18NText() {}

  /**
   * All-args constructor.
   * @param iso_code Locale ISO code.
   * @param text Internationalized text.
   */
  public I18NText(java.lang.CharSequence iso_code, java.lang.CharSequence text) {
    this.iso_code = iso_code;
    this.text = text;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return iso_code;
    case 1: return text;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: iso_code = (java.lang.CharSequence)value$; break;
    case 1: text = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'iso_code' field.
   * @return Locale ISO code.
   */
  public java.lang.CharSequence getIsoCode() {
    return iso_code;
  }


  /**
   * Sets the value of the 'iso_code' field.
   * Locale ISO code.
   * @param value the value to set.
   */
  public void setIsoCode(java.lang.CharSequence value) {
    this.iso_code = value;
  }

  /**
   * Gets the value of the 'text' field.
   * @return Internationalized text.
   */
  public java.lang.CharSequence getText() {
    return text;
  }


  /**
   * Sets the value of the 'text' field.
   * Internationalized text.
   * @param value the value to set.
   */
  public void setText(java.lang.CharSequence value) {
    this.text = value;
  }

  /**
   * Creates a new I18NText RecordBuilder.
   * @return A new I18NText RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder();
  }

  /**
   * Creates a new I18NText RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new I18NText RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder(other);
    }
  }

  /**
   * Creates a new I18NText RecordBuilder by copying an existing I18NText instance.
   * @param other The existing instance to copy.
   * @return A new I18NText RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.I18NText other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder(other);
    }
  }

  /**
   * RecordBuilder for I18NText instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<I18NText>
    implements org.apache.avro.data.RecordBuilder<I18NText> {

    /** Locale ISO code. */
    private java.lang.CharSequence iso_code;
    /** Internationalized text. */
    private java.lang.CharSequence text;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.iso_code)) {
        this.iso_code = data().deepCopy(fields()[0].schema(), other.iso_code);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.text)) {
        this.text = data().deepCopy(fields()[1].schema(), other.text);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing I18NText instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.I18NText other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.iso_code)) {
        this.iso_code = data().deepCopy(fields()[0].schema(), other.iso_code);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.text)) {
        this.text = data().deepCopy(fields()[1].schema(), other.text);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'iso_code' field.
      * Locale ISO code.
      * @return The value.
      */
    public java.lang.CharSequence getIsoCode() {
      return iso_code;
    }


    /**
      * Sets the value of the 'iso_code' field.
      * Locale ISO code.
      * @param value The value of 'iso_code'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder setIsoCode(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.iso_code = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'iso_code' field has been set.
      * Locale ISO code.
      * @return True if the 'iso_code' field has been set, false otherwise.
      */
    public boolean hasIsoCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'iso_code' field.
      * Locale ISO code.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder clearIsoCode() {
      iso_code = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'text' field.
      * Internationalized text.
      * @return The value.
      */
    public java.lang.CharSequence getText() {
      return text;
    }


    /**
      * Sets the value of the 'text' field.
      * Internationalized text.
      * @param value The value of 'text'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder setText(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.text = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'text' field has been set.
      * Internationalized text.
      * @return True if the 'text' field has been set, false otherwise.
      */
    public boolean hasText() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'text' field.
      * Internationalized text.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.I18NText.Builder clearText() {
      text = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public I18NText build() {
      try {
        I18NText record = new I18NText();
        record.iso_code = fieldSetFlags()[0] ? this.iso_code : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.text = fieldSetFlags()[1] ? this.text : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<I18NText>
    WRITER$ = (org.apache.avro.io.DatumWriter<I18NText>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<I18NText>
    READER$ = (org.apache.avro.io.DatumReader<I18NText>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.iso_code);

    out.writeString(this.text);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.iso_code = in.readString(this.iso_code instanceof Utf8 ? (Utf8)this.iso_code : null);

      this.text = in.readString(this.text instanceof Utf8 ? (Utf8)this.text : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.iso_code = in.readString(this.iso_code instanceof Utf8 ? (Utf8)this.iso_code : null);
          break;

        case 1:
          this.text = in.readString(this.text instanceof Utf8 ? (Utf8)this.text : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










