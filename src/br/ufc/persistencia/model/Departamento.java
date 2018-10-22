package br.ufc.persistencia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	private String nome;
	
	//está entidade é o lado mais fraco do relacionamento FUNCIONARIO--DEPARTAMENTO
	@OneToMany(mappedBy="departamento")//Falta colocar o (mappedBy:"nome_da_coluna_que_reflete")
	private List<AbstractFuncionario> funcionarios;
	
	//está entidade é o lado mais fraco do relacionamento PROJETO--DEPARTAMENTO
	@OneToMany (mappedBy="departamento")//Falta colocar o (mappedBy:"nome_da_coluna_que_reflete")
	private List<Projeto> projetos; 
	
	@Deprecated
	public Departamento() {
	}

	public Departamento(int numero, String nome) {
		funcionarios = new ArrayList<>();
		this.numero = numero;
		this.nome = nome;
		projetos = new ArrayList<>();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<AbstractFuncionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<AbstractFuncionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", numero=" + numero + ", nome=" + nome + ", funcionarios=" + funcionarios
				+ ", projetos=" + projetos + "]";
	}	
}
