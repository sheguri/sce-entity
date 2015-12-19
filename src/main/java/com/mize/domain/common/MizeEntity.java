/**
 * 
 */
package com.mize.domain.common;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mize.domain.datetime.DateTime;


/**
 * @author shivasheguri
 * 
 */
public class MizeEntity implements IEntity, Comparable<MizeEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1180956690343169549L;
	
	protected Long createdBy;
	protected DateTime createdDate;
	protected Long updatedBy;
	protected DateTime updatedDate;
	protected Long id;
	protected String createdByUser;
	protected String updatedByUser;

	protected Map<String, Object> additionalProps;
	@JsonIgnore
	private boolean solrIndex = true;

	@JsonIgnore
	private boolean isEntityUpdated;
	@JsonIgnore
	private boolean allowSave = true;
	protected Long tenantId;
	protected String tenantCode;
	protected String tenantType;

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}
	
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public DateTime getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}
	
	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	public DateTime getUpdatedDate() {
		return updatedDate;
	}
	
	public void setUpdatedDate(DateTime updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public String getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}
	
	public String getUpdatedByUser() {
		return updatedByUser;
	}

	public void setUpdatedByUser(String updatedByUser) {
		this.updatedByUser = updatedByUser;
	}

	@JsonAnyGetter	
	public Map<String, Object> getAdditionalProps() {
		return this.additionalProps;
	}
	
	@JsonIgnore	
	public Object getProperty(String key) {
		if(this.additionalProps != null){
			return this.additionalProps.get(key);
		}
		return null;
	}
	
	
	@Override
	public int hashCode() {
		int result = HASH_CODE_START;
		result = PRIME * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MizeEntity other = (MizeEntity) obj;		
		if (!isLongFieldsEquals(this.id, other.id)) {
			return false;
		}	
		return true;
	}

	public boolean isLongFieldsEquals(Long tHis, Long tHat) {
		if (tHis == null) {
			if (tHat != null) {
				return false;
			}
		} else if (!tHis.equals(tHat)) {
			return false;
		}
		return true;
	}
	
	/*@SuppressWarnings("rawtypes")
	public boolean isProxiesEquals(Object proxy1, Object proxy2){
		if(proxy1 == null && proxy2 == null){
			return true;
		}
		if(proxy1 != null && proxy2 == null){
			return false;
		}
		if(proxy1 == null && proxy2 != null){
			return false;
		}
		List list1 = toEntityList(proxy1);
		List list2 = toEntityList(proxy2);
		return list1.equals(list2);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List toEntityList(Object proxy){
		List list = new ArrayList();
		if(PersistentCollection.class.isAssignableFrom(proxy.getClass())) {
			PersistentCollection pcollection = (PersistentCollection) proxy;
			if (pcollection.wasInitialized()) {				
				if(PersistentMap.class.isAssignableFrom(proxy.getClass()))  {
					//need to handle Map data type ... ignoring for now
				}
				if(PersistentBag.class.isAssignableFrom(proxy.getClass()))  {
					Iterator iterator = ((PersistentBag)proxy).iterator();
					while(iterator.hasNext()){
						list.add(iterator.next());
					}
				}
				if(PersistentSet.class.isAssignableFrom(proxy.getClass()))  {
					Iterator iterator = ((PersistentSet)proxy).iterator();
					while(iterator.hasNext()){
						list.add(iterator.next());
					}
				}
			}
		}
		return list;
	}*/
	

	public static Long longValue(Long value) {
		return (value == null) ? Long.valueOf(0) : value;
	}

	@Override
	public int compareTo(MizeEntity obj) {
		if (this == obj) {
			return EQUAL;
		}
		if (this.id == null && obj.id == null) {
			return 0;
		}
		return longValue(this.id).compareTo(longValue(obj.id));
	}
}
