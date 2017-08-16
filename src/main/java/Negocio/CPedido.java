package Negocio;

import java.util.List;

import Negocio.Beans.PedidoEntity;
import dados.IPedidoDAO;
import dados.PedidoDAO;

public class CPedido implements ICPedido {
	private static CPedido instance;
	private IPedidoDAO ipedido;
	
	private CPedido() {
		this.ipedido = PedidoDAO.getInstance();
	}
	
	public static synchronized CPedido getInstance() {
		if (instance == null) {
			instance = new CPedido();
		}
		return instance;
	}
	
	public void cadastrarPedido(PedidoEntity pedido) {
		ipedido.cadastrarPedido(pedido);
	}
	
	public PedidoEntity editarPedido(PedidoEntity pedido) {
		return ipedido.editarPedido(pedido);
	}
	
	public PedidoEntity consultarPedido(int id) {
		return ipedido.consultarPedido(id);
	}
	
	public List<PedidoEntity> listarPedido() {
		return ipedido.listarPedido();
	}

}
