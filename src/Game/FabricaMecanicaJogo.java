package Game;

import java.io.IOException;

public class FabricaMecanicaJogo {
	//Classe que serve para selecionar o nível de dificuldade do jogo
	public MecanicaJogo getNivelFacil() throws IOException {
		return new NivelFacil();
	}
	
	public MecanicaJogo getNivelDificil() throws IOException {
		return new NivelDificil();
	}

}
