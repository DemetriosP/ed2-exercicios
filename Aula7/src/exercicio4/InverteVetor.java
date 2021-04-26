package exercicio4;

public class InverteVetor {
	
	public static Object inverteVetor(int vetor[], int posicaoInicial, int posicaoFinal) {
		
		int auxiliar;
		
		if(posicaoInicial <= posicaoFinal) {
			
			auxiliar = vetor[posicaoInicial];
			vetor[posicaoInicial] = vetor[posicaoFinal];
			vetor[posicaoFinal] = auxiliar;
			
			posicaoInicial++;
			posicaoFinal--;
			
			return inverteVetor(vetor, posicaoInicial, posicaoFinal);
			
		}else return null;
	}
}
