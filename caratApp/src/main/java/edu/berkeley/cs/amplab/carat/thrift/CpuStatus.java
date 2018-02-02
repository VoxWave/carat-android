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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2018-2-2")
public class CpuStatus implements org.apache.thrift.TBase<CpuStatus, CpuStatus._Fields>, java.io.Serializable, Cloneable, Comparable<CpuStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CpuStatus");

  private static final org.apache.thrift.protocol.TField CPU_USAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("cpuUsage", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField UPTIME_FIELD_DESC = new org.apache.thrift.protocol.TField("uptime", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField SLEEPTIME_FIELD_DESC = new org.apache.thrift.protocol.TField("sleeptime", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField CURRENT_FREQUENCIES_FIELD_DESC = new org.apache.thrift.protocol.TField("currentFrequencies", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField MIN_FREQUENCIES_FIELD_DESC = new org.apache.thrift.protocol.TField("minFrequencies", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField MAX_FREQUENCIES_FIELD_DESC = new org.apache.thrift.protocol.TField("maxFrequencies", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CpuStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CpuStatusTupleSchemeFactory());
  }

  public double cpuUsage; // optional
  public double uptime; // optional
  public double sleeptime; // optional
  public List<Long> currentFrequencies; // optional
  public List<Long> minFrequencies; // optional
  public List<Long> maxFrequencies; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CPU_USAGE((short)1, "cpuUsage"),
    UPTIME((short)2, "uptime"),
    SLEEPTIME((short)3, "sleeptime"),
    CURRENT_FREQUENCIES((short)4, "currentFrequencies"),
    MIN_FREQUENCIES((short)5, "minFrequencies"),
    MAX_FREQUENCIES((short)6, "maxFrequencies");

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
        case 1: // CPU_USAGE
          return CPU_USAGE;
        case 2: // UPTIME
          return UPTIME;
        case 3: // SLEEPTIME
          return SLEEPTIME;
        case 4: // CURRENT_FREQUENCIES
          return CURRENT_FREQUENCIES;
        case 5: // MIN_FREQUENCIES
          return MIN_FREQUENCIES;
        case 6: // MAX_FREQUENCIES
          return MAX_FREQUENCIES;
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
  private static final int __CPUUSAGE_ISSET_ID = 0;
  private static final int __UPTIME_ISSET_ID = 1;
  private static final int __SLEEPTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CPU_USAGE,_Fields.UPTIME,_Fields.SLEEPTIME,_Fields.CURRENT_FREQUENCIES,_Fields.MIN_FREQUENCIES,_Fields.MAX_FREQUENCIES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CPU_USAGE, new org.apache.thrift.meta_data.FieldMetaData("cpuUsage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.UPTIME, new org.apache.thrift.meta_data.FieldMetaData("uptime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SLEEPTIME, new org.apache.thrift.meta_data.FieldMetaData("sleeptime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CURRENT_FREQUENCIES, new org.apache.thrift.meta_data.FieldMetaData("currentFrequencies", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.MIN_FREQUENCIES, new org.apache.thrift.meta_data.FieldMetaData("minFrequencies", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.MAX_FREQUENCIES, new org.apache.thrift.meta_data.FieldMetaData("maxFrequencies", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CpuStatus.class, metaDataMap);
  }

  public CpuStatus() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CpuStatus(CpuStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    this.cpuUsage = other.cpuUsage;
    this.uptime = other.uptime;
    this.sleeptime = other.sleeptime;
    if (other.isSetCurrentFrequencies()) {
      List<Long> __this__currentFrequencies = new ArrayList<Long>(other.currentFrequencies);
      this.currentFrequencies = __this__currentFrequencies;
    }
    if (other.isSetMinFrequencies()) {
      List<Long> __this__minFrequencies = new ArrayList<Long>(other.minFrequencies);
      this.minFrequencies = __this__minFrequencies;
    }
    if (other.isSetMaxFrequencies()) {
      List<Long> __this__maxFrequencies = new ArrayList<Long>(other.maxFrequencies);
      this.maxFrequencies = __this__maxFrequencies;
    }
  }

  public CpuStatus deepCopy() {
    return new CpuStatus(this);
  }

  @Override
  public void clear() {
    setCpuUsageIsSet(false);
    this.cpuUsage = 0.0;
    setUptimeIsSet(false);
    this.uptime = 0.0;
    setSleeptimeIsSet(false);
    this.sleeptime = 0.0;
    this.currentFrequencies = null;
    this.minFrequencies = null;
    this.maxFrequencies = null;
  }

  public double getCpuUsage() {
    return this.cpuUsage;
  }

  public CpuStatus setCpuUsage(double cpuUsage) {
    this.cpuUsage = cpuUsage;
    setCpuUsageIsSet(true);
    return this;
  }

  public void unsetCpuUsage() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CPUUSAGE_ISSET_ID);
  }

  /** Returns true if field cpuUsage is set (has been assigned a value) and false otherwise */
  public boolean isSetCpuUsage() {
    return EncodingUtils.testBit(__isset_bitfield, __CPUUSAGE_ISSET_ID);
  }

  public void setCpuUsageIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CPUUSAGE_ISSET_ID, value);
  }

  public double getUptime() {
    return this.uptime;
  }

  public CpuStatus setUptime(double uptime) {
    this.uptime = uptime;
    setUptimeIsSet(true);
    return this;
  }

  public void unsetUptime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __UPTIME_ISSET_ID);
  }

  /** Returns true if field uptime is set (has been assigned a value) and false otherwise */
  public boolean isSetUptime() {
    return EncodingUtils.testBit(__isset_bitfield, __UPTIME_ISSET_ID);
  }

  public void setUptimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __UPTIME_ISSET_ID, value);
  }

  public double getSleeptime() {
    return this.sleeptime;
  }

  public CpuStatus setSleeptime(double sleeptime) {
    this.sleeptime = sleeptime;
    setSleeptimeIsSet(true);
    return this;
  }

  public void unsetSleeptime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SLEEPTIME_ISSET_ID);
  }

  /** Returns true if field sleeptime is set (has been assigned a value) and false otherwise */
  public boolean isSetSleeptime() {
    return EncodingUtils.testBit(__isset_bitfield, __SLEEPTIME_ISSET_ID);
  }

  public void setSleeptimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SLEEPTIME_ISSET_ID, value);
  }

  public int getCurrentFrequenciesSize() {
    return (this.currentFrequencies == null) ? 0 : this.currentFrequencies.size();
  }

  public java.util.Iterator<Long> getCurrentFrequenciesIterator() {
    return (this.currentFrequencies == null) ? null : this.currentFrequencies.iterator();
  }

  public void addToCurrentFrequencies(long elem) {
    if (this.currentFrequencies == null) {
      this.currentFrequencies = new ArrayList<Long>();
    }
    this.currentFrequencies.add(elem);
  }

  public List<Long> getCurrentFrequencies() {
    return this.currentFrequencies;
  }

  public CpuStatus setCurrentFrequencies(List<Long> currentFrequencies) {
    this.currentFrequencies = currentFrequencies;
    return this;
  }

  public void unsetCurrentFrequencies() {
    this.currentFrequencies = null;
  }

  /** Returns true if field currentFrequencies is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrentFrequencies() {
    return this.currentFrequencies != null;
  }

  public void setCurrentFrequenciesIsSet(boolean value) {
    if (!value) {
      this.currentFrequencies = null;
    }
  }

  public int getMinFrequenciesSize() {
    return (this.minFrequencies == null) ? 0 : this.minFrequencies.size();
  }

  public java.util.Iterator<Long> getMinFrequenciesIterator() {
    return (this.minFrequencies == null) ? null : this.minFrequencies.iterator();
  }

  public void addToMinFrequencies(long elem) {
    if (this.minFrequencies == null) {
      this.minFrequencies = new ArrayList<Long>();
    }
    this.minFrequencies.add(elem);
  }

  public List<Long> getMinFrequencies() {
    return this.minFrequencies;
  }

  public CpuStatus setMinFrequencies(List<Long> minFrequencies) {
    this.minFrequencies = minFrequencies;
    return this;
  }

  public void unsetMinFrequencies() {
    this.minFrequencies = null;
  }

  /** Returns true if field minFrequencies is set (has been assigned a value) and false otherwise */
  public boolean isSetMinFrequencies() {
    return this.minFrequencies != null;
  }

  public void setMinFrequenciesIsSet(boolean value) {
    if (!value) {
      this.minFrequencies = null;
    }
  }

  public int getMaxFrequenciesSize() {
    return (this.maxFrequencies == null) ? 0 : this.maxFrequencies.size();
  }

  public java.util.Iterator<Long> getMaxFrequenciesIterator() {
    return (this.maxFrequencies == null) ? null : this.maxFrequencies.iterator();
  }

  public void addToMaxFrequencies(long elem) {
    if (this.maxFrequencies == null) {
      this.maxFrequencies = new ArrayList<Long>();
    }
    this.maxFrequencies.add(elem);
  }

  public List<Long> getMaxFrequencies() {
    return this.maxFrequencies;
  }

  public CpuStatus setMaxFrequencies(List<Long> maxFrequencies) {
    this.maxFrequencies = maxFrequencies;
    return this;
  }

  public void unsetMaxFrequencies() {
    this.maxFrequencies = null;
  }

  /** Returns true if field maxFrequencies is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxFrequencies() {
    return this.maxFrequencies != null;
  }

  public void setMaxFrequenciesIsSet(boolean value) {
    if (!value) {
      this.maxFrequencies = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CPU_USAGE:
      if (value == null) {
        unsetCpuUsage();
      } else {
        setCpuUsage((Double)value);
      }
      break;

    case UPTIME:
      if (value == null) {
        unsetUptime();
      } else {
        setUptime((Double)value);
      }
      break;

    case SLEEPTIME:
      if (value == null) {
        unsetSleeptime();
      } else {
        setSleeptime((Double)value);
      }
      break;

    case CURRENT_FREQUENCIES:
      if (value == null) {
        unsetCurrentFrequencies();
      } else {
        setCurrentFrequencies((List<Long>)value);
      }
      break;

    case MIN_FREQUENCIES:
      if (value == null) {
        unsetMinFrequencies();
      } else {
        setMinFrequencies((List<Long>)value);
      }
      break;

    case MAX_FREQUENCIES:
      if (value == null) {
        unsetMaxFrequencies();
      } else {
        setMaxFrequencies((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CPU_USAGE:
      return Double.valueOf(getCpuUsage());

    case UPTIME:
      return Double.valueOf(getUptime());

    case SLEEPTIME:
      return Double.valueOf(getSleeptime());

    case CURRENT_FREQUENCIES:
      return getCurrentFrequencies();

    case MIN_FREQUENCIES:
      return getMinFrequencies();

    case MAX_FREQUENCIES:
      return getMaxFrequencies();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CPU_USAGE:
      return isSetCpuUsage();
    case UPTIME:
      return isSetUptime();
    case SLEEPTIME:
      return isSetSleeptime();
    case CURRENT_FREQUENCIES:
      return isSetCurrentFrequencies();
    case MIN_FREQUENCIES:
      return isSetMinFrequencies();
    case MAX_FREQUENCIES:
      return isSetMaxFrequencies();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CpuStatus)
      return this.equals((CpuStatus)that);
    return false;
  }

  public boolean equals(CpuStatus that) {
    if (that == null)
      return false;

    boolean this_present_cpuUsage = true && this.isSetCpuUsage();
    boolean that_present_cpuUsage = true && that.isSetCpuUsage();
    if (this_present_cpuUsage || that_present_cpuUsage) {
      if (!(this_present_cpuUsage && that_present_cpuUsage))
        return false;
      if (this.cpuUsage != that.cpuUsage)
        return false;
    }

    boolean this_present_uptime = true && this.isSetUptime();
    boolean that_present_uptime = true && that.isSetUptime();
    if (this_present_uptime || that_present_uptime) {
      if (!(this_present_uptime && that_present_uptime))
        return false;
      if (this.uptime != that.uptime)
        return false;
    }

    boolean this_present_sleeptime = true && this.isSetSleeptime();
    boolean that_present_sleeptime = true && that.isSetSleeptime();
    if (this_present_sleeptime || that_present_sleeptime) {
      if (!(this_present_sleeptime && that_present_sleeptime))
        return false;
      if (this.sleeptime != that.sleeptime)
        return false;
    }

    boolean this_present_currentFrequencies = true && this.isSetCurrentFrequencies();
    boolean that_present_currentFrequencies = true && that.isSetCurrentFrequencies();
    if (this_present_currentFrequencies || that_present_currentFrequencies) {
      if (!(this_present_currentFrequencies && that_present_currentFrequencies))
        return false;
      if (!this.currentFrequencies.equals(that.currentFrequencies))
        return false;
    }

    boolean this_present_minFrequencies = true && this.isSetMinFrequencies();
    boolean that_present_minFrequencies = true && that.isSetMinFrequencies();
    if (this_present_minFrequencies || that_present_minFrequencies) {
      if (!(this_present_minFrequencies && that_present_minFrequencies))
        return false;
      if (!this.minFrequencies.equals(that.minFrequencies))
        return false;
    }

    boolean this_present_maxFrequencies = true && this.isSetMaxFrequencies();
    boolean that_present_maxFrequencies = true && that.isSetMaxFrequencies();
    if (this_present_maxFrequencies || that_present_maxFrequencies) {
      if (!(this_present_maxFrequencies && that_present_maxFrequencies))
        return false;
      if (!this.maxFrequencies.equals(that.maxFrequencies))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cpuUsage = true && (isSetCpuUsage());
    list.add(present_cpuUsage);
    if (present_cpuUsage)
      list.add(cpuUsage);

    boolean present_uptime = true && (isSetUptime());
    list.add(present_uptime);
    if (present_uptime)
      list.add(uptime);

    boolean present_sleeptime = true && (isSetSleeptime());
    list.add(present_sleeptime);
    if (present_sleeptime)
      list.add(sleeptime);

    boolean present_currentFrequencies = true && (isSetCurrentFrequencies());
    list.add(present_currentFrequencies);
    if (present_currentFrequencies)
      list.add(currentFrequencies);

    boolean present_minFrequencies = true && (isSetMinFrequencies());
    list.add(present_minFrequencies);
    if (present_minFrequencies)
      list.add(minFrequencies);

    boolean present_maxFrequencies = true && (isSetMaxFrequencies());
    list.add(present_maxFrequencies);
    if (present_maxFrequencies)
      list.add(maxFrequencies);

    return list.hashCode();
  }

  @Override
  public int compareTo(CpuStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCpuUsage()).compareTo(other.isSetCpuUsage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCpuUsage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cpuUsage, other.cpuUsage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUptime()).compareTo(other.isSetUptime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUptime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uptime, other.uptime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSleeptime()).compareTo(other.isSetSleeptime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSleeptime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sleeptime, other.sleeptime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurrentFrequencies()).compareTo(other.isSetCurrentFrequencies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrentFrequencies()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currentFrequencies, other.currentFrequencies);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMinFrequencies()).compareTo(other.isSetMinFrequencies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMinFrequencies()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.minFrequencies, other.minFrequencies);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxFrequencies()).compareTo(other.isSetMaxFrequencies());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxFrequencies()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxFrequencies, other.maxFrequencies);
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
    StringBuilder sb = new StringBuilder("CpuStatus(");
    boolean first = true;

    if (isSetCpuUsage()) {
      sb.append("cpuUsage:");
      sb.append(this.cpuUsage);
      first = false;
    }
    if (isSetUptime()) {
      if (!first) sb.append(", ");
      sb.append("uptime:");
      sb.append(this.uptime);
      first = false;
    }
    if (isSetSleeptime()) {
      if (!first) sb.append(", ");
      sb.append("sleeptime:");
      sb.append(this.sleeptime);
      first = false;
    }
    if (isSetCurrentFrequencies()) {
      if (!first) sb.append(", ");
      sb.append("currentFrequencies:");
      if (this.currentFrequencies == null) {
        sb.append("null");
      } else {
        sb.append(this.currentFrequencies);
      }
      first = false;
    }
    if (isSetMinFrequencies()) {
      if (!first) sb.append(", ");
      sb.append("minFrequencies:");
      if (this.minFrequencies == null) {
        sb.append("null");
      } else {
        sb.append(this.minFrequencies);
      }
      first = false;
    }
    if (isSetMaxFrequencies()) {
      if (!first) sb.append(", ");
      sb.append("maxFrequencies:");
      if (this.maxFrequencies == null) {
        sb.append("null");
      } else {
        sb.append(this.maxFrequencies);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class CpuStatusStandardSchemeFactory implements SchemeFactory {
    public CpuStatusStandardScheme getScheme() {
      return new CpuStatusStandardScheme();
    }
  }

  private static class CpuStatusStandardScheme extends StandardScheme<CpuStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CpuStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CPU_USAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.cpuUsage = iprot.readDouble();
              struct.setCpuUsageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UPTIME
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.uptime = iprot.readDouble();
              struct.setUptimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SLEEPTIME
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.sleeptime = iprot.readDouble();
              struct.setSleeptimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CURRENT_FREQUENCIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.currentFrequencies = new ArrayList<Long>(_list16.size);
                long _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = iprot.readI64();
                  struct.currentFrequencies.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setCurrentFrequenciesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MIN_FREQUENCIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                struct.minFrequencies = new ArrayList<Long>(_list19.size);
                long _elem20;
                for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                {
                  _elem20 = iprot.readI64();
                  struct.minFrequencies.add(_elem20);
                }
                iprot.readListEnd();
              }
              struct.setMinFrequenciesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // MAX_FREQUENCIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list22 = iprot.readListBegin();
                struct.maxFrequencies = new ArrayList<Long>(_list22.size);
                long _elem23;
                for (int _i24 = 0; _i24 < _list22.size; ++_i24)
                {
                  _elem23 = iprot.readI64();
                  struct.maxFrequencies.add(_elem23);
                }
                iprot.readListEnd();
              }
              struct.setMaxFrequenciesIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CpuStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetCpuUsage()) {
        oprot.writeFieldBegin(CPU_USAGE_FIELD_DESC);
        oprot.writeDouble(struct.cpuUsage);
        oprot.writeFieldEnd();
      }
      if (struct.isSetUptime()) {
        oprot.writeFieldBegin(UPTIME_FIELD_DESC);
        oprot.writeDouble(struct.uptime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSleeptime()) {
        oprot.writeFieldBegin(SLEEPTIME_FIELD_DESC);
        oprot.writeDouble(struct.sleeptime);
        oprot.writeFieldEnd();
      }
      if (struct.currentFrequencies != null) {
        if (struct.isSetCurrentFrequencies()) {
          oprot.writeFieldBegin(CURRENT_FREQUENCIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.currentFrequencies.size()));
            for (long _iter25 : struct.currentFrequencies)
            {
              oprot.writeI64(_iter25);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.minFrequencies != null) {
        if (struct.isSetMinFrequencies()) {
          oprot.writeFieldBegin(MIN_FREQUENCIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.minFrequencies.size()));
            for (long _iter26 : struct.minFrequencies)
            {
              oprot.writeI64(_iter26);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.maxFrequencies != null) {
        if (struct.isSetMaxFrequencies()) {
          oprot.writeFieldBegin(MAX_FREQUENCIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.maxFrequencies.size()));
            for (long _iter27 : struct.maxFrequencies)
            {
              oprot.writeI64(_iter27);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CpuStatusTupleSchemeFactory implements SchemeFactory {
    public CpuStatusTupleScheme getScheme() {
      return new CpuStatusTupleScheme();
    }
  }

  private static class CpuStatusTupleScheme extends TupleScheme<CpuStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CpuStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCpuUsage()) {
        optionals.set(0);
      }
      if (struct.isSetUptime()) {
        optionals.set(1);
      }
      if (struct.isSetSleeptime()) {
        optionals.set(2);
      }
      if (struct.isSetCurrentFrequencies()) {
        optionals.set(3);
      }
      if (struct.isSetMinFrequencies()) {
        optionals.set(4);
      }
      if (struct.isSetMaxFrequencies()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetCpuUsage()) {
        oprot.writeDouble(struct.cpuUsage);
      }
      if (struct.isSetUptime()) {
        oprot.writeDouble(struct.uptime);
      }
      if (struct.isSetSleeptime()) {
        oprot.writeDouble(struct.sleeptime);
      }
      if (struct.isSetCurrentFrequencies()) {
        {
          oprot.writeI32(struct.currentFrequencies.size());
          for (long _iter28 : struct.currentFrequencies)
          {
            oprot.writeI64(_iter28);
          }
        }
      }
      if (struct.isSetMinFrequencies()) {
        {
          oprot.writeI32(struct.minFrequencies.size());
          for (long _iter29 : struct.minFrequencies)
          {
            oprot.writeI64(_iter29);
          }
        }
      }
      if (struct.isSetMaxFrequencies()) {
        {
          oprot.writeI32(struct.maxFrequencies.size());
          for (long _iter30 : struct.maxFrequencies)
          {
            oprot.writeI64(_iter30);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CpuStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.cpuUsage = iprot.readDouble();
        struct.setCpuUsageIsSet(true);
      }
      if (incoming.get(1)) {
        struct.uptime = iprot.readDouble();
        struct.setUptimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sleeptime = iprot.readDouble();
        struct.setSleeptimeIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list31 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.currentFrequencies = new ArrayList<Long>(_list31.size);
          long _elem32;
          for (int _i33 = 0; _i33 < _list31.size; ++_i33)
          {
            _elem32 = iprot.readI64();
            struct.currentFrequencies.add(_elem32);
          }
        }
        struct.setCurrentFrequenciesIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list34 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.minFrequencies = new ArrayList<Long>(_list34.size);
          long _elem35;
          for (int _i36 = 0; _i36 < _list34.size; ++_i36)
          {
            _elem35 = iprot.readI64();
            struct.minFrequencies.add(_elem35);
          }
        }
        struct.setMinFrequenciesIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list37 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.maxFrequencies = new ArrayList<Long>(_list37.size);
          long _elem38;
          for (int _i39 = 0; _i39 < _list37.size; ++_i39)
          {
            _elem38 = iprot.readI64();
            struct.maxFrequencies.add(_elem38);
          }
        }
        struct.setMaxFrequenciesIsSet(true);
      }
    }
  }

}

