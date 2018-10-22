package br.ufc.persistencia.dao.impl;

import br.ufc.persistencia.dao.GenericDAO;
import br.ufc.persistencia.dao.GenericJPADAO;
import br.ufc.persistencia.model.Projeto;

public class ProjetoJPADAO extends GenericJPADAO<Projeto> implements GenericDAO<Projeto>{

	public ProjetoJPADAO() {
		super(Projeto.class);
	}

}
