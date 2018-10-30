package br.ufc.persistencia.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
@Entity
@Table(name = "pesquisador_projeto")
public class PesquisadorProjeto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "projeto_id", nullable = false)
	private Projeto projeto;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pesquisador_id", nullable = false)
	private Pesquisador pesquisador;

	@Column(name = "horas_semanais")
	private int horasSemanais;

	public PesquisadorProjeto() {
	}

	public PesquisadorProjeto(Projeto projeto, Pesquisador pesquisador, int horasSemanais) {
		this.projeto = projeto;
		this.pesquisador = pesquisador;
		this.horasSemanais = horasSemanais;
	}

	public int getHorasSemanais() {
		return horasSemanais;
	}

	public void setHorasSemanais(int horasSemanais) {
		this.horasSemanais = horasSemanais;
	}

	public Integer getId() {
		return id;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public Pesquisador getPesquisador() {
		return pesquisador;
	}
}
