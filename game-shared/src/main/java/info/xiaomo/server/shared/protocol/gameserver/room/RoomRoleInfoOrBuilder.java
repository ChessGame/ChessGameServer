// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrRoomMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.room;

public interface RoomRoleInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RoomRoleInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *昵称
   * </pre>
   *
   * <code>string nick = 1;</code>
   * @return The nick.
   */
  java.lang.String getNick();
  /**
   * <pre>
   *昵称
   * </pre>
   *
   * <code>string nick = 1;</code>
   * @return The bytes for nick.
   */
  com.google.protobuf.ByteString
      getNickBytes();

  /**
   * <pre>
   *头像
   * </pre>
   *
   * <code>string icon = 2;</code>
   * @return The icon.
   */
  java.lang.String getIcon();
  /**
   * <pre>
   *头像
   * </pre>
   *
   * <code>string icon = 2;</code>
   * @return The bytes for icon.
   */
  com.google.protobuf.ByteString
      getIconBytes();

  /**
   * <pre>
   *等级
   * </pre>
   *
   * <code>int32 level = 3;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <pre>
   *金币
   * </pre>
   *
   * <code>int64 gold = 4;</code>
   * @return The gold.
   */
  long getGold();

  /**
   * <pre>
   *签名、心情
   * </pre>
   *
   * <code>string sign = 5;</code>
   * @return The sign.
   */
  java.lang.String getSign();
  /**
   * <pre>
   *签名、心情
   * </pre>
   *
   * <code>string sign = 5;</code>
   * @return The bytes for sign.
   */
  com.google.protobuf.ByteString
      getSignBytes();

  /**
   * <pre>
   *人气
   * </pre>
   *
   * <code>int32 popularity = 6;</code>
   * @return The popularity.
   */
  int getPopularity();

  /**
   * <pre>
   *座位编号
   * </pre>
   *
   * <code>int32 seatNo = 7;</code>
   * @return The seatNo.
   */
  int getSeatNo();

  /**
   * <pre>
   *是否为VIP
   * </pre>
   *
   * <code>bool vip = 8;</code>
   * @return The vip.
   */
  boolean getVip();

  /**
   * <pre>
   *钻石
   * </pre>
   *
   * <code>int64 diamond = 9;</code>
   * @return The diamond.
   */
  long getDiamond();

  /**
   * <pre>
   *角色ID
   * </pre>
   *
   * <code>int64 rid = 10;</code>
   * @return The rid.
   */
  long getRid();

  /**
   * <pre>
   *机器人编号 0玩家
   * </pre>
   *
   * <code>int32 robotNo = 11;</code>
   * @return The robotNo.
   */
  int getRobotNo();

  /**
   * <pre>
   *机器人所属玩家ID
   * </pre>
   *
   * <code>int32 ownerId = 12;</code>
   * @return The ownerId.
   */
  int getOwnerId();

  /**
   * <pre>
   *机器人请求用的sid
   * </pre>
   *
   * <code>string sid = 13;</code>
   * @return The sid.
   */
  java.lang.String getSid();
  /**
   * <pre>
   *机器人请求用的sid
   * </pre>
   *
   * <code>string sid = 13;</code>
   * @return The bytes for sid.
   */
  com.google.protobuf.ByteString
      getSidBytes();
}
