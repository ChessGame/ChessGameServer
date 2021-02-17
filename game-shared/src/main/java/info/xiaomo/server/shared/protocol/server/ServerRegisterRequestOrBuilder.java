// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerMessage.proto

package info.xiaomo.server.shared.protocol.server;

public interface ServerRegisterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ServerRegisterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  int getMsgIdValue();
  /**
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  info.xiaomo.server.shared.protocol.msg.MsgId getMsgId();

  /**
   * <pre>
   *服务器信息
   * </pre>
   *
   * <code>.GameServerInfo serverInfo = 2;</code>
   * @return Whether the serverInfo field is set.
   */
  boolean hasServerInfo();
  /**
   * <pre>
   *服务器信息
   * </pre>
   *
   * <code>.GameServerInfo serverInfo = 2;</code>
   * @return The serverInfo.
   */
  info.xiaomo.server.shared.protocol.server.GameServerInfo getServerInfo();
  /**
   * <pre>
   *服务器信息
   * </pre>
   *
   * <code>.GameServerInfo serverInfo = 2;</code>
   */
  info.xiaomo.server.shared.protocol.server.GameServerInfoOrBuilder getServerInfoOrBuilder();
}
