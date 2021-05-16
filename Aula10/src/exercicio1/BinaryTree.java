package exercicio1;

public class BinaryTree {
	
	private int numberOfNodes;
	private Node nodeRoot;
	
	public BinaryTree() {
		this.nodeRoot = null;
	}
	
	public boolean isEmpty() {
		return null == this.nodeRoot;
	}
	
	public int getNumberOfNodes() {
		return numberOfNodes;
	}
	
	public Node getNodeRoot() {
		return nodeRoot;
	}
	
	public void setNodeRoot(Node nodeRoot) {
		this.nodeRoot = nodeRoot;
	}
	
	public void add(Node node) {
		add(this.nodeRoot, node);
		this.numberOfNodes++;
	}
	
	private void add(Node theBinaryTreeRootNode, Node node) {
		
		if(theBinaryTreeRootNode == null) this.nodeRoot = node;
		else {
			
			if(node.getNodeValue() < theBinaryTreeRootNode.getNodeValue()) {
				
				if(theBinaryTreeRootNode.getLeftNode() == null) {
					theBinaryTreeRootNode.setLeftNode(node);;
				}else {
					add(theBinaryTreeRootNode.getLeftNode(), node);
				}
				
			}else {
				
				if(theBinaryTreeRootNode.getRigthtode() == null) {
					theBinaryTreeRootNode.setRigthtode(node);
				}else {
					add(theBinaryTreeRootNode.getRigthtode(), node);
				}
			}	
		}
		
	}
	
	public void printTree() {
		printTree(this.nodeRoot, 0, "->");
	}
	
	private void printTree(Node node, int nSpaces, String separator) {
		if(node != null) {
			
			System.out.print(nSpaces + separator);
			System.out.println(node.getNodeValue());
			printTree(node.getLeftNode(), nSpaces + 1, separator);
			printTree(node.getRigthtode(), nSpaces + 1, separator);
		}
	}
	
	public String preOrder() {
		return preOrder(this.nodeRoot);
	}
	
	private String preOrder(Node node) {
		if(node == null) return "";
		else return node.getNodeValue() + "->" +preOrder(node.getLeftNode()) + preOrder(node.getRigthtode());
	}

	public String inOrder() {
		return inOrder(this.nodeRoot);
	}

	private String inOrder(Node node) {
		if (node == null) return "";
		else return inOrder(node.getLeftNode()) +  node.getNodeValue() + "->" + inOrder(node.getRigthtode()); 
	}
	
	public String posOrder() {
		return posOrder(this.nodeRoot);
	};
	
	private String posOrder(Node node) {
		if (node == null) return "";
		else return posOrder(node.getLeftNode()) + posOrder(node.getRigthtode()) + node.getNodeValue() + "->";
	}
}
