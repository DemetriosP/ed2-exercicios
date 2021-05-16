package exercicio1;

public class Node {
	
	private Node rigthtode, leftNode;
	private int nodeValue;
	
	public Node(int valor) {
		this.nodeValue = valor;
		this.rigthtode = this.leftNode = null;
	}
	
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	public Node getRigthtode() {
		return rigthtode;
	}
	public void setRigthtode(Node rigthtode) {
		this.rigthtode = rigthtode;
	}
	public int getNodeValue() {
		return nodeValue;
	}
	public void setNodeValue(int nodeValue) {
		this.nodeValue = nodeValue;
	}
	
}
