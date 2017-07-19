package Negocio;

public class Fachada {

	private static Fachada instance;

	ICLoja loja;
	ICPedidos pedido;
	ICProduto produto;
	ICDistribuidor distribuidor;

	public Fachada() {
		this.distribuidor = new CDistribuidor();
		this.loja = new CLoja();
		this.produto = new CProduto();
		this.pedido = new CPedidos();

	}

	public static synchronized Fachada getInstance() {
		if (instance == null) {
			instance = new Fachada();
		}
		return instance;
	}
}
