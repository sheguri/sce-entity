package com.mize.domain.common;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IEntity extends Serializable{

	public static final int PRIME = 31;		
	public static final int EQUAL = 0;	
	public static final int BEFORE = -1;	
	public static final int AFTER = 1;	
	public static final int HASH_CODE_START = 17;
	@JsonIgnore	
	public static String STATUS = "status";
}
