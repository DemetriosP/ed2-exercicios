package exercicio5;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		int numeroUm, numeroDois;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe dois n�meros que voc� deseja saber o MDC\nN�mero 1:");
		numeroUm = Integer.parseInt(leitura.nextLine());
		
		System.out.println("N�mero 2: ");
		numeroDois = Integer.parseInt(leitura.nextLine());
		
		System.out.println("O MDC de " + numeroUm + " e " + numeroDois + " � " + MDC.maximoDivisorComum(numeroUm, numeroDois));
		
	}

}
