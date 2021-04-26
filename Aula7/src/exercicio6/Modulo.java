package exercicio6;

public class Modulo {
	
	public static int modulo(int dividendo, int divisor) {
		
		if(dividendo > divisor ) return modulo(dividendo - divisor, divisor);
		else if(dividendo < divisor) return dividendo;
		else return 0;
		
	}

}
