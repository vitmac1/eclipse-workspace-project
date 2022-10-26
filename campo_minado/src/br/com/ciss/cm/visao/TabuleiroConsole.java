package br.com.ciss.cm.visao;

import br.com.ciss.cm.excecao.ExplosaoException;
import br.com.ciss.cm.excecao.SairException;
import br.com.ciss.cm.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while(continuar) {
				System.out.println("Outra Partida? (S/n) ");
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				}else {
					tabuleiro.reiniciar();
				}
			}
		}catch(SairException Exception) {
			System.out.println(
					"Tchau!!!");
		}finally {
			entrada.close();
		}
	}
		
	@SuppressWarnings("unused")
	private void cicloDoJogo() {
		try {
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (x, y): ");
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
						.map(e -> Integer.parseInt(e.trim())).iterator();
				
				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");
				
				if("1".equalsIgnoreCase(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				}else if ("2".equalsIgnoreCase(digitado)){
					tabuleiro.AlternarMarcacao(xy.next(), xy.next());
				}
				
			}
			System.out.println(tabuleiro);
			System.out.println(
					"Voce Ganhou!!!");
		}catch (ExplosaoException ExplosionException) {
			System.out.println(tabuleiro);
			System.out.println(
					"Voce Perdeu!");
		}
	}
	
//		try {
//			while(!tabuleiro.objetivoAlcancado()) {
//				System.out.println(tabuleiro);
//				
//				String digitado = capturarValorDigitado("Digite (x, y): ");
//				
////				Arrays.stream(digitado.split(","))
////					.map(e -> Integer.parseInt(e));
//				
//				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
//						.map(e -> Integer.parseInt(e.trim())).iterator();			}
//			
//				System.out.println();
//			}
//			//System.out.println("Voce Ganhou!!!");
//		}catch(ExplosaoException ExplosionException) {
//			System.out.println("Voce Perdeu!!!");
//		}
	private String capturarValorDigitado(String texto) {
		System.out.println(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}else {
			return digitado;
		}
	}
}
