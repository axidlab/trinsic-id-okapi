// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pbmse/pbmse.proto

package trinsic.okapi.pbmse;

public interface EncryptionRecipientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pbmse.EncryptionRecipient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.pbmse.EncryptionHeader header = 1 [json_name = "unprotected"];</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.pbmse.EncryptionHeader header = 1 [json_name = "unprotected"];</code>
   * @return The header.
   */
  trinsic.okapi.pbmse.EncryptionHeader getHeader();
  /**
   * <code>.pbmse.EncryptionHeader header = 1 [json_name = "unprotected"];</code>
   */
  trinsic.okapi.pbmse.EncryptionHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>bytes content_encryption_key = 2 [json_name = "cek"];</code>
   * @return The contentEncryptionKey.
   */
  com.google.protobuf.ByteString getContentEncryptionKey();
}