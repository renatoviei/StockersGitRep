package Negocio.Beans;

public class ProdutoAlimento extends Produto {

	private String tamanho;

	public ProdutoAlimento(String nome, float preco, String codigo, String informacoes, int flag) {
		super(nome, preco, codigo, informacoes, flag);
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
