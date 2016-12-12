package Dominio;

public class Aluno {
	private String nome;
	private Curso curso;
	
	public Curso getCurso() {
		return curso;
	}
	
	public Aluno (String nome, Curso c){
		if (c == null){
			throw new RuntimeException("Erro: Curso não pode ser nulo!");
		}
		else {
			this.curso = c;
			this.nome = nome;
		}
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", curso=" + curso + "]";
	}

}
