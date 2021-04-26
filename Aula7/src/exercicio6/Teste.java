package exercicio6;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		int dividendo, divisor;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe dois números que você deseja saber o módulo de sua divisão\nNúmero 1:");
		dividendo = Integer.parseInt(leitura.nextLine());
		
		System.out.println("Número 2: ");
		divisor = Integer.parseInt(leitura.nextLine());
		
		System.out.println("O módulo da divisão entre " + dividendo + " e " + divisor + " é " + Modulo.modulo(dividendo, divisor));
		
	}

}
