package Dominio;

public class Professor {
	private String cpf;
	private float valorHora;
	
	public Professor (String cpf, float valorHora){
		this.cpf = cpf;
		this.valorHora = valorHora;
	}
	
	public String getCpf() {
		return cpf;
	}
	public float getValorHora() {
		return valorHora;
	}

	@Override
	public String toString() {
		return "Professor [cpf=" + cpf + ", valorHora=" + valorHora + "]";
	}
	

}
