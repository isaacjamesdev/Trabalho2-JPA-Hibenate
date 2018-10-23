package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;

@Entity
public class FuncionarioLimpeza extends AbstractFuncionario {

	private static final long serialVersionUID = 1L;
	//	private FuncionarioLimpeza gerente;
	private int jornadaTrabalho;


	@Deprecated
	public FuncionarioLimpeza() {
	}

	public FuncionarioLimpeza(String nome, TipoSexo sexo, Calendar dataAniversario,
			String endereco, BigDecimal salario, Departamento departamento,int jornadaTrabalho) {
		super(nome, sexo, dataAniversario, endereco, salario, departamento);
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public int getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(int jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}
}
