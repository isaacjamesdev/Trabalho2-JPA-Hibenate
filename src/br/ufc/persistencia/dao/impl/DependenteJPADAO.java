package br.ufc.persistencia.dao.impl;

import br.ufc.persistencia.dao.GenericJPADAO;
import br.ufc.persistencia.model.Dependente;

public class DependenteJPADAO extends GenericJPADAO<Dependente> implements DependenteDAO{

	public DependenteJPADAO() {
		super(Dependente.class);
	}
	
}
