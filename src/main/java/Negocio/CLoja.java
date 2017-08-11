package Negocio;

import Dados.ILojaRepositorio;
import Dados.LojaRepositorio;
import Negocio.Beans.Loja;

public class CLoja implements ICLoja {
	private ILojaRepositorio repositorio;

	public CLoja() {
		this.repositorio = LojaRepositorio.getInstance();
	}

	public boolean cadastarLoja(Loja loja) {
		boolean resposta = false;
		if (loja == null) {
			System.out.println("PARAMETRO INVALIDO");
		} else {
			if (!(this.repositorio.existe(loja.getNomeEmpresa()))) {
				this.repositorio.cadastrar(loja);
				System.out.println("Loja cadastrado com sucesso! ");
				resposta = true;
			} else {
				System.out.println("ERRO! LOJA JÁ CADASTRADA. TENTE OUTRO. ");
			}
		}
		return resposta;

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