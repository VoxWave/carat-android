/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.berkeley.cs.amplab.carat.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-6-13")
public class QuestionnaireAnswer implements org.apache.thrift.TBase<QuestionnaireAnswer, QuestionnaireAnswer._Fields>, java.io.Serializable, Cloneable, Comparable<QuestionnaireAnswer> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QuestionnaireAnswer");

  private static final org.apache.thrift.protocol.TField QUESTION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("questionId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ANSWERS_FIELD_DESC = new org.apache.thrift.protocol.TField("answers", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField INPUT_FIELD_DESC = new org.apache.thrift.protocol.TField("input", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField OTHER_FIELD_DESC = new org.apache.thrift.protocol.TField("other", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QuestionnaireAnswerStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QuestionnaireAnswerTupleSchemeFactory());
  }

  public int questionId; // required
  public List<Integer> answers; // optional
  public String input; // optional
  public boolean other; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUESTION_ID((short)1, "questionId"),
    ANSWERS((short)2, "answers"),
    INPUT((short)3, "input"),
    OTHER((short)4, "other");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // QUESTION_ID
          return QUESTION_ID;
        case 2: // ANSWERS
          return ANSWERS;
        case 3: // INPUT
          return INPUT;
        case 4: // OTHER
          return OTHER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __QUESTIONID_ISSET_ID = 0;
  private static final int __OTHER_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ANSWERS,_Fields.INPUT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUESTION_ID, new org.apache.thrift.meta_data.FieldMetaData("questionId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ANSWERS, new org.apache.thrift.meta_data.FieldMetaData("answers", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.INPUT, new org.apache.thrift.meta_data.FieldMetaData("input", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OTHER, new org.apache.thrift.meta_data.FieldMetaData("other", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QuestionnaireAnswer.class, metaDataMap);
  }

  public QuestionnaireAnswer() {
  }

  public QuestionnaireAnswer(
    int questionId,
    boolean other)
  {
    this();
    this.questionId = questionId;
    setQuestionIdIsSet(true);
    this.other = other;
    setOtherIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QuestionnaireAnswer(QuestionnaireAnswer other) {
    __isset_bitfield = other.__isset_bitfield;
    this.questionId = other.questionId;
    if (other.isSetAnswers()) {
      List<Integer> __this__answers = new ArrayList<Integer>(other.answers);
      this.answers = __this__answers;
    }
    if (other.isSetInput()) {
      this.input = other.input;
    }
    this.other = other.other;
  }

  public QuestionnaireAnswer deepCopy() {
    return new QuestionnaireAnswer(this);
  }

  @Override
  public void clear() {
    setQuestionIdIsSet(false);
    this.questionId = 0;
    this.answers = null;
    this.input = null;
    setOtherIsSet(false);
    this.other = false;
  }

  public int getQuestionId() {
    return this.questionId;
  }

  public QuestionnaireAnswer setQuestionId(int questionId) {
    this.questionId = questionId;
    setQuestionIdIsSet(true);
    return this;
  }

  public void unsetQuestionId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __QUESTIONID_ISSET_ID);
  }

  /** Returns true if field questionId is set (has been assigned a value) and false otherwise */
  public boolean isSetQuestionId() {
    return EncodingUtils.testBit(__isset_bitfield, __QUESTIONID_ISSET_ID);
  }

  public void setQuestionIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __QUESTIONID_ISSET_ID, value);
  }

  public int getAnswersSize() {
    return (this.answers == null) ? 0 : this.answers.size();
  }

  public java.util.Iterator<Integer> getAnswersIterator() {
    return (this.answers == null) ? null : this.answers.iterator();
  }

  public void addToAnswers(int elem) {
    if (this.answers == null) {
      this.answers = new ArrayList<Integer>();
    }
    this.answers.add(elem);
  }

  public List<Integer> getAnswers() {
    return this.answers;
  }

  public QuestionnaireAnswer setAnswers(List<Integer> answers) {
    this.answers = answers;
    return this;
  }

  public void unsetAnswers() {
    this.answers = null;
  }

  /** Returns true if field answers is set (has been assigned a value) and false otherwise */
  public boolean isSetAnswers() {
    return this.answers != null;
  }

  public void setAnswersIsSet(boolean value) {
    if (!value) {
      this.answers = null;
    }
  }

  public String getInput() {
    return this.input;
  }

  public QuestionnaireAnswer setInput(String input) {
    this.input = input;
    return this;
  }

  public void unsetInput() {
    this.input = null;
  }

  /** Returns true if field input is set (has been assigned a value) and false otherwise */
  public boolean isSetInput() {
    return this.input != null;
  }

  public void setInputIsSet(boolean value) {
    if (!value) {
      this.input = null;
    }
  }

  public boolean isOther() {
    return this.other;
  }

  public QuestionnaireAnswer setOther(boolean other) {
    this.other = other;
    setOtherIsSet(true);
    return this;
  }

  public void unsetOther() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OTHER_ISSET_ID);
  }

  /** Returns true if field other is set (has been assigned a value) and false otherwise */
  public boolean isSetOther() {
    return EncodingUtils.testBit(__isset_bitfield, __OTHER_ISSET_ID);
  }

  public void setOtherIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OTHER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUESTION_ID:
      if (value == null) {
        unsetQuestionId();
      } else {
        setQuestionId((Integer)value);
      }
      break;

    case ANSWERS:
      if (value == null) {
        unsetAnswers();
      } else {
        setAnswers((List<Integer>)value);
      }
      break;

    case INPUT:
      if (value == null) {
        unsetInput();
      } else {
        setInput((String)value);
      }
      break;

    case OTHER:
      if (value == null) {
        unsetOther();
      } else {
        setOther((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUESTION_ID:
      return Integer.valueOf(getQuestionId());

    case ANSWERS:
      return getAnswers();

    case INPUT:
      return getInput();

    case OTHER:
      return Boolean.valueOf(isOther());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUESTION_ID:
      return isSetQuestionId();
    case ANSWERS:
      return isSetAnswers();
    case INPUT:
      return isSetInput();
    case OTHER:
      return isSetOther();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QuestionnaireAnswer)
      return this.equals((QuestionnaireAnswer)that);
    return false;
  }

  public boolean equals(QuestionnaireAnswer that) {
    if (that == null)
      return false;

    boolean this_present_questionId = true;
    boolean that_present_questionId = true;
    if (this_present_questionId || that_present_questionId) {
      if (!(this_present_questionId && that_present_questionId))
        return false;
      if (this.questionId != that.questionId)
        return false;
    }

    boolean this_present_answers = true && this.isSetAnswers();
    boolean that_present_answers = true && that.isSetAnswers();
    if (this_present_answers || that_present_answers) {
      if (!(this_present_answers && that_present_answers))
        return false;
      if (!this.answers.equals(that.answers))
        return false;
    }

    boolean this_present_input = true && this.isSetInput();
    boolean that_present_input = true && that.isSetInput();
    if (this_present_input || that_present_input) {
      if (!(this_present_input && that_present_input))
        return false;
      if (!this.input.equals(that.input))
        return false;
    }

    boolean this_present_other = true;
    boolean that_present_other = true;
    if (this_present_other || that_present_other) {
      if (!(this_present_other && that_present_other))
        return false;
      if (this.other != that.other)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_questionId = true;
    list.add(present_questionId);
    if (present_questionId)
      list.add(questionId);

    boolean present_answers = true && (isSetAnswers());
    list.add(present_answers);
    if (present_answers)
      list.add(answers);

    boolean present_input = true && (isSetInput());
    list.add(present_input);
    if (present_input)
      list.add(input);

    boolean present_other = true;
    list.add(present_other);
    if (present_other)
      list.add(other);

    return list.hashCode();
  }

  @Override
  public int compareTo(QuestionnaireAnswer other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQuestionId()).compareTo(other.isSetQuestionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuestionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.questionId, other.questionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAnswers()).compareTo(other.isSetAnswers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnswers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.answers, other.answers);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInput()).compareTo(other.isSetInput());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInput()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.input, other.input);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOther()).compareTo(other.isSetOther());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOther()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.other, other.other);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("QuestionnaireAnswer(");
    boolean first = true;

    sb.append("questionId:");
    sb.append(this.questionId);
    first = false;
    if (isSetAnswers()) {
      if (!first) sb.append(", ");
      sb.append("answers:");
      if (this.answers == null) {
        sb.append("null");
      } else {
        sb.append(this.answers);
      }
      first = false;
    }
    if (isSetInput()) {
      if (!first) sb.append(", ");
      sb.append("input:");
      if (this.input == null) {
        sb.append("null");
      } else {
        sb.append(this.input);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("other:");
    sb.append(this.other);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'questionId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'other' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QuestionnaireAnswerStandardSchemeFactory implements SchemeFactory {
    public QuestionnaireAnswerStandardScheme getScheme() {
      return new QuestionnaireAnswerStandardScheme();
    }
  }

  private static class QuestionnaireAnswerStandardScheme extends StandardScheme<QuestionnaireAnswer> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QuestionnaireAnswer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUESTION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.questionId = iprot.readI32();
              struct.setQuestionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ANSWERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list112 = iprot.readListBegin();
                struct.answers = new ArrayList<Integer>(_list112.size);
                int _elem113;
                for (int _i114 = 0; _i114 < _list112.size; ++_i114)
                {
                  _elem113 = iprot.readI32();
                  struct.answers.add(_elem113);
                }
                iprot.readListEnd();
              }
              struct.setAnswersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INPUT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.input = iprot.readString();
              struct.setInputIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OTHER
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.other = iprot.readBool();
              struct.setOtherIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetQuestionId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'questionId' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetOther()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'other' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, QuestionnaireAnswer struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(QUESTION_ID_FIELD_DESC);
      oprot.writeI32(struct.questionId);
      oprot.writeFieldEnd();
      if (struct.answers != null) {
        if (struct.isSetAnswers()) {
          oprot.writeFieldBegin(ANSWERS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.answers.size()));
            for (int _iter115 : struct.answers)
            {
              oprot.writeI32(_iter115);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.input != null) {
        if (struct.isSetInput()) {
          oprot.writeFieldBegin(INPUT_FIELD_DESC);
          oprot.writeString(struct.input);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldBegin(OTHER_FIELD_DESC);
      oprot.writeBool(struct.other);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QuestionnaireAnswerTupleSchemeFactory implements SchemeFactory {
    public QuestionnaireAnswerTupleScheme getScheme() {
      return new QuestionnaireAnswerTupleScheme();
    }
  }

  private static class QuestionnaireAnswerTupleScheme extends TupleScheme<QuestionnaireAnswer> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QuestionnaireAnswer struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.questionId);
      oprot.writeBool(struct.other);
      BitSet optionals = new BitSet();
      if (struct.isSetAnswers()) {
        optionals.set(0);
      }
      if (struct.isSetInput()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAnswers()) {
        {
          oprot.writeI32(struct.answers.size());
          for (int _iter116 : struct.answers)
          {
            oprot.writeI32(_iter116);
          }
        }
      }
      if (struct.isSetInput()) {
        oprot.writeString(struct.input);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QuestionnaireAnswer struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.questionId = iprot.readI32();
      struct.setQuestionIdIsSet(true);
      struct.other = iprot.readBool();
      struct.setOtherIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list117 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.answers = new ArrayList<Integer>(_list117.size);
          int _elem118;
          for (int _i119 = 0; _i119 < _list117.size; ++_i119)
          {
            _elem118 = iprot.readI32();
            struct.answers.add(_elem118);
          }
        }
        struct.setAnswersIsSet(true);
      }
      if (incoming.get(1)) {
        struct.input = iprot.readString();
        struct.setInputIsSet(true);
      }
    }
  }

}

