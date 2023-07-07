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
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public interface TailLogEntriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.TailLogEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of a parent resource from which to retrieve log entries:
   *
   * *  `projects/[PROJECT_ID]`
   * *  `organizations/[ORGANIZATION_ID]`
   * *  `billingAccounts/[BILLING_ACCOUNT_ID]`
   * *  `folders/[FOLDER_ID]`
   *
   * May alternatively be one or more views:
   *
   *  * `projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   * </pre>
   *
   * <code>repeated string resource_names = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the resourceNames.
   */
  java.util.List<java.lang.String> getResourceNamesList();
  /**
   *
   *
   * <pre>
   * Required. Name of a parent resource from which to retrieve log entries:
   *
   * *  `projects/[PROJECT_ID]`
   * *  `organizations/[ORGANIZATION_ID]`
   * *  `billingAccounts/[BILLING_ACCOUNT_ID]`
   * *  `folders/[FOLDER_ID]`
   *
   * May alternatively be one or more views:
   *
   *  * `projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   * </pre>
   *
   * <code>repeated string resource_names = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of resourceNames.
   */
  int getResourceNamesCount();
  /**
   *
   *
   * <pre>
   * Required. Name of a parent resource from which to retrieve log entries:
   *
   * *  `projects/[PROJECT_ID]`
   * *  `organizations/[ORGANIZATION_ID]`
   * *  `billingAccounts/[BILLING_ACCOUNT_ID]`
   * *  `folders/[FOLDER_ID]`
   *
   * May alternatively be one or more views:
   *
   *  * `projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   * </pre>
   *
   * <code>repeated string resource_names = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The resourceNames at the given index.
   */
  java.lang.String getResourceNames(int index);
  /**
   *
   *
   * <pre>
   * Required. Name of a parent resource from which to retrieve log entries:
   *
   * *  `projects/[PROJECT_ID]`
   * *  `organizations/[ORGANIZATION_ID]`
   * *  `billingAccounts/[BILLING_ACCOUNT_ID]`
   * *  `folders/[FOLDER_ID]`
   *
   * May alternatively be one or more views:
   *
   *  * `projects/[PROJECT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `organizations/[ORGANIZATION_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `billingAccounts/[BILLING_ACCOUNT_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   *  * `folders/[FOLDER_ID]/locations/[LOCATION_ID]/buckets/[BUCKET_ID]/views/[VIEW_ID]`
   * </pre>
   *
   * <code>repeated string resource_names = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceNames at the given index.
   */
  com.google.protobuf.ByteString getResourceNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Only log entries that match the filter are returned.  An empty
   * filter matches all log entries in the resources listed in `resource_names`.
   * Referencing a parent resource that is not listed in `resource_names` will
   * cause the filter to return no results. The maximum length of a filter is
   * 20,000 characters.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. Only log entries that match the filter are returned.  An empty
   * filter matches all log entries in the resources listed in `resource_names`.
   * Referencing a parent resource that is not listed in `resource_names` will
   * cause the filter to return no results. The maximum length of a filter is
   * 20,000 characters.
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The amount of time to buffer log entries at the server before
   * being returned to prevent out of order results due to late arriving log
   * entries. Valid values are between 0-60000 milliseconds. Defaults to 2000
   * milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration buffer_window = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the bufferWindow field is set.
   */
  boolean hasBufferWindow();
  /**
   *
   *
   * <pre>
   * Optional. The amount of time to buffer log entries at the server before
   * being returned to prevent out of order results due to late arriving log
   * entries. Valid values are between 0-60000 milliseconds. Defaults to 2000
   * milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration buffer_window = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bufferWindow.
   */
  com.google.protobuf.Duration getBufferWindow();
  /**
   *
   *
   * <pre>
   * Optional. The amount of time to buffer log entries at the server before
   * being returned to prevent out of order results due to late arriving log
   * entries. Valid values are between 0-60000 milliseconds. Defaults to 2000
   * milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration buffer_window = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getBufferWindowOrBuilder();
}
