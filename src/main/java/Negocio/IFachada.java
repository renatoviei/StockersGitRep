package Negocio;

import Negocio.Beans.Loja;
import Negocio.Beans.Pedido;
import Negocio.Beans.Produto;

public interface IFachada {

	abstract boolean efetuarLoginDistribuidor(String login, String senha);

	abstract void cadastarLoja(Loja loja);

	abstract Loja pesquisarLoja(String nomeEmpresa);

	abstract void deletarLoja(String nomeEmpresa);

	abstract boolean efetuarLoginLoja(String login, String senha, String nomeEmpresa);

	abstract void salvarLoja();
	
	abstract void editarLoja(String nomeResponsavel, int telefoneEmpresa, String rua, String cidade, String estado, String pais,
			int cep, int cnpj, String razaoSocial, String email, String nomeEmpresa, String senha);

	abstract void cadastarProduto(Loja loja);

	abstract Produto pesquisarProduto(String codigo);

	abstract void deletarProduto(String nomeEmpresa);

	abstract void salvarProduto();
	
	abstract void editarProduto(String nome, float preco, String codigo, String informacoes, String categoria, String cor,
			String tamanho);

	abstract void cadastarPedido(Loja loja);

	abstract Pedido pesquisarPedido(int id);

	abstract void deletarPedido(String nomeEmpresa);

	abstract void salvarPedido();

}