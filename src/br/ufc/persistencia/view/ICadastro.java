package br.ufc.persistencia.view;

import java.math.BigDecimal;
import java.util.Calendar;

import br.ufc.persistencia.model.AbstractFuncionario;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.TipoSexo;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public interface ICadastro {
	
	public void cadastrarDepartamento();
	public void cadastrarPesquisador();
	public void cadastrarFuncionarioLimpeza();
	public void cadastrarSecretario();
	public void cadastrarProjeto();
	public void cadastrarDependente();
	public String setString();
	public int setInt();
	public TipoSexo setSexo();
	public Calendar setDataAniversario();
	public BigDecimal setSalario();
	public AbstractFuncionario setFuncionario();
	public Departamento setDepartamento();
	public boolean validaInt(int entrada);
}
