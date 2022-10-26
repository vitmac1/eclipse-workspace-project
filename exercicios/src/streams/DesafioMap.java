package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 * 
		 * Integer.
		 */
		
		Consumer<String> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		nums.stream().map(n -> Integer.toBinaryString(n)).forEach(print);
		
		UnaryOperator<String> reverseString =
				s -> new StringBuilder(s).reverse().toString();
		
		Function<String, Integer> convertInt =
				s -> Integer.parseInt(s, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(reverseString)
			.map(convertInt)
			.forEach(System.out::println);
			
		
		}
}
