package exercicio6;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		int dividendo, divisor;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe dois n�meros que voc� deseja saber o m�dulo de sua divis�o\nN�mero 1:");
		dividendo = Integer.parseInt(leitura.nextLine());
		
		System.out.println("N�mero 2: ");
		divisor = Integer.parseInt(leitura.nextLine());
		
		System.out.println("O m�dulo da divis�o entre " + dividendo + " e " + divisor + " � " + Modulo.modulo(dividendo, divisor));
		
	}

}
