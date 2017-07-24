package Dados;

import Negocio.Beans.Loja;

public class LojaRepositorio implements ILojaRepositorio {

	private static LojaRepositorio instanceUser;
	private Loja[] lojas;
	private int next;

	private LojaRepositorio(int tamanho) {
		this.lojas = new Loja[tamanho];
		this.next = 0;
	}

	public static synchronized LojaRepositorio getInstance() {
		if (instanceUser == null) {
			instanceUser = new LojaRepositorio(10);

		} else {

		}
		return instanceUser;
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Loja cadastrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loja deletar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loja editar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loja procurar() {
		// TODO Auto-generated method stub
		return null;
	}

}
