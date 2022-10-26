package padroes.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Porteiro {

	private List<ObservadorChegadaAniversariante> observadores 
	= new ArrayList<>();
	
	public void registrarObservador(
		ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"Sair".equalsIgnoreCase(valor)) {
			
			System.out.println("Aniversariante chegou? ");
			valor = entrada.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				//Criar o evento
				EventoChegadaAniversariante evento = 
						new EventoChegadaAniversariante(new Date());
				
				//notificar os observadores!
				observadores.stream()
					.forEach(o -> o.chegou(evento));
				valor = 
						"Sair";
			}else {
				System.out.println("Alarme falso!");
			}
		}
		
		entrada.close();
	}
	
}
