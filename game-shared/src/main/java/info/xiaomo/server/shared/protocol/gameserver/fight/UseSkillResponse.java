// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrFightMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.fight;

/**
 * <pre>
 *使用技能
 * </pre>
 *
 * Protobuf type {@code UseSkillResponse}
 */
public final class UseSkillResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UseSkillResponse)
    UseSkillResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UseSkillResponse.newBuilder() to construct.
  private UseSkillResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UseSkillResponse() {
    msgId_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UseSkillResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UseSkillResponse(
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
          case 16: {

            rid_ = input.readInt64();
            break;
          }
          case 24: {

            skillId_ = input.readInt32();
            break;
          }
          case 32: {

            result_ = input.readInt32();
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
    return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_UseSkillResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_UseSkillResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse.class, info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse.Builder.class);
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

  public static final int RID_FIELD_NUMBER = 2;
  private long rid_;
  /**
   * <pre>
   *使用技能玩家ID
   * </pre>
   *
   * <code>int64 rid = 2;</code>
   * @return The rid.
   */
  @java.lang.Override
  public long getRid() {
    return rid_;
  }

  public static final int SKILLID_FIELD_NUMBER = 3;
  private int skillId_;
  /**
   * <pre>
   *技能配置ID
   * </pre>
   *
   * <code>int32 skillId = 3;</code>
   * @return The skillId.
   */
  @java.lang.Override
  public int getSkillId() {
    return skillId_;
  }

  public static final int RESULT_FIELD_NUMBER = 4;
  private int result_;
  /**
   * <pre>
   *结果
   * </pre>
   *
   * <code>int32 result = 4;</code>
   * @return The result.
   */
  @java.lang.Override
  public int getResult() {
    return result_;
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
    if (rid_ != 0L) {
      output.writeInt64(2, rid_);
    }
    if (skillId_ != 0) {
      output.writeInt32(3, skillId_);
    }
    if (result_ != 0) {
      output.writeInt32(4, result_);
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
    if (rid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, rid_);
    }
    if (skillId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, skillId_);
    }
    if (result_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, result_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse other = (info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse) obj;

    if (msgId_ != other.msgId_) return false;
    if (getRid()
        != other.getRid()) return false;
    if (getSkillId()
        != other.getSkillId()) return false;
    if (getResult()
        != other.getResult()) return false;
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
    hash = (37 * hash) + RID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRid());
    hash = (37 * hash) + SKILLID_FIELD_NUMBER;
    hash = (53 * hash) + getSkillId();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse prototype) {
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
   *使用技能
   * </pre>
   *
   * Protobuf type {@code UseSkillResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UseSkillResponse)
      info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_UseSkillResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_UseSkillResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse.class, info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse.newBuilder()
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

      rid_ = 0L;

      skillId_ = 0;

      result_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_UseSkillResponse_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse build() {
      info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse buildPartial() {
      info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse result = new info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse(this);
      result.msgId_ = msgId_;
      result.rid_ = rid_;
      result.skillId_ = skillId_;
      result.result_ = result_;
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
      if (other instanceof info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse) {
        return mergeFrom((info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse other) {
      if (other == info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse.getDefaultInstance()) return this;
      if (other.msgId_ != 0) {
        setMsgIdValue(other.getMsgIdValue());
      }
      if (other.getRid() != 0L) {
        setRid(other.getRid());
      }
      if (other.getSkillId() != 0) {
        setSkillId(other.getSkillId());
      }
      if (other.getResult() != 0) {
        setResult(other.getResult());
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
      info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse) e.getUnfinishedMessage();
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

    private long rid_ ;
    /**
     * <pre>
     *使用技能玩家ID
     * </pre>
     *
     * <code>int64 rid = 2;</code>
     * @return The rid.
     */
    @java.lang.Override
    public long getRid() {
      return rid_;
    }
    /**
     * <pre>
     *使用技能玩家ID
     * </pre>
     *
     * <code>int64 rid = 2;</code>
     * @param value The rid to set.
     * @return This builder for chaining.
     */
    public Builder setRid(long value) {
      
      rid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *使用技能玩家ID
     * </pre>
     *
     * <code>int64 rid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRid() {
      
      rid_ = 0L;
      onChanged();
      return this;
    }

    private int skillId_ ;
    /**
     * <pre>
     *技能配置ID
     * </pre>
     *
     * <code>int32 skillId = 3;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }
    /**
     * <pre>
     *技能配置ID
     * </pre>
     *
     * <code>int32 skillId = 3;</code>
     * @param value The skillId to set.
     * @return This builder for chaining.
     */
    public Builder setSkillId(int value) {
      
      skillId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *技能配置ID
     * </pre>
     *
     * <code>int32 skillId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillId() {
      
      skillId_ = 0;
      onChanged();
      return this;
    }

    private int result_ ;
    /**
     * <pre>
     *结果
     * </pre>
     *
     * <code>int32 result = 4;</code>
     * @return The result.
     */
    @java.lang.Override
    public int getResult() {
      return result_;
    }
    /**
     * <pre>
     *结果
     * </pre>
     *
     * <code>int32 result = 4;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(int value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *结果
     * </pre>
     *
     * <code>int32 result = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:UseSkillResponse)
  }

  // @@protoc_insertion_point(class_scope:UseSkillResponse)
  private static final info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse();
  }

  public static info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UseSkillResponse>
      PARSER = new com.google.protobuf.AbstractParser<UseSkillResponse>() {
    @java.lang.Override
    public UseSkillResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UseSkillResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UseSkillResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UseSkillResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.fight.UseSkillResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

