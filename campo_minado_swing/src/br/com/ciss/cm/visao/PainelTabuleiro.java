package br.com.ciss.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.ciss.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(
				tabuleiro.getLinhas(), tabuleiro.getColunas()));
	
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c))); 
		tabuleiro.registrarObservador(c -> {
			
			SwingUtilities.invokeLater(() -> {
				if(c.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou :)");
				}else {
					JOptionPane.showMessageDialog(this, "Perdeu :)");
				}
				
				tabuleiro.reiniciar();
			});
		});
	}
}
