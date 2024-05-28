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
// source: google/logging/v2/logging_metrics.proto

// Protobuf Java Version: 3.25.2
package com.google.logging.v2;

public interface CreateLogMetricRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.CreateLogMetricRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the project in which to create the metric:
   *
   *     "projects/[PROJECT_ID]"
   *
   * The new metric must be provided in the request.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the project in which to create the metric:
   *
   *     "projects/[PROJECT_ID]"
   *
   * The new metric must be provided in the request.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The new logs-based metric, which must not have an identifier that
   * already exists.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the metric field is set.
   */
  boolean hasMetric();
  /**
   *
   *
   * <pre>
   * Required. The new logs-based metric, which must not have an identifier that
   * already exists.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The metric.
   */
  com.google.logging.v2.LogMetric getMetric();
  /**
   *
   *
   * <pre>
   * Required. The new logs-based metric, which must not have an identifier that
   * already exists.
   * </pre>
   *
   * <code>.google.logging.v2.LogMetric metric = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.logging.v2.LogMetricOrBuilder getMetricOrBuilder();
}
