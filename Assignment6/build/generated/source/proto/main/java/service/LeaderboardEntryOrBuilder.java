// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/rockpaperscissors.proto

package service;

public interface LeaderboardEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service.LeaderboardEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name of player
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name of player
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * you can rank any way you like, based only on wins or on diff between won and lost games or whatever you come up with 
   * </pre>
   *
   * <code>int32 rank = 2;</code>
   * @return The rank.
   */
  int getRank();

  /**
   * <pre>
   * number of wins
   * </pre>
   *
   * <code>int32 wins = 3;</code>
   * @return The wins.
   */
  int getWins();

  /**
   * <pre>
   * number of lost games 
   * </pre>
   *
   * <code>int32 lost = 4;</code>
   * @return The lost.
   */
  int getLost();
}