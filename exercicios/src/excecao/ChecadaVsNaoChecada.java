package excecao;


public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
//		try {
//			geraErro1();
//		} catch (RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
		
		geraErro1();
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Exceção NÃO checada ou NÃO verificada
//	static void geraErro1() {
//		throw new RuntimeException("Ocorreu um erro bem legal #01!");
//	}
	
	static void geraErro1() {
		try {
			throw new RuntimeException("Ocorreu um erro bem legal #01!");
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	 //Exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
	
//	static void geraErro2() {
//		try {
//			throw new Exception("Ocorreu um erro bem legal #02!");
//		} catch (Exception e) {
//			System.out.println("Que Legal!");
//		}
//	}
	
	
}
