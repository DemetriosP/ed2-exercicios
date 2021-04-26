package exercicio4;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		int vetor[] = new int [5], posicao, numero;
		String valores = "";
		
		Scanner leitura = new Scanner(System.in);
		
		for(posicao = 0; posicao < vetor.length; posicao++) {
			
			System.out.print("Infome um numero para a posicao " + posicao + " do vetor: ");
			numero = Integer.parseInt(leitura.nextLine());
			
			vetor[posicao] = numero;
			
		}
		
		for(int valor:vetor) valores += " " + valor;
		
		System.out.println("Vetor informado: " + valores);
		
		InverteVetor.inverteVetor(vetor, 0, 4);
		
		valores = "";
		
		for(int valor:vetor) valores += " " + valor;
		
		System.out.println("Vetor invertido: " + valores);
		
	}

}
