package br.ufc.persistencia.dao.impl;

import br.ufc.persistencia.dao.GenericJPADAO;
import br.ufc.persistencia.model.Pesquisador;

public class PesquisadorJPADAO extends GenericJPADAO<Pesquisador> implements PesquisadorDAO{

	public PesquisadorJPADAO(Class<Pesquisador> persistentClass) {
		super(Pesquisador.class);
	}

}
