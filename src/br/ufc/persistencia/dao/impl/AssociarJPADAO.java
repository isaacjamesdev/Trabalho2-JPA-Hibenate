package br.ufc.persistencia.dao.impl;

import br.ufc.persistencia.dao.GenericJPADAO;
import br.ufc.persistencia.model.PesquisadorProjeto;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class AssociarJPADAO extends GenericJPADAO<PesquisadorProjeto> implements AssociarDAO {
	public AssociarJPADAO() {
		super(PesquisadorProjeto.class);
	}
}
