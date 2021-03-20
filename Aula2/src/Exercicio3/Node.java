package Exercicio3;

public class Node {
	
	private int valor;
	private Node proximoNo;
	
	public Node(int value) {
		super();
		this.valor = value;
	}
	
	public int obterValor() {
		return valor;
	}
	
	public void definirValor (int value) {
		this.valor = value;
	}
	
	public Node obterProximoNo() {
		return proximoNo;
	}
	
	public void definirProximoNo(Node nextNode) {
		this.proximoNo = nextNode;
	}
	
}
