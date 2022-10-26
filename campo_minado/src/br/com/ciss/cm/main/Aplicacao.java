package br.com.ciss.cm.main;

import br.com.ciss.cm.modelo.Tabuleiro;
import br.com.ciss.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
//		tabuleiro.abrir(3, 3);
//		tabuleiro.AlternarMarcacao(4, 4);
//		tabuleiro.AlternarMarcacao(4, 5);
		
		
	}
}
