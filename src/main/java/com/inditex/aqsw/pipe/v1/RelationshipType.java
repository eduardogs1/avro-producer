/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.inditex.aqsw.pipe.v1;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum RelationshipType {
  createdBy, causes, dependsOn, hasA, partOf, memberOf  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"RelationshipType\",\"namespace\":\"com.inditex.aqsw.pipe.v1\",\"symbols\":[\"createdBy\",\"causes\",\"dependsOn\",\"hasA\",\"partOf\",\"memberOf\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
