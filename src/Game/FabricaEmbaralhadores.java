package Game;

public class FabricaEmbaralhadores {
	
	//Este método serve para retonar uma embaralhador de forma aleatória
	public Embaralhador getEmbaralhadorAleatorio() {
		//utiliza o método random para selecionar de forma randômica
		//se o resultado for 0, chama o embaralhador 1, senão, chama o 2;
		int random = (int) (Math.random()*2);
		if (random == 0) {
			return new EmbaralhadorS1();
		}else {
			return new EmbaralhadorS2();
		}
		
	}

}
