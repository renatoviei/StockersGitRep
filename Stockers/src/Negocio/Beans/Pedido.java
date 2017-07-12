package Negocio.Beans;

public class Pedido {
	private Loja loja;
	private Produto produto;
	private int quantidade;
	private int valor;
	private String observacao;
	private int ID;

	public Pedido() {

	}

	public Loja getLoja() {
		return loja;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public int getValor() {
		return valor;
	}

	public String getObservacao() {
		return observacao;
	}

	public int getID() {
		return ID;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
