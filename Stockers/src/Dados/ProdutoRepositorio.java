package Dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import Negocio.Beans.Produto;

public class ProdutoRepositorio implements IProdutoRepositorio {

	private static ProdutoRepositorio instanceUser;
	private List<Produto> produtos;

	private ProdutoRepositorio() {
		this.produtos = new ArrayList<Produto>();
	}

	public static synchronized ProdutoRepositorio getInstance() {
		if (instanceUser == null) {
			instanceUser = new ProdutoRepositorio();

		} else {

		}
		return instanceUser;
	}

	@Override
	public boolean cadastrar(Produto produto) {
		boolean resposta = true;
		if (produto != null) {

			this.produtos.add(produto);

		} else {
			resposta = false;

		}

		return resposta;
	}

	@Override
	public boolean deletar(String codigo) {
		boolean resposta = true;

		if (existe(codigo)) {

			this.produtos.remove(procurar(codigo));

		} else {
			resposta = false;
		}

		return resposta;
	}

	@Override
	public Produto editar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto procurar(String codigo) {
		Produto produto = null;
		if (codigo != null) {
			produto = this.produtos.get(buscarIndice(codigo));

		}
		return produto;
	}

	public List<Produto> getLojas() {
		return produtos;
	}

	@Override
	public boolean existe(String codigo) {
		boolean existe = false;
		int i = this.buscarIndice(codigo);
		if (i != this.produtos.size()) {
			existe = true;

		}
		return existe;
	}

	@Override
	public int buscarIndice(String codigo) {
		int i = 0;
		boolean resposta = false;
		while (resposta != true && i < this.produtos.size()) {
			if (codigo.equals(this.produtos.get(i).getCodigo())) {
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

	public static ProdutoRepositorio ler() {
		ProdutoRepositorio rep = null;
		try {

			File f = new File("");

			FileInputStream fis = new FileInputStream(f);

			ObjectInputStream ois = new ObjectInputStream(fis);

			Object o = ois.readObject();
			if (o != null) {
				rep = (ProdutoRepositorio) o;
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rep;

	}

}
