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
/** Class that holds segment prices for a tariff. */
@org.apache.avro.specific.AvroGenerated
public class Tariff extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -495662663852926860L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Tariff\",\"namespace\":\"com.inditex.mecc.mecprsku.api.avro.v2\",\"doc\":\"Class that holds segment prices for a tariff.\",\"fields\":[{\"name\":\"tariff_id\",\"type\":\"long\",\"doc\":\"Tariff identifier\"},{\"name\":\"offer_segments\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OfferSegment\",\"doc\":\"Class that holds the list of prices of the sku.\",\"fields\":[{\"name\":\"start_date\",\"type\":\"long\",\"doc\":\"Starting period date in milliseconds since epoch time where the price becomes valid.\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"end_date\",\"type\":\"long\",\"doc\":\"Ending period date in milliseconds since epoch time where the price stops being valid.\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"kind\",\"type\":\"string\",\"doc\":\"Kind of segment: Regular, sales...\"},{\"name\":\"promotion_name\",\"type\":[\"null\",\"string\"],\"doc\":\"Optional name of the promotion associated to the price\",\"default\":null},{\"name\":\"offer_prices\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OfferPrice\",\"doc\":\"Class that holds price information for a given period of time.\",\"fields\":[{\"name\":\"amount\",\"type\":\"long\",\"doc\":\"Current price during the current period expressed in the smallest legal unit available for the price currency (e.g. prices are expressed in euro's cents).\"},{\"name\":\"compare_amount\",\"type\":[\"null\",\"long\"],\"doc\":\"Previous price of the product during a sales period expressed in the smallest legal unit available for the price currency (e.g. prices are expressed in euro's cents). This is optional and used to compare previous and current prices during sales.\"},{\"name\":\"currency_iso\",\"type\":\"string\",\"doc\":\"Currency ISO 4217 code.\"}]}},\"doc\":\"List of prices of the current sku.\"}]}},\"doc\":\"List of offer segments for a tariff of a store.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Tariff> ENCODER =
      new BinaryMessageEncoder<Tariff>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Tariff> DECODER =
      new BinaryMessageDecoder<Tariff>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Tariff> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Tariff> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Tariff>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Tariff to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Tariff from a ByteBuffer. */
  public static Tariff fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Tariff identifier */
  @Deprecated public long tariff_id;
  /** List of offer segments for a tariff of a store. */
  @Deprecated public java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.OfferSegment> offer_segments;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Tariff() {}

  /**
   * All-args constructor.
   * @param tariff_id Tariff identifier
   * @param offer_segments List of offer segments for a tariff of a store.
   */
  public Tariff(java.lang.Long tariff_id, java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.OfferSegment> offer_segments) {
    this.tariff_id = tariff_id;
    this.offer_segments = offer_segments;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return tariff_id;
    case 1: return offer_segments;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: tariff_id = (java.lang.Long)value$; break;
    case 1: offer_segments = (java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.OfferSegment>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'tariff_id' field.
   * @return Tariff identifier
   */
  public java.lang.Long getTariffId() {
    return tariff_id;
  }

  /**
   * Sets the value of the 'tariff_id' field.
   * Tariff identifier
   * @param value the value to set.
   */
  public void setTariffId(java.lang.Long value) {
    this.tariff_id = value;
  }

  /**
   * Gets the value of the 'offer_segments' field.
   * @return List of offer segments for a tariff of a store.
   */
  public java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.OfferSegment> getOfferSegments() {
    return offer_segments;
  }

  /**
   * Sets the value of the 'offer_segments' field.
   * List of offer segments for a tariff of a store.
   * @param value the value to set.
   */
  public void setOfferSegments(java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.OfferSegment> value) {
    this.offer_segments = value;
  }

  /**
   * Creates a new Tariff RecordBuilder.
   * @return A new Tariff RecordBuilder
   */
  public static com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder newBuilder() {
    return new com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder();
  }

  /**
   * Creates a new Tariff RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Tariff RecordBuilder
   */
  public static com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder newBuilder(com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder other) {
    return new com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder(other);
  }

  /**
   * Creates a new Tariff RecordBuilder by copying an existing Tariff instance.
   * @param other The existing instance to copy.
   * @return A new Tariff RecordBuilder
   */
  public static com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder newBuilder(com.inditex.mecc.mecprsku.api.avro.v2.Tariff other) {
    return new com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder(other);
  }

  /**
   * RecordBuilder for Tariff instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Tariff>
    implements org.apache.avro.data.RecordBuilder<Tariff> {

    /** Tariff identifier */
    private long tariff_id;
    /** List of offer segments for a tariff of a store. */
    private java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.OfferSegment> offer_segments;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.tariff_id)) {
        this.tariff_id = data().deepCopy(fields()[0].schema(), other.tariff_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.offer_segments)) {
        this.offer_segments = data().deepCopy(fields()[1].schema(), other.offer_segments);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Tariff instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprsku.api.avro.v2.Tariff other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.tariff_id)) {
        this.tariff_id = data().deepCopy(fields()[0].schema(), other.tariff_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.offer_segments)) {
        this.offer_segments = data().deepCopy(fields()[1].schema(), other.offer_segments);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'tariff_id' field.
      * Tariff identifier
      * @return The value.
      */
    public java.lang.Long getTariffId() {
      return tariff_id;
    }

    /**
      * Sets the value of the 'tariff_id' field.
      * Tariff identifier
      * @param value The value of 'tariff_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder setTariffId(long value) {
      validate(fields()[0], value);
      this.tariff_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'tariff_id' field has been set.
      * Tariff identifier
      * @return True if the 'tariff_id' field has been set, false otherwise.
      */
    public boolean hasTariffId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'tariff_id' field.
      * Tariff identifier
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder clearTariffId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'offer_segments' field.
      * List of offer segments for a tariff of a store.
      * @return The value.
      */
    public java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.OfferSegment> getOfferSegments() {
      return offer_segments;
    }

    /**
      * Sets the value of the 'offer_segments' field.
      * List of offer segments for a tariff of a store.
      * @param value The value of 'offer_segments'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder setOfferSegments(java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.OfferSegment> value) {
      validate(fields()[1], value);
      this.offer_segments = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'offer_segments' field has been set.
      * List of offer segments for a tariff of a store.
      * @return True if the 'offer_segments' field has been set, false otherwise.
      */
    public boolean hasOfferSegments() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'offer_segments' field.
      * List of offer segments for a tariff of a store.
      * @return This builder.
      */
    public com.inditex.mecc.mecprsku.api.avro.v2.Tariff.Builder clearOfferSegments() {
      offer_segments = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Tariff build() {
      try {
        Tariff record = new Tariff();
        record.tariff_id = fieldSetFlags()[0] ? this.tariff_id : (java.lang.Long) defaultValue(fields()[0]);
        record.offer_segments = fieldSetFlags()[1] ? this.offer_segments : (java.util.List<com.inditex.mecc.mecprsku.api.avro.v2.OfferSegment>) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Tariff>
    WRITER$ = (org.apache.avro.io.DatumWriter<Tariff>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Tariff>
    READER$ = (org.apache.avro.io.DatumReader<Tariff>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}