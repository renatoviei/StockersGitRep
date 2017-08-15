package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProdutoDAO implements IProdutoDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	public void cadastrarProduto(ProdutoEntity produto) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//verifica se ainda não está no banco?
		ProdutoEntity sproduto = em.find(ProdutoEntity.class, produto.getCodigo());
		
		if(sproduto == null) {
			//então salva
			em.persist(produto);
		} else {
			System.out.println("Lancar excecao de produto ja existente!");
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public ProdutoEntity editarProduto(ProdutoEntity produto) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		em.merge(produto);
		
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
	public ProdutoEntity consultarProduto(String nome) {
		List<ProdutoEntity> listaP = this.listarProduto();
		ProdutoEntity produto = null;
		
		for(ProdutoEntity p : listaP) {
			if(p.getNome() == nome) {
				produto = p;
			}
		}
		
		return produto;
	}
	
	public List<ProdutoEntity> listarProduto() {
		EntityManager em = getEM();
		
		List<ProdutoEntity> listaP;
		
		String queryStr = "select * from stockers.produto"; //The query now changed to database independent
		Query query = em.createQuery(queryStr);
		listaP = query.getResultList();
		
		//System.out.println("Result Size: "+query.getResultList().size());
		
		em.close();
		emf.close();
		return listaP;
	}

}
