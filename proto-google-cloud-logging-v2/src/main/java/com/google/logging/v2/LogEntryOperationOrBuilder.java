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

public interface LogEntryOperationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.LogEntryOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. An arbitrary operation identifier. Log entries with the same
   * identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Optional. An arbitrary operation identifier. Log entries with the same
   * identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. An arbitrary producer identifier. The combination of `id` and
   * `producer` must be globally unique. Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>string producer = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The producer.
   */
  java.lang.String getProducer();
  /**
   *
   *
   * <pre>
   * Optional. An arbitrary producer identifier. The combination of `id` and
   * `producer` must be globally unique. Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>string producer = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for producer.
   */
  com.google.protobuf.ByteString getProducerBytes();

  /**
   *
   *
   * <pre>
   * Optional. Set this to True if this is the first log entry in the operation.
   * </pre>
   *
   * <code>bool first = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The first.
   */
  boolean getFirst();

  /**
   *
   *
   * <pre>
   * Optional. Set this to True if this is the last log entry in the operation.
   * </pre>
   *
   * <code>bool last = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The last.
   */
  boolean getLast();
}
