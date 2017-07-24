package Dados;

import Negocio.Beans.Produto;

public class ProdutoRepositorio implements IProdutoRepositorio {

	private static ProdutoRepositorio instanceUser;
	private Produto[] produtos;
	private int next;

	private ProdutoRepositorio(int tamanho) {
		this.produtos = new Produto[tamanho];
		this.next = 0;
	}

	public static synchronized ProdutoRepositorio getInstance() {
		if (instanceUser == null) {
			instanceUser = new ProdutoRepositorio(10);

		} else {

		}
		return instanceUser;
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub

	}

	@Override
	public Produto cadastrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto deletar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto editar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto procurar() {
		// TODO Auto-generated method stub
		return null;
	}

}
