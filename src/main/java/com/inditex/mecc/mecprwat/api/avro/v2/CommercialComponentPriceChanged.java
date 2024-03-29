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

/** Class that holds price changes in a Commercial Component. */
@org.apache.avro.specific.AvroGenerated
public class CommercialComponentPriceChanged extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4235381497282741120L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CommercialComponentPriceChanged\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that holds price changes in a Commercial Component.\",\"fields\":[{\"name\":\"store_id\",\"type\":\"long\",\"doc\":\"Store's unique identifier.\"},{\"name\":\"commercial_component_id\",\"type\":\"long\",\"doc\":\"Commercial component's identifier.\"},{\"name\":\"commercial_component_type\",\"type\":{\"type\":\"enum\",\"name\":\"CommercialComponentType\",\"symbols\":[\"PRODUCT\",\"SINGLE_COMPONENT\",\"BUNDLE_COMPONENT\",\"BANNER\"]},\"doc\":\"Type of commercial component.\"},{\"name\":\"environment\",\"type\":{\"type\":\"enum\",\"name\":\"Environment\",\"symbols\":[\"DRAFT\",\"LIVE\"]},\"doc\":\"Environment where the change has been processed.\"},{\"name\":\"updated_at\",\"type\":\"long\",\"doc\":\"Event's date in microseconds.\",\"logicalType\":\"timestamp-micros\"},{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"PriceItem\",\"doc\":\"Class that holds price information for an item bean.\",\"fields\":[{\"name\":\"item_id\",\"type\":\"long\",\"doc\":\"Item's identifier\"},{\"name\":\"offer\",\"type\":{\"type\":\"record\",\"name\":\"Offer\",\"doc\":\"Class that holds the list of prices of the item bean.\",\"fields\":[{\"name\":\"prices\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Price\",\"doc\":\"Class that holds price information for a given period of time.\",\"fields\":[{\"name\":\"start_date\",\"type\":\"long\",\"doc\":\"Starting period date in milliseconds since epoch time where the price becomes valid.\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"end_date\",\"type\":\"long\",\"doc\":\"Ending period date in milliseconds since epoch time where the price stops being valid.\",\"order\":\"ignore\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"price\",\"type\":\"long\",\"doc\":\"Current price during the current period expressed in the smallest legal unit available for the price currency (e.g. prices are expressed in euro's cents).\",\"order\":\"ignore\"},{\"name\":\"old_price\",\"type\":[\"null\",\"long\"],\"doc\":\"Previous price of the product during a sales period expressed in the smallest legal unit available for the price currency (e.g. prices are expressed in euro's cents). This is optional and used to compare previous and current prices during sales.\",\"order\":\"ignore\"},{\"name\":\"currency_iso\",\"type\":\"string\",\"doc\":\"Currency ISO 4217 code.\",\"order\":\"ignore\"},{\"name\":\"promotion\",\"type\":[\"null\",\"string\"],\"doc\":\"Price promotion information. This value will not be set on a regular price but will be set instead on sales and event prices.\",\"default\":null,\"order\":\"ignore\"}]}},\"doc\":\"List of prices of the current item.\"}]},\"doc\":\"Contains list of prices of the item bean.\"}]}},\"doc\":\"List of items child of the current commercial component.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CommercialComponentPriceChanged> ENCODER =
      new BinaryMessageEncoder<CommercialComponentPriceChanged>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CommercialComponentPriceChanged> DECODER =
      new BinaryMessageDecoder<CommercialComponentPriceChanged>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CommercialComponentPriceChanged> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CommercialComponentPriceChanged> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CommercialComponentPriceChanged> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CommercialComponentPriceChanged>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CommercialComponentPriceChanged to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CommercialComponentPriceChanged from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CommercialComponentPriceChanged instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CommercialComponentPriceChanged fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Store's unique identifier. */
  @Deprecated public long store_id;
  /** Commercial component's identifier. */
  @Deprecated public long commercial_component_id;
  /** Type of commercial component. */
  @Deprecated public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType commercial_component_type;
  /** Environment where the change has been processed. */
  @Deprecated public com.inditex.mecc.mecprwat.api.avro.v2.Environment environment;
  /** Event's date in microseconds. */
  @Deprecated public long updated_at;
  /** List of items child of the current commercial component. */
  @Deprecated public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> items;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CommercialComponentPriceChanged() {}

  /**
   * All-args constructor.
   * @param store_id Store's unique identifier.
   * @param commercial_component_id Commercial component's identifier.
   * @param commercial_component_type Type of commercial component.
   * @param environment Environment where the change has been processed.
   * @param updated_at Event's date in microseconds.
   * @param items List of items child of the current commercial component.
   */
  public CommercialComponentPriceChanged(java.lang.Long store_id, java.lang.Long commercial_component_id, com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType commercial_component_type, com.inditex.mecc.mecprwat.api.avro.v2.Environment environment, java.lang.Long updated_at, java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> items) {
    this.store_id = store_id;
    this.commercial_component_id = commercial_component_id;
    this.commercial_component_type = commercial_component_type;
    this.environment = environment;
    this.updated_at = updated_at;
    this.items = items;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return store_id;
    case 1: return commercial_component_id;
    case 2: return commercial_component_type;
    case 3: return environment;
    case 4: return updated_at;
    case 5: return items;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: store_id = (java.lang.Long)value$; break;
    case 1: commercial_component_id = (java.lang.Long)value$; break;
    case 2: commercial_component_type = (com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType)value$; break;
    case 3: environment = (com.inditex.mecc.mecprwat.api.avro.v2.Environment)value$; break;
    case 4: updated_at = (java.lang.Long)value$; break;
    case 5: items = (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'store_id' field.
   * @return Store's unique identifier.
   */
  public long getStoreId() {
    return store_id;
  }


  /**
   * Sets the value of the 'store_id' field.
   * Store's unique identifier.
   * @param value the value to set.
   */
  public void setStoreId(long value) {
    this.store_id = value;
  }

  /**
   * Gets the value of the 'commercial_component_id' field.
   * @return Commercial component's identifier.
   */
  public long getCommercialComponentId() {
    return commercial_component_id;
  }


  /**
   * Sets the value of the 'commercial_component_id' field.
   * Commercial component's identifier.
   * @param value the value to set.
   */
  public void setCommercialComponentId(long value) {
    this.commercial_component_id = value;
  }

  /**
   * Gets the value of the 'commercial_component_type' field.
   * @return Type of commercial component.
   */
  public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType getCommercialComponentType() {
    return commercial_component_type;
  }


  /**
   * Sets the value of the 'commercial_component_type' field.
   * Type of commercial component.
   * @param value the value to set.
   */
  public void setCommercialComponentType(com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType value) {
    this.commercial_component_type = value;
  }

  /**
   * Gets the value of the 'environment' field.
   * @return Environment where the change has been processed.
   */
  public com.inditex.mecc.mecprwat.api.avro.v2.Environment getEnvironment() {
    return environment;
  }


  /**
   * Sets the value of the 'environment' field.
   * Environment where the change has been processed.
   * @param value the value to set.
   */
  public void setEnvironment(com.inditex.mecc.mecprwat.api.avro.v2.Environment value) {
    this.environment = value;
  }

  /**
   * Gets the value of the 'updated_at' field.
   * @return Event's date in microseconds.
   */
  public long getUpdatedAt() {
    return updated_at;
  }


  /**
   * Sets the value of the 'updated_at' field.
   * Event's date in microseconds.
   * @param value the value to set.
   */
  public void setUpdatedAt(long value) {
    this.updated_at = value;
  }

  /**
   * Gets the value of the 'items' field.
   * @return List of items child of the current commercial component.
   */
  public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> getItems() {
    return items;
  }


  /**
   * Sets the value of the 'items' field.
   * List of items child of the current commercial component.
   * @param value the value to set.
   */
  public void setItems(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> value) {
    this.items = value;
  }

  /**
   * Creates a new CommercialComponentPriceChanged RecordBuilder.
   * @return A new CommercialComponentPriceChanged RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder();
  }

  /**
   * Creates a new CommercialComponentPriceChanged RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CommercialComponentPriceChanged RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder(other);
    }
  }

  /**
   * Creates a new CommercialComponentPriceChanged RecordBuilder by copying an existing CommercialComponentPriceChanged instance.
   * @param other The existing instance to copy.
   * @return A new CommercialComponentPriceChanged RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder(other);
    }
  }

  /**
   * RecordBuilder for CommercialComponentPriceChanged instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CommercialComponentPriceChanged>
    implements org.apache.avro.data.RecordBuilder<CommercialComponentPriceChanged> {

    /** Store's unique identifier. */
    private long store_id;
    /** Commercial component's identifier. */
    private long commercial_component_id;
    /** Type of commercial component. */
    private com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType commercial_component_type;
    /** Environment where the change has been processed. */
    private com.inditex.mecc.mecprwat.api.avro.v2.Environment environment;
    /** Event's date in microseconds. */
    private long updated_at;
    /** List of items child of the current commercial component. */
    private java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> items;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.store_id)) {
        this.store_id = data().deepCopy(fields()[0].schema(), other.store_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.commercial_component_id)) {
        this.commercial_component_id = data().deepCopy(fields()[1].schema(), other.commercial_component_id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.commercial_component_type)) {
        this.commercial_component_type = data().deepCopy(fields()[2].schema(), other.commercial_component_type);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.environment)) {
        this.environment = data().deepCopy(fields()[3].schema(), other.environment);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.updated_at)) {
        this.updated_at = data().deepCopy(fields()[4].schema(), other.updated_at);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.items)) {
        this.items = data().deepCopy(fields()[5].schema(), other.items);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing CommercialComponentPriceChanged instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.store_id)) {
        this.store_id = data().deepCopy(fields()[0].schema(), other.store_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.commercial_component_id)) {
        this.commercial_component_id = data().deepCopy(fields()[1].schema(), other.commercial_component_id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.commercial_component_type)) {
        this.commercial_component_type = data().deepCopy(fields()[2].schema(), other.commercial_component_type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.environment)) {
        this.environment = data().deepCopy(fields()[3].schema(), other.environment);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.updated_at)) {
        this.updated_at = data().deepCopy(fields()[4].schema(), other.updated_at);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.items)) {
        this.items = data().deepCopy(fields()[5].schema(), other.items);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'store_id' field.
      * Store's unique identifier.
      * @return The value.
      */
    public long getStoreId() {
      return store_id;
    }


    /**
      * Sets the value of the 'store_id' field.
      * Store's unique identifier.
      * @param value The value of 'store_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder setStoreId(long value) {
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
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder clearStoreId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'commercial_component_id' field.
      * Commercial component's identifier.
      * @return The value.
      */
    public long getCommercialComponentId() {
      return commercial_component_id;
    }


    /**
      * Sets the value of the 'commercial_component_id' field.
      * Commercial component's identifier.
      * @param value The value of 'commercial_component_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder setCommercialComponentId(long value) {
      validate(fields()[1], value);
      this.commercial_component_id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'commercial_component_id' field has been set.
      * Commercial component's identifier.
      * @return True if the 'commercial_component_id' field has been set, false otherwise.
      */
    public boolean hasCommercialComponentId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'commercial_component_id' field.
      * Commercial component's identifier.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder clearCommercialComponentId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'commercial_component_type' field.
      * Type of commercial component.
      * @return The value.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType getCommercialComponentType() {
      return commercial_component_type;
    }


    /**
      * Sets the value of the 'commercial_component_type' field.
      * Type of commercial component.
      * @param value The value of 'commercial_component_type'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder setCommercialComponentType(com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType value) {
      validate(fields()[2], value);
      this.commercial_component_type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'commercial_component_type' field has been set.
      * Type of commercial component.
      * @return True if the 'commercial_component_type' field has been set, false otherwise.
      */
    public boolean hasCommercialComponentType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'commercial_component_type' field.
      * Type of commercial component.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder clearCommercialComponentType() {
      commercial_component_type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'environment' field.
      * Environment where the change has been processed.
      * @return The value.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Environment getEnvironment() {
      return environment;
    }


    /**
      * Sets the value of the 'environment' field.
      * Environment where the change has been processed.
      * @param value The value of 'environment'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder setEnvironment(com.inditex.mecc.mecprwat.api.avro.v2.Environment value) {
      validate(fields()[3], value);
      this.environment = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'environment' field has been set.
      * Environment where the change has been processed.
      * @return True if the 'environment' field has been set, false otherwise.
      */
    public boolean hasEnvironment() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'environment' field.
      * Environment where the change has been processed.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder clearEnvironment() {
      environment = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'updated_at' field.
      * Event's date in microseconds.
      * @return The value.
      */
    public long getUpdatedAt() {
      return updated_at;
    }


    /**
      * Sets the value of the 'updated_at' field.
      * Event's date in microseconds.
      * @param value The value of 'updated_at'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder setUpdatedAt(long value) {
      validate(fields()[4], value);
      this.updated_at = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'updated_at' field has been set.
      * Event's date in microseconds.
      * @return True if the 'updated_at' field has been set, false otherwise.
      */
    public boolean hasUpdatedAt() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'updated_at' field.
      * Event's date in microseconds.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder clearUpdatedAt() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'items' field.
      * List of items child of the current commercial component.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> getItems() {
      return items;
    }


    /**
      * Sets the value of the 'items' field.
      * List of items child of the current commercial component.
      * @param value The value of 'items'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder setItems(java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> value) {
      validate(fields()[5], value);
      this.items = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'items' field has been set.
      * List of items child of the current commercial component.
      * @return True if the 'items' field has been set, false otherwise.
      */
    public boolean hasItems() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'items' field.
      * List of items child of the current commercial component.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentPriceChanged.Builder clearItems() {
      items = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CommercialComponentPriceChanged build() {
      try {
        CommercialComponentPriceChanged record = new CommercialComponentPriceChanged();
        record.store_id = fieldSetFlags()[0] ? this.store_id : (java.lang.Long) defaultValue(fields()[0]);
        record.commercial_component_id = fieldSetFlags()[1] ? this.commercial_component_id : (java.lang.Long) defaultValue(fields()[1]);
        record.commercial_component_type = fieldSetFlags()[2] ? this.commercial_component_type : (com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType) defaultValue(fields()[2]);
        record.environment = fieldSetFlags()[3] ? this.environment : (com.inditex.mecc.mecprwat.api.avro.v2.Environment) defaultValue(fields()[3]);
        record.updated_at = fieldSetFlags()[4] ? this.updated_at : (java.lang.Long) defaultValue(fields()[4]);
        record.items = fieldSetFlags()[5] ? this.items : (java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem>) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CommercialComponentPriceChanged>
    WRITER$ = (org.apache.avro.io.DatumWriter<CommercialComponentPriceChanged>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CommercialComponentPriceChanged>
    READER$ = (org.apache.avro.io.DatumReader<CommercialComponentPriceChanged>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.store_id);

    out.writeLong(this.commercial_component_id);

    out.writeEnum(this.commercial_component_type.ordinal());

    out.writeEnum(this.environment.ordinal());

    out.writeLong(this.updated_at);

    long size0 = this.items.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.inditex.mecc.mecprwat.api.avro.v2.PriceItem e0: this.items) {
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
      this.store_id = in.readLong();

      this.commercial_component_id = in.readLong();

      this.commercial_component_type = com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType.values()[in.readEnum()];

      this.environment = com.inditex.mecc.mecprwat.api.avro.v2.Environment.values()[in.readEnum()];

      this.updated_at = in.readLong();

      long size0 = in.readArrayStart();
      java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> a0 = this.items;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem>((int)size0, SCHEMA$.getField("items").schema());
        this.items = a0;
      } else a0.clear();
      SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.inditex.mecc.mecprwat.api.avro.v2.PriceItem e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.inditex.mecc.mecprwat.api.avro.v2.PriceItem();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.store_id = in.readLong();
          break;

        case 1:
          this.commercial_component_id = in.readLong();
          break;

        case 2:
          this.commercial_component_type = com.inditex.mecc.mecprwat.api.avro.v2.CommercialComponentType.values()[in.readEnum()];
          break;

        case 3:
          this.environment = com.inditex.mecc.mecprwat.api.avro.v2.Environment.values()[in.readEnum()];
          break;

        case 4:
          this.updated_at = in.readLong();
          break;

        case 5:
          long size0 = in.readArrayStart();
          java.util.List<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> a0 = this.items;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem>((int)size0, SCHEMA$.getField("items").schema());
            this.items = a0;
          } else a0.clear();
          SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.inditex.mecc.mecprwat.api.avro.v2.PriceItem>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.inditex.mecc.mecprwat.api.avro.v2.PriceItem e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.inditex.mecc.mecprwat.api.avro.v2.PriceItem();
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










