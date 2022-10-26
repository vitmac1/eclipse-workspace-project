package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.aguardar(2.77);
		System.out.println
		(caixaA.abrir());
		
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaB.aguardar(2.88);
		System.out.println
		(caixaB.abrir());
		
	}
	
	
}
