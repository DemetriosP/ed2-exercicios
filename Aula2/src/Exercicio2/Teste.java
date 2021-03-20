package Exercicio2;

public class Teste {

	public static void main(String[] args) {
		
		FilaPessoal fila = new FilaPessoal();
		
		System.out.println("Vazia? " + fila.estaVazio());
		System.out.println("Tamanho: " + fila.tamanho());
		System.out.println(fila);
		
		fila.adicionar(new Node(10));
		fila.adicionar(new Node(11));
		fila.adicionar(new Node(12));
		fila.adicionar(new Node(13));
		
		System.out.println("Vazia? " + fila.estaVazio());
		System.out.println("Tamanho: " + fila.tamanho());
		System.out.println(fila);
		
		Node removido = fila.remove();
		System.out.println("REMOVIDO: " + removido.obterValor());
		
		System.out.println("Vazia? " + fila.estaVazio());
		System.out.println("Tamanho: " + fila.tamanho());
		System.out.println(fila);
		
		System.out.println("Posição do numero 5: " + fila.busca(5));
		System.out.println("Posição do numero 13: " + fila.busca(13));

	}

}
