// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transport.proto

package trinsic.okapi.transport;

/**
 * Protobuf type {@code okapi.transport.CoreMessage}
 */
public final class CoreMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:okapi.transport.CoreMessage)
    CoreMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CoreMessage.newBuilder() to construct.
  private CoreMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CoreMessage() {
    id_ = "";
    type_ = "";
    body_ = com.google.protobuf.ByteString.EMPTY;
    to_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    from_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CoreMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CoreMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
            break;
          }
          case 26: {

            body_ = input.readBytes();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              to_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            to_.add(s);
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            from_ = s;
            break;
          }
          case 48: {

            created_ = input.readInt64();
            break;
          }
          case 56: {

            expires_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        to_ = to_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return trinsic.okapi.transport.Transport.internal_static_okapi_transport_CoreMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.okapi.transport.Transport.internal_static_okapi_transport_CoreMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.okapi.transport.CoreMessage.class, trinsic.okapi.transport.CoreMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 2;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BODY_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString body_;
  /**
   * <code>bytes body = 3;</code>
   * @return The body.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBody() {
    return body_;
  }

  public static final int TO_FIELD_NUMBER = 4;
  private com.google.protobuf.LazyStringList to_;
  /**
   * <code>repeated string to = 4;</code>
   * @return A list containing the to.
   */
  public com.google.protobuf.ProtocolStringList
      getToList() {
    return to_;
  }
  /**
   * <code>repeated string to = 4;</code>
   * @return The count of to.
   */
  public int getToCount() {
    return to_.size();
  }
  /**
   * <code>repeated string to = 4;</code>
   * @param index The index of the element to return.
   * @return The to at the given index.
   */
  public java.lang.String getTo(int index) {
    return to_.get(index);
  }
  /**
   * <code>repeated string to = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the to at the given index.
   */
  public com.google.protobuf.ByteString
      getToBytes(int index) {
    return to_.getByteString(index);
  }

  public static final int FROM_FIELD_NUMBER = 5;
  private volatile java.lang.Object from_;
  /**
   * <code>string from = 5;</code>
   * @return The from.
   */
  @java.lang.Override
  public java.lang.String getFrom() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <code>string from = 5;</code>
   * @return The bytes for from.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromBytes() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      from_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATED_FIELD_NUMBER = 6;
  private long created_;
  /**
   * <code>int64 created = 6 [json_name = "created_time"];</code>
   * @return The created.
   */
  @java.lang.Override
  public long getCreated() {
    return created_;
  }

  public static final int EXPIRES_FIELD_NUMBER = 7;
  private long expires_;
  /**
   * <code>int64 expires = 7 [json_name = "expires_time"];</code>
   * @return The expires.
   */
  @java.lang.Override
  public long getExpires() {
    return expires_;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (!body_.isEmpty()) {
      output.writeBytes(3, body_);
    }
    for (int i = 0; i < to_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, to_.getRaw(i));
    }
    if (!getFromBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, from_);
    }
    if (created_ != 0L) {
      output.writeInt64(6, created_);
    }
    if (expires_ != 0L) {
      output.writeInt64(7, expires_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (!body_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, body_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < to_.size(); i++) {
        dataSize += computeStringSizeNoTag(to_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getToList().size();
    }
    if (!getFromBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, from_);
    }
    if (created_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, created_);
    }
    if (expires_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, expires_);
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
    if (!(obj instanceof trinsic.okapi.transport.CoreMessage)) {
      return super.equals(obj);
    }
    trinsic.okapi.transport.CoreMessage other = (trinsic.okapi.transport.CoreMessage) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (!getBody()
        .equals(other.getBody())) return false;
    if (!getToList()
        .equals(other.getToList())) return false;
    if (!getFrom()
        .equals(other.getFrom())) return false;
    if (getCreated()
        != other.getCreated()) return false;
    if (getExpires()
        != other.getExpires()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + BODY_FIELD_NUMBER;
    hash = (53 * hash) + getBody().hashCode();
    if (getToCount() > 0) {
      hash = (37 * hash) + TO_FIELD_NUMBER;
      hash = (53 * hash) + getToList().hashCode();
    }
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (37 * hash) + CREATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreated());
    hash = (37 * hash) + EXPIRES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpires());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.okapi.transport.CoreMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.okapi.transport.CoreMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.okapi.transport.CoreMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.okapi.transport.CoreMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.okapi.transport.CoreMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static trinsic.okapi.transport.CoreMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static trinsic.okapi.transport.CoreMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.okapi.transport.CoreMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.okapi.transport.CoreMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static trinsic.okapi.transport.CoreMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static trinsic.okapi.transport.CoreMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static trinsic.okapi.transport.CoreMessage parseFrom(
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
  public static Builder newBuilder(trinsic.okapi.transport.CoreMessage prototype) {
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
   * Protobuf type {@code okapi.transport.CoreMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:okapi.transport.CoreMessage)
      trinsic.okapi.transport.CoreMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return trinsic.okapi.transport.Transport.internal_static_okapi_transport_CoreMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.okapi.transport.Transport.internal_static_okapi_transport_CoreMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.okapi.transport.CoreMessage.class, trinsic.okapi.transport.CoreMessage.Builder.class);
    }

    // Construct using trinsic.okapi.transport.CoreMessage.newBuilder()
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
      id_ = "";

      type_ = "";

      body_ = com.google.protobuf.ByteString.EMPTY;

      to_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      from_ = "";

      created_ = 0L;

      expires_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return trinsic.okapi.transport.Transport.internal_static_okapi_transport_CoreMessage_descriptor;
    }

    @java.lang.Override
    public trinsic.okapi.transport.CoreMessage getDefaultInstanceForType() {
      return trinsic.okapi.transport.CoreMessage.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.okapi.transport.CoreMessage build() {
      trinsic.okapi.transport.CoreMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.okapi.transport.CoreMessage buildPartial() {
      trinsic.okapi.transport.CoreMessage result = new trinsic.okapi.transport.CoreMessage(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.type_ = type_;
      result.body_ = body_;
      if (((bitField0_ & 0x00000001) != 0)) {
        to_ = to_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.to_ = to_;
      result.from_ = from_;
      result.created_ = created_;
      result.expires_ = expires_;
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
      if (other instanceof trinsic.okapi.transport.CoreMessage) {
        return mergeFrom((trinsic.okapi.transport.CoreMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.okapi.transport.CoreMessage other) {
      if (other == trinsic.okapi.transport.CoreMessage.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (other.getBody() != com.google.protobuf.ByteString.EMPTY) {
        setBody(other.getBody());
      }
      if (!other.to_.isEmpty()) {
        if (to_.isEmpty()) {
          to_ = other.to_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureToIsMutable();
          to_.addAll(other.to_);
        }
        onChanged();
      }
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        onChanged();
      }
      if (other.getCreated() != 0L) {
        setCreated(other.getCreated());
      }
      if (other.getExpires() != 0L) {
        setExpires(other.getExpires());
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
      trinsic.okapi.transport.CoreMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (trinsic.okapi.transport.CoreMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 2;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString body_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes body = 3;</code>
     * @return The body.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBody() {
      return body_;
    }
    /**
     * <code>bytes body = 3;</code>
     * @param value The body to set.
     * @return This builder for chaining.
     */
    public Builder setBody(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      body_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes body = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBody() {
      
      body_ = getDefaultInstance().getBody();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList to_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureToIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        to_ = new com.google.protobuf.LazyStringArrayList(to_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string to = 4;</code>
     * @return A list containing the to.
     */
    public com.google.protobuf.ProtocolStringList
        getToList() {
      return to_.getUnmodifiableView();
    }
    /**
     * <code>repeated string to = 4;</code>
     * @return The count of to.
     */
    public int getToCount() {
      return to_.size();
    }
    /**
     * <code>repeated string to = 4;</code>
     * @param index The index of the element to return.
     * @return The to at the given index.
     */
    public java.lang.String getTo(int index) {
      return to_.get(index);
    }
    /**
     * <code>repeated string to = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the to at the given index.
     */
    public com.google.protobuf.ByteString
        getToBytes(int index) {
      return to_.getByteString(index);
    }
    /**
     * <code>repeated string to = 4;</code>
     * @param index The index to set the value at.
     * @param value The to to set.
     * @return This builder for chaining.
     */
    public Builder setTo(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureToIsMutable();
      to_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string to = 4;</code>
     * @param value The to to add.
     * @return This builder for chaining.
     */
    public Builder addTo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureToIsMutable();
      to_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string to = 4;</code>
     * @param values The to to add.
     * @return This builder for chaining.
     */
    public Builder addAllTo(
        java.lang.Iterable<java.lang.String> values) {
      ensureToIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, to_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string to = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTo() {
      to_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string to = 4;</code>
     * @param value The bytes of the to to add.
     * @return This builder for chaining.
     */
    public Builder addToBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureToIsMutable();
      to_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object from_ = "";
    /**
     * <code>string from = 5;</code>
     * @return The from.
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from = 5;</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from = 5;</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      from_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string from = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      
      from_ = getDefaultInstance().getFrom();
      onChanged();
      return this;
    }
    /**
     * <code>string from = 5;</code>
     * @param value The bytes for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      from_ = value;
      onChanged();
      return this;
    }

    private long created_ ;
    /**
     * <code>int64 created = 6 [json_name = "created_time"];</code>
     * @return The created.
     */
    @java.lang.Override
    public long getCreated() {
      return created_;
    }
    /**
     * <code>int64 created = 6 [json_name = "created_time"];</code>
     * @param value The created to set.
     * @return This builder for chaining.
     */
    public Builder setCreated(long value) {
      
      created_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 created = 6 [json_name = "created_time"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreated() {
      
      created_ = 0L;
      onChanged();
      return this;
    }

    private long expires_ ;
    /**
     * <code>int64 expires = 7 [json_name = "expires_time"];</code>
     * @return The expires.
     */
    @java.lang.Override
    public long getExpires() {
      return expires_;
    }
    /**
     * <code>int64 expires = 7 [json_name = "expires_time"];</code>
     * @param value The expires to set.
     * @return This builder for chaining.
     */
    public Builder setExpires(long value) {
      
      expires_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expires = 7 [json_name = "expires_time"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpires() {
      
      expires_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:okapi.transport.CoreMessage)
  }

  // @@protoc_insertion_point(class_scope:okapi.transport.CoreMessage)
  private static final trinsic.okapi.transport.CoreMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new trinsic.okapi.transport.CoreMessage();
  }

  public static trinsic.okapi.transport.CoreMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CoreMessage>
      PARSER = new com.google.protobuf.AbstractParser<CoreMessage>() {
    @java.lang.Override
    public CoreMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CoreMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CoreMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CoreMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.okapi.transport.CoreMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
