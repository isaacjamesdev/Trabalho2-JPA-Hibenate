package br.ufc.persistencia.dao.impl;

import br.ufc.persistencia.dao.GenericJPADAO;
import br.ufc.persistencia.model.Secretario;

public class SecretarioJPADAO extends GenericJPADAO<Secretario> implements SecretarioDao{
	
	public SecretarioJPADAO() {
		super(Secretario.class);
	}
}
