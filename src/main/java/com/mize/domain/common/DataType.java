package com.mize.domain.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlType(name="appDataType")
public interface DataType extends Serializable{
	public Object getBaseValue();
	public int sqlType();
	public Class<?> getBaseType();
	
}
