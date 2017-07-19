package Dados;

import Negocio.Beans.Pedido;

public interface IPedidoRepositorio {

	public void salvar();

	public Pedido cadastrar();

	public Pedido deletar();

	public Pedido editar();

	public Pedido procurar();

}
