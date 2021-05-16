package exercicio1;

public class Teste {
	
	public static void main(String[] args) {
		
		BinaryTree arvore = new BinaryTree();
		
		//imprimi a quantidade de numeros de nos
		System.out.println(arvore.getNumberOfNodes());
		
		//verifica se a arvore está vazia
		System.out.println(arvore.isEmpty());
		
		//inseri numeros na arvore
		arvore.add(new Node(15));
		arvore.add(new Node(5));
		arvore.add(new Node(7));
		arvore.add(new Node(3));
		arvore.add(new Node(9));
		arvore.add(new Node(2));
		
		//imprimi a quantidade de numeros de nos
		System.out.println(arvore.getNumberOfNodes());
		
		//imprime a arvore
		arvore.printTree();
		
		//imprimir em pré-ordem
		System.out.println(arvore.preOrder());
		
		//imprimi em em ordem
		System.out.println(arvore.inOrder());
		
		//imprimi em pos-ordem
		System.out.println(arvore.posOrder());
		
	}
	
}
