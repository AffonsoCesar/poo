package br.ufpb.sistemapedidos;
public class ItemDePedido {
	
	private int quantidade;
	private long codProduto;
	private double valorUnitario;
	
	public ItemDePedido(int quanti,long codi, double valor){
		this.quantidade=quanti;
		this.codProduto=codi;
		this.valorUnitario=valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int novaQuantidade) {
		this.quantidade = novaQuantidade;
	}

	public long getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(long novoCodProduto) {
		this.codProduto = novoCodProduto;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double novoValorUnitario) {
		this.valorUnitario = novoValorUnitario;
	}

}