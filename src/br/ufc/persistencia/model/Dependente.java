package br.ufc.persistencia.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
@Entity
public class Dependente extends AbstractPessoa {

	private static final long serialVersionUID = 1L;
	private String parentesco;
	@ManyToOne(fetch = FetchType.EAGER)
	private AbstractFuncionario funcionario;

	public Dependente() {
	}

	public Dependente(String nome, TipoSexo sexo, Calendar dataAniversario, AbstractFuncionario funcionario,
			String parentesco) {
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

	public AbstractFuncionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(AbstractFuncionario funcionario) {
		this.funcionario = funcionario;
	}

}
