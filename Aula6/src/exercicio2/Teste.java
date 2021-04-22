package exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		List<Cartao> cartoes = new ArrayList<Cartao>();
		
		Cartao cartaoUm = new Cartao("Demetrios Pantaleão", 14523698712547852l, 1024, 127);
		Cartao cartaoDois = new Cartao("José Dias", 4536987516824579l, 1024, 802);
		Cartao cartaoTres = new Cartao("Valter Mercado", 6954127865423564l, 1125, 401);
		
		cartoes.add(cartaoUm);
		cartoes.add(cartaoTres);
		cartoes.add(cartaoDois);
		
		//usei o sort, mas implementei dois compareTo, para atender o que foi solicitado 
		Collections.sort(cartoes);
		
		for(Cartao cartao:cartoes) {
			System.out.println(cartao);
		}

	}

}
