package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Pesquisador extends AbstractFuncionario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String areaAtuacao;
	private int horasTrabalhadas;
	@ManyToMany
//    @JoinTable(name="pesquisador_has_projetos", joinColumns=
//    {@JoinColumn(name="id")}, inverseJoinColumns=
//      {@JoinColumn(name="id")})
	private List<Projeto> projetos;
	
	@Deprecated
	public Pesquisador() {
	}
	
	public Pesquisador(String nome, TipoSexo sexo, Calendar dataAniversario,
			String endereco, BigDecimal salario, Departamento departamento,
			String areaAtuacao, int horasTrabalhadas) {
		
		super(nome, sexo, dataAniversario, endereco, salario, departamento);
		this.areaAtuacao = areaAtuacao;
		
		//tens que ajeitar isso aqui
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
}
