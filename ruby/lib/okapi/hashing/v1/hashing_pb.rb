# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: okapi/hashing/v1/hashing.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("okapi/hashing/v1/hashing.proto", :syntax => :proto3) do
    add_message "okapi.hashing.v1.Blake3HashRequest" do
      optional :data, :bytes, 1
    end
    add_message "okapi.hashing.v1.Blake3HashResponse" do
      optional :digest, :bytes, 1
    end
    add_message "okapi.hashing.v1.Blake3KeyedHashRequest" do
      optional :data, :bytes, 1
      optional :key, :bytes, 2
    end
    add_message "okapi.hashing.v1.Blake3KeyedHashResponse" do
      optional :digest, :bytes, 1
    end
    add_message "okapi.hashing.v1.Blake3DeriveKeyRequest" do
      optional :context, :bytes, 1
      optional :key_material, :bytes, 2
    end
    add_message "okapi.hashing.v1.Blake3DeriveKeyResponse" do
      optional :digest, :bytes, 1
    end
    add_message "okapi.hashing.v1.SHA256HashRequest" do
      optional :data, :bytes, 1
    end
    add_message "okapi.hashing.v1.SHA256HashResponse" do
      optional :digest, :bytes, 1
    end
  end
end

module Okapi
  module Hashing
    module V1
      Blake3HashRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.hashing.v1.Blake3HashRequest").msgclass
      Blake3HashResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.hashing.v1.Blake3HashResponse").msgclass
      Blake3KeyedHashRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.hashing.v1.Blake3KeyedHashRequest").msgclass
      Blake3KeyedHashResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.hashing.v1.Blake3KeyedHashResponse").msgclass
      Blake3DeriveKeyRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.hashing.v1.Blake3DeriveKeyRequest").msgclass
      Blake3DeriveKeyResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.hashing.v1.Blake3DeriveKeyResponse").msgclass
      SHA256HashRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.hashing.v1.SHA256HashRequest").msgclass
      SHA256HashResponse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("okapi.hashing.v1.SHA256HashResponse").msgclass
    end
  end
end
