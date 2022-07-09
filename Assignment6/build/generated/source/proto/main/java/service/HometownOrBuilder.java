// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/hometowns.proto

package service;

public interface HometownOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.Hometown)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name of the person
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name of the person
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * the city the person lives in
   * </pre>
   *
   * <code>string city = 2;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <pre>
   * the city the person lives in
   * </pre>
   *
   * <code>string city = 2;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <pre>
   * the state or country the city is in
   * </pre>
   *
   * <code>string region = 3;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * the state or country the city is in
   * </pre>
   *
   * <code>string region = 3;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();
}