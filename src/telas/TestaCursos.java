package telas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Dominio.Atividade;
import Dominio.CursoPratico;
import Dominio.CursoTeorico;
import Dominio.Professor;
import Dominio.Aluno;
import telas.TelaAluno;

public class TestaCursos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professor p1 = new Professor("111.111.111-11", 10.00f);
		Professor p2 = new Professor("222.222.222-22", 20.00f);
		Professor p3 = new Professor("333.333.333-33", 30.00f);
		Professor p4 = new Professor("444.444.444-44", 40.00f);
		Professor p5 = new Professor("555.555.555-55", 50.00f);
		Atividade a1 = new Atividade("Capina", 10f);
		Atividade a2 = new Atividade("Adubação", 20f);
		Atividade a3 = new Atividade("Semeadura", 30f);
		Atividade a4 = new Atividade("Manejo", 40f);
		
		CursoTeorico ct1 = new CursoTeorico("Biologia", 2, 100f);
		ct1.adicionaProfessor(p1);
		ct1.adicionaProfessor(p2);
		
		//System.out.println(ct1);
		
		CursoPratico cp1 = new CursoPratico("Agricultura", 200f);
		cp1.adicionaProfessor(p3);
		cp1.adicionaProfessor(p4);
		cp1.adicionaProfessor(p5);
		cp1.adicionaAtividade(a1);
		cp1.adicionaAtividade(a2);
		cp1.adicionaAtividade(a3);
		cp1.adicionaAtividade(a4);
		
		//System.out.println(cp1);
		
		
		Aluno Maria = new Aluno("Maria", ct1);
		Aluno Carla = new Aluno("Carla", ct1);
		Aluno Joao = new Aluno("Joao", cp1);
		Aluno Pedro = new Aluno("Pedro", cp1);
		List<Aluno> list_aluno = new ArrayList<Aluno>();
		list_aluno.addAll(Arrays.asList(Maria, Carla, Joao, Pedro));
		
		TelaAluno tela = new TelaAluno();
		
		//tela.imprime(Maria);
		
		for (Aluno aluno:list_aluno)
			tela.imprime(aluno);

	
	}

}
