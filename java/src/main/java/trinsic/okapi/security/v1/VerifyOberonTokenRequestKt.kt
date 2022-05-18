//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: okapi/security/v1/security.proto

package trinsic.okapi.security.v1;

@kotlin.jvm.JvmName("-initializeverifyOberonTokenRequest")
public inline fun verifyOberonTokenRequest(block: trinsic.okapi.security.v1.VerifyOberonTokenRequestKt.Dsl.() -> kotlin.Unit): trinsic.okapi.security.v1.Security.VerifyOberonTokenRequest =
  trinsic.okapi.security.v1.VerifyOberonTokenRequestKt.Dsl._create(trinsic.okapi.security.v1.Security.VerifyOberonTokenRequest.newBuilder()).apply { block() }._build()
public object VerifyOberonTokenRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: trinsic.okapi.security.v1.Security.VerifyOberonTokenRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: trinsic.okapi.security.v1.Security.VerifyOberonTokenRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): trinsic.okapi.security.v1.Security.VerifyOberonTokenRequest = _builder.build()

    /**
     * <pre>
     * raw token bytes
     * </pre>
     *
     * <code>bytes token = 1;</code>
     */
    public var token: com.google.protobuf.ByteString
      @JvmName("getToken")
      get() = _builder.getToken()
      @JvmName("setToken")
      set(value) {
        _builder.setToken(value)
      }
    /**
     * <pre>
     * raw token bytes
     * </pre>
     *
     * <code>bytes token = 1;</code>
     */
    public fun clearToken() {
      _builder.clearToken()
    }

    /**
     * <pre>
     * token is valid to this public key?
     * </pre>
     *
     * <code>bytes pk = 2;</code>
     */
    public var pk: com.google.protobuf.ByteString
      @JvmName("getPk")
      get() = _builder.getPk()
      @JvmName("setPk")
      set(value) {
        _builder.setPk(value)
      }
    /**
     * <pre>
     * token is valid to this public key?
     * </pre>
     *
     * <code>bytes pk = 2;</code>
     */
    public fun clearPk() {
      _builder.clearPk()
    }

    /**
     * <pre>
     * public part of oberon protocol - can be any data
     * </pre>
     *
     * <code>bytes data = 3;</code>
     */
    public var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <pre>
     * public part of oberon protocol - can be any data
     * </pre>
     *
     * <code>bytes data = 3;</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun trinsic.okapi.security.v1.Security.VerifyOberonTokenRequest.copy(block: trinsic.okapi.security.v1.VerifyOberonTokenRequestKt.Dsl.() -> kotlin.Unit): trinsic.okapi.security.v1.Security.VerifyOberonTokenRequest =
  trinsic.okapi.security.v1.VerifyOberonTokenRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
