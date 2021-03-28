package exercicio2;

public class ListaDuplamenteLigada {
	
	private Node primeiroElemento;
	
	public Node obterPrimeiroNo() { return primeiroElemento; }
	
	public void definirPrimeiroNo(Node primeiroNo) { this.primeiroElemento = primeiroNo; }
	
	public boolean estaVazio() { return primeiroElemento == null; }
	
	public void adicionar(Node no) {
		if (this.estaVazio()) {
			this.primeiroElemento = no;
		} else {
			Node noTemp = this.primeiroElemento;
			while (noTemp.obterNoSeguinte() != null) noTemp = noTemp.obterNoSeguinte();
			noTemp.definirNoSeguinte(no);
			no.definirNoAnterior(noTemp);
		}
	}
	
	public Node remove() {
		if (this.estaVazio()) return null;
		Node noTemp = this.primeiroElemento;
		this.primeiroElemento = this.primeiroElemento.obterNoSeguinte();
		this.primeiroElemento.definirNoAnterior(null);
		return noTemp;
	}
	
	public int busca(Object buscado) {
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
				noTemp = noTemp.obterNoSeguinte();
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
				noTemp = noTemp.obterNoSeguinte();
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
			noTemp = noTemp.obterNoSeguinte();
		};
		return "[" + r + "]";
	}
	
}
