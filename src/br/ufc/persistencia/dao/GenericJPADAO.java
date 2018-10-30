package br.ufc.persistencia.dao;

import java.util.InputMismatchException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.ufc.persistencia.util.JPAUtil;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public abstract class GenericJPADAO<T> implements GenericDAO<T> {

	protected Class<T> persistentClass;

	public GenericJPADAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	public EntityManager getEm() {
		return JPAUtil.getEntityManager();
	}

	@Override
	public void save(T entity) {
		try {
			getEm().merge(entity);
			System.out.println("Salvo com sucesso");
		} catch (Exception e) {
			System.out.println("Ocorreu algum no preenchimento dos dados. Repita corretamente");
			System.out.println(e.getMessage());
			rollback();
		} finally {
			close();
		}
	}

	@Override
	public void delete(T entity) {
		try {
			getEm().remove(getEm().merge(entity));
			System.out.println("Removido com sucesso");
		} catch (InputMismatchException e) {
			System.out.println("Ocorreu algum no preenchimento dos dados. Repita corretamente");
			System.out.println(e.getMessage());
			rollback();
		} finally {
			close();
		}
	}

	@Override
	public T find(Object id) throws NullPointerException {
		try {
			return getEm().find(persistentClass, id);
		} catch (Exception e) {
			System.out.println("Ocorreu algum no preenchimento dos dados. Repita corretamente");
			System.out.println(e.getMessage());
			return null;
		} finally {
			close();
		}
	}

	@Override
	public List<T> find() throws NullPointerException {
		try {
			CriteriaQuery<T> cq = getEm().getCriteriaBuilder().createQuery(persistentClass);
			cq.from(persistentClass);
			return getEm().createQuery(cq).getResultList();
		} catch (Exception e) {
			System.out.println("Ocorreu algum no preenchimento dos dados. Repita corretamente");
			System.out.println(e.getMessage());
			return null;
		} finally {
			close();
		}
	}

	@Override
	public void beginTransaction() {
		JPAUtil.beginTransaction();
	}

	@Override
	public void commit() {
		try {
			JPAUtil.commit();
			System.out.println("Comitado com sucesso");
		} catch (Exception e) {
			System.out.println("Erro ao comitar");
			System.out.println(e.getMessage());
			rollback();
		} finally {
			close();
		}
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
