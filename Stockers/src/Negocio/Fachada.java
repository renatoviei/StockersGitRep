package Negocio;

public class Fachada {

	private static Fachada instance;

	ICLoja loja;
	ICProduto produto;
	ICDistribuidor distribuidor;

	public Fachada() {

	}

	public static synchronized Fachada getInstance() {
		if (instance == null) {
			instance = new Fachada();
		}
		return instance;
	}
}
