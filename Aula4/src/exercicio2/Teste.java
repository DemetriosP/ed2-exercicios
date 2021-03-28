package exercicio2;

public class Teste {
	
	public static void main(String[] args) {
		
		//criando uma lista duplamente ligada
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		
		//verificando se a lista está vazia
		System.out.println("A lista está vazia? " + lista.estaVazio());
		
		//verificando o tamanho da lista
		System.out.println("Tamanho da lista: " + lista.tamanho());
				
		//adicionando elementos na lista
		lista.adicionar(new Node(10));
		lista.adicionar(new Node(15));
		lista.adicionar(new Node("macarrão"));
		lista.adicionar(new Node(35));
		lista.adicionar(new Node("arroz"));
		
		//verificando se a lista está vazia
		System.out.println("A lista está vazia? " + lista.estaVazio());
		
		//verificando o tamanho da lista
		System.out.println("Tamanho da lista: " + lista.tamanho());
		
		//mostra os elementos da lista
		System.out.println(lista.toString());
		
		//remove um elemento da lista
		lista.remove();
		
		//mostra os elementos da lista
		System.out.println(lista.toString());
		
		//busca um item da lista e mostra a posicao ou -1 se o item não se encontra na lista
		System.out.println("Posição o item na lista: " + lista.busca(10));
		
		//busca um item da lista e mostra a posicao ou -1 se o item não se encontra na lista
		System.out.println("Posição o item na lista: " + lista.busca("macarrão"));
		
		//mostra que os elementos estão duplamente ligados
		//mostra o primeiro elemento da lista
		System.out.println("Primeiro elemento da lista: " + lista.obterPrimeiroNo().obterValor());
		//mosta o segundo elemento da lista
		System.out.println("Segundo elemento da lista: " + lista.obterPrimeiroNo().obterNoSeguinte().obterValor());
		//mosta o elemento anterior ao segundo nó da lista
		System.out.println("Elemento anterior ao segundo elemento da lista: "+ lista.obterPrimeiroNo().obterNoSeguinte().obterNoAnterior().obterValor());
		
	}

}
