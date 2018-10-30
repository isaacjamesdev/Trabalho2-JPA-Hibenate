package br.ufc.persistencia.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import br.ufc.persistencia.dao.impl.DepartamentoJPADAO;
import br.ufc.persistencia.dao.impl.FuncionarioLimpezaJPADAO;
import br.ufc.persistencia.dao.impl.PesquisadorJPADAO;
import br.ufc.persistencia.dao.impl.PesquisadorProjetoJPADAO;
import br.ufc.persistencia.dao.impl.ProjetoJPADAO;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.FuncionarioLimpeza;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.PesquisadorProjeto;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.TipoSexo;

/**
 * @author Isaac James
 * @Email isaacjames@alu.ufc.br
 * @Ocupation Graduando de Eng. de Software
 * @University UFC - Campus Quixada - CE
 */
public class PopularBancoTeste {

	public static void main(String[] args) {
		popularFuncionarioLimpeza();
		popularDepartamento();
		popularPesquisador();
		popularProjeto();
		popularRelacionamento();
	}
	//ASSOCIAÇÃO	
	public static void popularRelacionamento() {
		PesquisadorProjetoJPADAO ppj = new PesquisadorProjetoJPADAO();
		ppj.beginTransaction();

		Pesquisador pesquisador = new Pesquisador();
		pesquisador.setId(2);
		Projeto projeto = new Projeto();
		projeto.setId(2);
		ppj.save(new PesquisadorProjeto(projeto, pesquisador, 30));

		ppj.commit();
		ppj.close();

	}

	public static void popularPesquisador() {
		PesquisadorJPADAO pjd = new PesquisadorJPADAO();
		Departamento dep = new Departamento();
		dep.setId(1);
		pjd.beginTransaction();
		pjd.save(new Pesquisador("Junior", TipoSexo.MASC, Calendar.getInstance(), "Av. Ipiranga", new BigDecimal(1000),
				dep, "Edificacoes"));
		pjd.save(new Pesquisador("Isaac", TipoSexo.MASC, Calendar.getInstance(), "Neblon", new BigDecimal(1000), dep,
				"FullStack"));
		pjd.save(new Pesquisador("Nathalia", TipoSexo.FEM, Calendar.getInstance(), "Recife", new BigDecimal(1000), dep,
				"Arquiteta"));
		pjd.commit();
		pjd.close();
	}

	public static void popularProjeto() {
		Departamento dep = new Departamento();
		dep.setId(1);
		ProjetoJPADAO pjd = new ProjetoJPADAO();
		pjd.beginTransaction();
		pjd.save(new Projeto("Projeto um", 10, dep));
		pjd.save(new Projeto("Projeto dois", 10, dep));
		dep.setId(2);
		pjd.save(new Projeto("Projeto tres", 10, dep));
		pjd.commit();
		pjd.close();
	}

	public static void popularDepartamento() {
		DepartamentoJPADAO djd = new DepartamentoJPADAO();
		djd.beginTransaction();
		djd.save(new Departamento(1, "Departamento Contabilidade"));
		djd.save(new Departamento(2, "Departamento Almoxarifado"));
		djd.save(new Departamento(3, "Departamento Segurança"));
		djd.commit();
		djd.close();
	}
	
	public static void popularFuncionarioLimpeza() {
		FuncionarioLimpezaJPADAO jpadao = new FuncionarioLimpezaJPADAO();
		Departamento dep = new Departamento();
		dep.setId(1);
		FuncionarioLimpeza fl = new FuncionarioLimpeza("Isaac", TipoSexo.MASC,
				Calendar.getInstance(), "Rua Merda",
				new BigDecimal(0), dep , 200);
		jpadao.save(fl);
	}
}
