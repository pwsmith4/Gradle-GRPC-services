// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/higherorlower.proto

package service;

public interface HigherResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service.HigherResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.service.Winner winner = 2;</code>
   * @return Whether the winner field is set.
   */
  boolean hasWinner();
  /**
   * <code>.service.Winner winner = 2;</code>
   * @return The winner.
   */
  service.Winner getWinner();
  /**
   * <code>.service.Winner winner = 2;</code>
   */
  service.WinnerOrBuilder getWinnerOrBuilder();

  /**
   * <code>int32 numWin = 3;</code>
   * @return The numWin.
   */
  int getNumWin();

  /**
   * <code>bool win = 4;</code>
   * @return The win.
   */
  boolean getWin();
}