package Dados;

import Negocio.Beans.Loja;

public interface ILojaRepositorio {

	public void salvar();

	public Loja cadastrar();

	public Loja deletar();

	public Loja editar();

	public Loja procurar();

}
