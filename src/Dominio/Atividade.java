package Dominio;

public class Atividade {

	private String nome;
	private float valor;
	
	public Atividade(String nome, float valor) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Atividade [nome=" + nome + ", valor=" + valor + "]";
	}
	
}
