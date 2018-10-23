package br.ufc.persistencia.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import br.ufc.persistencia.dao.impl.DepartamentoJPADAO;
import br.ufc.persistencia.dao.impl.PesquisadorJPADAO;
import br.ufc.persistencia.dao.impl.ProjetoJPADAO;
import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.TipoSexo;

public class PopularBancoTeste {
	
	public static void main(String[] args) {
		popularDepartamento();
		popularPesquisador();
		popularProjeto();
	}
	
	public static void popularPesquisador(){
		PesquisadorJPADAO pjd = new PesquisadorJPADAO();
		pjd.save(new Pesquisador("Junior", TipoSexo.MASC,
				Calendar.getInstance(), "Av. Ipiranga", new BigDecimal(1000),
				new Departamento(1, "Departamento Contabilidade"), "Edificacoes"));
		pjd.save(new Pesquisador("Isaac", TipoSexo.MASC,
				Calendar.getInstance(), "Neblon", new BigDecimal(1000),
				new Departamento(1, "Departamento Contabilidade"), "FullStack"));
		pjd.save(new Pesquisador("Nathalia", TipoSexo.FEM,
				Calendar.getInstance(), "Recife", new BigDecimal(1000),
				new Departamento(1, "Departamento Contabilidade"), "Arquiteta"));
	}

	public static void popularProjeto(){
		ProjetoJPADAO pjd = new ProjetoJPADAO();
		pjd.save(new Projeto("Projeto um", 10, new Departamento(1, "Departamento Contabilidade")));
		pjd.save(new Projeto("Projeto dois", 10, new Departamento(1, "Departamento Contabilidade")));
		pjd.save(new Projeto("Projeto tres", 10, new Departamento(2, "Departamento Almoxarifado")));
	}

	public static void popularDepartamento(){
		DepartamentoJPADAO djd = new DepartamentoJPADAO();
		djd.save(new Departamento(1, "Departamento Contabilidade"));
		djd.save(new Departamento(2, "Departamento Almoxarifado"));
		djd.save(new Departamento(3, "Departamento Segurança"));
	}
}
