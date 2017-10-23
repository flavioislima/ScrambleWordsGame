package Game;

import java.io.IOException;

//implementa nível de dificuldade difícil para o jogo com menos vidas e sem dicas;

public class NivelDificil implements MecanicaJogo {
	
	private FabricaEmbaralhadores f = new FabricaEmbaralhadores();
	private BancoDePalavras b = new BancoDePalavras();
	private boolean acertou;
	private String palavraSelecionada = b.getPalavraAleatoria();
	private String palavraSelecionadaAleatoria = f.getEmbaralhadorAleatorio().embaralhar(palavraSelecionada);
	
	public NivelDificil() throws IOException{
			
	}

	@Override
	public boolean verificaPalavra(String palavraDigitada) throws IOException {
		if (palavraDigitada.equals(getPalavraSelecionada())) {
			acertou = true;
			return true;
		}else {
			acertou = false;
			return false;
		}
	}

	@Override
	public boolean gameOver(int tentativas) {
		if (tentativas == 1 || acertou) {
			return true;
		}
		return false;
	}

	@Override
	public String getPalavraSelecionada() throws IOException {
		return palavraSelecionada;
	}

	@Override
	public String getPalavraSelecionadaAleatoria() throws IOException {
		return palavraSelecionadaAleatoria;
	}

}
