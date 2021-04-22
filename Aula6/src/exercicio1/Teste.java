package exercicio1;

public class Teste {
	
	public static void main(String[] args) {
		
		int vetor[] = {1,5,9,2,4,6,8,0};
		
		//ordena o vetor usando o método bubbleSort
		Ordenadores.bubbleSort(vetor);
		
		//imprimi o vetor
		Ordenadores.imprimiVetor(vetor);
		
		//embralha o vetor
		Ordenadores.embaralhar(vetor);
		
		//imprimindo o vetor para mostrar que o método acima está funcioanando
		Ordenadores.imprimiVetor(vetor);
		
		Ordenadores.embaralhar(vetor);
		//ordena o vetor usando o método selectionSort
		Ordenadores.selectionSort(vetor);
		Ordenadores.imprimiVetor(vetor);
		
		Ordenadores.embaralhar(vetor);
		//ordena o vetor usando o método insertionSort
		Ordenadores.insertionSort(vetor);
		Ordenadores.imprimiVetor(vetor);
	
	}

}
