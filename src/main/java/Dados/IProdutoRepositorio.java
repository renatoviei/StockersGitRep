package Dados;

import Negocio.Beans.Produto;

public interface IProdutoRepositorio {

	public void salvar();

	public boolean cadastrar(Produto produto);

	public boolean deletar(String codigo);

	public Produto editar(String nome, float preco, String codigo, String informacoes, String categoria, String cor,
			String tamanho);

	public Produto procurar(String codigo);

	public int buscarIndice(String codigo);

	public boolean existe(String codigo);

}
