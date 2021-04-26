package exercicio5;

public class MDC {
	
	public static int maximoDivisorComum(int primeiro, int segundo) {
		
		if(primeiro > segundo) return maximoDivisorComum(primeiro - segundo, segundo);
		else if (primeiro == segundo) return primeiro;
		else return maximoDivisorComum(segundo, primeiro);
	
	}

}
