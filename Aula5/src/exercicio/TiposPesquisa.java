package exercicio;

public class TiposPesquisa {
	
	
	public static int pesquisaSequencial(Integer vetor[], int valor) {
		
		int posicaoValor = -1, comparacoes = 0;
		
		
		for(int posicao = 0; posicao < vetor.length; posicao++) {
			
			comparacoes++;
			
			if(vetor[posicao] == valor) {
				posicaoValor = posicao;
				break;
			}
		}
		System.out.println("Foram realizadas " + comparacoes + " comparações.");
		return posicaoValor;
	}
	
	public static int pesquisaSequencialEstruturaOrdenada(Integer vetor[], int valor) {
			
			int posicaoValor = -1, comparacoes = 0;
			
			for(int posicao = 0; posicao < vetor.length; posicao++) {
				
				comparacoes++;
				
				if(vetor[posicao] == valor) {
					posicaoValor = posicao;
					break;
				}else if(vetor[posicao] > valor) break;
				
			}
			System.out.println("Foram realizadas " + comparacoes + " comparações.");
			return posicaoValor;
		}
	
	public static int pesquisaSequencialComOrdenacaoEntradas(Integer vetor[], int valor) {
		
		int posicaoValor = -1, comparacoes = 0;
		
		for(int posicao = 0; posicao < vetor.length; posicao++) {
			
			comparacoes++;
			
			if(vetor[posicao] == valor) {
				
				for(int i = posicao; i != 0; i--) {
					vetor[i] = vetor[i - 1];
				}
				
				vetor[0] = valor;
				posicaoValor = posicao;
				break;
			}
		}
		System.out.println("Foram realizadas " + comparacoes + " comparações.");
		return posicaoValor;
		
	}
	
	public static int pesquisaBinaria(Integer vetor[], int valor) {
		
		int posicaoValor = -1, comparacoes = 0, posicaoInicial = 0, 
				posicaoFinal = vetor.length - 1, meio;
		
		while(posicaoInicial <= posicaoFinal) {
			
			meio = (posicaoFinal + posicaoInicial) / 2;
			comparacoes++;
			
			if(vetor[meio].compareTo(valor) < 0) 
				posicaoInicial = meio + 1;
			else if(vetor[meio].compareTo(valor) > 0)
				posicaoFinal = meio - 1;
			else 
				return meio;
		}
		
		System.out.println("Foram realizadas " + comparacoes + " comparações.");
		return posicaoValor;
	}
	
	public static int pesquisaBinariaRecursiva(Integer vetor[], int valor, int posicaoInicial, int posicaoFinal) {
		
		int valorPosicao = -1, meio;
		
		if(posicaoInicial > posicaoFinal) return valorPosicao;
		
		meio = (posicaoFinal + posicaoInicial) / 2;
		
		if(vetor[meio].compareTo(valor) < 0)
			return pesquisaBinariaRecursiva(vetor, valor, meio + 1, posicaoFinal);
		else if (vetor[meio].compareTo(valor) > 0)
			return pesquisaBinariaRecursiva(vetor, valor, posicaoInicial, meio -1);
		else 
			return meio;
	
	}
	
	public static void encontrou(int posicao) {
		
		if(posicao == -1) System.out.println("O valor não foi encontrado no vetor informado.");
		else System.out.println("O valor foi encontrado na posicão " + posicao + " do vetor.");
		
	}

	
}
