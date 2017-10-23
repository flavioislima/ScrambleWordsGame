package Game;
import java.util.ArrayList;
import java.util.Collections;

//Classe que cria um método para criar uma nova palavra embaralhada.

public class EmbaralhadorS1 implements Embaralhador{
	@Override
	public String embaralhar(String palavra) {
		int tamanhoPalavra = palavra.length();
		ArrayList<String> letras = new ArrayList<String>();
		
		for (int i = 0; i < tamanhoPalavra; i++) {
			letras.add(palavra.substring(i, i+1));
		}
		
		Collections.shuffle(letras);
		
		String novaPalavra = palavra.substring(1, 1);
		
		for (int i = 0; i < tamanhoPalavra; i++) {
			novaPalavra += letras.get(i);
		}
		
		return novaPalavra;
	}
	
	@Override
	public String toString() {
		return "Embaralhador Nivel 1";
	}

    
    
}
