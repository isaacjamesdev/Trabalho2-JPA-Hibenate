package br.ufc.persistencia.dao.impl;

import br.ufc.persistencia.dao.GenericJPADAO;
import br.ufc.persistencia.model.Departamento;

public class DepartamentoJPADAO extends GenericJPADAO<Departamento> implements DepartamentoDAO{
	
	public DepartamentoJPADAO() {
		super(Departamento.class);
	}
}
