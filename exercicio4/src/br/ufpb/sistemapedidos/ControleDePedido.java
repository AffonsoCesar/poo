package br.ufpb.sistemapedidos;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe implementa os metodos da InterfaceSistemaDeControle, e um m�todo
 * adicional.
 * 
 * @author Affonso
 * 
 */


public class ControleDePedido implements InterfaceSistemaDeControle {
	
	List<Pedido>pedidos;
	
	/**
	 * Construtor onde est� sendo inicializada a lista de pedidos.
	 * 
	 */
	
	public ControleDePedido(){
		pedidos=new ArrayList<Pedido>();
	}
	
	/**
	 * 
	 * Cadastro de novo pedido.
	 * 
	 * @param p1 Pedido.
	 */

	@Override
	public void adicionarPedido(Pedido p1) {
		pedidos.add(p1);		
	}
	
	/**
	 * Pesquisa Pedido incluindo os produtos quando � passado o codigo do
	 * produto.
	 * 
	 * @param codProduto Codigo do Produto.
	 * @return a lista com todos os itens do pedido.
	 */

	@Override
	public List<Pedido> pesquisaPedidosincluindoProduto(long codProduto) {
			List<Pedido>ped= new ArrayList<Pedido>();
			
			for(Pedido p1 : pedidos){
				for(ItemDePedido itens:p1.getItens()){
					if(itens.getCodProduto()==codProduto){
						ped.add(p1);
					}
				}
			}
			return ped;
		}
	/**
	 * Remove o pedido apartir do numero do pedido que for passado.
	 * 
	 * @param numPedido Numero do Pedido.
	 * 
	 */
		
	

	@Override
	public void removePedido(long numPedido) {
	     for (Pedido p1: pedidos) {
	            if (p1.getNumeroDoPedido()==numPedido){
	            		pedidos.remove(numPedido);
	                System.out.println("O Pedido " + numPedido + " foi removido com sucesso!");
	            }
	            else{
	        
	        System.out.println("O Pedido " + numPedido + " n�o foi encontrado!");
	    }
	     }
		
	}

	/**
	 * Calcula a quantidade de pedidos de um Cliente cujo nome foi passado por
	 * paramentro.
	 * 
	 * @param nome Nome do Cliente.
	 * @return a quantidade de Pedidos de um certo cliente.
	 * 
	 */
	
	public int calculaQuantidadeDePedidoDoCliente(String nome){
		int quantidade=0;
		
		for(Pedido p1: pedidos){
			if(p1.getCliente().getNome().equalsIgnoreCase(nome)){
				quantidade ++;
			}
		}
	return quantidade;
	}
}