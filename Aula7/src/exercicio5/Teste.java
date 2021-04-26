package exercicio5;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		int numeroUm, numeroDois;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe dois números que você deseja saber o MDC\nNúmero 1:");
		numeroUm = Integer.parseInt(leitura.nextLine());
		
		System.out.println("Número 2: ");
		numeroDois = Integer.parseInt(leitura.nextLine());
		
		System.out.println("O MDC de " + numeroUm + " e " + numeroDois + " é " + MDC.maximoDivisorComum(numeroUm, numeroDois));
		
	}

}
