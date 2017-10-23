package tests;

import static org.junit.jupiter.api.Assertions.*;
import Game.EmbaralhadorS1;
import Game.EmbaralhadorS2;

import org.junit.jupiter.api.Test;

class TesteEmbaralamento {

	//Testa o primeiro método de embaralhamento
	@Test
	void testEmbaralhadorS1() {
		EmbaralhadorS1 e = new EmbaralhadorS1();
		String palavra = "Java";
		assertNotEquals(e.embaralhar(palavra), palavra);
		
	}

	//Testa o segundo método de embaralhamento
	@Test
	void testEmbaralhadorS2() {
		EmbaralhadorS2 e2 = new EmbaralhadorS2();
		String palavra = "Java";
		assertEquals(e2.embaralhar(palavra), "avaJ");
			
	}
}
