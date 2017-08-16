package Negocio;

import java.util.List;

import Negocio.Beans.ProdutoEntity;

public interface ICProduto {
	
	public boolean cadastrarProduto(ProdutoEntity produto);
	public ProdutoEntity editarProduto(ProdutoEntity produto);
	public void apagarProduto(String codigo);
	public ProdutoEntity consultarProduto(String nome);
	public List<ProdutoEntity> listarProduto();

}
