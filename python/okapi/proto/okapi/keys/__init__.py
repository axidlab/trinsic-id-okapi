# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: keys.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import List

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase


class KeyType(betterproto.Enum):
    Ed25519 = 0
    X25519 = 1
    P256 = 2
    Bls12381G1G2 = 3
    Secp256k1 = 4


@dataclass(eq=False, repr=False)
class GenerateKeyRequest(betterproto.Message):
    seed: bytes = betterproto.bytes_field(1)
    key_type: "KeyType" = betterproto.enum_field(2)


@dataclass(eq=False, repr=False)
class GenerateKeyResponse(betterproto.Message):
    key: List["JsonWebKey"] = betterproto.message_field(1)
    did_document: "betterproto_lib_google_protobuf.Struct" = betterproto.message_field(
        2
    )


@dataclass(eq=False, repr=False)
class ResolveRequest(betterproto.Message):
    did: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class ResolveResponse(betterproto.Message):
    did_document: "betterproto_lib_google_protobuf.Struct" = betterproto.message_field(
        1
    )
    keys: List["JsonWebKey"] = betterproto.message_field(2)


@dataclass(eq=False, repr=False)
class JsonWebKey(betterproto.Message):
    kid: str = betterproto.string_field(1)
    x: str = betterproto.string_field(2)
    y: str = betterproto.string_field(3)
    d: str = betterproto.string_field(4)
    crv: str = betterproto.string_field(5)
    kty: str = betterproto.string_field(6)


import betterproto.lib.google.protobuf as betterproto_lib_google_protobuf