package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;

@Entity
public class FuncionarioLimpeza extends AbstractFuncionario {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	private FuncionarioLimpeza gerente;
	private int jornadaTrabalho;
	private int attribute13;

//	FuncionarioLimpeza gerente, 

	@Deprecated
	public FuncionarioLimpeza() {
	}

	public FuncionarioLimpeza(String nome, TipoSexo sexo, Calendar dataAniversario,
			String endereco, BigDecimal salario, Departamento departamento,int jornadaTrabalho, int attribute13) {
		super(nome, sexo, dataAniversario, endereco, salario, departamento);
//		this.gerente = gerente;
		this.jornadaTrabalho = jornadaTrabalho;
		this.attribute13 = attribute13;
	}

//	public FuncionarioLimpeza getGerente() {
//		return gerente;
//	}
//
//	public void setGerente(FuncionarioLimpeza gerente) {
//		this.gerente = gerente;
//	}

	public int getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(int jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public int getAttribute13() {
		return attribute13;
	}

	public void setAttribute13(int attribute13) {
		this.attribute13 = attribute13;
	}
}
