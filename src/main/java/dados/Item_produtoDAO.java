package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Item_produtoDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	//salvar ou atualizar no BD
	public Item_produtoEntity salvarItem_produto(Item_produtoEntity item_produto) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//verifica se ainda não está no banco?
		if((item_produto.getCodProd() == null) && (item_produto.getIdPed() == 0)) {
			//então salva
			em.persist(item_produto);
		} else {	//atualiza
			item_produto = em.merge(item_produto);
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return item_produto;
	}
	
	//apagar do BD
	public void apagarItem_produto(int id, String codigo) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//consultar BD
		Item_produtoEntity item_produto = em.find(LojaEntity.class, id, codigo);
		
		em.remove(item_produto);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	//consultar do BD
	public Item_produtoEntity consultarItem_produto(int id, String codigo) {
		EntityManager em = getEM();
		Item_produtoEntity item_produto = null;
		
		item_produto = em.find(Item_produtoEntity.class, id, codigo);
		
		em.close();
		emf.close();
		return item_produto;
	}

}
