package dados;

import java.util.List;

public interface IItem_produtoDAO {
	
	public void cadastrarItem_produto(Item_produtoEntity itemP);
	public Item_produtoEntity editarItem_produto(Item_produtoEntity itemP);
	public void apagarItem_produto(int id, String codigo);
	public List<Item_produtoEntity> consultarItem_produto(int id);
	public List<Item_produtoEntity> listarItem_produto();

}
