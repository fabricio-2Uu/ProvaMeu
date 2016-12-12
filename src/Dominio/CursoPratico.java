package Dominio;

import java.util.ArrayList;
import java.util.List;

public class CursoPratico extends Curso {
	
	private List<Atividade> list_ativ = new ArrayList<Atividade>();
	
	public void adicionaAtividade(Atividade a){
		
		this.list_ativ.add(a);
		
	}
	
	public List<Atividade> getAtividades(){
		   
		   return list_ativ;
	}
	
	public float custoEspecifico(){
		float custo = 0.0f;
		
		for(Atividade ativ: list_ativ)
			custo += ativ.getValor();
		
		return custo;
	}
	
	public CursoPratico (String nome, float tHoras){
		
		super(nome, tHoras);
		
	}

	@Override
	public String toString() {
		return "CursoPratico [list_ativ=" + list_ativ + ", custoEspecifico()=" + custoEspecifico()
				+ ", custoBasico()=" + custoBasico() + ", custoTotal()="
				+ custoTotal() + ", getNome()=" + getNome()
				+ ", getQuantHoras()=" + getQuantHoras()
				+ ", quantProfessores()=" + quantProfessores()
				+ ", getProfessor()=" + getProfessor() + "]";
	}
	
	

}
