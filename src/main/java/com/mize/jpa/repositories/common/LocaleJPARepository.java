/**
 * 
 */
package com.mize.jpa.repositories.common;

import org.springframework.stereotype.Repository;

import com.mize.domain.common.Locale;

/**
 * @author shivasheguri
 *
 */
@Repository(value="localeJPARepository")
public interface LocaleJPARepository  extends MizeJPARepository<Locale>{

}
