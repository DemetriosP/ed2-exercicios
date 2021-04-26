package exercicio2;

public class MaiorInteiro {
	
	public static int maiorInteiro(int vetor[], int tamanhoVetor) {
		
		if(tamanhoVetor == 0) return vetor[tamanhoVetor];
		
		int metodo = maiorInteiro(vetor, tamanhoVetor - 1);
		
		if(metodo > vetor[tamanhoVetor - 1]) return metodo;
	
		return vetor[tamanhoVetor - 1];
		
	}

}
