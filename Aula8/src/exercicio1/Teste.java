package exercicio1;

import java.util.Random;

public class Teste {
	
	public static void embaralhar(int vetor[]) {

		Random random = new Random();

		for (int posicao=0; posicao < (vetor.length - 1); posicao++) {

			int posicaoAleatoria = random.nextInt(vetor.length);

			int temp = vetor[posicao];
			vetor[posicao] = vetor[posicaoAleatoria];
			vetor[posicaoAleatoria] = temp;
		}

	}
	
	public static void imprimiVetor(int vetor[]) {
		
		String valores = "";
		
		for(int valor:vetor) {
			valores = valores + " " + valor;
		}
		
		System.out.println("[" + valores + " ]");
		
	}
	
	public static void main(String[] args) {
		
		int vetor[] = {15, 20, 0, 9, 541, 169, 221, 122, 5, 3, 80};
		
		//ordenar vetor com shellSort
		ShellSort.sort(vetor);
		imprimiVetor(vetor);
		embaralhar(vetor);
		
		//ordenar vetor com quickSort
		QuickSort.sort(vetor);
		imprimiVetor(vetor);
		embaralhar(vetor);
		
		//ordenar vetor com mergeSort
		MergeSort.sort(vetor);
		imprimiVetor(vetor);
		embaralhar(vetor);
		
	}

}
