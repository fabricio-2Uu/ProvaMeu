package Dominio;

public class CursoTeorico extends Curso{

	private int quantDisciplinas;

	public int getQuantDisciplinas() {
		
		return quantDisciplinas;
	}
	
	public float custoEspecifico(){
		float custo = 0.0f;
		
		custo = this.getQuantDisciplinas() * 70f;
		
		return custo;
	}
	
	public CursoTeorico (String nome, int quantDisc, float tHoras){
		
		super(nome, tHoras);
		this.quantDisciplinas = quantDisc;
		
	}

	@Override
	public String toString() {
		return "CursoTeorico [quantDisciplinas=" + quantDisciplinas
				+ ", custoEspecifico()=" + custoEspecifico()
				+ ", custoBasico()=" + custoBasico() + ", custoTotal()="
				+ custoTotal() + ", getNome()=" + getNome()
				+ ", getQuantHoras()=" + getQuantHoras()
				+ ", quantProfessores()=" + quantProfessores()
				+ ", getProfessor()=" + getProfessor() + "]";
	}
	
}
