package dados;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Item_produtoDAO implements IItem_produtoDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	public void cadastrarItem_produto(Item_produtoEntity itemP) {
		EntityManager em = getEM();
		em.getTransaction().begin();
		
		//verifica se ainda não está no banco?
		Item_produtoEntity sitemP = em.find(Item_produtoEntity.class, itemP.getIdPed());
		
		if(sitemP == null) {
			//então salva
			em.persist(itemP);
		} else {
			List<Item_produtoEntity> listaP = this.consultarItem_produto(itemP.getIdPed());
			int i = 0;
			for(Item_produtoEntity ip : listaP) {
				if(ip.getCodProd() == itemP.getCodProd()) {
					i = 1;
				}
			}
			if(i == 0) {
				em.persist(itemP);
			} else {
				System.out.println("Lancar excecao de produto ja existente no pedido");
			}
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public Item_produtoEntity editarItem_produto(Item_produtoEntity itemP) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		em.merge(itemP);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return itemP;
	}
	
	//apagar do BD
	public void apagarItem_produto(int id, String codigo) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//consultar BD
		List<Item_produtoEntity> listaP = this.consultarItem_produto(id);
		
		for(Item_produtoEntity ip : listaP) {
			if(ip.getCodProd() == codigo) {
				em.remove(ip);
			}
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	//consultar do BD
	public List<Item_produtoEntity> consultarItem_produto(int id) {
		List<Item_produtoEntity> listaI = this.listarItem_produto();
		List<Item_produtoEntity> itemP = new ArrayList<Item_produtoEntity>();
		
		for(Item_produtoEntity ip : listaI) {
			if(ip.getIdPed() == id) {
				itemP.add(ip);
			}
		}
		
		return itemP;
	}
	
	public List<Item_produtoEntity> listarItem_produto() {
		EntityManager em = getEM();
		List<Item_produtoEntity> listaI;
		
		String queryStr = "select * from stockers.item_produto"; //The query now changed to database independent
		Query query = em.createQuery(queryStr);
		listaI = query.getResultList();
		
		//System.out.println("Result Size: "+query.getResultList().size());
		
		em.close();
		emf.close();
		return listaI;
	}

}
