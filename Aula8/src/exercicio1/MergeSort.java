package exercicio1;

public class MergeSort {
	
	public static void sort(int[]  vetor) {
		if(vetor.length > 1) {
			int metadeTamanhoVetor = vetor.length / 2;
			int[] vetorEsquerdo = new int[metadeTamanhoVetor];
			int[] vetorDireito = new int[vetor.length - metadeTamanhoVetor];
			System.arraycopy(vetor, 0, vetorEsquerdo, 0, metadeTamanhoVetor);
			System.arraycopy(vetor, metadeTamanhoVetor, vetorDireito, 0, vetor.length - metadeTamanhoVetor);
			sort(vetorEsquerdo);
			sort(vetorDireito);
			merge(vetor, vetorEsquerdo, vetorDireito);
			
		}
	}
	
	private static void merge(int[] vetor, int[] vetorEsquerdo, int[] vetorDireito) {
		
		int i = 0; int j = 0; int k = 0;
		
		while(i < vetorEsquerdo.length && j < vetorDireito.length) {
			
			if(vetorEsquerdo[i] < vetorDireito[j]) {
				vetor[k++] = vetorEsquerdo[i++];
			}else {
				vetor[k++] = vetorDireito[j++];
			}
		}
		while (i < vetorEsquerdo.length) vetor[k++] = vetorEsquerdo[i++];
		while (j < vetorDireito.length) vetor[k++] = vetorDireito[j++];
	}

}
