package Negocio.Beans;

public class ProdutoAlimento extends Produto {

	private String tamanho;

	public ProdutoAlimento(String nome, float preco, String codigo, String informacoes, String tamanho) {
		super(nome, preco, codigo, informacoes);
		// TODO Auto-generated constructor stub

		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
