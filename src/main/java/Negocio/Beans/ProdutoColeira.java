package Negocio.Beans;

public class ProdutoColeira extends Produto {

	private String tamanho;

	public ProdutoColeira(String nome, float preco, String codigo, String informacoes, String tamanho) {
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
