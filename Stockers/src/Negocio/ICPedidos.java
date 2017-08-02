package Negocio;

import Negocio.Beans.Pedido;

public interface ICPedidos {

	abstract boolean cadastarPedido(Pedido pedido);

	abstract Pedido pesquisarPedido(int id);

	abstract void deletarPedido(int id);

	abstract void salvarPedido();

}