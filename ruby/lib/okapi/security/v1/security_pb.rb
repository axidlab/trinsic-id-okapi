# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: okapi/security/v1/security.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("okapi/security/v1/security.proto", :syntax => :proto3) do
    add_message "okapi.security.v1.CreateOberonKeyRequest" do
      optional :seed, :bytes, 1
    end
    add_message "okapi.security.v1.CreateOberonKeyResponse" do
      optional :sk, :bytes, 2
      optional :pk, :bytes, 3
    end
    add_message "okapi.security.v1.CreateOberonTokenRequest" do
      optional :sk, :bytes, 1
      optional :data, :bytes, 2
      repeated :blinding, :bytes, 3
    end
    add_message "okapi.security.v1.CreateOberonTokenResponse" do
      optional :token, :bytes, 1
    end
    add_message "okapi.security.v1.CreateOberonProofRequest" do
      optional :data, :bytes, 1
      optional :token, :bytes, 2
      repeated :blinding, :bytes, 3
      optional :nonce, :bytes, 4
    end
    add_message "okapi.security.v1.CreateOberonProofResponse" do
      optional :proof, :bytes, 2
    end
    add_message "okapi.security.v1.VerifyOberonProofRequest" do
      optional :proof, :bytes, 1
      optional :data, :bytes, 2
      optional :nonce, :bytes, 3
      optional :pk, :bytes, 4
    end
    add_message "okapi.security.v1.VerifyOberonProofResponse" do
      optional :valid, :bool, 1
    end
    add_message "okapi.security.v1.BlindOberonTokenRequest" do
      optional :token, :bytes, 1
      repeated :blinding, :bytes, 2
    end
    add_message "okapi.security.v1.BlindOberonTokenResponse" do
      optional :token, :bytes, 1
    end
    add_message "okapi.security.v1.UnBlindOberonTokenRequest" do
      optional :token, :bytes, 1
      repeated :blinding, :bytes, 2
    end
    add_message "okapi.security.v1.UnBlindOberonTokenResponse" do
      optional :token, :bytes, 1
    end
  end
end

module Okapi
  module Security
    module V1
      CreateOberonKeyRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.CreateOberonKeyRequest").msgclass
      CreateOberonKeyResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.CreateOberonKeyResponse").msgclass
      CreateOberonTokenRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.CreateOberonTokenRequest").msgclass
      CreateOberonTokenResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.CreateOberonTokenResponse").msgclass
      CreateOberonProofRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.CreateOberonProofRequest").msgclass
      CreateOberonProofResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.CreateOberonProofResponse").msgclass
      VerifyOberonProofRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.VerifyOberonProofRequest").msgclass
      VerifyOberonProofResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.VerifyOberonProofResponse").msgclass
      BlindOberonTokenRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.BlindOberonTokenRequest").msgclass
      BlindOberonTokenResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.BlindOberonTokenResponse").msgclass
      UnBlindOberonTokenRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.UnBlindOberonTokenRequest").msgclass
      UnBlindOberonTokenResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.security.v1.UnBlindOberonTokenResponse").msgclass
    end
  end
end