package Exercicio1;

import java.util.Scanner;

public class Vetor {
	
	public static void main(String[] args) {
		
		int valores, contador = 0;
		int vetor_a[] = new int[10];
		int vetor_b[] = new int[10];
		
		Scanner leitura = new Scanner(System.in);
		
		for (int posicao = 0; posicao < 10; posicao++) {
			System.out.println("Informe o número para a posição " + posicao + " do vetor.");
			valores = leitura.nextInt();
			vetor_a[posicao] = valores;
		}
		
		for (int posicao = 9; posicao >= 0; posicao--) {
			vetor_b[contador] = vetor_a[posicao];
			contador++;
		}
		
		System.out.println("A   B");
		
		for (int posicao = 0; posicao < 10; posicao++) {
			System.out.println(vetor_a[posicao] + "  " +vetor_b[posicao]);
		}
	}
	
}
