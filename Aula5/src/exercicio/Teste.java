package exercicio;

import java.util.Arrays;

public class Teste {
	
	public static void main(String[] args) {
		
		Integer [] vetor = {8, 1, 3, 456, 120, 90, 7, 48, 36, 2};
		
		int posicao;
		
		//usa a pesquisa sequencial para procurar um numero em um vetor
		posicao = TiposPesquisa.pesquisaSequencial(vetor, 7);
		//Informa a posição do vetor onde o valor foi encontrado
		TiposPesquisa.encontrou(posicao);
		
		//ordena o vetor
		Arrays.sort(vetor);
		
		//usa a pesquisa sequencial para procurar um numero em um vetor ordenado
		posicao = TiposPesquisa.pesquisaSequencialEstruturaOrdenada(vetor, 7);
		TiposPesquisa.encontrou(posicao);
		
		posicao = TiposPesquisa.pesquisaSequencialEstruturaOrdenada(vetor, 5);
		TiposPesquisa.encontrou(posicao);
		
		/*usa a pesquisa sequencial para procurar um numero em um vetor e se o numero for
		encontrado ele é colocado na primeira posição*/
		posicao = TiposPesquisa.pesquisaSequencialComOrdenacaoEntradas(vetor, 456);
		TiposPesquisa.encontrou(posicao);
		
		posicao = TiposPesquisa.pesquisaSequencialComOrdenacaoEntradas(vetor, 456);
		TiposPesquisa.encontrou(posicao);
		
		Arrays.sort(vetor);
		
		//usa a pesquisa binaria para encontrar um numero em um vetor ordenado
		posicao = TiposPesquisa.pesquisaBinaria(vetor, 2);
		TiposPesquisa.encontrou(posicao);
		
		posicao = TiposPesquisa.pesquisaBinaria(vetor, 100);
		TiposPesquisa.encontrou(posicao);
		
		//usa a pesquisa binaria recursiva para encontrar um numero em um vetor ordenado
		posicao = TiposPesquisa.pesquisaBinariaRecursiva(vetor, 120, 0, 9);
		TiposPesquisa.encontrou(posicao);
		
		posicao = TiposPesquisa.pesquisaBinariaRecursiva(vetor, 100, 0, 9);
		TiposPesquisa.encontrou(posicao);
		
	}

}
