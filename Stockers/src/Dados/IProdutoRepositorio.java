package Dados;

import Negocio.Beans.Produto;

public interface IProdutoRepositorio {

	public void salvar();

	public boolean cadastrar(Produto produto);

	public boolean deletar(String codigo);

	public Produto editar();

	public Produto procurar(String codigo);

	public int buscarIndice(String codigo);

	public boolean existe(String codigo);

}
