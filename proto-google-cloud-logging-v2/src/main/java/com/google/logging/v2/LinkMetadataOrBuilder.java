/*
 * Copyright 2023 Google LLC
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
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface LinkMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LinkMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The start time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The start time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The start time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The end time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The end time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The end time of an operation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * State of an operation.
   * </pre>
   *
   * <code>.google.logging.v2.OperationState state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * State of an operation.
   * </pre>
   *
   * <code>.google.logging.v2.OperationState state = 3;</code>
   *
   * @return The state.
   */
  com.google.logging.v2.OperationState getState();

  /**
   *
   *
   * <pre>
   * CreateLink RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.CreateLinkRequest create_link_request = 4;</code>
   *
   * @return Whether the createLinkRequest field is set.
   */
  boolean hasCreateLinkRequest();
  /**
   *
   *
   * <pre>
   * CreateLink RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.CreateLinkRequest create_link_request = 4;</code>
   *
   * @return The createLinkRequest.
   */
  com.google.logging.v2.CreateLinkRequest getCreateLinkRequest();
  /**
   *
   *
   * <pre>
   * CreateLink RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.CreateLinkRequest create_link_request = 4;</code>
   */
  com.google.logging.v2.CreateLinkRequestOrBuilder getCreateLinkRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * DeleteLink RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.DeleteLinkRequest delete_link_request = 5;</code>
   *
   * @return Whether the deleteLinkRequest field is set.
   */
  boolean hasDeleteLinkRequest();
  /**
   *
   *
   * <pre>
   * DeleteLink RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.DeleteLinkRequest delete_link_request = 5;</code>
   *
   * @return The deleteLinkRequest.
   */
  com.google.logging.v2.DeleteLinkRequest getDeleteLinkRequest();
  /**
   *
   *
   * <pre>
   * DeleteLink RPC request.
   * </pre>
   *
   * <code>.google.logging.v2.DeleteLinkRequest delete_link_request = 5;</code>
   */
  com.google.logging.v2.DeleteLinkRequestOrBuilder getDeleteLinkRequestOrBuilder();

  com.google.logging.v2.LinkMetadata.RequestCase getRequestCase();
}
