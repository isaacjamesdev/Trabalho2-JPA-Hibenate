package br.ufc.persistencia.teste;

import br.ufc.persistencia.dao.impl.DepartamentoJPADAO;
import br.ufc.persistencia.model.Departamento;

public class PopularDepartamentoTeste {
	
	public static void main(String[] args) {
		DepartamentoJPADAO djd = new DepartamentoJPADAO();
		djd.beginTransaction();
		
		//defina os dados do Departamento
		Departamento departamento = new Departamento(100, "Departamento Central");

		djd.save(departamento);
		
		djd.commit();		
		djd.close();
	}
}
