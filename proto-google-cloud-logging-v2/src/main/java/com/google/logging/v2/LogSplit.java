/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/log_entry.proto

// Protobuf Java Version: 3.25.2
package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * Additional information used to correlate multiple log entries. Used when a
 * single LogEntry would exceed the Google Cloud Logging size limit and is
 * split across multiple log entries.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.LogSplit}
 */
public final class LogSplit extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.LogSplit)
    LogSplitOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LogSplit.newBuilder() to construct.
  private LogSplit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LogSplit() {
    uid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LogSplit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LogEntryProto
        .internal_static_google_logging_v2_LogSplit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LogEntryProto
        .internal_static_google_logging_v2_LogSplit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.LogSplit.class, com.google.logging.v2.LogSplit.Builder.class);
  }

  public static final int UID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object uid_ = "";
  /**
   *
   *
   * <pre>
   * A globally unique identifier for all log entries in a sequence of split log
   * entries. All log entries with the same |LogSplit.uid| are assumed to be
   * part of the same sequence of split log entries.
   * </pre>
   *
   * <code>string uid = 1;</code>
   *
   * @return The uid.
   */
  @java.lang.Override
  public java.lang.String getUid() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uid_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A globally unique identifier for all log entries in a sequence of split log
   * entries. All log entries with the same |LogSplit.uid| are assumed to be
   * part of the same sequence of split log entries.
   * </pre>
   *
   * <code>string uid = 1;</code>
   *
   * @return The bytes for uid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUidBytes() {
    java.lang.Object ref = uid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INDEX_FIELD_NUMBER = 2;
  private int index_ = 0;
  /**
   *
   *
   * <pre>
   * The index of this LogEntry in the sequence of split log entries. Log
   * entries are given |index| values 0, 1, ..., n-1 for a sequence of n log
   * entries.
   * </pre>
   *
   * <code>int32 index = 2;</code>
   *
   * @return The index.
   */
  @java.lang.Override
  public int getIndex() {
    return index_;
  }

  public static final int TOTAL_SPLITS_FIELD_NUMBER = 3;
  private int totalSplits_ = 0;
  /**
   *
   *
   * <pre>
   * The total number of log entries that the original LogEntry was split into.
   * </pre>
   *
   * <code>int32 total_splits = 3;</code>
   *
   * @return The totalSplits.
   */
  @java.lang.Override
  public int getTotalSplits() {
    return totalSplits_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uid_);
    }
    if (index_ != 0) {
      output.writeInt32(2, index_);
    }
    if (totalSplits_ != 0) {
      output.writeInt32(3, totalSplits_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uid_);
    }
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, index_);
    }
    if (totalSplits_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, totalSplits_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.logging.v2.LogSplit)) {
      return super.equals(obj);
    }
    com.google.logging.v2.LogSplit other = (com.google.logging.v2.LogSplit) obj;

    if (!getUid().equals(other.getUid())) return false;
    if (getIndex() != other.getIndex()) return false;
    if (getTotalSplits() != other.getTotalSplits()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UID_FIELD_NUMBER;
    hash = (53 * hash) + getUid().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    hash = (37 * hash) + TOTAL_SPLITS_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSplits();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.LogSplit parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.LogSplit parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.LogSplit parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.LogSplit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.LogSplit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.LogSplit parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.LogSplit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.LogSplit parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.LogSplit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.LogSplit parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.LogSplit parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.LogSplit parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.logging.v2.LogSplit prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Additional information used to correlate multiple log entries. Used when a
   * single LogEntry would exceed the Google Cloud Logging size limit and is
   * split across multiple log entries.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.LogSplit}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.LogSplit)
      com.google.logging.v2.LogSplitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LogEntryProto
          .internal_static_google_logging_v2_LogSplit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LogEntryProto
          .internal_static_google_logging_v2_LogSplit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.LogSplit.class, com.google.logging.v2.LogSplit.Builder.class);
    }

    // Construct using com.google.logging.v2.LogSplit.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      uid_ = "";
      index_ = 0;
      totalSplits_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LogEntryProto
          .internal_static_google_logging_v2_LogSplit_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.LogSplit getDefaultInstanceForType() {
      return com.google.logging.v2.LogSplit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.LogSplit build() {
      com.google.logging.v2.LogSplit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.LogSplit buildPartial() {
      com.google.logging.v2.LogSplit result = new com.google.logging.v2.LogSplit(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.logging.v2.LogSplit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uid_ = uid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.index_ = index_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalSplits_ = totalSplits_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.LogSplit) {
        return mergeFrom((com.google.logging.v2.LogSplit) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.LogSplit other) {
      if (other == com.google.logging.v2.LogSplit.getDefaultInstance()) return this;
      if (!other.getUid().isEmpty()) {
        uid_ = other.uid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (other.getTotalSplits() != 0) {
        setTotalSplits(other.getTotalSplits());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                uid_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                index_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                totalSplits_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object uid_ = "";
    /**
     *
     *
     * <pre>
     * A globally unique identifier for all log entries in a sequence of split log
     * entries. All log entries with the same |LogSplit.uid| are assumed to be
     * part of the same sequence of split log entries.
     * </pre>
     *
     * <code>string uid = 1;</code>
     *
     * @return The uid.
     */
    public java.lang.String getUid() {
      java.lang.Object ref = uid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A globally unique identifier for all log entries in a sequence of split log
     * entries. All log entries with the same |LogSplit.uid| are assumed to be
     * part of the same sequence of split log entries.
     * </pre>
     *
     * <code>string uid = 1;</code>
     *
     * @return The bytes for uid.
     */
    public com.google.protobuf.ByteString getUidBytes() {
      java.lang.Object ref = uid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A globally unique identifier for all log entries in a sequence of split log
     * entries. All log entries with the same |LogSplit.uid| are assumed to be
     * part of the same sequence of split log entries.
     * </pre>
     *
     * <code>string uid = 1;</code>
     *
     * @param value The uid to set.
     * @return This builder for chaining.
     */
    public Builder setUid(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A globally unique identifier for all log entries in a sequence of split log
     * entries. All log entries with the same |LogSplit.uid| are assumed to be
     * part of the same sequence of split log entries.
     * </pre>
     *
     * <code>string uid = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUid() {
      uid_ = getDefaultInstance().getUid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A globally unique identifier for all log entries in a sequence of split log
     * entries. All log entries with the same |LogSplit.uid| are assumed to be
     * part of the same sequence of split log entries.
     * </pre>
     *
     * <code>string uid = 1;</code>
     *
     * @param value The bytes for uid to set.
     * @return This builder for chaining.
     */
    public Builder setUidBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int index_;
    /**
     *
     *
     * <pre>
     * The index of this LogEntry in the sequence of split log entries. Log
     * entries are given |index| values 0, 1, ..., n-1 for a sequence of n log
     * entries.
     * </pre>
     *
     * <code>int32 index = 2;</code>
     *
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }
    /**
     *
     *
     * <pre>
     * The index of this LogEntry in the sequence of split log entries. Log
     * entries are given |index| values 0, 1, ..., n-1 for a sequence of n log
     * entries.
     * </pre>
     *
     * <code>int32 index = 2;</code>
     *
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(int value) {

      index_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The index of this LogEntry in the sequence of split log entries. Log
     * entries are given |index| values 0, 1, ..., n-1 for a sequence of n log
     * entries.
     * </pre>
     *
     * <code>int32 index = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      index_ = 0;
      onChanged();
      return this;
    }

    private int totalSplits_;
    /**
     *
     *
     * <pre>
     * The total number of log entries that the original LogEntry was split into.
     * </pre>
     *
     * <code>int32 total_splits = 3;</code>
     *
     * @return The totalSplits.
     */
    @java.lang.Override
    public int getTotalSplits() {
      return totalSplits_;
    }
    /**
     *
     *
     * <pre>
     * The total number of log entries that the original LogEntry was split into.
     * </pre>
     *
     * <code>int32 total_splits = 3;</code>
     *
     * @param value The totalSplits to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSplits(int value) {

      totalSplits_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of log entries that the original LogEntry was split into.
     * </pre>
     *
     * <code>int32 total_splits = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTotalSplits() {
      bitField0_ = (bitField0_ & ~0x00000004);
      totalSplits_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.LogSplit)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.LogSplit)
  private static final com.google.logging.v2.LogSplit DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.LogSplit();
  }

  public static com.google.logging.v2.LogSplit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogSplit> PARSER =
      new com.google.protobuf.AbstractParser<LogSplit>() {
        @java.lang.Override
        public LogSplit parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<LogSplit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogSplit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.LogSplit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
