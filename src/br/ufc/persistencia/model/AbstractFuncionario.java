package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AbstractFuncionario extends AbstractPessoa {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String endereco;
	private BigDecimal salario;

	// muitos pode ter somente um único departamento
	@ManyToOne(fetch = FetchType.EAGER)
	private Departamento departamento;

	@OneToMany(mappedBy = "funcionario")
	private List<Dependente> dependentes = new ArrayList<>();

	public AbstractFuncionario() {
	}

	public AbstractFuncionario(String nome, TipoSexo sexo, Calendar dataAniversario, String endereco,
			BigDecimal salario, Departamento departamento) {
		super(nome, sexo, dataAniversario);
		this.endereco = endereco;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "AbstractFuncionario [endereco=" + endereco + ", salario=" + salario
				+ ", departamento=" + departamento + ", dependentes=" + dependentes + "]";
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

}
