package Dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import Negocio.Beans.Pedido;

public class PedidoRepositorio implements IPedidoRepositorio {

	private static PedidoRepositorio instanceUser;
	private List<Pedido> pedidos;

	private PedidoRepositorio() {
		this.pedidos = new ArrayList<Pedido>();
	}

	public static synchronized PedidoRepositorio getInstance() {
		if (instanceUser == null) {
			instanceUser = new PedidoRepositorio();

		} else {

		}
		return instanceUser;
	}

	public boolean cadastrar(Pedido pedido) {
		boolean resposta = true;
		if (pedido != null) {

			this.pedidos.add(pedido);

		} else {
			resposta = false;

		}

		return resposta;
	}

	@Override
	public boolean deletar(int id) {
		boolean resposta = true;

		if (existe(id)) {

			this.pedidos.remove(procurar(id));

		} else {
			resposta = false;
		}

		return resposta;
	}

	@Override
	public Pedido editar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido procurar(int id) {
		Pedido pedido = null;
		if (id != 0) {
			pedido = this.pedidos.get(buscarIndice(id));

		}
		return pedido;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	@Override
	public boolean existe(int id) {
		boolean existe = false;
		int i = this.buscarIndice(id);
		if (i != this.pedidos.size()) {
			existe = true;

		}
		return existe;
	}

	@Override
	public int buscarIndice(int id) {
		int i = 0;
		boolean resposta = false;
		while (resposta != true && i < this.pedidos.size()) {
			if (id == pedidos.get(i).getID()) {
				resposta = true;
			} else {
				i = i + 1;
			}
		}
		return i;

	}

	// Codigo destinado aos testes com aquivos, antes de implementar o banco!
	public void salvar() {

		try {
			File f = new File("");

			FileOutputStream fos = new FileOutputStream(f);

			ObjectOutputStream ous = new ObjectOutputStream(fos);

			ous.writeObject(instanceUser);

			ous.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Codigo destinado aos testes com aquivos, antes de implementar o banco!
	public static PedidoRepositorio ler() {
		PedidoRepositorio rep = null;
		try {

			File f = new File("");

			FileInputStream fis = new FileInputStream(f);

			ObjectInputStream ois = new ObjectInputStream(fis);

			Object o = ois.readObject();
			if (o != null) {
				rep = (PedidoRepositorio) o;
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rep;

	}

}
