package br.ufc.persistencia.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Dependente extends AbstractPessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String parentesco;
	@ManyToOne
	private AbstractFuncionario funcionario;

	public Dependente(String nome, TipoSexo sexo, Calendar dataAniversario,AbstractFuncionario funcionario, String parentesco) {
		super(nome, sexo, dataAniversario);
		this.parentesco = parentesco;
		this.funcionario = funcionario;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
}
