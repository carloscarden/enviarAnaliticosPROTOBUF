// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_titulos.proto

package hello_titulos;

public final class HelloTitulos {
  private HelloTitulos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface helloOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hello_titulos.hello)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    java.lang.String getId();
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    com.google.protobuf.ByteString
        getIdBytes();
  }
  /**
   * Protobuf type {@code hello_titulos.hello}
   */
  public static final class hello extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hello_titulos.hello)
      helloOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use hello.newBuilder() to construct.
    private hello(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private hello() {
      id_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new hello();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hello_titulos.HelloTitulos.hello.class, hello_titulos.HelloTitulos.hello.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof hello_titulos.HelloTitulos.hello)) {
        return super.equals(obj);
      }
      hello_titulos.HelloTitulos.hello other = (hello_titulos.HelloTitulos.hello) obj;

      if (!getId()
          .equals(other.getId())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static hello_titulos.HelloTitulos.hello parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hello_titulos.HelloTitulos.hello parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hello_titulos.HelloTitulos.hello parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hello_titulos.HelloTitulos.hello parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static hello_titulos.HelloTitulos.hello parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static hello_titulos.HelloTitulos.hello parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static hello_titulos.HelloTitulos.hello parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(hello_titulos.HelloTitulos.hello prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hello_titulos.hello}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hello_titulos.hello)
        hello_titulos.HelloTitulos.helloOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                hello_titulos.HelloTitulos.hello.class, hello_titulos.HelloTitulos.hello.Builder.class);
      }

      // Construct using hello_titulos.HelloTitulos.hello.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        id_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_descriptor;
      }

      @java.lang.Override
      public hello_titulos.HelloTitulos.hello getDefaultInstanceForType() {
        return hello_titulos.HelloTitulos.hello.getDefaultInstance();
      }

      @java.lang.Override
      public hello_titulos.HelloTitulos.hello build() {
        hello_titulos.HelloTitulos.hello result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public hello_titulos.HelloTitulos.hello buildPartial() {
        hello_titulos.HelloTitulos.hello result = new hello_titulos.HelloTitulos.hello(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(hello_titulos.HelloTitulos.hello result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof hello_titulos.HelloTitulos.hello) {
          return mergeFrom((hello_titulos.HelloTitulos.hello)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(hello_titulos.HelloTitulos.hello other) {
        if (other == hello_titulos.HelloTitulos.hello.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                id_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object id_ = "";
      /**
       * <code>string id = 1;</code>
       * @return The id.
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string id = 1;</code>
       * @return The bytes for id.
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        id_ = getDefaultInstance().getId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string id = 1;</code>
       * @param value The bytes for id to set.
       * @return This builder for chaining.
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hello_titulos.hello)
    }

    // @@protoc_insertion_point(class_scope:hello_titulos.hello)
    private static final hello_titulos.HelloTitulos.hello DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new hello_titulos.HelloTitulos.hello();
    }

    public static hello_titulos.HelloTitulos.hello getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<hello>
        PARSER = new com.google.protobuf.AbstractParser<hello>() {
      @java.lang.Override
      public hello parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<hello> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<hello> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public hello_titulos.HelloTitulos.hello getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface hello_respuestaOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hello_titulos.hello_respuesta)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string mensaje = 1;</code>
     * @return The mensaje.
     */
    java.lang.String getMensaje();
    /**
     * <code>string mensaje = 1;</code>
     * @return The bytes for mensaje.
     */
    com.google.protobuf.ByteString
        getMensajeBytes();
  }
  /**
   * Protobuf type {@code hello_titulos.hello_respuesta}
   */
  public static final class hello_respuesta extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hello_titulos.hello_respuesta)
      hello_respuestaOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use hello_respuesta.newBuilder() to construct.
    private hello_respuesta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private hello_respuesta() {
      mensaje_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new hello_respuesta();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_respuesta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_respuesta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hello_titulos.HelloTitulos.hello_respuesta.class, hello_titulos.HelloTitulos.hello_respuesta.Builder.class);
    }

    public static final int MENSAJE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object mensaje_ = "";
    /**
     * <code>string mensaje = 1;</code>
     * @return The mensaje.
     */
    @java.lang.Override
    public java.lang.String getMensaje() {
      java.lang.Object ref = mensaje_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mensaje_ = s;
        return s;
      }
    }
    /**
     * <code>string mensaje = 1;</code>
     * @return The bytes for mensaje.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMensajeBytes() {
      java.lang.Object ref = mensaje_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mensaje_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mensaje_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mensaje_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mensaje_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mensaje_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof hello_titulos.HelloTitulos.hello_respuesta)) {
        return super.equals(obj);
      }
      hello_titulos.HelloTitulos.hello_respuesta other = (hello_titulos.HelloTitulos.hello_respuesta) obj;

      if (!getMensaje()
          .equals(other.getMensaje())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + MENSAJE_FIELD_NUMBER;
      hash = (53 * hash) + getMensaje().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static hello_titulos.HelloTitulos.hello_respuesta parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(hello_titulos.HelloTitulos.hello_respuesta prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code hello_titulos.hello_respuesta}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hello_titulos.hello_respuesta)
        hello_titulos.HelloTitulos.hello_respuestaOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_respuesta_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_respuesta_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                hello_titulos.HelloTitulos.hello_respuesta.class, hello_titulos.HelloTitulos.hello_respuesta.Builder.class);
      }

      // Construct using hello_titulos.HelloTitulos.hello_respuesta.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        mensaje_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return hello_titulos.HelloTitulos.internal_static_hello_titulos_hello_respuesta_descriptor;
      }

      @java.lang.Override
      public hello_titulos.HelloTitulos.hello_respuesta getDefaultInstanceForType() {
        return hello_titulos.HelloTitulos.hello_respuesta.getDefaultInstance();
      }

      @java.lang.Override
      public hello_titulos.HelloTitulos.hello_respuesta build() {
        hello_titulos.HelloTitulos.hello_respuesta result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public hello_titulos.HelloTitulos.hello_respuesta buildPartial() {
        hello_titulos.HelloTitulos.hello_respuesta result = new hello_titulos.HelloTitulos.hello_respuesta(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(hello_titulos.HelloTitulos.hello_respuesta result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.mensaje_ = mensaje_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof hello_titulos.HelloTitulos.hello_respuesta) {
          return mergeFrom((hello_titulos.HelloTitulos.hello_respuesta)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(hello_titulos.HelloTitulos.hello_respuesta other) {
        if (other == hello_titulos.HelloTitulos.hello_respuesta.getDefaultInstance()) return this;
        if (!other.getMensaje().isEmpty()) {
          mensaje_ = other.mensaje_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                mensaje_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object mensaje_ = "";
      /**
       * <code>string mensaje = 1;</code>
       * @return The mensaje.
       */
      public java.lang.String getMensaje() {
        java.lang.Object ref = mensaje_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          mensaje_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string mensaje = 1;</code>
       * @return The bytes for mensaje.
       */
      public com.google.protobuf.ByteString
          getMensajeBytes() {
        java.lang.Object ref = mensaje_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mensaje_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string mensaje = 1;</code>
       * @param value The mensaje to set.
       * @return This builder for chaining.
       */
      public Builder setMensaje(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        mensaje_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string mensaje = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMensaje() {
        mensaje_ = getDefaultInstance().getMensaje();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string mensaje = 1;</code>
       * @param value The bytes for mensaje to set.
       * @return This builder for chaining.
       */
      public Builder setMensajeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        mensaje_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hello_titulos.hello_respuesta)
    }

    // @@protoc_insertion_point(class_scope:hello_titulos.hello_respuesta)
    private static final hello_titulos.HelloTitulos.hello_respuesta DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new hello_titulos.HelloTitulos.hello_respuesta();
    }

    public static hello_titulos.HelloTitulos.hello_respuesta getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<hello_respuesta>
        PARSER = new com.google.protobuf.AbstractParser<hello_respuesta>() {
      @java.lang.Override
      public hello_respuesta parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<hello_respuesta> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<hello_respuesta> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public hello_titulos.HelloTitulos.hello_respuesta getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_titulos_hello_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_titulos_hello_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_titulos_hello_respuesta_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_titulos_hello_respuesta_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023hello_titulos.proto\022\rhello_titulos\"\023\n\005" +
      "hello\022\n\n\002id\030\001 \001(\t\"\"\n\017hello_respuesta\022\017\n\007" +
      "mensaje\030\001 \001(\t2_\n\032servicios_de_hello_titu" +
      "los\022A\n\007send_id\022\024.hello_titulos.hello\032\036.h" +
      "ello_titulos.hello_respuesta\"\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_hello_titulos_hello_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hello_titulos_hello_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_titulos_hello_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_hello_titulos_hello_respuesta_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hello_titulos_hello_respuesta_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_titulos_hello_respuesta_descriptor,
        new java.lang.String[] { "Mensaje", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}