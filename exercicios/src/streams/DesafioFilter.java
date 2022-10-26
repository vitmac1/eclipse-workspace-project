package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		Produto produtoInicial = new Produto("Vape do Freitas", 600, 1.99, 60);
		Produto produto2 = new Produto("Oculos do Agostinho", 800, 1.99, 10);
		Produto produto3 = new Produto("Shaco do Marks", 1000, 1.99, 20);
		Produto produto4 = new Produto("Gol do Zanella", 100, 0.89, 50);
		Produto produto5 = new Produto("Iphone do Danilete", 500, 0.99, 0);
	

		List<Produto> produtos = Arrays.asList(produtoInicial, produto2, produto3, produto4, produto5);
		
		// Filter filter, map
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
		Predicate<Produto> superDescontao = p -> p.desconto >= 0.99;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		
		Function<Produto, String> ProdutoPromocao =
				p -> "Aproveite! " + p.nome + "por R$" + p.preco;
		
		produtos.stream()
			.filter(superDescontao)
			.filter(freteGratis)
			.filter(produtoRelevante)
			.map(ProdutoPromocao)
			.forEach(System.out::println);
	}
}
