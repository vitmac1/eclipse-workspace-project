package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero);
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		//Forma mais natural de chamar o método
		Integer ultimaNumero2 = ListaUtil.getUltimo2(nums);
		System.out.println(ultimaNumero2);
		
		//Especificar o tipo na chamada do método 
		Integer ultimaNumeroEspecifico2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(ultimaNumeroEspecifico2);
	} 
}
  