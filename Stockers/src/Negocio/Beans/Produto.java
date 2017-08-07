package Negocio.Beans;

public class Produto {
	private String nome;
	private float preco;
	private String codigo;
	private String informacoes;
	private String cor;
	private String tamanho;

	public Produto(String nome, float preco, String codigo, String informacoes, String cor,
			String tamanho) {
		this.codigo = codigo;
		this.cor = cor;
		this.informacoes = informacoes;
		this.nome = nome;
		this.preco = preco;
		this.tamanho = tamanho;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
