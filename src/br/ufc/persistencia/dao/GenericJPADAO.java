package br.ufc.persistencia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.ufc.persistencia.util.JPAUtil;

public abstract class GenericJPADAO<T> implements GenericDAO<T>{
	
	protected Class<T> persistentClass;

	public GenericJPADAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	public EntityManager getEm() {
		return JPAUtil.getEntityManager();
	}

	@Override
	public void save(T entity) {
		getEm().merge(entity);
	}

	@Override
	public void delete(T entity) {
		getEm().remove(getEm().merge(entity));		
	}

	@Override
	public T find(Object id) {
		return getEm().find(persistentClass, id);
	}

	@Override
	public List<T> find() {
		CriteriaQuery<T> cq = getEm().getCriteriaBuilder().createQuery(persistentClass);
		cq.from(persistentClass);
		return getEm().createQuery(cq).getResultList();
	}

	@Override
	public void beginTransaction() {
		JPAUtil.beginTransaction();		
	}

	@Override
	public void commit() {
		JPAUtil.commit();
	}

	@Override
	public void rollback() {
		JPAUtil.rollback();		
	}

	@Override
	public void close() {
		JPAUtil.closeEntityManager();	
	}
}
