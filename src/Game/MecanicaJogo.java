package Game;

import java.io.IOException;

public interface MecanicaJogo {
	public boolean verificaPalavra(String palavraDigitada) throws IOException;
	public boolean gameOver(int tentativas);
	public String getPalavraSelecionada() throws IOException;
	public String getPalavraSelecionadaAleatoria() throws IOException;
	
}
