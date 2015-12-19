package com.mize.jpa.repositories.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public class MizeJPARepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>  {

	
	//private static Logger logger = LoggerFactory.getLogger(MizeJPARepositoryImpl.class);

	private final JpaEntityInformation<T, ?> entityInformation;
	private final EntityManager em;

	private Class<?> springDataRepositoryInterface;

	public Class<?> getSpringDataRepositoryInterface() {
		return springDataRepositoryInterface;
	}

	public void setSpringDataRepositoryInterface(Class<?> springDataRepositoryInterface) {
		this.springDataRepositoryInterface = springDataRepositoryInterface;
	}

	/**
	 * Creates a new {@link SimpleJpaRepository} to manage objects of the given
	 * {@link JpaEntityInformation}.
	 * 
	 * @param entityInformation
	 * @param entityManager
	 */
	public MizeJPARepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager, Class<?> springDataRepositoryInterface) {
		super(entityInformation, entityManager);
		this.entityInformation = entityInformation;
		this.em = entityManager;
		this.springDataRepositoryInterface = springDataRepositoryInterface;
	}

	/**
	 * Creates a new {@link SimpleJpaRepository} to manage objects of the given
	 * domain type.
	 * 
	 * @param domainClass
	 * @param em
	 */
	public MizeJPARepositoryImpl(Class<T> domainClass, EntityManager em) {
		this(JpaEntityInformationSupport.getMetadata(domainClass, em), em, null);
	}

	public <S extends T> S save(S entity) {
		if (this.entityInformation.isNew(entity)) {
			this.em.persist(entity);
			flush();
			return entity;
		}
		entity = this.em.merge(entity);
		flush();
		return entity;
	}

	public T saveWithoutFlush(T entity) {
		return super.save(entity);
	}

	public List<T> saveWithoutFlush(Iterable<? extends T> entities) {
		List<T> result = new ArrayList<T>();
		if (entities == null) {
			return result;
		}

		for (T entity : entities) {
			result.add(saveWithoutFlush(entity));
		}
		return result;
	}
}
