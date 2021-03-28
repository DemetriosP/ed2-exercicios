package exercicio2;

public class Node {
	
	private Object valor;
	private Node noAnterior;
	private Node noSeguinte;
	
	public Node(Object valor) {
		super();
		this.valor = valor;
	}
	
	public Object obterValor() {
		return valor;
	}
	
	public void definirValor (Object valor) {
		this.valor = valor;
	}
	
	public Node obterNoSeguinte() {
		return noSeguinte;
	}
	
	public Node obterNoAnterior() {
		return noAnterior;
	}
	
	public void definirNoSeguinte(Node noSeguinte) {
		this.noSeguinte = noSeguinte;
	}
	
	public void definirNoAnterior(Node noAnterior) {
		this.noAnterior = noAnterior;
	}
	
}