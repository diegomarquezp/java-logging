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

public interface SettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.Settings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the settings.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the settings.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The resource name for the configured Cloud KMS key.
   *
   * KMS key name format:
   *
   *     "projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]"
   *
   * For example:
   *
   *   `"projects/my-project/locations/us-central1/keyRings/my-ring/cryptoKeys/my-key"`
   *
   *
   *
   * To enable CMEK for the Log Router, set this field to a valid
   * `kms_key_name` for which the associated service account has the required
   * `roles/cloudkms.cryptoKeyEncrypterDecrypter` role assigned for the key.
   *
   * The Cloud KMS key used by the Log Router can be updated by changing the
   * `kms_key_name` to a new valid key name. Encryption operations that are in
   * progress will be completed with the key that was in use when they started.
   * Decryption operations will be completed using the key that was used at the
   * time of encryption unless access to that key has been revoked.
   *
   * To disable CMEK for the Log Router, set this field to an empty string.
   *
   * See [Enabling CMEK for Log
   * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
   * for more information.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * Optional. The resource name for the configured Cloud KMS key.
   *
   * KMS key name format:
   *
   *     "projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]"
   *
   * For example:
   *
   *   `"projects/my-project/locations/us-central1/keyRings/my-ring/cryptoKeys/my-key"`
   *
   *
   *
   * To enable CMEK for the Log Router, set this field to a valid
   * `kms_key_name` for which the associated service account has the required
   * `roles/cloudkms.cryptoKeyEncrypterDecrypter` role assigned for the key.
   *
   * The Cloud KMS key used by the Log Router can be updated by changing the
   * `kms_key_name` to a new valid key name. Encryption operations that are in
   * progress will be completed with the key that was in use when they started.
   * Decryption operations will be completed using the key that was used at the
   * time of encryption unless access to that key has been revoked.
   *
   * To disable CMEK for the Log Router, set this field to an empty string.
   *
   * See [Enabling CMEK for Log
   * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
   * for more information.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The service account that will be used by the Log Router to
   * access your Cloud KMS key.
   *
   * Before enabling CMEK for Log Router, you must first assign the role
   * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to the service account that
   * the Log Router will use to access your Cloud KMS key. Use
   * [GetSettings][google.logging.v2.ConfigServiceV2.GetSettings] to
   * obtain the service account ID.
   *
   * See [Enabling CMEK for Log
   * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
   * for more information.
   * </pre>
   *
   * <code>string kms_service_account_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The kmsServiceAccountId.
   */
  java.lang.String getKmsServiceAccountId();
  /**
   *
   *
   * <pre>
   * Output only. The service account that will be used by the Log Router to
   * access your Cloud KMS key.
   *
   * Before enabling CMEK for Log Router, you must first assign the role
   * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to the service account that
   * the Log Router will use to access your Cloud KMS key. Use
   * [GetSettings][google.logging.v2.ConfigServiceV2.GetSettings] to
   * obtain the service account ID.
   *
   * See [Enabling CMEK for Log
   * Router](https://cloud.google.com/logging/docs/routing/managed-encryption)
   * for more information.
   * </pre>
   *
   * <code>string kms_service_account_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for kmsServiceAccountId.
   */
  com.google.protobuf.ByteString getKmsServiceAccountIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Cloud region that will be used for _Default and _Required log
   * buckets for newly created projects and folders. For example `europe-west1`.
   * This setting does not affect the location of custom log buckets.
   * </pre>
   *
   * <code>string storage_location = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The storageLocation.
   */
  java.lang.String getStorageLocation();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud region that will be used for _Default and _Required log
   * buckets for newly created projects and folders. For example `europe-west1`.
   * This setting does not affect the location of custom log buckets.
   * </pre>
   *
   * <code>string storage_location = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for storageLocation.
   */
  com.google.protobuf.ByteString getStorageLocationBytes();

  /**
   *
   *
   * <pre>
   * Optional. If set to true, the _Default sink in newly created projects and
   * folders will created in a disabled state. This can be used to automatically
   * disable log ingestion if there is already an aggregated sink configured in
   * the hierarchy. The _Default sink can be re-enabled manually if needed.
   * </pre>
   *
   * <code>bool disable_default_sink = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The disableDefaultSink.
   */
  boolean getDisableDefaultSink();
}
