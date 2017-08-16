package Negocio;

import java.util.List;

import Negocio.Beans.AdmEntity;
import Negocio.Beans.ItemProdutoEntity;
import Negocio.Beans.LojaEntity;
import Negocio.Beans.PedidoEntity;
import Negocio.Beans.ProdutoEntity;

public class Fachada implements IFachada {
	private static Fachada instance;
	private ICAdm iadm;
	private ICLoja iloja;
	private ICProduto iproduto;
	private ICPedido ipedido;
	private ICItemProduto iitemP;
	
	private Fachada() {
		this.iadm = CAdm.getInstance();
		this.iloja = CLoja.getInstance();
		this.iproduto = CProduto.getInstance();
		this.ipedido = CPedido.getInstance();
		this.iitemP = CItemProduto.getInstance();
	}
	
	public static synchronized Fachada getInstance() {
		if (instance == null) {
			instance = new Fachada();
		}
		return instance;
	}
	
	public AdmEntity efetuarLoginAdm(String login, String senha) {
		return iadm.efetuarLoginAdm(login, senha);
	}
	
	public boolean cadastrarLoja(LojaEntity loja) {
		return iloja.cadastrarLoja(loja);
	}
	public LojaEntity editarLoja(LojaEntity loja) {
		return iloja.editarLoja(loja);
	}
	public void apagarLoja(String email) {
		iloja.apagarLoja(email);
	}
	public LojaEntity consultarLoja(String nome) {
		return iloja.consultarLoja(nome);
	}
	public List<LojaEntity> listarLoja() {
		return iloja.listarLoja();
	}
	public LojaEntity efetuarLoginLoja(String email, String senha) {
		return iloja.efetuarLoginLoja(email, senha);
	}
	
	public boolean cadastrarProduto(ProdutoEntity produto) {
		return iproduto.cadastrarProduto(produto);
	}
	public ProdutoEntity editarProduto(ProdutoEntity produto) {
		return iproduto.editarProduto(produto);
	}
	public void apagarProduto(String codigo) {
		iproduto.apagarProduto(codigo);
	}
	public ProdutoEntity consultarProduto(String nome) {
		return iproduto.consultarProduto(nome);
	}
	public List<ProdutoEntity> listarProduto() {
		return iproduto.listarProduto();
	}
	
	public boolean cadastrarPedido(PedidoEntity pedido) {
		return ipedido.cadastrarPedido(pedido);
	}
	public PedidoEntity editarPedido(PedidoEntity pedido) {
		return ipedido.editarPedido(pedido);
	}
	public PedidoEntity consultarPedido(int id) {
		return ipedido.consultarPedido(id);
	}
	public List<PedidoEntity> listarPedido() {
		return ipedido.listarPedido();
	}
	
	public boolean cadastrarItemProduto(ItemProdutoEntity itemP) {
		return iitemP.cadastrarItemProduto(itemP);
	}
	public ItemProdutoEntity editarItemProduto(ItemProdutoEntity itemP) {
		return iitemP.editarItemProduto(itemP);
	}
	public void apagarItemProduto(int id, String codigo) {
		iitemP.apagarItemProduto(id, codigo);
	}
	public List<ItemProdutoEntity> consultarItemProduto(int id) {
		return iitemP.consultarItemProduto(id);
	}
	public List<ItemProdutoEntity> listarItemProduto() {
		return iitemP.listarItemProduto();
	}

}
