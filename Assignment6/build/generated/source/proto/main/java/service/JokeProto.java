// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/joke.proto

package service;

public final class JokeProto {
  private JokeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_JokeReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_JokeReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_JokeRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_JokeRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_JokeSetReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_JokeSetReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service_JokeSetRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service_JokeSetRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023services/joke.proto\022\007service\"\031\n\007JokeRe" +
      "q\022\016\n\006number\030\001 \001(\005\"\027\n\007JokeRes\022\014\n\004joke\030\001 \003" +
      "(\t\"\032\n\nJokeSetReq\022\014\n\004joke\030\001 \001(\t\")\n\nJokeSe" +
      "tRes\022\n\n\002ok\030\001 \001(\010\022\017\n\007message\030\002 \001(\t2n\n\004Jok" +
      "e\022/\n\007getJoke\022\020.service.JokeReq\032\020.service" +
      ".JokeRes\"\000\0225\n\007setJoke\022\023.service.JokeSetR" +
      "eq\032\023.service.JokeSetRes\"\000B\026\n\007serviceB\tJo" +
      "keProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_service_JokeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_service_JokeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_JokeReq_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_service_JokeRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_service_JokeRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_JokeRes_descriptor,
        new java.lang.String[] { "Joke", });
    internal_static_service_JokeSetReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_service_JokeSetReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_JokeSetReq_descriptor,
        new java.lang.String[] { "Joke", });
    internal_static_service_JokeSetRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_service_JokeSetRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service_JokeSetRes_descriptor,
        new java.lang.String[] { "Ok", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}