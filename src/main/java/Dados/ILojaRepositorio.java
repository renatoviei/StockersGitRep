package Dados;

import Negocio.Beans.Loja;

public interface ILojaRepositorio {

	public void salvar();

	public boolean cadastrar(Loja loja);

	public boolean deletar(String nomeEmpresa);

	public Loja editar(String nomeResponsavel, int telefoneEmpresa, String rua, String cidade, String estado, String pais,
			int cep, int cnpj, String razaoSocial, String email, String nomeEmpresa, String senha);

	public Loja procurar(String nomeEmpresa);

	public int buscarIndice(String nomeEmpresa);

	public boolean existe(String nomeEmpresa);

}
