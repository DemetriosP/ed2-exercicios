package conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConjuntoEspelho {
	
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	private int tamanho = 0;
	
	public ConjuntoEspelho() {
		for(int i = 0; i < 26; i++) {
			this.tabela.add( new LinkedList<String>() );
		}
	}
	
	public LinkedList<String> todos() {
		LinkedList<String> lista = new LinkedList<String>();
		for(int i = 0; i < this.tabela.size(); i++) {
			lista.addAll(this.tabela.get(i) );
		}
		return lista;
		}
	
	public boolean estaVazio() {
		if (this.tamanho == 0) return true;
		else return false;
	}
	
	public int calcularPosicao(String palavra){
		int ascii = palavra.toLowerCase().charAt(0);
		return ascii % 26;
	}
	
	public void adicionar(String palavra){
		if (!contem(palavra)) {
			int codigo = calcularPosicao(palavra);
			LinkedList<String> lista = this.tabela.get(codigo);
			lista.add(palavra);
			this.tamanho++;
		}
	}
	
	public void remover(String palavra){
		if (contem(palavra)) {
			int codigo = calcularPosicao(palavra);
			LinkedList<String> lista = this.tabela.get(codigo);
			lista.remove(palavra);
			this.tamanho--;
		}
	}
	
	public boolean contem(String palavra) {
		int codigo = calcularPosicao(palavra);
		LinkedList<String> lista = this.tabela.get(codigo);
		return lista.contains(palavra);
	}
	
	public int tamanho() {return this.tamanho;}
}
