package br.ufc.persistencia.dao.impl;

import br.ufc.persistencia.dao.GenericJPADAO;
import br.ufc.persistencia.model.FuncionarioLimpeza;

public class FuncionarioLimpezaJPADAO extends GenericJPADAO<FuncionarioLimpeza> implements FuncionarioLimpezaDAO{
	
	public FuncionarioLimpezaJPADAO() {
		super(FuncionarioLimpeza.class);
	}

}
