package Negocio;

import java.util.List;

import Negocio.Beans.ProdutoEntity;
import dados.IProdutoDAO;
import dados.ProdutoDAO;

public class CProduto implements ICProduto {
	private static CProduto instance;
	private IProdutoDAO iproduto;
	
	private CProduto() {
		this.iproduto = ProdutoDAO.getInstance();
	}
	
	public static synchronized CProduto getInstance() {
		if (instance == null) {
			instance = new CProduto();
		}
		return instance;
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

}
