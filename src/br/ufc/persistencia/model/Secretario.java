package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;

@Entity
public class Secretario extends AbstractFuncionario {

	
	private static final long serialVersionUID = 1L;
	private String grauEscolar;

	@Deprecated
	public Secretario() {
	}
	
	public Secretario(String nome, TipoSexo sexo, Calendar dataAniversario,
			String endereco, BigDecimal salario, String grauEscolar, Departamento departamento) {
		super(nome, sexo, dataAniversario, endereco, salario, departamento);
		this.grauEscolar = grauEscolar;
	}

	public String getGrauEscolar() {
		return grauEscolar;
	}

	public void setGrauEscolar(String grauEscolar) {
		this.grauEscolar = grauEscolar;
	}
}