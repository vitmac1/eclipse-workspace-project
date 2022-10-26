package teste_basico;

import infra.DAO;
import modelo_basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Monitor 23", 789.98);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.incluirAtomico(produto).fechar();	
		
		System.out.println("ID do produto: " + produto.getId());
	}
}
