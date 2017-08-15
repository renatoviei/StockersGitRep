package Negocio;

import java.util.List;

import dados.PedidoEntity;

public interface ICPedido {

	public void cadastrarPedido(PedidoEntity pedido);
	public PedidoEntity editarPedido(PedidoEntity pedido);
	public PedidoEntity consultarPedido(int id);
	public List<PedidoEntity> listarPedido();

}