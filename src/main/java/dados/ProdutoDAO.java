package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdutoDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	//salvar ou atualizar no BD
	public ProdutoEntity salvarProduto(ProdutoEntity produto) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//verifica se ainda não está no banco?
		if(produto.getCodigo() == null) {
			//então salva
			em.persist(produto);
		} else {	//atualiza
			produto = em.merge(produto);
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return produto;
	}
	
	//apagar do BD
	public void apagarProduto(String codigo) {
		EntityManager em = getEM();
			
		em.getTransaction().begin();
		
		//consultar BD
		ProdutoEntity produto = em.find(ProdutoEntity.class, codigo);
		
		em.remove(produto);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	//consultar do BD
	public ProdutoEntity consultarProduto(String codigo) {
		EntityManager em = getEM();
		ProdutoEntity produto = null;
		
		produto = em.find(ProdutoEntity.class, codigo);
		
		em.close();
		emf.close();
		return produto;
	}

}
