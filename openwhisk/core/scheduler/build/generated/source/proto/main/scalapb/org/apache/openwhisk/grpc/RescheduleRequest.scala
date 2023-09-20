// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package org.apache.openwhisk.grpc

@SerialVersionUID(0L)
final case class RescheduleRequest(
    invocationNamespace: _root_.scala.Predef.String = "",
    fqn: _root_.scala.Predef.String = "",
    rev: _root_.scala.Predef.String = "",
    activationMessage: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[RescheduleRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = invocationNamespace
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = fqn
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = rev
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = activationMessage
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = invocationNamespace
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = fqn
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = rev
        if (!__v.isEmpty) {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = activationMessage
        if (!__v.isEmpty) {
          _output__.writeString(4, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withInvocationNamespace(__v: _root_.scala.Predef.String): RescheduleRequest = copy(invocationNamespace = __v)
    def withFqn(__v: _root_.scala.Predef.String): RescheduleRequest = copy(fqn = __v)
    def withRev(__v: _root_.scala.Predef.String): RescheduleRequest = copy(rev = __v)
    def withActivationMessage(__v: _root_.scala.Predef.String): RescheduleRequest = copy(activationMessage = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = invocationNamespace
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = fqn
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = rev
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = activationMessage
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(invocationNamespace)
        case 2 => _root_.scalapb.descriptors.PString(fqn)
        case 3 => _root_.scalapb.descriptors.PString(rev)
        case 4 => _root_.scalapb.descriptors.PString(activationMessage)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = org.apache.openwhisk.grpc.RescheduleRequest
}

object RescheduleRequest extends scalapb.GeneratedMessageCompanion[org.apache.openwhisk.grpc.RescheduleRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[org.apache.openwhisk.grpc.RescheduleRequest] = this
  def merge(`_message__`: org.apache.openwhisk.grpc.RescheduleRequest, `_input__`: _root_.com.google.protobuf.CodedInputStream): org.apache.openwhisk.grpc.RescheduleRequest = {
    var __invocationNamespace = `_message__`.invocationNamespace
    var __fqn = `_message__`.fqn
    var __rev = `_message__`.rev
    var __activationMessage = `_message__`.activationMessage
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __invocationNamespace = _input__.readStringRequireUtf8()
        case 18 =>
          __fqn = _input__.readStringRequireUtf8()
        case 26 =>
          __rev = _input__.readStringRequireUtf8()
        case 34 =>
          __activationMessage = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    org.apache.openwhisk.grpc.RescheduleRequest(
        invocationNamespace = __invocationNamespace,
        fqn = __fqn,
        rev = __rev,
        activationMessage = __activationMessage,
        unknownFields = if (_unknownFields__ == null) _message__.unknownFields else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[org.apache.openwhisk.grpc.RescheduleRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      org.apache.openwhisk.grpc.RescheduleRequest(
        invocationNamespace = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        fqn = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        rev = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        activationMessage = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ActivationProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ActivationProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = org.apache.openwhisk.grpc.RescheduleRequest(
    invocationNamespace = "",
    fqn = "",
    rev = "",
    activationMessage = ""
  )
  implicit class RescheduleRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, org.apache.openwhisk.grpc.RescheduleRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, org.apache.openwhisk.grpc.RescheduleRequest](_l) {
    def invocationNamespace: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.invocationNamespace)((c_, f_) => c_.copy(invocationNamespace = f_))
    def fqn: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.fqn)((c_, f_) => c_.copy(fqn = f_))
    def rev: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.rev)((c_, f_) => c_.copy(rev = f_))
    def activationMessage: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.activationMessage)((c_, f_) => c_.copy(activationMessage = f_))
  }
  final val INVOCATIONNAMESPACE_FIELD_NUMBER = 1
  final val FQN_FIELD_NUMBER = 2
  final val REV_FIELD_NUMBER = 3
  final val ACTIVATIONMESSAGE_FIELD_NUMBER = 4
  def of(
    invocationNamespace: _root_.scala.Predef.String,
    fqn: _root_.scala.Predef.String,
    rev: _root_.scala.Predef.String,
    activationMessage: _root_.scala.Predef.String
  ): _root_.org.apache.openwhisk.grpc.RescheduleRequest = _root_.org.apache.openwhisk.grpc.RescheduleRequest(
    invocationNamespace,
    fqn,
    rev,
    activationMessage
  )
}
