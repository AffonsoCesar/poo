package br.ufpb.sistemapedidos;
import java.util.ArrayList;
import java.util.List;


public class Pedido {
	
	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido> itens;
	
	public Pedido(long novoNumeroDoPedido,Cliente novoCliente){
		itens = new ArrayList<ItemDePedido>();
		this.numeroDoPedido=novoNumeroDoPedido;
		this.cliente = novoCliente;
	}

	public List<ItemDePedido> getItens(){
        return itens;
    }
    
    public void adicionaItem(ItemDePedido novoItem){
        itens.add(novoItem);
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente novoCliente) {
		this.cliente = novoCliente;
	}

	public long getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(long novoNumeroDoPedido) {
		this.numeroDoPedido = novoNumeroDoPedido;
	}
}
