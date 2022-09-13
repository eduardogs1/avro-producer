/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.inditex.mecc.mecprsku.api.avro.v2;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Class that holds exclusion changes in a list of skus. */
@org.apache.avro.specific.AvroGenerated
public class SkuExclusionChanged extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9003543382934965315L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SkuExclusionChanged\",\"namespace\":\"com.inditex.mecc.mecprsku.api.avro.v2\",\"doc\":\"Class that holds exclusion changes in a list of skus.\",\"fields\":[{\"name\":\"store_id\",\"type\":\"long\",\"doc\":\"Store's unique identifier.\"},{\"name\":\"parent_id\",\"type\":\"string\",\"doc\":\"Unique identifier that allows an unequivocal parent-child relationship.\"},{\"name\":\"brand_id\",\"type\":\"long\",\"doc\":\"Brand identifier.\"},{\"name\":\"updated_at\",\"type\":\"long\",\"doc\":\"Event's date in microseconds.\",\"logicalType\":\"timestamp-micros\"},{\"name\":\"sku_exclusions\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"SkuExclusion\",\"doc\":\"Class that holds the availability information.\",\"fields\":[{\"name\":\"sku_reference\",\"type\":\"string\",\"doc\":\"Sku's identifier.\"},{\"name\":\"exclusion_info\",\"type\":{\"type\":\"record\",\"name\":\"ExclusionInfo\",\"doc\":\"Class that holds the exclusion of a sku.\",\"fields\":[{\"name\":\"is_excluded\",\"type\":\"boolean\",\"doc\":\"Indicates if the sku is excluded in the indicated store.\"},{\"name\":\"exclusion_type\",\"type\":[\"null\",\"string\"],\"doc\":\"Type of exclusion.\"}]},\"doc\":\"The exclusion information of a sku.\"}]}},\"doc\":\"List of skus child exclusions of the current parent.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SkuExclusionChanged> ENCODER =
      new BinaryMessageEncoder<SkuExclusionChanged>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SkuExclusionChanged> DECODER =
      new BinaryMessageDecoder<SkuExclusionChanged>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<SkuExclusionChanged> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<SkuExclusionChanged> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SkuExclusionChanged>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this SkuExclusionChanged to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a SkuExclusionChanged from a ByteBuffer. */
  public static SkuExclusionChanged fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Store's unique identifier. */
  @Deprecated public long store_id;
  /** Unique identifier that allows an unequivocal parent-child relationship. */
  @Deprecated public java.lang.CharSequence parent_id;
  /** Brand identifier. */
  @Deprecated public long brand_id;
  /** Event's date in microseconds. */
  @Deprecated public long updated_at;
  /** List of skus child exclusions of the current parent. */
  @Deprecated public java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusion> sku_exclusions;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SkuExclusionChanged() {}

  /**
   * All-args constructor.
   * @param store_id Store's unique identifier.
   * @param parent_id Unique identifier that allows an unequivocal parent-child relationship.
   * @param brand_id Brand identifier.
   * @param updated_at Event's date in microseconds.
   * @param sku_exclusions List of skus child exclusions of the current parent.
   */
  public SkuExclusionChanged(java.lang.Long store_id, java.lang.CharSequence parent_id, java.lang.Long brand_id, java.lang.Long updated_at, java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusion> sku_exclusions) {
    this.store_id = store_id;
    this.parent_id = parent_id;
    this.brand_id = brand_id;
    this.updated_at = updated_at;
    this.sku_exclusions = sku_exclusions;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return store_id;
    case 1: return parent_id;
    case 2: return brand_id;
    case 3: return updated_at;
    case 4: return sku_exclusions;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: store_id = (java.lang.Long)value$; break;
    case 1: parent_id = (java.lang.CharSequence)value$; break;
    case 2: brand_id = (java.lang.Long)value$; break;
    case 3: updated_at = (java.lang.Long)value$; break;
    case 4: sku_exclusions = (java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusion>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'store_id' field.
   * @return Store's unique identifier.
   */
  public java.lang.Long getStoreId() {
    return store_id;
  }

  /**
   * Sets the value of the 'store_id' field.
   * Store's unique identifier.
   * @param value the value to set.
   */
  public void setStoreId(java.lang.Long value) {
    this.store_id = value;
  }

  /**
   * Gets the value of the 'parent_id' field.
   * @return Unique identifier that allows an unequivocal parent-child relationship.
   */
  public java.lang.CharSequence getParentId() {
    return parent_id;
  }

  /**
   * Sets the value of the 'parent_id' field.
   * Unique identifier that allows an unequivocal parent-child relationship.
   * @param value the value to set.
   */
  public void setParentId(java.lang.CharSequence value) {
    this.parent_id = value;
  }

  /**
   * Gets the value of the 'brand_id' field.
   * @return Brand identifier.
   */
  public java.lang.Long getBrandId() {
    return brand_id;
  }

  /**
   * Sets the value of the 'brand_id' field.
   * Brand identifier.
   * @param value the value to set.
   */
  public void setBrandId(java.lang.Long value) {
    this.brand_id = value;
  }

  /**
   * Gets the value of the 'updated_at' field.
   * @return Event's date in microseconds.
   */
  public java.lang.Long getUpdatedAt() {
    return updated_at;
  }

  /**
   * Sets the value of the 'updated_at' field.
   * Event's date in microseconds.
   * @param value the value to set.
   */
  public void setUpdatedAt(java.lang.Long value) {
    this.updated_at = value;
  }

  /**
   * Gets the value of the 'sku_exclusions' field.
   * @return List of skus child exclusions of the current parent.
   */
  public java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusion> getSkuExclusions() {
    return sku_exclusions;
  }

  /**
   * Sets the value of the 'sku_exclusions' field.
   * List of skus child exclusions of the current parent.
   * @param value the value to set.
   */
  public void setSkuExclusions(java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusion> value) {
    this.sku_exclusions = value;
  }

  /**
   * Creates a new SkuExclusionChanged RecordBuilder.
   * @return A new SkuExclusionChanged RecordBuilder
   */
  public static com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder newBuilder() {
    return new com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder();
  }

  /**
   * Creates a new SkuExclusionChanged RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SkuExclusionChanged RecordBuilder
   */
  public static com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder newBuilder(com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder other) {
    return new com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder(other);
  }

  /**
   * Creates a new SkuExclusionChanged RecordBuilder by copying an existing SkuExclusionChanged instance.
   * @param other The existing instance to copy.
   * @return A new SkuExclusionChanged RecordBuilder
   */
  public static com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder newBuilder(com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged other) {
    return new com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder(other);
  }

  /**
   * RecordBuilder for SkuExclusionChanged instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SkuExclusionChanged>
    implements org.apache.avro.data.RecordBuilder<SkuExclusionChanged> {

    /** Store's unique identifier. */
    private long store_id;
    /** Unique identifier that allows an unequivocal parent-child relationship. */
    private java.lang.CharSequence parent_id;
    /** Brand identifier. */
    private long brand_id;
    /** Event's date in microseconds. */
    private long updated_at;
    /** List of skus child exclusions of the current parent. */
    private java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusion> sku_exclusions;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.store_id)) {
        this.store_id = data().deepCopy(fields()[0].schema(), other.store_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.parent_id)) {
        this.parent_id = data().deepCopy(fields()[1].schema(), other.parent_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.brand_id)) {
        this.brand_id = data().deepCopy(fields()[2].schema(), other.brand_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.updated_at)) {
        this.updated_at = data().deepCopy(fields()[3].schema(), other.updated_at);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sku_exclusions)) {
        this.sku_exclusions = data().deepCopy(fields()[4].schema(), other.sku_exclusions);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing SkuExclusionChanged instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.store_id)) {
        this.store_id = data().deepCopy(fields()[0].schema(), other.store_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.parent_id)) {
        this.parent_id = data().deepCopy(fields()[1].schema(), other.parent_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.brand_id)) {
        this.brand_id = data().deepCopy(fields()[2].schema(), other.brand_id);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.updated_at)) {
        this.updated_at = data().deepCopy(fields()[3].schema(), other.updated_at);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sku_exclusions)) {
        this.sku_exclusions = data().deepCopy(fields()[4].schema(), other.sku_exclusions);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'store_id' field.
      * Store's unique identifier.
      * @return The value.
      */
    public java.lang.Long getStoreId() {
      return store_id;
    }

    /**
      * Sets the value of the 'store_id' field.
      * Store's unique identifier.
      * @param value The value of 'store_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder setStoreId(long value) {
      validate(fields()[0], value);
      this.store_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'store_id' field has been set.
      * Store's unique identifier.
      * @return True if the 'store_id' field has been set, false otherwise.
      */
    public boolean hasStoreId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'store_id' field.
      * Store's unique identifier.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder clearStoreId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'parent_id' field.
      * Unique identifier that allows an unequivocal parent-child relationship.
      * @return The value.
      */
    public java.lang.CharSequence getParentId() {
      return parent_id;
    }

    /**
      * Sets the value of the 'parent_id' field.
      * Unique identifier that allows an unequivocal parent-child relationship.
      * @param value The value of 'parent_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder setParentId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.parent_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'parent_id' field has been set.
      * Unique identifier that allows an unequivocal parent-child relationship.
      * @return True if the 'parent_id' field has been set, false otherwise.
      */
    public boolean hasParentId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'parent_id' field.
      * Unique identifier that allows an unequivocal parent-child relationship.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder clearParentId() {
      parent_id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'brand_id' field.
      * Brand identifier.
      * @return The value.
      */
    public java.lang.Long getBrandId() {
      return brand_id;
    }

    /**
      * Sets the value of the 'brand_id' field.
      * Brand identifier.
      * @param value The value of 'brand_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder setBrandId(long value) {
      validate(fields()[2], value);
      this.brand_id = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'brand_id' field has been set.
      * Brand identifier.
      * @return True if the 'brand_id' field has been set, false otherwise.
      */
    public boolean hasBrandId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'brand_id' field.
      * Brand identifier.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder clearBrandId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'updated_at' field.
      * Event's date in microseconds.
      * @return The value.
      */
    public java.lang.Long getUpdatedAt() {
      return updated_at;
    }

    /**
      * Sets the value of the 'updated_at' field.
      * Event's date in microseconds.
      * @param value The value of 'updated_at'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder setUpdatedAt(long value) {
      validate(fields()[3], value);
      this.updated_at = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'updated_at' field has been set.
      * Event's date in microseconds.
      * @return True if the 'updated_at' field has been set, false otherwise.
      */
    public boolean hasUpdatedAt() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'updated_at' field.
      * Event's date in microseconds.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder clearUpdatedAt() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'sku_exclusions' field.
      * List of skus child exclusions of the current parent.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusion> getSkuExclusions() {
      return sku_exclusions;
    }

    /**
      * Sets the value of the 'sku_exclusions' field.
      * List of skus child exclusions of the current parent.
      * @param value The value of 'sku_exclusions'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder setSkuExclusions(java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusion> value) {
      validate(fields()[4], value);
      this.sku_exclusions = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'sku_exclusions' field has been set.
      * List of skus child exclusions of the current parent.
      * @return True if the 'sku_exclusions' field has been set, false otherwise.
      */
    public boolean hasSkuExclusions() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'sku_exclusions' field.
      * List of skus child exclusions of the current parent.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusionChanged.Builder clearSkuExclusions() {
      sku_exclusions = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SkuExclusionChanged build() {
      try {
        SkuExclusionChanged record = new SkuExclusionChanged();
        record.store_id = fieldSetFlags()[0] ? this.store_id : (java.lang.Long) defaultValue(fields()[0]);
        record.parent_id = fieldSetFlags()[1] ? this.parent_id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.brand_id = fieldSetFlags()[2] ? this.brand_id : (java.lang.Long) defaultValue(fields()[2]);
        record.updated_at = fieldSetFlags()[3] ? this.updated_at : (java.lang.Long) defaultValue(fields()[3]);
        record.sku_exclusions = fieldSetFlags()[4] ? this.sku_exclusions : (java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.SkuExclusion>) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SkuExclusionChanged>
    WRITER$ = (org.apache.avro.io.DatumWriter<SkuExclusionChanged>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SkuExclusionChanged>
    READER$ = (org.apache.avro.io.DatumReader<SkuExclusionChanged>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
