package br.ufc.persistencia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Projeto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private int periodoDesenvolvimento;

	@ManyToOne // lado mais forte do relacionamento PROJETO--DEPARTAMENTO
	Departamento departamento;
	
	@OneToMany(mappedBy = "projeto", targetEntity = Pesquisador.class)
	private List<Pesquisador> pesquisadores = new ArrayList<>();
	
	@Deprecated
	public Projeto() {
	}

	public Projeto(String nome, int periodoDesenvolvimento, Departamento departamento) {
		this.nome = nome;
		this.periodoDesenvolvimento = periodoDesenvolvimento;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeriodoDesenvolvimento() {
		return periodoDesenvolvimento;
	}

	public void setPeriodoDesenvolvimento(int periodoDesenvolvimento) {
		this.periodoDesenvolvimento = periodoDesenvolvimento;
	}

	public void setId(int id) {
		this.id = id;
	}
}
