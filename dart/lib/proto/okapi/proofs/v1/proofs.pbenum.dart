///
//  Generated code. Do not modify.
//  source: okapi/proofs/v1/proofs.proto
//
// @dart = 2.12
// ignore_for_file: annotate_overrides,camel_case_types,unnecessary_const,non_constant_identifier_names,library_prefixes,unused_import,unused_shown_name,return_of_invalid_type,unnecessary_this,prefer_final_fields

// ignore_for_file: UNDEFINED_SHOWN_NAME
import 'dart:core' as $core;
import 'package:protobuf/protobuf.dart' as $pb;

class LdSuite extends $pb.ProtobufEnum {
  static const LdSuite LD_SUITE_UNSPECIFIED = LdSuite._(0, const $core.bool.fromEnvironment('protobuf.omit_enum_names') ? '' : 'LD_SUITE_UNSPECIFIED');
  static const LdSuite LD_SUITE_JCSED25519SIGNATURE2020 = LdSuite._(1, const $core.bool.fromEnvironment('protobuf.omit_enum_names') ? '' : 'LD_SUITE_JCSED25519SIGNATURE2020');

  static const $core.List<LdSuite> values = <LdSuite> [
    LD_SUITE_UNSPECIFIED,
    LD_SUITE_JCSED25519SIGNATURE2020,
  ];

  static final $core.Map<$core.int, LdSuite> _byValue = $pb.ProtobufEnum.initByValue(values);
  static LdSuite? valueOf($core.int value) => _byValue[value];

  const LdSuite._($core.int v, $core.String n) : super(v, n);
}
