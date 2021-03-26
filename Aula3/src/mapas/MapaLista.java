package mapas;

import java.util.ArrayList;
import java.util.List;

public class MapaLista {
	
	private List<Associacao> associacao = new ArrayList<Associacao>();
	
	public boolean contemChave(String placa) {
		for(Associacao associacao : this.associacao) {
			if (placa.equals(associacao.getPlaca())) {
					return true;
			}
		}
		return false;
	}
	
	public void adicionar(String placa, Carro carro) {
		if (this.contemChave(placa)) { this.remover(placa); }
		this.associacao.add(new Associacao(placa, carro) );
	}
	
	public void remover(String placa) {
		if (this.contemChave(placa)) {
			for(int i = 0; i < this.associacao.size(); i++) {
				Associacao associacao = this.associacao.get(i);
				if (placa.equals(associacao.getPlaca())) {
					this.associacao.remove(i);
					break;
				}
			}
		} else {
			System.err.println("Placa não encontrada no mapa.");
		}
	}
	
	public Carro pegar(String placa) {
		if (this.contemChave(placa)) {
			for(Associacao associacao : this.associacao) {
				if (placa.equals(associacao.getPlaca())) {
					return associacao.getCarro();
				}
			}
		}
		return null;
	}
	
	public int tamanho() {return this.associacao.size();}
	
	public boolean estaVazio() {
		if (this.associacao.size() == 0) return true;
		else return false;
	}
	
	
}
