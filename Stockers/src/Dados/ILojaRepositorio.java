package Dados;

import Negocio.Beans.Loja;

public interface ILojaRepositorio {

	public void salvar();

	public boolean cadastrar(Loja loja);

	public boolean deletar(String nomeEmpresa);

	public Loja editar();

	public Loja procurar(String nomeEmpresa);

	public int buscarIndice(String nomeEmpresa);

	public boolean existe(String nomeEmpresa);

}
