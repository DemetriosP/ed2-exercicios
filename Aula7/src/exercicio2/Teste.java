package exercicio2;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		int vetor[] = new int [7], posicao, numero;
		
		Scanner leitura = new Scanner(System.in);
		
		for(posicao = 0; posicao < vetor.length; posicao++) {
			
			System.out.print("Infome um numero para a posicao " + posicao + " do vetor: ");
			numero = Integer.parseInt(leitura.nextLine());
			
			vetor[posicao] = numero;
			
		}
		
		System.out.println("Maior número inteiro informado contido no vetor "
				+ "é " + MaiorInteiro.maiorInteiro(vetor, vetor.length));
		
	}

}
