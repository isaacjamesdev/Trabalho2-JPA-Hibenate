package br.ufc.persistencia.model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED)
//<class>br.ufc.persistencia.model.Funcionario</class>
//<class>br.ufc.persistencia.model.Pessoa</class>
public abstract class AbstractFuncionario extends AbstractPessoa  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String endereco;
	private BigDecimal salario;
	//muitos pode ter somente um único departamento
	@ManyToOne 
	private Departamento departamento;
	
	@OneToMany(mappedBy="funcionario")
	private List<Dependente> dependentes;
	
	@Deprecated
	public AbstractFuncionario() {
	}
	
	public AbstractFuncionario(String nome, TipoSexo sexo, Calendar dataAniversario,
			String endereco, BigDecimal salario, Departamento departamento) {
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
}
