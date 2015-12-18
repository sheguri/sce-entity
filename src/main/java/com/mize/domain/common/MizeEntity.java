/**
 * 
 */
package com.mize.domain.common;

import com.mize.domain.datetime.DateTime;

/**
 * @author shivasheguri
 *
 */
public  class MizeEntity implements IEntity ,Comparable<MizeEntity> {

	protected Long createdBy;	
	protected DateTime createdDate;		
	protected Long updatedBy;	
	protected DateTime updatedDate;    
	protected Long id;	
	protected String createdByUser;	
	protected String updatedByUser;

	

	
	public static Long longValue(Long value) {
		return (value == null) ? Long.valueOf(0) : value;
	}

	
	
	
	
	
	

	@Override
	public int compareTo(MizeEntity obj) {
		if ( this == obj){ 
			return EQUAL;
		}
		if(this.id == null && obj.id == null){
			return 0;
		}
		return longValue(this.id).compareTo(longValue(obj.id));
	}
}
