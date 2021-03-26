package mapas;

public class Teste {

	public static void main(String[] args) {
		
		//criando um mapa de listas
		MapaLista mapaLista = new MapaLista();
		
		//verifica se o mapa est� vazio
		System.out.println("O mapa est� vazio: " + mapaLista.estaVazio());
		
		//adiciona os elementos no mapa
		mapaLista.adicionar("TRE5976", new Carro());
		mapaLista.adicionar("RTG3942", new Carro());
		mapaLista.adicionar("OIL6719", new Carro());
		mapaLista.adicionar("ZXS5143", new Carro());
		
		//verifica o tamanho do mapa ap�s a inser��o dos elementos
		System.out.println("Tamanho do mapa: " + mapaLista.tamanho());
		
		//verifica se uma chave est� presente no mapa
		System.out.println("A chave TRE5976 est� no mapa? " + mapaLista.contemChave("TRE5976"));
		System.out.println("A chave ERW9959 est� no mapa? " + mapaLista.contemChave("ERW9959"));
		
		//retorna o objeto carro atrav�s da placa e define um fabricante
		mapaLista.pegar("RTG3942").setFabricante("Fiat");
		
		//retorna o fabricante definido na lista acima
		System.out.println("Fabricante do carro com a chave RTG3945: " + mapaLista.pegar("RTG3942").getFabricante());
		
		//remove um dos elementos da lista atrav�s da placa
		mapaLista.remover("OIL6719");
		
		//verifica se o elemento removido est� no mapa
		System.out.println("A chave TRE5976 est� no mapa? " + mapaLista.contemChave("OIL6719"));
		
		//verifica o tamanho do mapa ap�s a remo��o do elemento
		System.out.println("Tamanho do mapa: " + mapaLista.tamanho());
		
		
	}
}
