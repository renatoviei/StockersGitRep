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
	public boolean cadastrar(Produto produto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(String codigo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Produto editar(String nome, float preco, String codigo, String informacoes, String categoria, String cor,
			String tamanho) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto procurar(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int buscarIndice(String codigo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existe(String codigo) {
		// TODO Auto-generated method stub
		return false;
	}

}
