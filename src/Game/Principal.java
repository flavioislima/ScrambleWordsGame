package Game;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	//Inicializa a pontuação
	private static int pontos = 0;
	//Implementa o Scanner para o Menu
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		FabricaMecanicaJogo f = new FabricaMecanicaJogo();
		boolean loop = true;
		boolean verificar;
		int tentativas = 1;
		int nPalavras = 0; 
		
		
		//Apresenta o Menu ao jogador
		while(loop) {
			System.out.println("\n-------MENU DO JOGO-------\n");
			System.out.println("Digite uma das opções abaixo:\n");
			System.out.println("-----Modo Normal-------[1]");
			System.out.println("-----Modo Difícil------[2]");
			System.out.println("-----Lista Pontuação---[3]");
			System.out.println("-----Sair--------------[4]");
			int selecao = entrada.nextInt();
			
						
			switch (selecao) {
			case 1:
				System.out.println("\nBem vindo ao Modo Normal");
				System.out.println("Nesse modo são 5 Palavras no total");
				System.out.println("Você ganha 2 pontos por acerto.");
				System.out.println("E não perde ponto se errar!");
				System.out.println("Você tem 3 chances para acertar a palavra.");
				System.out.println("Que os jogos comecem!\n");
				
				while (nPalavras < 5) {
					MecanicaJogo facil = f.getNivelFacil();				
					String palavraSelecionada = facil.getPalavraSelecionada();
					nPalavras++;
					String palavraSelecionadaAleatoria = facil.getPalavraSelecionadaAleatoria();
					System.out.println("Palavra Embaralhada: " + palavraSelecionadaAleatoria + "\nQual é a palavra?");
					
					Scanner entrada2 = new Scanner(System.in);
					String palavraDigitada = entrada2.nextLine();
					verificar = facil.verificaPalavra(palavraDigitada);
	
					
					while(!facil.gameOver(tentativas)) {
							System.out.println("\nErrou!");
							System.out.println("Atenção! Você só tem mais " + (3-tentativas) + " chance(s!");
							System.out.println("Tente novamente! Palavra Embaralhada: "+ palavraSelecionadaAleatoria);
							
							@SuppressWarnings("resource")
							Scanner entrada3 = new Scanner(System.in);
							String palavraDigitada3 = entrada3.nextLine();
							verificar = facil.verificaPalavra(palavraDigitada3);
						
							tentativas++;
						
							if(tentativas == 3) {
								System.out.println("Fim de Jogo =/ ");
								System.out.println("A palavra correta era: "+ palavraSelecionada);
								System.out.println("Pontuação: " + pontos);
								System.out.println();
							}
							
							
						
					}
				
					if (verificar) {
						pontos += 2;
						System.out.println("Parabens! Você acertou e marcou 2 pontos!");
						System.out.println("Pontuação: " + pontos);
						System.out.println();
					}
				}
				System.out.println("Fim de jogo!");
				System.out.println("Pontuação final: " + pontos);
				
				break;
				
			case 2:
				System.out.println("\nBem vindo ao modo Difícil");
				System.out.println("Nesse modo são 5 Palavras no total");
				System.out.println("Você ganha 3 pontos por acerto.");
				System.out.println("Mas também perde 2 ponto se errar!");
				System.out.println("Que os jogos comecem!\n");

					while(nPalavras < 5) {
					MecanicaJogo dificil= f.getNivelDificil();
					String palavraSelecionadaD = dificil.getPalavraSelecionada();
					String palavraSelecionadaAleatoriaD = dificil.getPalavraSelecionadaAleatoria();
					System.out.println("Palavra Embaralhada: " + palavraSelecionadaAleatoriaD + "\nQual é a palavra?");
					nPalavras++;
					
					Scanner entrada3 = new Scanner(System.in);
					String palavraDigitadaD = entrada3.nextLine();
					verificar = dificil.verificaPalavra(palavraDigitadaD);
					tentativas++;
					
					if(!(verificar)) {
						System.out.println("Errou!");
						System.out.println("A palavra correta era: " + palavraSelecionadaD);
						System.out.println("Você perdeu 2 pontos.");
						pontos -= 2;
						System.out.println("Pontuação: " + pontos);
						System.out.println();
						}
							
	
						if (verificar) {
							pontos += 3;
							System.out.println("Parabens! Você acertou e marcou 3 pontos!");
							System.out.println("Pontuação: " + pontos);
							System.out.println();
						}
					}	
					System.out.println("Fim de jogo!");
					System.out.println("Pontuação final: " + pontos);
				break;
			
			case 3:
				System.out.println("Sua Pontuação: " + pontos); //imprime a pontuação
				break;
			
			case 4:
				loop = false;//Sai do jogo
				break;
			}
			
		}
		
	}
	

}
