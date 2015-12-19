package com.mize.domain.common;

import java.io.Serializable;


public class ServiceDTO<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4762494908833099647L;

	private T dataObject;
	
	//private List<AppMessage> appMessages = new ArrayList<AppMessage>();
	private Integer severity;
	private Integer saveSeverity;
	private Integer statusSeverity;
	private boolean isValid;
	private boolean allowSave;
	private boolean allowStatusChange;
	private boolean isEntityStatusDefined;
	
	
	
	public ServiceDTO() {
		super();
	}
	
	public ServiceDTO(T dataObject) {
		super();
		this.dataObject = dataObject;
	}

	public T getDataObject() {
		return dataObject;
	}
	
	public void setDataObject(T dataObject) {
		this.dataObject = dataObject;
	}
	
	
	
}
