// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package okapiproto

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// SecureExampleServiceClient is the client API for SecureExampleService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type SecureExampleServiceClient interface {
	Unary(ctx context.Context, in *EncryptedMessage, opts ...grpc.CallOption) (*EncryptedMessage, error)
	ServerStreaming(ctx context.Context, in *EncryptedMessage, opts ...grpc.CallOption) (SecureExampleService_ServerStreamingClient, error)
}

type secureExampleServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewSecureExampleServiceClient(cc grpc.ClientConnInterface) SecureExampleServiceClient {
	return &secureExampleServiceClient{cc}
}

func (c *secureExampleServiceClient) Unary(ctx context.Context, in *EncryptedMessage, opts ...grpc.CallOption) (*EncryptedMessage, error) {
	out := new(EncryptedMessage)
	err := c.cc.Invoke(ctx, "/okapi.examples.v1.SecureExampleService/Unary", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *secureExampleServiceClient) ServerStreaming(ctx context.Context, in *EncryptedMessage, opts ...grpc.CallOption) (SecureExampleService_ServerStreamingClient, error) {
	stream, err := c.cc.NewStream(ctx, &SecureExampleService_ServiceDesc.Streams[0], "/okapi.examples.v1.SecureExampleService/ServerStreaming", opts...)
	if err != nil {
		return nil, err
	}
	x := &secureExampleServiceServerStreamingClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type SecureExampleService_ServerStreamingClient interface {
	Recv() (*EncryptedMessage, error)
	grpc.ClientStream
}

type secureExampleServiceServerStreamingClient struct {
	grpc.ClientStream
}

func (x *secureExampleServiceServerStreamingClient) Recv() (*EncryptedMessage, error) {
	m := new(EncryptedMessage)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

// SecureExampleServiceServer is the server API for SecureExampleService service.
// All implementations must embed UnimplementedSecureExampleServiceServer
// for forward compatibility
type SecureExampleServiceServer interface {
	Unary(context.Context, *EncryptedMessage) (*EncryptedMessage, error)
	ServerStreaming(*EncryptedMessage, SecureExampleService_ServerStreamingServer) error
	mustEmbedUnimplementedSecureExampleServiceServer()
}

// UnimplementedSecureExampleServiceServer must be embedded to have forward compatible implementations.
type UnimplementedSecureExampleServiceServer struct {
}

func (UnimplementedSecureExampleServiceServer) Unary(context.Context, *EncryptedMessage) (*EncryptedMessage, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Unary not implemented")
}
func (UnimplementedSecureExampleServiceServer) ServerStreaming(*EncryptedMessage, SecureExampleService_ServerStreamingServer) error {
	return status.Errorf(codes.Unimplemented, "method ServerStreaming not implemented")
}
func (UnimplementedSecureExampleServiceServer) mustEmbedUnimplementedSecureExampleServiceServer() {}

// UnsafeSecureExampleServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to SecureExampleServiceServer will
// result in compilation errors.
type UnsafeSecureExampleServiceServer interface {
	mustEmbedUnimplementedSecureExampleServiceServer()
}

func RegisterSecureExampleServiceServer(s grpc.ServiceRegistrar, srv SecureExampleServiceServer) {
	s.RegisterService(&SecureExampleService_ServiceDesc, srv)
}

func _SecureExampleService_Unary_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(EncryptedMessage)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SecureExampleServiceServer).Unary(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/okapi.examples.v1.SecureExampleService/Unary",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SecureExampleServiceServer).Unary(ctx, req.(*EncryptedMessage))
	}
	return interceptor(ctx, in, info, handler)
}

func _SecureExampleService_ServerStreaming_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(EncryptedMessage)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(SecureExampleServiceServer).ServerStreaming(m, &secureExampleServiceServerStreamingServer{stream})
}

type SecureExampleService_ServerStreamingServer interface {
	Send(*EncryptedMessage) error
	grpc.ServerStream
}

type secureExampleServiceServerStreamingServer struct {
	grpc.ServerStream
}

func (x *secureExampleServiceServerStreamingServer) Send(m *EncryptedMessage) error {
	return x.ServerStream.SendMsg(m)
}

// SecureExampleService_ServiceDesc is the grpc.ServiceDesc for SecureExampleService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var SecureExampleService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "okapi.examples.v1.SecureExampleService",
	HandlerType: (*SecureExampleServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Unary",
			Handler:    _SecureExampleService_Unary_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "ServerStreaming",
			Handler:       _SecureExampleService_ServerStreaming_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "okapi/examples/v1/examples.proto",
}