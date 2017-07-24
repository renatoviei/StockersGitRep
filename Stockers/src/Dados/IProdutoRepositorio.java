package Dados;

import Negocio.Beans.Produto;

public interface IProdutoRepositorio {

	public void salvar();

	public Produto cadastrar();

	public Produto deletar();

	public Produto editar();

	public Produto procurar();

}
