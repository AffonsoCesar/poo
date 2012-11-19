
public class Main {
	public static void main (String[]args){
	

	int quantidade=0;
	
	Cliente cliente = new Cliente("Affonso");       
	ControleDePedido c1pedido = new ControleDePedido();
	
    		Pedido p = new Pedido(1, cliente);
    		ItemDePedido lapis = new ItemDePedido(1,12,1.50);
    		p.adicionaItem(lapis);
    		c1pedido.adicionarPedido(p);
    
    		Pedido p2 = new Pedido(2, cliente);
    		ItemDePedido livro = new ItemDePedido(2,12345, 25.0);    
    		p2.adicionaItem(livro);
    		c1pedido.adicionarPedido(p2);
    
    		quantidade=c1pedido.calculaQuantidadeDePedidoDoCliente("Affonso");
    
    	if(quantidade == 2) {
    		System.out.println("Programa Correto");
    	}
	else{
    		System.out.println("Programa Incorreto");
    	
    }
  }
}
