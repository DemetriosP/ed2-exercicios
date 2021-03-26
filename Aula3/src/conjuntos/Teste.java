package conjuntos;

public class Teste {
	
	public static void main(String[] args) {
		
		ConjuntoEspelho conjuntoEspelho = new ConjuntoEspelho();
		
		//verificar se o conjunto est� vazio
		System.out.println("Conjunto est� vazio? " + conjuntoEspelho.estaVazio());
		
		//adicionando elementos no conjunto
		conjuntoEspelho.adicionar("casa");
		conjuntoEspelho.adicionar("rua");
		conjuntoEspelho.adicionar("pedestre");
		conjuntoEspelho.adicionar("salada");
		conjuntoEspelho.adicionar("carro");
		
		//verifica o tamanho do conjunto ap�s adicionar os elementos
		System.out.println("Tamanho do Conjunto Espelho: " + conjuntoEspelho.tamanho());
		
		//testando a adi��o de elementos repetidos no conjunto
		conjuntoEspelho.adicionar("casa");
		
		//verifica o tamanho do conjunto ap�s tentar adicionar um elemento repetido
		System.out.println("Tamanho do Conjunto Espelho: " + conjuntoEspelho.tamanho());
		
		//verificar a posi��o de um elemento no conjunto
		System.out.println("Posi��o do elemento carro: " + conjuntoEspelho.calcularPosicao("carro"));
		
		//remover um elemento do conjunto
		conjuntoEspelho.remover("casa");
		
		//verifica se o elemento removido foi removido
		System.out.println("O conjunto cont�m o elemento casa? " + conjuntoEspelho.contem("casa"));
		
		//verifica o tamanho do conjunto
		System.out.println("Tamanho do Conjunto Espelho: " + conjuntoEspelho.tamanho());
		
	}

}
