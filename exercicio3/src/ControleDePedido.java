import java.util.ArrayList;
import java.util.List;


public class ControleDePedido implements InterfaceSistemaDeControle {
	
	List<Pedido>pedidos;
	
	public ControleDePedido(){
		pedidos=new ArrayList<Pedido>();
	}

	@Override
	public void adicionarPedido(Pedido p1) {
		pedidos.add(p1);		
	}

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
		
	

	@Override
	public void removePedido(long numPedido) {
	     for (Pedido p1: pedidos) {
	            if (p1.getNumeroDoPedido()==numPedido){
	            		pedidos.remove(numPedido);
	                System.out.println("O Pedido " + numPedido + " foi removido com sucesso!");
	            }
	            else{
	        
	        System.out.println("O Pedido " + numPedido + " não foi encontrado!");
	    }
	     }
		
	}
	
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