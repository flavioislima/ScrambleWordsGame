package Game;

import java.io.IOException;

//implementa nível de dificuldade fácil para o jogo com mais vidas e com dicas;

public class NivelFacil implements MecanicaJogo {
	
	private FabricaEmbaralhadores f = new FabricaEmbaralhadores();
	private BancoDePalavras b = new BancoDePalavras();
	private boolean acertou;
	private String palavraSelecionada = b.getPalavraAleatoria();
	private String palavraSelecionadaAleatoria = f.getEmbaralhadorAleatorio().embaralhar(palavraSelecionada);
	
	public NivelFacil() throws IOException{
			
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
		if (tentativas == 3 || acertou) {
			return true;
		}else {
		return false;
		}
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
