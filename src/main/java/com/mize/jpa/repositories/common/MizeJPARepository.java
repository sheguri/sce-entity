package com.mize.jpa.repositories.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.mize.domain.common.IEntity;

@NoRepositoryBean
public interface MizeJPARepository<T extends IEntity> extends JpaRepository<T, Long> {
	
	/*@Query("select e from #{#entityName} e where e.id = ?1")
	public T findOne(Long id);*/ // causing performance issue, adding this method to huge entities like PartsOrder, ServiceEntity, Registration ... 
	
}
