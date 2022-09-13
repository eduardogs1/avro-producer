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

/** Class that holds the twinned type */
@org.apache.avro.specific.AvroGenerated
public class TimeLinePriceType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1251427370689767894L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TimeLinePriceType\",\"namespace\":\"com.inditex.mecc.ecomloadbk.api.avro.v1\",\"doc\":\"Class that holds the twinned type\",\"fields\":[{\"name\":\"startDate\",\"type\":\"long\",\"doc\":\"The string ISO UTC for the price activation\"},{\"name\":\"endDate\",\"type\":\"long\",\"doc\":\"The string ISO UTC for the price end date.\"},{\"name\":\"price\",\"type\":\"double\",\"doc\":\"The price amount\"},{\"name\":\"comparePrice\",\"type\":\"double\",\"doc\":\"The amount of the compare price / previous price\"},{\"name\":\"observation\",\"type\":{\"type\":\"record\",\"name\":\"ObservationType\",\"doc\":\"Class that holds observatios/descriptions about a price\",\"fields\":[{\"name\":\"description\",\"type\":\"string\",\"doc\":\"Description of the price info\"},{\"name\":\"kind\",\"type\":{\"type\":\"enum\",\"name\":\"KindTypeEnum\",\"symbols\":[\"REGULAR\",\"SALES\",\"EVENT\"]},\"doc\":\"Enum to catalog the price type\"},{\"name\":\"ecomload_promo_info\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"EcomloadPromoInfoType\",\"doc\":\"Class that holds the reference info\",\"fields\":[{\"name\":\"ecomload_promo_name\",\"type\":\"string\",\"doc\":\"The promo name created by EcomLoad\"},{\"name\":\"ecomload_promo_id\",\"type\":\"long\",\"doc\":\"The eomload promo id\"}]}],\"doc\":\"Ecomload promos data description\",\"default\":null}]},\"doc\":\"The Object for storing the observation details\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TimeLinePriceType> ENCODER =
      new BinaryMessageEncoder<TimeLinePriceType>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TimeLinePriceType> DECODER =
      new BinaryMessageDecoder<TimeLinePriceType>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TimeLinePriceType> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TimeLinePriceType> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TimeLinePriceType> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TimeLinePriceType>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TimeLinePriceType to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TimeLinePriceType from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TimeLinePriceType instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TimeLinePriceType fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The string ISO UTC for the price activation */
  @Deprecated public long startDate;
  /** The string ISO UTC for the price end date. */
  @Deprecated public long endDate;
  /** The price amount */
  @Deprecated public double price;
  /** The amount of the compare price / previous price */
  @Deprecated public double comparePrice;
  /** The Object for storing the observation details */
  @Deprecated public com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType observation;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TimeLinePriceType() {}

  /**
   * All-args constructor.
   * @param startDate The string ISO UTC for the price activation
   * @param endDate The string ISO UTC for the price end date.
   * @param price The price amount
   * @param comparePrice The amount of the compare price / previous price
   * @param observation The Object for storing the observation details
   */
  public TimeLinePriceType(java.lang.Long startDate, java.lang.Long endDate, java.lang.Double price, java.lang.Double comparePrice, com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType observation) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.price = price;
    this.comparePrice = comparePrice;
    this.observation = observation;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return startDate;
    case 1: return endDate;
    case 2: return price;
    case 3: return comparePrice;
    case 4: return observation;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: startDate = (java.lang.Long)value$; break;
    case 1: endDate = (java.lang.Long)value$; break;
    case 2: price = (java.lang.Double)value$; break;
    case 3: comparePrice = (java.lang.Double)value$; break;
    case 4: observation = (com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'startDate' field.
   * @return The string ISO UTC for the price activation
   */
  public long getStartDate() {
    return startDate;
  }


  /**
   * Sets the value of the 'startDate' field.
   * The string ISO UTC for the price activation
   * @param value the value to set.
   */
  public void setStartDate(long value) {
    this.startDate = value;
  }

  /**
   * Gets the value of the 'endDate' field.
   * @return The string ISO UTC for the price end date.
   */
  public long getEndDate() {
    return endDate;
  }


  /**
   * Sets the value of the 'endDate' field.
   * The string ISO UTC for the price end date.
   * @param value the value to set.
   */
  public void setEndDate(long value) {
    this.endDate = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The price amount
   */
  public double getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * The price amount
   * @param value the value to set.
   */
  public void setPrice(double value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'comparePrice' field.
   * @return The amount of the compare price / previous price
   */
  public double getComparePrice() {
    return comparePrice;
  }


  /**
   * Sets the value of the 'comparePrice' field.
   * The amount of the compare price / previous price
   * @param value the value to set.
   */
  public void setComparePrice(double value) {
    this.comparePrice = value;
  }

  /**
   * Gets the value of the 'observation' field.
   * @return The Object for storing the observation details
   */
  public com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType getObservation() {
    return observation;
  }


  /**
   * Sets the value of the 'observation' field.
   * The Object for storing the observation details
   * @param value the value to set.
   */
  public void setObservation(com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType value) {
    this.observation = value;
  }

  /**
   * Creates a new TimeLinePriceType RecordBuilder.
   * @return A new TimeLinePriceType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder newBuilder() {
    return new com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder();
  }

  /**
   * Creates a new TimeLinePriceType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TimeLinePriceType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder(other);
    }
  }

  /**
   * Creates a new TimeLinePriceType RecordBuilder by copying an existing TimeLinePriceType instance.
   * @param other The existing instance to copy.
   * @return A new TimeLinePriceType RecordBuilder
   */
  public static com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder newBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType other) {
    if (other == null) {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder();
    } else {
      return new com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder(other);
    }
  }

  /**
   * RecordBuilder for TimeLinePriceType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TimeLinePriceType>
    implements org.apache.avro.data.RecordBuilder<TimeLinePriceType> {

    /** The string ISO UTC for the price activation */
    private long startDate;
    /** The string ISO UTC for the price end date. */
    private long endDate;
    /** The price amount */
    private double price;
    /** The amount of the compare price / previous price */
    private double comparePrice;
    /** The Object for storing the observation details */
    private com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType observation;
    private com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType.Builder observationBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.startDate)) {
        this.startDate = data().deepCopy(fields()[0].schema(), other.startDate);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.endDate)) {
        this.endDate = data().deepCopy(fields()[1].schema(), other.endDate);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.comparePrice)) {
        this.comparePrice = data().deepCopy(fields()[3].schema(), other.comparePrice);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.observation)) {
        this.observation = data().deepCopy(fields()[4].schema(), other.observation);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasObservationBuilder()) {
        this.observationBuilder = com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType.newBuilder(other.getObservationBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing TimeLinePriceType instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.startDate)) {
        this.startDate = data().deepCopy(fields()[0].schema(), other.startDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.endDate)) {
        this.endDate = data().deepCopy(fields()[1].schema(), other.endDate);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.comparePrice)) {
        this.comparePrice = data().deepCopy(fields()[3].schema(), other.comparePrice);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.observation)) {
        this.observation = data().deepCopy(fields()[4].schema(), other.observation);
        fieldSetFlags()[4] = true;
      }
      this.observationBuilder = null;
    }

    /**
      * Gets the value of the 'startDate' field.
      * The string ISO UTC for the price activation
      * @return The value.
      */
    public long getStartDate() {
      return startDate;
    }


    /**
      * Sets the value of the 'startDate' field.
      * The string ISO UTC for the price activation
      * @param value The value of 'startDate'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder setStartDate(long value) {
      validate(fields()[0], value);
      this.startDate = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'startDate' field has been set.
      * The string ISO UTC for the price activation
      * @return True if the 'startDate' field has been set, false otherwise.
      */
    public boolean hasStartDate() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'startDate' field.
      * The string ISO UTC for the price activation
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder clearStartDate() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'endDate' field.
      * The string ISO UTC for the price end date.
      * @return The value.
      */
    public long getEndDate() {
      return endDate;
    }


    /**
      * Sets the value of the 'endDate' field.
      * The string ISO UTC for the price end date.
      * @param value The value of 'endDate'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder setEndDate(long value) {
      validate(fields()[1], value);
      this.endDate = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'endDate' field has been set.
      * The string ISO UTC for the price end date.
      * @return True if the 'endDate' field has been set, false otherwise.
      */
    public boolean hasEndDate() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'endDate' field.
      * The string ISO UTC for the price end date.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder clearEndDate() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * The price amount
      * @return The value.
      */
    public double getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * The price amount
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder setPrice(double value) {
      validate(fields()[2], value);
      this.price = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * The price amount
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'price' field.
      * The price amount
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder clearPrice() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'comparePrice' field.
      * The amount of the compare price / previous price
      * @return The value.
      */
    public double getComparePrice() {
      return comparePrice;
    }


    /**
      * Sets the value of the 'comparePrice' field.
      * The amount of the compare price / previous price
      * @param value The value of 'comparePrice'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder setComparePrice(double value) {
      validate(fields()[3], value);
      this.comparePrice = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'comparePrice' field has been set.
      * The amount of the compare price / previous price
      * @return True if the 'comparePrice' field has been set, false otherwise.
      */
    public boolean hasComparePrice() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'comparePrice' field.
      * The amount of the compare price / previous price
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder clearComparePrice() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'observation' field.
      * The Object for storing the observation details
      * @return The value.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType getObservation() {
      return observation;
    }


    /**
      * Sets the value of the 'observation' field.
      * The Object for storing the observation details
      * @param value The value of 'observation'.
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder setObservation(com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType value) {
      validate(fields()[4], value);
      this.observationBuilder = null;
      this.observation = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'observation' field has been set.
      * The Object for storing the observation details
      * @return True if the 'observation' field has been set, false otherwise.
      */
    public boolean hasObservation() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'observation' field and creates one if it doesn't exist yet.
     * The Object for storing the observation details
     * @return This builder.
     */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType.Builder getObservationBuilder() {
      if (observationBuilder == null) {
        if (hasObservation()) {
          setObservationBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType.newBuilder(observation));
        } else {
          setObservationBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType.newBuilder());
        }
      }
      return observationBuilder;
    }

    /**
     * Sets the Builder instance for the 'observation' field
     * The Object for storing the observation details
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder setObservationBuilder(com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType.Builder value) {
      clearObservation();
      observationBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'observation' field has an active Builder instance
     * The Object for storing the observation details
     * @return True if the 'observation' field has an active Builder instance
     */
    public boolean hasObservationBuilder() {
      return observationBuilder != null;
    }

    /**
      * Clears the value of the 'observation' field.
      * The Object for storing the observation details
      * @return This builder.
      */
    public com.inditex.mecc.ecomloadbk.api.avro.v1.TimeLinePriceType.Builder clearObservation() {
      observation = null;
      observationBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TimeLinePriceType build() {
      try {
        TimeLinePriceType record = new TimeLinePriceType();
        record.startDate = fieldSetFlags()[0] ? this.startDate : (java.lang.Long) defaultValue(fields()[0]);
        record.endDate = fieldSetFlags()[1] ? this.endDate : (java.lang.Long) defaultValue(fields()[1]);
        record.price = fieldSetFlags()[2] ? this.price : (java.lang.Double) defaultValue(fields()[2]);
        record.comparePrice = fieldSetFlags()[3] ? this.comparePrice : (java.lang.Double) defaultValue(fields()[3]);
        if (observationBuilder != null) {
          try {
            record.observation = this.observationBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("observation"));
            throw e;
          }
        } else {
          record.observation = fieldSetFlags()[4] ? this.observation : (com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType) defaultValue(fields()[4]);
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
  private static final org.apache.avro.io.DatumWriter<TimeLinePriceType>
    WRITER$ = (org.apache.avro.io.DatumWriter<TimeLinePriceType>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TimeLinePriceType>
    READER$ = (org.apache.avro.io.DatumReader<TimeLinePriceType>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.startDate);

    out.writeLong(this.endDate);

    out.writeDouble(this.price);

    out.writeDouble(this.comparePrice);

    this.observation.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.startDate = in.readLong();

      this.endDate = in.readLong();

      this.price = in.readDouble();

      this.comparePrice = in.readDouble();

      if (this.observation == null) {
        this.observation = new com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType();
      }
      this.observation.customDecode(in);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.startDate = in.readLong();
          break;

        case 1:
          this.endDate = in.readLong();
          break;

        case 2:
          this.price = in.readDouble();
          break;

        case 3:
          this.comparePrice = in.readDouble();
          break;

        case 4:
          if (this.observation == null) {
            this.observation = new com.inditex.mecc.ecomloadbk.api.avro.v1.ObservationType();
          }
          this.observation.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










