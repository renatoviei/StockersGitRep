package Negocio;

import Negocio.Beans.Pedido;
import dados.IPedidoRepositorio;
import dados.PedidoRepositorio;

public class CPedidos implements ICPedidos {
	private IPedidoRepositorio repositorio;

	public CPedidos() {
		this.repositorio = PedidoRepositorio.getInstanceLoja();
	}

	public boolean cadastarPedido(Pedido pedido) {
		boolean resposta = false;
		if (pedido == null) {
			System.out.println("PARAMETRO INVALIDO");
		} else {
			if (!(this.repositorio.existe(pedido.getID()))) {
				this.repositorio.cadastrar(pedido);
				System.out.println("Pedido cadastrado com sucesso! ");
				resposta = true;
			} else {
				System.out.println("ERRO! PEDIDO JÁ CADASTRADO. TENTE OUTRO. ");
			}
		}
		return resposta;

	}

	public Pedido pesquisarPedido(int id) {
		Pedido pedido = null;
		if (this.repositorio.procurar(id) == null) {
			System.out.println("Pedido nao existe");
		} else {
			pedido = repositorio.procurar(id);
		}
		return pedido;

	}

	public void deletarPedido(int id) {
		boolean x = false;
		while (x == false) {

			Pedido aux = null;

			aux = pesquisarPedido(id);

			if (id == aux.getID()) {
				this.repositorio.deletar(id);
				x = true;
				System.out.println("Pedido removido com sucesso!");
			} else {
				System.out.println("Senha errada, digite novamente");
			}
		}

	}

	public void salvarPedido() {
		repositorio.salvar();
	}

}