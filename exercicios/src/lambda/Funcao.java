package lambda;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
		Function<String, String> oResultadoE = 
				valor -> "O resultado e: " + valor;
				
		Function<String, String> empolgado =
				valor -> valor + "!!!";
  	 
		@SuppressWarnings("unused")
		Function<String, String> duvida =
				valor -> valor + "???";
				
		String resultadoFinal1 = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal1);
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(33);
		
		System.out.println(resultadoFinal2);
		
		System.out.println(parOuImpar.apply(32));
	}
}
