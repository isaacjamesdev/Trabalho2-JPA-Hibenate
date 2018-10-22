package br.ufc.persistencia.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.ufc.persistencia.model.Departamento;
import br.ufc.persistencia.model.Pesquisador;
import br.ufc.persistencia.model.Projeto;
import br.ufc.persistencia.model.TipoSexo;
import br.ufc.persistencia.util.JPAUtil;

public class PopularBancoTeste {
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Departamento departamento1 = new Departamento(1, "Departamento 1");
		Projeto projeto1 = new Projeto("Projeto 1", 10, departamento1);
		Pesquisador pesquisador1 = new Pesquisador("Pesquisador 1", TipoSexo.MASC,
				Calendar.getInstance(), "casa do caralho", new BigDecimal(1000),
				departamento1, "tudo", 10);
		
		em.persist(departamento1);
		em.persist(projeto1);
		em.persist(pesquisador1);
				
		em.getTransaction().commit();
		em.close();
	}

}
