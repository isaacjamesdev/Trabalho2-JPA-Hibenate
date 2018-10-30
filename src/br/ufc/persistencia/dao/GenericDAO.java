package br.ufc.persistencia.dao;

import java.util.List;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public interface GenericDAO<T> {
	public void save(T entity);

	public void delete(T entity);

	public T find(Object id);

	public List<T> find();

	public void beginTransaction();

	public void commit();

	public void rollback();

	public void close();
}
