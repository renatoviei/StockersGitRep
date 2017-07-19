package Dados;

import Negocio.Beans.Distribuidor;

public interface IDistribuidorRepositorio {
	
	public void salvar();
	
	public Distribuidor cadastrar();
	
	public Distribuidor deletar();
	
	public Distribuidor editar();
	
	public Distribuidor procurar();

}
