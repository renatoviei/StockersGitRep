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
			instanceUser = new PedidoRepositorio(10);

		} else {

		}
		return instanceUser;
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean cadastrar(Pedido pedido) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Pedido editar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido procurar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int buscarIndice(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existe(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}