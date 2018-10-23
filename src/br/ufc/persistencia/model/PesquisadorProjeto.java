package br.ufc.persistencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="pesquisador_projeto")
public class PesquisadorProjeto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne @JoinColumn(name="projeto_id", insertable = false, updatable = false)
	private Projeto projeto;
	
	@ManyToOne @JoinColumn(name="pesquisador_id", insertable = false, updatable = false)
	private Pesquisador pesquisador;
	
	
	@Column (name="horas_semanais")
	private int horasSemanais;

}
