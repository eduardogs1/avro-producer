/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.inditex.mecc.mecprwat.api.avro.v2;
@org.apache.avro.specific.AvroGenerated
public enum Availability implements org.apache.avro.generic.GenericEnumSymbol<Availability> {
  IN_STOCK, OUT_OF_STOCK, COMING_SOON, BACK_SOON  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"Availability\",\"namespace\":\"com.inditex.mecc.mecprwat.api.avro.v2\",\"symbols\":[\"IN_STOCK\",\"OUT_OF_STOCK\",\"COMING_SOON\",\"BACK_SOON\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}