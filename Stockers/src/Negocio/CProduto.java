package Negocio;

import Dados.IProdutoRepositorio;
import Dados.ProdutoRepositorio;
import Negocio.Beans.Produto;

public class CProduto implements ICProduto {
	private IProdutoRepositorio repositorio;

	public CProduto() {
		this.repositorio = ProdutoRepositorio.getInstance();
	}

	public boolean cadastarProduto(Produto produto) {
		boolean resposta = false;
		if (produto == null) {
			System.out.println("PARAMETRO INVALIDO");
		} else {
			if (!(this.repositorio.existe(produto.getCodigo()))) {
				this.repositorio.cadastrar(produto);
				System.out.println("Produto cadastrado com sucesso! ");
				resposta = true;
			} else {
				System.out.println("ERRO! PRODUTO JÁ CADASTRADO. TENTE OUTRO. ");
			}
		}
		return resposta;

	}

	public Produto pesquisarProduto(String codigo) {
		Produto produto = null;
		if (this.repositorio.procurar(codigo) == null) {
			System.out.println("Produto nao existe");
		} else {
			produto = repositorio.procurar(codigo);
		}
		return produto;

	}

	public void deletarProduto(String codigo) {
		boolean x = false;
		while (x == false) {

			Produto aux = null;

			aux = pesquisarProduto(codigo);

			if (codigo.equals(aux.getCodigo())) {
				this.repositorio.deletar(codigo);
				x = true;
				System.out.println("Produtoremovido com sucesso!");
			} else {
				System.out.println("Senha errada, digite novamente");
			}
		}

	}

	public void salvarProduto() {
		repositorio.salvar();
	}
	
	public void editarProduto(String nome, float preco, String codigo, String informacoes, String categoria, String cor,
			String tamanho) {
		repositorio.editar(nome, preco, codigo, informacoes, categoria, cor, tamanho);
	}

}
