package Negocio.Beans;

public class ProdutoAcessorio extends Produto {

	private String tipo;

	public ProdutoAcessorio(String nome, float preco, String codigo, String informacoes, String tipo) {
		super(nome, preco, codigo, informacoes);
		// TODO Auto-generated constructor stub

		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
