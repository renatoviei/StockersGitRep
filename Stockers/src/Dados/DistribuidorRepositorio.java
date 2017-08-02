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
	public void sefetuarLogin(String login, String senha) {
		// TODO Auto-generated method stub

	}

}