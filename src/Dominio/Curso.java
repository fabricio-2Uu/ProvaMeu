package Dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Curso {

	private String nome;
	private float quantHoras;
	private List<Professor> list_prof = new ArrayList<Professor>();
	
	public Curso(String nome, float tHoras) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.quantHoras = tHoras;
	}


	public abstract float custoEspecifico();
	
	
	public float custoBasico() {
		float custobasico = 0.0f;
		
		for(Professor professor: list_prof)
			custobasico += (quantHoras * professor.getValorHora());
		
		return custobasico;
	}
	
	public float custoTotal() {
		float custototal = 0.0f;
		float cb = this.custoBasico();
		
		custototal = this.custoBasico() + this.custoEspecifico();
		
		return custototal;
	}

	public String getNome() {
		
		return nome;
	}

	public float getQuantHoras() {
		
		return quantHoras;
	}
	
	public int quantProfessores() {
		int quantidade = 0;

		for(Professor professor: list_prof)
			quantidade += 1;
		
		return quantidade;
	}

	public void adicionaProfessor (Professor p){
		
		this.list_prof.add(p);
		
	}

	public List<Professor> getProfessor (){
		
		return list_prof;
	}


	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", quantHoras=" + quantHoras
				+ ", list_prof=" + list_prof + ", custoTotal()=" + custoTotal()
				+ ", quantProfessores()=" + quantProfessores() + "]";
	}
	
	
}
