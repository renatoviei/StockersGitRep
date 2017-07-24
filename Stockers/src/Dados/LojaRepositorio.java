package Dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Negocio.Beans.Loja;

public class LojaRepositorio implements ILojaRepositorio {

	private static LojaRepositorio instanceUser;
	private List<Loja> lojas;

	private LojaRepositorio() {
		this.lojas = new ArrayList<Loja>();
	}

	public static synchronized LojaRepositorio getInstance() {
		if (instanceUser == null) {
			instanceUser = new LojaRepositorio();

		} else {

		}
		return instanceUser;
	}

	@Override
	public boolean cadastrar(Loja loja) {
		boolean resposta = true;
		if (loja != null) {

			this.lojas.add(loja);

		} else {
			resposta = false;

		}

		return resposta;
	}

	@Override
	public boolean deletar(String nomeEmpresa) {
		boolean resposta = true;

		if (existe(nomeEmpresa)) {

			this.lojas.remove(procurar(nomeEmpresa));

		} else {
			resposta = false;
		}

		return resposta;
	}

	@Override
	public Loja editar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loja procurar(String nomeEmpresa) {
		Loja loja = null;
		if (nomeEmpresa != null) {
			loja = this.lojas.get(buscarIndice(nomeEmpresa));

		}
		return loja;
	}

	public List<Loja> getLojas() {
		return lojas;
	}

	@Override
	public boolean existe(String nomeEmpresa) {
		boolean existe = false;
		int i = this.buscarIndice(nomeEmpresa);
		if (i != this.lojas.size()) {
			existe = true;

		}
		return existe;
	}

	@Override
	public int buscarIndice(String nomeEmpresa) {
		int i = 0;
		boolean resposta = false;
		while (resposta != true && i < this.lojas.size()) {
			if (nomeEmpresa.equals(this.lojas.get(i).getNomeEmpresa())) {
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
	public static LojaRepositorio ler() {
		LojaRepositorio rep = null;
		try {

			File f = new File("");

			FileInputStream fis = new FileInputStream(f);

			ObjectInputStream ois = new ObjectInputStream(fis);

			Object o = ois.readObject();
			if (o != null) {
				rep = (LojaRepositorio) o;
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rep;

	}

}
