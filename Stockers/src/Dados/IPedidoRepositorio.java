package Dados;

import Negocio.Beans.Pedido;

public interface IPedidoRepositorio {

	public void salvar();

	public boolean cadastrar(Pedido pedido);

	public boolean deletar(int id);

	public Pedido editar();

	public Pedido procurar(int id);

	public int buscarIndice(int id);

	public boolean existe(int id);
}
