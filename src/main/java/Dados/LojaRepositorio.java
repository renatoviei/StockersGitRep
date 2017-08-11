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
	public boolean cadastrar(Loja loja) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(String nomeEmpresa) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Loja editar(String nomeResponsavel, int telefoneEmpresa, String rua, String cidade, String estado, String pais,
			int cep, int cnpj, String razaoSocial, String email, String nomeEmpresa, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loja procurar(String nomeEmpresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int buscarIndice(String nomeEmpresa) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existe(String nomeEmpresa) {
		// TODO Auto-generated method stub
		return false;
	}

}
