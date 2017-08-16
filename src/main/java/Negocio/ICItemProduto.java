package Negocio;

import java.util.List;

import Negocio.Beans.ItemProdutoEntity;

public interface ICItemProduto {
	
	public void cadastrarItemProduto(ItemProdutoEntity itemP);
	public ItemProdutoEntity editarItemProduto(ItemProdutoEntity itemP);
	public void apagarItemProduto(int id, String codigo);
	public List<ItemProdutoEntity> consultarItemProduto(int id);
	public List<ItemProdutoEntity> listarItemProduto();

}
