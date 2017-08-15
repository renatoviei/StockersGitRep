package Negocio;

import java.util.List;

import dados.AdmEntity;
import dados.ItemProdutoEntity;
import dados.LojaEntity;
import dados.PagamentoEntity;
import dados.PedidoEntity;
import dados.ProdutoEntity;

public interface IFachada {

	public AdmEntity efetuarLoginAdm(String login, String senha);
	
	public void cadastrarLoja(LojaEntity loja);
	public LojaEntity editarLoja(LojaEntity loja);
	public void apagarLoja(String email);
	public LojaEntity consultarLoja(String nome);
	public List<LojaEntity> listarLoja();
	public LojaEntity efetuarLoginLoja(String email, String senha);
	
	public void cadastrarProduto(ProdutoEntity produto);
	public ProdutoEntity editarProduto(ProdutoEntity produto);
	public void apagarProduto(String codigo);
	public ProdutoEntity consultarProduto(String nome);
	public List<ProdutoEntity> listarProduto();
	
	public void cadastrarPedido(PedidoEntity pedido);
	public PedidoEntity editarPedido(PedidoEntity pedido);
	public PedidoEntity consultarPedido(int id);
	public List<PedidoEntity> listarPedido();
	
	public void cadastrarPagamento(PagamentoEntity pagamento);
	public PagamentoEntity editarPagamento(PagamentoEntity pagamento);
	public PagamentoEntity consultarPagamento(String codigo);
	
	public void cadastrarItemProduto(ItemProdutoEntity itemP);
	public ItemProdutoEntity editarItemProduto(ItemProdutoEntity itemP);
	public void apagarItemProduto(int id, String codigo);
	public List<ItemProdutoEntity> consultarItemProduto(int id);
	public List<ItemProdutoEntity> listarItemProduto();

}