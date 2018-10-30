package br.ufc.persistencia.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractPessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;
	@Column(nullable = false)
	private String nome;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoSexo sexo;
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Calendar dataAniversario;

	public AbstractPessoa() {
		// TODO Auto-generated constructor stub
	}

	public AbstractPessoa(String nome, TipoSexo sexo, Calendar dataAniversario) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoSexo getSexo() {
		return sexo;
	}

	public void setSexo(TipoSexo sexo) {
		this.sexo = sexo;
	}

	public Calendar getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Calendar dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", dataAniversario=" + dataAniversario.get(1) + "/"
				+ dataAniversario.get(2) + "/" + dataAniversario.get(5) + "]";
	}

}
