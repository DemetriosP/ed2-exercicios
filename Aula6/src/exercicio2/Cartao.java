package exercicio2;

public class Cartao implements Comparable<Object>{
	
	private String titular;
	private long numero;
	private int validade;
	private int cvv;
	
	public Cartao(String titular, long numero, int validade, int cvv) {
		this.titular = titular;
		this.numero = numero;
		this.validade = validade;
		this.cvv = cvv;
	}
	
	public int getValidade() {
		return validade;
	}
	
	public void setValidade(int validade) {
		this.validade = validade;
	}

	public long getNumero() {
		return numero;
	}
	
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	/*
	//ordenada por data de validade
	@Override
	public int compareTo(Object arg0) {
		
		int valor = 0;
		
		if(getValidade() == ((Cartao) arg0).getValidade()) valor = 0};
		if(getValidade() < ((Cartao) arg0).getValidade()) valor = -1;
		if(getValidade() > ((Cartao) arg0).getValidade()) valor = 1;
		
		return valor;
	}
	*/
	
	
	//ordena por data de validade, se a data de validade for igual, ordenada pelo numero do cartão
	@Override
	public int compareTo(Object arg0) {
		
		int valor = 0;
		
		if(getValidade() == ((Cartao) arg0).getValidade()) {
			if(getNumero() == ((Cartao) arg0).getNumero()) valor = 0;
			if(getNumero() < ((Cartao) arg0).getNumero()) valor = -1;
			if(getNumero() > ((Cartao) arg0).getNumero()) valor = 1;
		};
		if(getValidade() < ((Cartao) arg0).getValidade()) valor = -1;
		if(getValidade() > ((Cartao) arg0).getValidade()) valor = 1;
		
		return valor;
		
		
	}
	
	@Override
	public String toString() {
		String informacoes;
		informacoes = "Titular: " + getTitular()  + "\n" + 
		"Número: " + getNumero() +"\n" + "Validade: " + getValidade() + "\n" + 
				"CVV: " + getCvv();
		return informacoes;
	}

}
