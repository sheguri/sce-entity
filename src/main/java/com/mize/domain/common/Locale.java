package com.mize.domain.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, include="all")
@Table(name="locale")
public class Locale extends MizeEntity {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3070262903590516688L;
	
	private String isActive;
	private String languageCode;
    private String countryCode;
    private String name;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Override
	@Column(name="id")
	public Long getId() {
		return id;
	}

	@Column(name="language_code")
	public String getLanguageCode() {
		return languageCode;
	}

	@Column(name="country_code")
	public String getCountryCode() {
		return countryCode;
	}
	
	@Column(name="locale_name")
	public String getName() {
		return name;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="is_active")
	public String getIsActive() {
		return isActive;
	}
	
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
		result = prime * result + ((languageCode == null) ? 0 : languageCode.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Locale other = (Locale) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (isActive == null) {
			if (other.isActive != null)
				return false;
		} else if (!isActive.equals(other.isActive))
			return false;
		if (languageCode == null) {
			if (other.languageCode != null)
				return false;
		} else if (!languageCode.equals(other.languageCode))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Locale [id=" + id + ", countryCode=" + countryCode + ", isActive=" 
				+ isActive + ", languageCode=" + languageCode + ", name=" + name + "]";
	}
	
	
	
}
