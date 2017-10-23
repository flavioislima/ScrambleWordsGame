package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BancoDePalavras {
	private ArrayList<String> listaPalavras = new ArrayList<String>();
	
	//Arquivo onde se encontram as palavras: palavras.txt;
	//ATENÇÃO: arquivo não pode ter linhas em branco
	private String nomeArq = "palavras.txt";
	
	private void LerArquivo() {
		try {
			
			listaPalavras.clear(); //apaga a lista de palavras para a geração de uma nova.
			
			FileReader arq = new FileReader(nomeArq);
			BufferedReader lerArq = new BufferedReader(arq);
			
			//Ler a primeira linha do arquivo
			String linha = lerArq.readLine();
			
			//Realiza um loop para ler todas as outras até atingir o fim do arquivo:
			while (linha != null) {
				listaPalavras.add(linha);
				linha = lerArq.readLine();//pula para a próxima linha.
			}
			
			arq.close();
			
		} catch (IOException e) {
			System.out.println("Arquivo Não Encontrado!");
			e.getMessage();
		}
		
	}
	
	//Método para retonar uma palavra do Array
	private ArrayList<String> getPalavras() {
		this.LerArquivo();
		return listaPalavras;
	}
	
	// Metodo que retorna uma palavra aleatória contida na lista de palavras obtidas de palavras.txt
	public String getPalavraAleatoria ()	{
		 @SuppressWarnings("unchecked")
		ArrayList<String> palavrasCopia = (ArrayList<String>) getPalavras().clone(); 
		 
		Collections.shuffle(palavrasCopia); 
		String a = palavrasCopia.get(0);
		return a;
	}
	
}
