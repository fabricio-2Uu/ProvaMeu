package telas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Dominio.Atividade;
import Dominio.CursoPratico;
import Dominio.CursoTeorico;
import Dominio.Professor;
import Dominio.Aluno;

public class TelaAluno {
	
	  public void imprime(Aluno a) {
		  
		  if (a.getCurso() instanceof CursoTeorico) {
		 
		  CursoTeorico  cTeo = (CursoTeorico)a.getCurso();		  
		  System.out.println(
				  "Aluno: " + a.getNome() +
				  "\nCurso: "+ a.getCurso().getNome() +
				  "\nQuantidade de disciplinas: " + cTeo.getQuantDisciplinas() +
				  "\nQuantidade de horas: " + cTeo.getQuantHoras() +
				  "\nProfessores e valor hora: ");
				  
		   List<Professor> lista = new ArrayList<Professor>();
				  
		   lista = a.getCurso().getProfessor();
		    for (Professor p: lista)
			 System.out.print(
							p.getCpf() + " - " + p.getValorHora() + " - total = " + (cTeo.getQuantHoras() * p.getValorHora()) +"\n"
							);  
			 System.out.println(
				  "\nCusto Basico: " + cTeo.custoBasico()+
				  "\nCusto Especifico = " + cTeo.getQuantDisciplinas() + " x 70 = " + cTeo.custoEspecifico() +
				  "\nCusto Total = " + cTeo.custoTotal() +
				  "\n------------------------------------"
						  );
			
		  } else if (a.getCurso() instanceof CursoPratico) {
				
			CursoPratico cPra = (CursoPratico)a.getCurso();
			 System.out.println(
					  "Aluno: " + a.getNome() +
					  "\nCurso: "+ a.getCurso().getNome() +
					  "\nQuantidade de horas: " + cPra.getQuantHoras() +
					  "\nProfessores e valor hora: ");
					  
					  List<Professor> lista1 = new ArrayList<Professor>();
					  
					  lista1 = a.getCurso().getProfessor();
					  for (Professor p: lista1)
			 System.out.print(
								p.getCpf() + " - " + p.getValorHora() + " - total = " + (cPra.getQuantHoras() * p.getValorHora()) +"\n"
								);  
			 System.out.println(
					  "\nCusto Basico: " + cPra.custoBasico() +
					  "\nAtividades: ");
					  
					  List<Atividade> lista2 = new ArrayList<Atividade>();
					  lista2 = cPra.getAtividades();
					  for (Atividade at: lista2)
			 System.out.print(
									at.getNome() + " = " + at.getValor() + "\n"
									);
			 System.out.println(
					  "\nCusto Especifico = " + cPra.custoEspecifico() +
					  "\nCusto Total = " + cPra.custoTotal()+
					  "\n---------------------------------"
							  );
			}
		  
	  };
};

