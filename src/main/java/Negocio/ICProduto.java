package Negocio;

import Negocio.Beans.Produto;

public interface ICProduto {

	abstract boolean cadastarProduto(Produto produto);

	abstract Produto pesquisarProduto(String codigo);

	abstract void deletarProduto(String codigo);

	abstract void salvarProduto();
	
	abstract void editarProduto(String nome, float preco, String codigo, String informacoes, String categoria, String cor,
			String tamanho);

}
