package Game;

import java.util.ArrayList;

public class EmbaralhadorS2 implements Embaralhador {

	@Override
	public String embaralhar(String palavra) {
		int tamanhoPalavra = palavra.length();
		ArrayList<String> letras = new ArrayList<String>();
		
		for (int i = tamanhoPalavra; i > 0; i--) {
			letras.add(palavra.substring(i-1, i));
		}
		
		String novaPalavra = palavra.substring(1, 1);
		
		for (int i = 0; i < tamanhoPalavra; i++) {
			novaPalavra += letras.get(i);
			
		}
		
		return novaPalavra;
	}

	@Override
	public String toString() {
		return "Embaralhador Nivel 2";
	}

	
	
}
