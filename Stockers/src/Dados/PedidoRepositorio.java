package Dados;

import Negocio.Beans.Pedido;

public class PedidoRepositorio implements IPedidoRepositorio {

	private static PedidoRepositorio instanceUser;
	private Pedido[] pedidos;
	private int next;

	private PedidoRepositorio(int tamanho) {
		this.pedidos = new Pedido[tamanho];
		this.next = 0;
	}

	public static synchronized PedidoRepositorio getInstance() {
		if (instanceUser == null) {
			new PedidoRepositorio(10);

		} else {

		}
		return instanceUser;
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Pedido cadastrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido deletar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido editar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido procurar() {
		// TODO Auto-generated method stub
		return null;
	}

}
