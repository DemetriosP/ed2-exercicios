package exercicio1;

public class ListaVetor {
	
	private int tamanho = 4;
	private Object vetor[] = new Object[tamanho];

	public int tamanho() {
		int contador = 0;
		
		for(@SuppressWarnings("unused") Object posicao : vetor) {
			if(vetor[contador] == null) {break;}
			contador++;
		}
		return contador;
	}
	
	public boolean estaVazio() {
		int tamanho = tamanho();
		
		if(tamanho == 0) {return true;}
		else {return false;}
	}
	
	public void adicionar(Object valor) {
		int posicao = tamanho(), tamanhoTemp = this.tamanho;
		
		if(posicao > (this.tamanho/2)) {
			Object vetorTemp[] = vetor;
			this.tamanho = this.tamanho * 2;
			this.vetor = new Object[tamanho];
			
			for(int contador = 0; contador < tamanhoTemp; contador++) {
				this.vetor[contador] = vetorTemp[contador];
			}
		}
		vetor[posicao] = valor;
	}
	
	public void remover(int posicao) {
		Object vetorTemp[] = vetor;
		int contador = 0;
		
		for(Object elemento : vetor) {
			if(contador > posicao) {
				this.vetor[posicao] = elemento;
				posicao++;
			}
			contador++;
		}
		
		if(tamanho() < (this.tamanho * 0.25)) {
			vetorTemp = vetor;
			this.tamanho = this.tamanho / 2;
			this.vetor = new Object[tamanho];
			
			for(contador = 0; contador < tamanho; contador++) {
				this.vetor[contador] = vetorTemp[contador];
			}
		}
	}
	
	public boolean contem(Object valor) {
		boolean contem = false;
		
		for(Object elemento : vetor) {
			if(elemento.equals(valor)) {
				contem = true;
				break;
			}
		}
		return contem;
	}
	
	@Override
	public String toString() {
		
		String todosItens = "";
		
		if (this.estaVazio()) {return "[vazia]";}
		else {
			for(Object elemento : vetor) {
				if(elemento != null) {todosItens += elemento + " ";}
			}
		}
		
		return "[ " + todosItens + "]";
	}


}
