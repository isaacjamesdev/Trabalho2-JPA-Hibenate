package br.ufc.persistencia.dao.impl;

import br.ufc.persistencia.dao.GenericJPADAO;
import br.ufc.persistencia.model.PesquisadorProjeto;

public class PesquisadorProjetoJPADAO extends GenericJPADAO<PesquisadorProjeto> implements PesquisadorProjetoDAO{
	public PesquisadorProjetoJPADAO() {
		super(PesquisadorProjeto.class);
	}
}
