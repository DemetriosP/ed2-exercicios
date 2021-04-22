package exercicio1;

import java.util.Random;

public class Ordenadores {
	
	public static void bubbleSort(int vetor[]) {
		
		int interacao, posicao, auxiliar;
		
		for(interacao = 0; interacao < vetor.length - 1; interacao++ ) {
			for(posicao = 0; posicao < vetor.length - 1; posicao++) {
				if(vetor[posicao] > vetor[posicao+1]) {
					auxiliar = vetor[posicao];
					vetor[posicao] = vetor[posicao+1];
					vetor[posicao+1] = auxiliar;
				};
				
			}
		}
		
	}
	
	public static void selectionSort(int vetor[]) {
		
		int priPo, segPos, auxiliar;
		
		for(priPo = 0; priPo < vetor.length; priPo++ ) {
			for(segPos = 0; segPos < vetor.length; segPos++) {
				if(vetor[priPo] < vetor[segPos]) {
					auxiliar = vetor[priPo];
					vetor[priPo] = vetor[segPos];
					vetor[segPos] = auxiliar;
				};
				
			}
		}
		
	}
	
	public static void insertionSort(int vetor[]) {
       
		for (int posicaoAtual = 1; posicaoAtual < vetor.length; posicaoAtual++) {  
            
			int valorAtual = vetor[posicaoAtual];  
            int i = posicaoAtual - 1;  
            
            while ( (i > -1) && ( vetor [i] > valorAtual ) ) {  
                vetor [i+1] = vetor [i];  
                i--;  
            } 
            
            vetor[i+1] = valorAtual;  
        }  
    }
	
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
		
			
		
}
	
	


