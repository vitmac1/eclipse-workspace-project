package observer;

public class Namorada implements ChegadaAniversarianteObserver{
	
	
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Apagas as luzes...");
		System.out.println("Fazer silencio...");
		System.out.println("Surpresa...");
	}
}
