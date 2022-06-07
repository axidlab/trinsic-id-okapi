# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: okapi/metadata/metadata.proto
# plugin: python-betterproto
from dataclasses import dataclass

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase


@dataclass(eq=False, repr=False)
class MetadataRequest(betterproto.Message):
    """
    Request custom metadata about the native okapi binaries - cannot get cargo
    env vars at runtime
    """

    pass


@dataclass(eq=False, repr=False)
class MetadataResponse(betterproto.Message):
    """
    Metadata information about the native okapi binaries. Always returns the
    version information
    """

    version: str = betterproto.string_field(1)
    version_major: int = betterproto.int32_field(2)
    version_minor: int = betterproto.int32_field(3)
    version_patch: int = betterproto.int32_field(4)
    # https://doc.rust-lang.org/cargo/reference/environment-
    # variables.html#environment-variables-cargo-sets-for-crates
    target_family: str = betterproto.string_field(10)
    target_os: str = betterproto.string_field(11)
    target_arch: str = betterproto.string_field(12)
    target_vendor: str = betterproto.string_field(13)
    target_env: str = betterproto.string_field(14)