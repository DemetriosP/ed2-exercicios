package exercicio1;

public class Teste {
	
	public static void main(String[] args) {
		
		//iniciando uma lista de vetores
		ListaVetor listaVetor = new ListaVetor();
		
		//verificando se a lista de vetores est� vazia
		System.out.println("A lista de vetores est� vazia? " + listaVetor.estaVazio());
		
		//adicionando elementos na lista de vertores
		listaVetor.adicionar(10);
		listaVetor.adicionar("banana");
		listaVetor.adicionar(50);
		listaVetor.adicionar("carro");
		
		//verifica a quantidade de elementos na lista de vetores
		System.out.println("Quantidade de elementos na lista: " + listaVetor.tamanho());
		
		//verifica se a lista de vetores est� vazia
		System.out.println("A lista de vetores est� vazia? " + listaVetor.estaVazio());
		
		//verifica se o elemente est� na lista
		System.out.println("O elemento 50 est� na lista de vetores? " + listaVetor.contem(50));
		
		//remove o elemento da lista atrav�s da posi��o
		listaVetor.remover(3);
		
		//verifica a quantidade de elementos na lista de vetores
		System.out.println("Quantidade de elementos na lista: " + listaVetor.tamanho());
		
		//mostra os elementos presentes na lista
		System.out.println("Elementos da lista de vetores: " + listaVetor.toString());
		
		
	}
}
