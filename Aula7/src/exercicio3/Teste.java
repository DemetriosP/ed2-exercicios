package exercicio3;

import java.util.Scanner;

import exercicio2.MaiorInteiro;

public class Teste {
	
	public static void main(String[] args) {
		
		int vetor[] = new int [5], posicao, numero;
		
		Scanner leitura = new Scanner(System.in);
		
		for(posicao = 0; posicao < vetor.length; posicao++) {
			
			System.out.print("Infome um numero para a posicao " + posicao + " do vetor: ");
			numero = Integer.parseInt(leitura.nextLine());
			
			vetor[posicao] = numero;
			
		}
		
		System.out.println("O Produto dos número contidos no vetor "
				+ "é " + Produto.produto(vetor, vetor.length));
		
	}

}
