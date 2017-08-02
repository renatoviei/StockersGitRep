package Negocio;

import Negocio.Beans.Loja;
import Negocio.Beans.Pedido;
import Negocio.Beans.Produto;

public class Fachada {

	private static Fachada instance;

	ICLoja loja;
	ICPedidos pedido;
	ICProduto produto;
	ICDistribuidor distribuidor;

	public Fachada() {
		this.distribuidor = new CDistribuidor();
		this.loja = new CLoja();
		this.produto = new CProduto();
		this.pedido = new CPedidos();

	}

	public static synchronized Fachada getInstance() {
		if (instance == null) {
			instance = new Fachada();
		}
		return instance;
	}

	public boolean efetuarLoginDistribuidor(String login, String senha) {
		return this.distribuidor.efetuarLoginDistribuidor(login, senha);

	}

	public void cadastarLoja(Loja loja) {
		this.loja.cadastarLoja(loja);

	}

	public Loja pesquisarLoja(String nomeEmpresa) {
		return this.loja.pesquisarLoja(nomeEmpresa);
	}

	public void deletarLoja(String nomeEmpresa) {
		this.loja.pesquisarLoja(nomeEmpresa);
	}

	public boolean efetuarLoginLoja(String login, String senha, String nomeEmpresa) {
		return this.loja.efetuarLoginLoja(login, senha, nomeEmpresa);
	}

	public void salvarLoja() {
		this.loja.salvarLoja();
	}

	public void editarLoja(String nomeResponsavel, int telefoneEmpresa, String rua, String cidade, String estado, String pais,
			int cep, int cnpj, String razaoSocial, String email, String nomeEmpresa, String senha) {
		this.loja.editarLoja(nomeResponsavel, telefoneEmpresa, rua, cidade, estado, pais, cep, cnpj, razaoSocial, email, nomeEmpresa, senha);
	}
	
	public void cadastarProduto(Produto produto) {
		this.produto.cadastarProduto(produto);
	}

	public Produto pesquisarProduto(String codigo) {
		return this.produto.pesquisarProduto(codigo);

	}

	public void deletarProduto(String nomeEmpresa) {
		this.produto.deletarProduto(nomeEmpresa);
	}

	public void salvarProduto() {
		this.produto.salvarProduto();
	}
	
	public void editarProduto(String nome, float preco, String codigo, String informacoes, String categoria, String cor,
			String tamanho) {
		this.produto.editarProduto(nome, preco, codigo, informacoes, categoria, cor, tamanho);
	}

	public void cadastarPedido(Pedido pedido) {
		this.pedido.cadastarPedido(pedido);
	}

	public Pedido pesquisarPedido(int id) {
		return this.pedido.pesquisarPedido(id);

	}

	public void deletarPedido(int id) {
		this.pedido.deletarPedido(id);
	}

	public void salvarPedido() {
		this.pedido.salvarPedido();
	}

}