package Negocio;

import Negocio.Beans.Loja;
import dados.ILojaDAO;
import dados.LojaDAO;
import dados.LojaEntity;


public class CLoja implements ICLoja {
	
	private static CLoja instanceLoja;
	private ILojaDAO lojaR;

	private CLoja() {
		this.loja = LojaDAO.getInstanceLoja();
	}
	
	public static synchronized CLoja getInstance() {
		if (instanceLoja == null) {
			instanceLoja = new CLoja();
		}
		return instanceLoja;
	}

	public void cadastarLoja(LojaEntity loja) {
		lojaR.cadastrarLoja(loja);
	}
	
	public LojaEntity editarLoja(LojaEntity loja) {
		lojaR.editarLoja(loja);
		return loja;
	}
	
	public void apagarLoja(String email) {
		lojaR.apagarLoja(email);
	}
	
	public LojaEntity consultarLoja(String nome) {
		LojaEntity loja;
		loja = lojaR.consultarLoja(nome);
		return loja;
	}

	public Loja pesquisarLoja(String nomeEmpresa) {
		Loja loja = null;
		if (this.repositorio.procurar(nomeEmpresa) == null) {
			System.out.println("Loja nao existe");
		} else {
			loja = repositorio.procurar(nomeEmpresa);
		}
		return loja;
	}

	public void deletarLoja(String nomeEmpresa) {
		boolean x = false;
		while (x == false) {

			Loja aux = null;

			aux = pesquisarLoja(nomeEmpresa);

			if (nomeEmpresa.equals(aux.getNomeEmpresa())) {
				this.repositorio.deletar(nomeEmpresa);
				x = true;
				System.out.println("Loja removida com sucesso!");
			} else {
				System.out.println("Senha errada, digite novamente");
			}
		}

	}

	public boolean efetuarLoginLoja(String login, String senha, String nomeEmpresa) {
		boolean logado = false;
		if (repositorio.existe(login) && repositorio.procurar(nomeEmpresa).getSenha().equals(senha)) {

			logado = true;
			System.out.println("Login realizado com sucesso!");
		} else {
			System.out.println("LOGIN NÃO REALIZADO. CONTA NAO EXISTE!");
		}
		return logado;
	}

	public void salvarLoja() {
		repositorio.salvar();
	}
	
	public void editarLoja(String nomeResponsavel, int telefoneEmpresa, String rua, String cidade, String estado, String pais,
			int cep, int cnpj, String razaoSocial, String email, String nomeEmpresa, String senha) {
		repositorio.editar(nomeResponsavel, telefoneEmpresa, rua, cidade, estado, pais, cep, cnpj, razaoSocial, email, nomeEmpresa, senha);
	}


}