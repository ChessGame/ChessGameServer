// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrRoomMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.room;

/**
 * <pre>
 *房间变更消息
 * </pre>
 *
 * Protobuf type {@code RoomChangeResponse}
 */
public final class RoomChangeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RoomChangeResponse)
    RoomChangeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoomChangeResponse.newBuilder() to construct.
  private RoomChangeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoomChangeResponse() {
    msgId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoomChangeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoomChangeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            msgId_ = rawValue;
            break;
          }
          case 18: {
            info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.Builder subBuilder = null;
            if (roomInfo_ != null) {
              subBuilder = roomInfo_.toBuilder();
            }
            roomInfo_ = input.readMessage(info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(roomInfo_);
              roomInfo_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomChangeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomChangeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse.class, info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse.Builder.class);
  }

  public static final int MSGID_FIELD_NUMBER = 1;
  private int msgId_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  @java.lang.Override public int getMsgIdValue() {
    return msgId_;
  }
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>.MsgId msgId = 1;</code>
   * @return The msgId.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.msg.MsgId getMsgId() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.msg.MsgId result = info.xiaomo.server.shared.protocol.msg.MsgId.valueOf(msgId_);
    return result == null ? info.xiaomo.server.shared.protocol.msg.MsgId.UNRECOGNIZED : result;
  }

  public static final int ROOMINFO_FIELD_NUMBER = 2;
  private info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo roomInfo_;
  /**
   * <pre>
   *房间信息
   * </pre>
   *
   * <code>.RoomInfo roomInfo = 2;</code>
   * @return Whether the roomInfo field is set.
   */
  @java.lang.Override
  public boolean hasRoomInfo() {
    return roomInfo_ != null;
  }
  /**
   * <pre>
   *房间信息
   * </pre>
   *
   * <code>.RoomInfo roomInfo = 2;</code>
   * @return The roomInfo.
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo getRoomInfo() {
    return roomInfo_ == null ? info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.getDefaultInstance() : roomInfo_;
  }
  /**
   * <pre>
   *房间信息
   * </pre>
   *
   * <code>.RoomInfo roomInfo = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.room.RoomInfoOrBuilder getRoomInfoOrBuilder() {
    return getRoomInfo();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (msgId_ != info.xiaomo.server.shared.protocol.msg.MsgId.Base.getNumber()) {
      output.writeEnum(1, msgId_);
    }
    if (roomInfo_ != null) {
      output.writeMessage(2, getRoomInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (msgId_ != info.xiaomo.server.shared.protocol.msg.MsgId.Base.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, msgId_);
    }
    if (roomInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRoomInfo());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse other = (info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse) obj;

    if (msgId_ != other.msgId_) return false;
    if (hasRoomInfo() != other.hasRoomInfo()) return false;
    if (hasRoomInfo()) {
      if (!getRoomInfo()
          .equals(other.getRoomInfo())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MSGID_FIELD_NUMBER;
    hash = (53 * hash) + msgId_;
    if (hasRoomInfo()) {
      hash = (37 * hash) + ROOMINFO_FIELD_NUMBER;
      hash = (53 * hash) + getRoomInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *房间变更消息
   * </pre>
   *
   * Protobuf type {@code RoomChangeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RoomChangeResponse)
      info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomChangeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomChangeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse.class, info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      msgId_ = 0;

      if (roomInfoBuilder_ == null) {
        roomInfo_ = null;
      } else {
        roomInfo_ = null;
        roomInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.gameserver.room.BydrRoomMessage.internal_static_RoomChangeResponse_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse build() {
      info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse buildPartial() {
      info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse result = new info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse(this);
      result.msgId_ = msgId_;
      if (roomInfoBuilder_ == null) {
        result.roomInfo_ = roomInfo_;
      } else {
        result.roomInfo_ = roomInfoBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse) {
        return mergeFrom((info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse other) {
      if (other == info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse.getDefaultInstance()) return this;
      if (other.msgId_ != 0) {
        setMsgIdValue(other.getMsgIdValue());
      }
      if (other.hasRoomInfo()) {
        mergeRoomInfo(other.getRoomInfo());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int msgId_ = 0;
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>.MsgId msgId = 1;</code>
     * @return The enum numeric value on the wire for msgId.
     */
    @java.lang.Override public int getMsgIdValue() {
      return msgId_;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>.MsgId msgId = 1;</code>
     * @param value The enum numeric value on the wire for msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgIdValue(int value) {
      
      msgId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>.MsgId msgId = 1;</code>
     * @return The msgId.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.msg.MsgId getMsgId() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.msg.MsgId result = info.xiaomo.server.shared.protocol.msg.MsgId.valueOf(msgId_);
      return result == null ? info.xiaomo.server.shared.protocol.msg.MsgId.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>.MsgId msgId = 1;</code>
     * @param value The msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgId(info.xiaomo.server.shared.protocol.msg.MsgId value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      msgId_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>.MsgId msgId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      
      msgId_ = 0;
      onChanged();
      return this;
    }

    private info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo roomInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo, info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.Builder, info.xiaomo.server.shared.protocol.gameserver.room.RoomInfoOrBuilder> roomInfoBuilder_;
    /**
     * <pre>
     *房间信息
     * </pre>
     *
     * <code>.RoomInfo roomInfo = 2;</code>
     * @return Whether the roomInfo field is set.
     */
    public boolean hasRoomInfo() {
      return roomInfoBuilder_ != null || roomInfo_ != null;
    }
    /**
     * <pre>
     *房间信息
     * </pre>
     *
     * <code>.RoomInfo roomInfo = 2;</code>
     * @return The roomInfo.
     */
    public info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo getRoomInfo() {
      if (roomInfoBuilder_ == null) {
        return roomInfo_ == null ? info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.getDefaultInstance() : roomInfo_;
      } else {
        return roomInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *房间信息
     * </pre>
     *
     * <code>.RoomInfo roomInfo = 2;</code>
     */
    public Builder setRoomInfo(info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo value) {
      if (roomInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        roomInfo_ = value;
        onChanged();
      } else {
        roomInfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *房间信息
     * </pre>
     *
     * <code>.RoomInfo roomInfo = 2;</code>
     */
    public Builder setRoomInfo(
        info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.Builder builderForValue) {
      if (roomInfoBuilder_ == null) {
        roomInfo_ = builderForValue.build();
        onChanged();
      } else {
        roomInfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *房间信息
     * </pre>
     *
     * <code>.RoomInfo roomInfo = 2;</code>
     */
    public Builder mergeRoomInfo(info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo value) {
      if (roomInfoBuilder_ == null) {
        if (roomInfo_ != null) {
          roomInfo_ =
            info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.newBuilder(roomInfo_).mergeFrom(value).buildPartial();
        } else {
          roomInfo_ = value;
        }
        onChanged();
      } else {
        roomInfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *房间信息
     * </pre>
     *
     * <code>.RoomInfo roomInfo = 2;</code>
     */
    public Builder clearRoomInfo() {
      if (roomInfoBuilder_ == null) {
        roomInfo_ = null;
        onChanged();
      } else {
        roomInfo_ = null;
        roomInfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *房间信息
     * </pre>
     *
     * <code>.RoomInfo roomInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.Builder getRoomInfoBuilder() {
      
      onChanged();
      return getRoomInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *房间信息
     * </pre>
     *
     * <code>.RoomInfo roomInfo = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.gameserver.room.RoomInfoOrBuilder getRoomInfoOrBuilder() {
      if (roomInfoBuilder_ != null) {
        return roomInfoBuilder_.getMessageOrBuilder();
      } else {
        return roomInfo_ == null ?
            info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.getDefaultInstance() : roomInfo_;
      }
    }
    /**
     * <pre>
     *房间信息
     * </pre>
     *
     * <code>.RoomInfo roomInfo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo, info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.Builder, info.xiaomo.server.shared.protocol.gameserver.room.RoomInfoOrBuilder> 
        getRoomInfoFieldBuilder() {
      if (roomInfoBuilder_ == null) {
        roomInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo, info.xiaomo.server.shared.protocol.gameserver.room.RoomInfo.Builder, info.xiaomo.server.shared.protocol.gameserver.room.RoomInfoOrBuilder>(
                getRoomInfo(),
                getParentForChildren(),
                isClean());
        roomInfo_ = null;
      }
      return roomInfoBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RoomChangeResponse)
  }

  // @@protoc_insertion_point(class_scope:RoomChangeResponse)
  private static final info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse();
  }

  public static info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoomChangeResponse>
      PARSER = new com.google.protobuf.AbstractParser<RoomChangeResponse>() {
    @java.lang.Override
    public RoomChangeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoomChangeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoomChangeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoomChangeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.room.RoomChangeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

