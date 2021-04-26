package exercicio3;

public class Produto {
	
	public static int produto(int vetor[], int tamanhoVetor) { 
		
		int vetorAlt[] = vetor.clone(), produto, tamanho;
		
		tamanho = tamanhoVetor - 1;
		
		if(tamanho == 0) return vetor[tamanho];
		
		produto = vetorAlt[tamanho] * vetorAlt[tamanho - 1];
	
		if(tamanho == 1) return produto;
		else {
			vetorAlt[tamanho - 1] = produto;
			return produto(vetorAlt, tamanho);
		}
		
	}

}
