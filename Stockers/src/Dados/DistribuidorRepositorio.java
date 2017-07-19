package Dados;

import Negocio.Beans.Distribuidor;

public class DistribuidorRepositorio implements IDistribuidorRepositorio {

	private static DistribuidorRepositorio instanceUser;
	private Distribuidor[] distribuidores;
	private int next;

	private DistribuidorRepositorio(int tamanho) {
		this.distribuidores = new Distribuidor[tamanho];
		this.next = 0;
	}

	public static synchronized DistribuidorRepositorio getInstance() {
		if (instanceUser == null) {
			new DistribuidorRepositorio(10);

		} else {

		}
		return instanceUser;
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Distribuidor cadastrar() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public Distribuidor deletar() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public Distribuidor editar() {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public Distribuidor procurar() {
		// TODO Auto-generated method stub

		return null;
	}

}
