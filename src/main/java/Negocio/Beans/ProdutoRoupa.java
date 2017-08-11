package Negocio.Beans;

public class ProdutoRoupa extends Produto {

	private String tamanho;

	public ProdutoRoupa(String nome, float preco, String codigo, String informacoes, String tamanho) {
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
