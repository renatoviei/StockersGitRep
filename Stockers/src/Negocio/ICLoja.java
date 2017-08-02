package Negocio;

import Negocio.Beans.Loja;

public interface ICLoja {

	abstract boolean cadastarLoja(Loja loja);

	abstract Loja pesquisarLoja(String nomeEmpresa);

	abstract void deletarLoja(String nomeEmpresa);

	abstract boolean efetuarLoginLoja(String login, String senha, String nomeEmpresa);

	abstract void salvarLoja();
	
	abstract void editarLoja(String nomeResponsavel, int telefoneEmpresa, String rua, String cidade, String estado, String pais,
	int cep, int cnpj, String razaoSocial, String email, String nomeEmpresa, String senha);

}
