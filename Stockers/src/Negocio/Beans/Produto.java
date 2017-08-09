package Negocio.Beans;

public class Produto {

	private String nome;
	private float preco;
	private String codigo;
	private String informacoes;

	public Produto(String nome, float preco, String codigo, String informacoes) {
		this.codigo = codigo;
		this.informacoes = informacoes;
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}
}
