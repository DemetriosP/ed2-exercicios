package Exercicio3;

public class PilhaPessoal {
	
	private Node primeiroElemento;
	
	public Node obterPrimeiroNo() { return primeiroElemento; }
	
	public void definirPrimeiroNo(Node primeiroNo) { this.primeiroElemento = primeiroNo; }
	
	public boolean estaVazio() { return primeiroElemento == null; }
	
	public void adicionar(Node no) {
		if (this.estaVazio()) {
			this.primeiroElemento = no;
		} else {
			Node noTemp = this.primeiroElemento;
			this.primeiroElemento = no;
			this.primeiroElemento.definirProximoNo(noTemp);
		}
	}
	
	public Node remove() {
		if (this.estaVazio()) return null;
		Node noTemp = this.primeiroElemento;
		this.primeiroElemento = this.primeiroElemento.obterProximoNo();
		return noTemp;
	}
	
	public int busca(int buscado) {
		int pos = -1;
		
		if (!this.estaVazio()) {
			int cont = 0;
			Node noTemp = this.primeiroElemento;
			while ( noTemp != null ) {
				if (noTemp.obterValor() == buscado) {
					pos = cont;
					break;
				}
				cont++;
				noTemp = noTemp.obterProximoNo();
			};
		}
		return pos;
	}
	
	public int tamanho() {
		int tamanho = 0;
		if (!this.estaVazio()) {
			Node noTemp = this.primeiroElemento;
			while ( noTemp != null ) {
				tamanho++;
				noTemp = noTemp.obterProximoNo();
			};
		}
		return tamanho;
	}
	
	
	@Override
	public String toString() {
		
		String r = "";
		
		if (this.estaVazio()) return "[vazia]";
		
		Node noTemp = this.primeiroElemento;
		
		while ( noTemp != null ) {
			r += (r.length() == 0 ? "" : ", ") + noTemp.obterValor();
			noTemp = noTemp.obterProximoNo();
		};
		return "[" + r + "]";
	}
}
