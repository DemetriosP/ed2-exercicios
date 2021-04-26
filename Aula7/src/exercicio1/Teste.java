package exercicio1;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informe o do qual deseja saber o Fatorial: ");
		numero = Integer.parseInt(leitura.nextLine());
		
		System.out.println("O Fatorial de " + numero + " é " + Fatorial.fatorial(numero));
		
		
		
	}

}
