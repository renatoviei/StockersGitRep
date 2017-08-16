package dados;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Negocio.Beans.ItemProdutoEntity;

public class ItemProdutoDAO implements IItemProdutoDAO {
	private static ItemProdutoDAO instance;
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	private ItemProdutoDAO() {
		
	}
	
	public static synchronized ItemProdutoDAO getInstance() {
		if (instance == null) {
			instance = new ItemProdutoDAO();
		}
		return instance;
	}
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	public void cadastrarItemProduto(ItemProdutoEntity itemP) {
		EntityManager em = getEM();
		em.getTransaction().begin();
		
		//verifica se ainda não está no banco?
		ItemProdutoEntity sitemP = em.find(ItemProdutoEntity.class, itemP.getIdPed());
		
		if(sitemP == null) {
			//então salva
			em.persist(itemP);
		} else {
			List<ItemProdutoEntity> listaP = this.consultarItemProduto(itemP.getIdPed());
			int i = 0;
			for(ItemProdutoEntity ip : listaP) {
				if(ip.getCodProd().equals(itemP.getCodProd())) {
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
	
	public ItemProdutoEntity editarItemProduto(ItemProdutoEntity itemP) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		em.merge(itemP);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return itemP;
	}
	
	//apagar do BD
	public void apagarItemProduto(int id, String codigo) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//consultar BD
		List<ItemProdutoEntity> listaP = this.consultarItemProduto(id);
		
		for(ItemProdutoEntity ip : listaP) {
			if(ip.getCodProd().equals(codigo)) {
				em.remove(ip);
			}
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	//consultar do BD
	public List<ItemProdutoEntity> consultarItemProduto(int id) {
		List<ItemProdutoEntity> listaI = this.listarItemProduto();
		List<ItemProdutoEntity> itemP = new ArrayList<ItemProdutoEntity>();
		
		for(ItemProdutoEntity ip : listaI) {
			if(ip.getIdPed() == id) {
				itemP.add(ip);
			}
		}
		
		return itemP;
	}
	
	public List<ItemProdutoEntity> listarItemProduto() {
		EntityManager em = getEM();
		List<ItemProdutoEntity> listaI;
		
		String queryStr = "SELECT ij FROM ItemProdutoEntity ij"; //The query now changed to database independent
		
		Query query = em.createQuery(queryStr);
		listaI = query.getResultList();
		
		//System.out.println("Result Size: "+query.getResultList().size());
		
		em.close();
		emf.close();
		return listaI;
	}

}
