package br.ufpb.sistemapedidos;
import java.util.List;

/**
 * Esta interface define as operações feitas no sistema
 * que controla os pedidos, itens e cadastros
 * de clientes deste sistema.
 * 
 * @author Affonso
 * 
 */

public interface InterfaceSistemaDeControle {

	/**
	 * 
	 * Cadastra um novo pedido no sistema.
	 * @param p  Pedido.
	 * 
	 */
	
	public void adicionarPedido(Pedido p);
	
	/**
	 * 
	 * Pesquisa um Pedido incluindo os produtos quando é passado o codigo do produto.
	 * @param codProduto Codigo do Produto.
	 * @return a lista com todos os itens do pedido.
	 * 
	 */

	public List<Pedido> pesquisaPedidosincluindoProduto(long codProduto);
	
	/**
	 * 
	 * Remove o pedido apartir do numero do pedido que foi passado pelo usuário.
	 * @param numPedido Numero do Pedido.
	 * 
	 */
	
	public void removePedido(long numPedido);

}
