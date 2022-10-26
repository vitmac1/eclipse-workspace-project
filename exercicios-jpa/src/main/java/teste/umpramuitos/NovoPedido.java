package teste.umpramuitos;

import infra.DAO;

import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;
import modelo_basico.Produto;


public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira", 2789.99);
		ItemPedido itemPedido = new ItemPedido(pedido, produto, 10);
		
		dao.abrirT()
			.incluir(produto)	
			.incluir(pedido)
			.incluir(itemPedido)
			.fecharT()
			.fechar();
	}
}
