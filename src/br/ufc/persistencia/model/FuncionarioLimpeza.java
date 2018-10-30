package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
@Entity
public class FuncionarioLimpeza extends AbstractFuncionario {

	private static final long serialVersionUID = 1L;
	
//	private FuncionarioLimpeza supervisor;
//	
//	private List<FuncionarioLimpeza> supervisionados;
	
	private int jornadaTrabalho;

	public FuncionarioLimpeza() {
	}

	public FuncionarioLimpeza(String nome, TipoSexo sexo, Calendar dataAniversario, String endereco, BigDecimal salario,
			Departamento departamento, int jornadaTrabalho) {
		super(nome, sexo, dataAniversario, endereco, salario, departamento);
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public int getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(int jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	@Override
	public String toString() {

		return super.toString() + "FuncionarioLimpeza [jornadaTrabalho=" + jornadaTrabalho + "]";
	}

}
