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

/** Class that represents a business label (for instance: new, ...) translated in all available languages. */
@org.apache.avro.specific.AvroGenerated
public class Label extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5318784568233439755L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Label\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that represents a business label (for instance: new, ...) translated in all available languages.\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"I18NText\",\"doc\":\"Class that holds a text and its locale ISO code.\",\"fields\":[{\"name\":\"iso_code\",\"type\":\"string\",\"doc\":\"Locale ISO code.\"},{\"name\":\"text\",\"type\":\"string\",\"doc\":\"Internationalized text.\"}]}},\"doc\":\"Internationalized label name.\",\"default\":[]},{\"name\":\"type\",\"type\":{\"type\":\"record\",\"name\":\"LabelType\",\"doc\":\"Class that represents a type of label.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"doc\":\"Label's type identifier.\"}]},\"doc\":\"Related label's type.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Label> ENCODER =
      new BinaryMessageEncoder<Label>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Label> DECODER =
      new BinaryMessageDecoder<Label>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Label> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Label> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Label> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Label>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Label to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Label from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Label instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Label fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Internationalized label name. */
  @Deprecated public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> name;
  /** Related label's type. */
  @Deprecated public com.inditex.mecc.mecprwat.api.avro.v2.LabelType type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Label() {}

  /**
   * All-args constructor.
   * @param name Internationalized label name.
   * @param type Related label's type.
   */
  public Label(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> name, com.inditex.mecc.mecprwat.api.avro.v2.LabelType type) {
    this.name = name;
    this.type = type;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>)value$; break;
    case 1: type = (com.inditex.mecc.mecprwat.api.avro.v2.LabelType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return Internationalized label name.
   */
  public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * Internationalized label name.
   * @param value the value to set.
   */
  public void setName(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return Related label's type.
   */
  public com.inditex.mecc.mecprwat.api.avro.v2.LabelType getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * Related label's type.
   * @param value the value to set.
   */
  public void setType(com.inditex.mecc.mecprwat.api.avro.v2.LabelType value) {
    this.type = value;
  }

  /**
   * Creates a new Label RecordBuilder.
   * @return A new Label RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder();
  }

  /**
   * Creates a new Label RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Label RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder(other);
    }
  }

  /**
   * Creates a new Label RecordBuilder by copying an existing Label instance.
   * @param other The existing instance to copy.
   * @return A new Label RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.Label other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder(other);
    }
  }

  /**
   * RecordBuilder for Label instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Label>
    implements org.apache.avro.data.RecordBuilder<Label> {

    /** Internationalized label name. */
    private java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> name;
    /** Related label's type. */
    private com.inditex.mecc.mecprwat.api.avro.v2.LabelType type;
    private com.inditex.mecc.mecprwat.api.avro.v2.LabelType.Builder typeBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasTypeBuilder()) {
        this.typeBuilder = com.inditex.mecc.mecprwat.api.avro.v2.LabelType.newBuilder(other.getTypeBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Label instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.Label other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      this.typeBuilder = null;
    }

    /**
      * Gets the value of the 'name' field.
      * Internationalized label name.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * Internationalized label name.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder setName(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * Internationalized label name.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * Internationalized label name.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * Related label's type.
      * @return The value.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.LabelType getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * Related label's type.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder setType(com.inditex.mecc.mecprwat.api.avro.v2.LabelType value) {
      validate(fields()[1], value);
      this.typeBuilder = null;
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * Related label's type.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'type' field and creates one if it doesn't exist yet.
     * Related label's type.
     * @return This builder.
     */
    public com.inditex.mecc.mecprwat.api.avro.v2.LabelType.Builder getTypeBuilder() {
      if (typeBuilder == null) {
        if (hasType()) {
          setTypeBuilder(com.inditex.mecc.mecprwat.api.avro.v2.LabelType.newBuilder(type));
        } else {
          setTypeBuilder(com.inditex.mecc.mecprwat.api.avro.v2.LabelType.newBuilder());
        }
      }
      return typeBuilder;
    }

    /**
     * Sets the Builder instance for the 'type' field
     * Related label's type.
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder setTypeBuilder(com.inditex.mecc.mecprwat.api.avro.v2.LabelType.Builder value) {
      clearType();
      typeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'type' field has an active Builder instance
     * Related label's type.
     * @return True if the 'type' field has an active Builder instance
     */
    public boolean hasTypeBuilder() {
      return typeBuilder != null;
    }

    /**
      * Clears the value of the 'type' field.
      * Related label's type.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Label.Builder clearType() {
      type = null;
      typeBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Label build() {
      try {
        Label record = new Label();
        record.name = fieldSetFlags()[0] ? this.name : (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>) defaultValue(fields()[0]);
        if (typeBuilder != null) {
          try {
            record.type = this.typeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("type"));
            throw e;
          }
        } else {
          record.type = fieldSetFlags()[1] ? this.type : (com.inditex.mecc.mecprwat.api.avro.v2.LabelType) defaultValue(fields()[1]);
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
  private static final org.apache.avro.io.DatumWriter<Label>
    WRITER$ = (org.apache.avro.io.DatumWriter<Label>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Label>
    READER$ = (org.apache.avro.io.DatumReader<Label>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.name.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.inditex.mecc.mecprwat.api.avro.v2.I18NText e0: this.name) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    this.type.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readArrayStart();
      java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> a0 = this.name;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>((int)size0, SCHEMA$.getField("name").schema());
        this.name = a0;
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

      if (this.type == null) {
        this.type = new com.inditex.mecc.mecprwat.api.avro.v2.LabelType();
      }
      this.type.customDecode(in);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.I18NText> a0 = this.name;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.I18NText>((int)size0, SCHEMA$.getField("name").schema());
            this.name = a0;
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

        case 1:
          if (this.type == null) {
            this.type = new com.inditex.mecc.mecprwat.api.avro.v2.LabelType();
          }
          this.type.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










