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

/** Class that holds availability information for an item bean (aka an SKU). */
@org.apache.avro.specific.AvroGenerated
public class AvailabilityItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -987952491886495424L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvailabilityItem\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"doc\":\"Class that holds availability information for an item bean (aka an SKU).\",\"fields\":[{\"name\":\"item_id\",\"type\":\"long\",\"doc\":\"Item's identifier\"},{\"name\":\"availability\",\"type\":{\"type\":\"enum\",\"name\":\"Availability\",\"symbols\":[\"IN_STOCK\",\"OUT_OF_STOCK\",\"COMING_SOON\",\"BACK_SOON\"]},\"doc\":\"Item's availability information.\"},{\"name\":\"first_availability_date\",\"type\":[\"null\",\"long\"],\"doc\":\"First visible date in microseconds.\",\"logicalType\":\"timestamp-micros\"},{\"name\":\"is_available\",\"type\":\"boolean\",\"doc\":\"Whether the item is available\"},{\"name\":\"subscription_type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"AvailabilitySubscriptionType\",\"symbols\":[\"BACK_SOON\",\"COMING_SOON\"]}],\"doc\":\"Availability subscription type for item\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvailabilityItem> ENCODER =
      new BinaryMessageEncoder<AvailabilityItem>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvailabilityItem> DECODER =
      new BinaryMessageDecoder<AvailabilityItem>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AvailabilityItem> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AvailabilityItem> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AvailabilityItem> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvailabilityItem>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AvailabilityItem to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AvailabilityItem from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AvailabilityItem instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AvailabilityItem fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Item's identifier */
  @Deprecated public long item_id;
  /** Item's availability information. */
  @Deprecated public com.inditex.mecc.mecprwat.api.avro.v2.Availability availability;
  /** First visible date in microseconds. */
  @Deprecated public java.lang.Long first_availability_date;
  /** Whether the item is available */
  @Deprecated public boolean is_available;
  /** Availability subscription type for item */
  @Deprecated public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType subscription_type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvailabilityItem() {}

  /**
   * All-args constructor.
   * @param item_id Item's identifier
   * @param availability Item's availability information.
   * @param first_availability_date First visible date in microseconds.
   * @param is_available Whether the item is available
   * @param subscription_type Availability subscription type for item
   */
  public AvailabilityItem(java.lang.Long item_id, com.inditex.mecc.mecprwat.api.avro.v2.Availability availability, java.lang.Long first_availability_date, java.lang.Boolean is_available, com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType subscription_type) {
    this.item_id = item_id;
    this.availability = availability;
    this.first_availability_date = first_availability_date;
    this.is_available = is_available;
    this.subscription_type = subscription_type;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return item_id;
    case 1: return availability;
    case 2: return first_availability_date;
    case 3: return is_available;
    case 4: return subscription_type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: item_id = (java.lang.Long)value$; break;
    case 1: availability = (com.inditex.mecc.mecprwat.api.avro.v2.Availability)value$; break;
    case 2: first_availability_date = (java.lang.Long)value$; break;
    case 3: is_available = (java.lang.Boolean)value$; break;
    case 4: subscription_type = (com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'item_id' field.
   * @return Item's identifier
   */
  public long getItemId() {
    return item_id;
  }


  /**
   * Sets the value of the 'item_id' field.
   * Item's identifier
   * @param value the value to set.
   */
  public void setItemId(long value) {
    this.item_id = value;
  }

  /**
   * Gets the value of the 'availability' field.
   * @return Item's availability information.
   */
  public com.inditex.mecc.mecprwat.api.avro.v2.Availability getAvailability() {
    return availability;
  }


  /**
   * Sets the value of the 'availability' field.
   * Item's availability information.
   * @param value the value to set.
   */
  public void setAvailability(com.inditex.mecc.mecprwat.api.avro.v2.Availability value) {
    this.availability = value;
  }

  /**
   * Gets the value of the 'first_availability_date' field.
   * @return First visible date in microseconds.
   */
  public java.lang.Long getFirstAvailabilityDate() {
    return first_availability_date;
  }


  /**
   * Sets the value of the 'first_availability_date' field.
   * First visible date in microseconds.
   * @param value the value to set.
   */
  public void setFirstAvailabilityDate(java.lang.Long value) {
    this.first_availability_date = value;
  }

  /**
   * Gets the value of the 'is_available' field.
   * @return Whether the item is available
   */
  public boolean getIsAvailable() {
    return is_available;
  }


  /**
   * Sets the value of the 'is_available' field.
   * Whether the item is available
   * @param value the value to set.
   */
  public void setIsAvailable(boolean value) {
    this.is_available = value;
  }

  /**
   * Gets the value of the 'subscription_type' field.
   * @return Availability subscription type for item
   */
  public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType getSubscriptionType() {
    return subscription_type;
  }


  /**
   * Sets the value of the 'subscription_type' field.
   * Availability subscription type for item
   * @param value the value to set.
   */
  public void setSubscriptionType(com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType value) {
    this.subscription_type = value;
  }

  /**
   * Creates a new AvailabilityItem RecordBuilder.
   * @return A new AvailabilityItem RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder newBuilder() {
    return new com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder();
  }

  /**
   * Creates a new AvailabilityItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvailabilityItem RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder(other);
    }
  }

  /**
   * Creates a new AvailabilityItem RecordBuilder by copying an existing AvailabilityItem instance.
   * @param other The existing instance to copy.
   * @return A new AvailabilityItem RecordBuilder
   */
  public static com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder newBuilder(com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem other) {
    if (other == null) {
      return new com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder();
    } else {
      return new com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder(other);
    }
  }

  /**
   * RecordBuilder for AvailabilityItem instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvailabilityItem>
    implements org.apache.avro.data.RecordBuilder<AvailabilityItem> {

    /** Item's identifier */
    private long item_id;
    /** Item's availability information. */
    private com.inditex.mecc.mecprwat.api.avro.v2.Availability availability;
    /** First visible date in microseconds. */
    private java.lang.Long first_availability_date;
    /** Whether the item is available */
    private boolean is_available;
    /** Availability subscription type for item */
    private com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType subscription_type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.item_id)) {
        this.item_id = data().deepCopy(fields()[0].schema(), other.item_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.availability)) {
        this.availability = data().deepCopy(fields()[1].schema(), other.availability);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.first_availability_date)) {
        this.first_availability_date = data().deepCopy(fields()[2].schema(), other.first_availability_date);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.is_available)) {
        this.is_available = data().deepCopy(fields()[3].schema(), other.is_available);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.subscription_type)) {
        this.subscription_type = data().deepCopy(fields()[4].schema(), other.subscription_type);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing AvailabilityItem instance
     * @param other The existing instance to copy.
     */
    private Builder(com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.item_id)) {
        this.item_id = data().deepCopy(fields()[0].schema(), other.item_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.availability)) {
        this.availability = data().deepCopy(fields()[1].schema(), other.availability);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.first_availability_date)) {
        this.first_availability_date = data().deepCopy(fields()[2].schema(), other.first_availability_date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.is_available)) {
        this.is_available = data().deepCopy(fields()[3].schema(), other.is_available);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.subscription_type)) {
        this.subscription_type = data().deepCopy(fields()[4].schema(), other.subscription_type);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'item_id' field.
      * Item's identifier
      * @return The value.
      */
    public long getItemId() {
      return item_id;
    }


    /**
      * Sets the value of the 'item_id' field.
      * Item's identifier
      * @param value The value of 'item_id'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder setItemId(long value) {
      validate(fields()[0], value);
      this.item_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'item_id' field has been set.
      * Item's identifier
      * @return True if the 'item_id' field has been set, false otherwise.
      */
    public boolean hasItemId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'item_id' field.
      * Item's identifier
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder clearItemId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'availability' field.
      * Item's availability information.
      * @return The value.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.Availability getAvailability() {
      return availability;
    }


    /**
      * Sets the value of the 'availability' field.
      * Item's availability information.
      * @param value The value of 'availability'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder setAvailability(com.inditex.mecc.mecprwat.api.avro.v2.Availability value) {
      validate(fields()[1], value);
      this.availability = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'availability' field has been set.
      * Item's availability information.
      * @return True if the 'availability' field has been set, false otherwise.
      */
    public boolean hasAvailability() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'availability' field.
      * Item's availability information.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder clearAvailability() {
      availability = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'first_availability_date' field.
      * First visible date in microseconds.
      * @return The value.
      */
    public java.lang.Long getFirstAvailabilityDate() {
      return first_availability_date;
    }


    /**
      * Sets the value of the 'first_availability_date' field.
      * First visible date in microseconds.
      * @param value The value of 'first_availability_date'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder setFirstAvailabilityDate(java.lang.Long value) {
      validate(fields()[2], value);
      this.first_availability_date = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'first_availability_date' field has been set.
      * First visible date in microseconds.
      * @return True if the 'first_availability_date' field has been set, false otherwise.
      */
    public boolean hasFirstAvailabilityDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'first_availability_date' field.
      * First visible date in microseconds.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder clearFirstAvailabilityDate() {
      first_availability_date = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'is_available' field.
      * Whether the item is available
      * @return The value.
      */
    public boolean getIsAvailable() {
      return is_available;
    }


    /**
      * Sets the value of the 'is_available' field.
      * Whether the item is available
      * @param value The value of 'is_available'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder setIsAvailable(boolean value) {
      validate(fields()[3], value);
      this.is_available = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'is_available' field has been set.
      * Whether the item is available
      * @return True if the 'is_available' field has been set, false otherwise.
      */
    public boolean hasIsAvailable() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'is_available' field.
      * Whether the item is available
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder clearIsAvailable() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'subscription_type' field.
      * Availability subscription type for item
      * @return The value.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType getSubscriptionType() {
      return subscription_type;
    }


    /**
      * Sets the value of the 'subscription_type' field.
      * Availability subscription type for item
      * @param value The value of 'subscription_type'.
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder setSubscriptionType(com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType value) {
      validate(fields()[4], value);
      this.subscription_type = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'subscription_type' field has been set.
      * Availability subscription type for item
      * @return True if the 'subscription_type' field has been set, false otherwise.
      */
    public boolean hasSubscriptionType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'subscription_type' field.
      * Availability subscription type for item
      * @return This builder.
      */
    public com.inditex.mecc.mecprwat.api.avro.v2.AvailabilityItem.Builder clearSubscriptionType() {
      subscription_type = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvailabilityItem build() {
      try {
        AvailabilityItem record = new AvailabilityItem();
        record.item_id = fieldSetFlags()[0] ? this.item_id : (java.lang.Long) defaultValue(fields()[0]);
        record.availability = fieldSetFlags()[1] ? this.availability : (com.inditex.mecc.mecprwat.api.avro.v2.Availability) defaultValue(fields()[1]);
        record.first_availability_date = fieldSetFlags()[2] ? this.first_availability_date : (java.lang.Long) defaultValue(fields()[2]);
        record.is_available = fieldSetFlags()[3] ? this.is_available : (java.lang.Boolean) defaultValue(fields()[3]);
        record.subscription_type = fieldSetFlags()[4] ? this.subscription_type : (com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvailabilityItem>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvailabilityItem>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvailabilityItem>
    READER$ = (org.apache.avro.io.DatumReader<AvailabilityItem>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.item_id);

    out.writeEnum(this.availability.ordinal());

    if (this.first_availability_date == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.first_availability_date);
    }

    out.writeBoolean(this.is_available);

    if (this.subscription_type == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeEnum(this.subscription_type.ordinal());
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.item_id = in.readLong();

      this.availability = com.inditex.mecc.mecprwat.api.avro.v2.Availability.values()[in.readEnum()];

      if (in.readIndex() != 1) {
        in.readNull();
        this.first_availability_date = null;
      } else {
        this.first_availability_date = in.readLong();
      }

      this.is_available = in.readBoolean();

      if (in.readIndex() != 1) {
        in.readNull();
        this.subscription_type = null;
      } else {
        this.subscription_type = com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType.values()[in.readEnum()];
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.item_id = in.readLong();
          break;

        case 1:
          this.availability = com.inditex.mecc.mecprwat.api.avro.v2.Availability.values()[in.readEnum()];
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.first_availability_date = null;
          } else {
            this.first_availability_date = in.readLong();
          }
          break;

        case 3:
          this.is_available = in.readBoolean();
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.subscription_type = null;
          } else {
            this.subscription_type = com.inditex.mecc.mecprwat.api.avro.v2.AvailabilitySubscriptionType.values()[in.readEnum()];
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










