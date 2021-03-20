package Exercicio3;

public class Teste {
	
	public static void main(String[] args) {
		
		PilhaPessoal pilha = new PilhaPessoal();
		
		System.out.println("Vazia: " + pilha.estaVazio());
		
		pilha.adicionar(new Node(14));
		pilha.adicionar(new Node(10));
		pilha.adicionar(new Node(11));
		pilha.adicionar(new Node(12));
		pilha.adicionar(new Node(13));
		
		System.out.println("Vazia: " + pilha.estaVazio());
		
		System.out.println(pilha.obterPrimeiroNo().obterValor());
		System.out.println(pilha.obterPrimeiroNo().obterProximoNo().obterValor());
	
		System.out.println(pilha);
		
		pilha.remove();
		
		System.out.println(pilha);
		
		System.out.println("Tamanho: " + pilha.tamanho());
		
		System.out.println(pilha.busca(14));
	}
	
	
	
	

}
