package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Negocio.Beans.PedidoEntity;

public class PedidoDAO implements IPedidoDAO {
	private static PedidoDAO instance;
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	private PedidoDAO() {
		
	}
	
	public static synchronized PedidoDAO getInstance() {
		if (instance == null) {
			instance = new PedidoDAO();
		}
		return instance;
	}
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	public boolean cadastrarPedido(PedidoEntity pedido) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		boolean retorno = false;
		
		//verifica se ainda não está no banco?
		PedidoEntity spedido = em.find(PedidoEntity.class, pedido.getId());
		
		if(spedido == null) {
			//então salva
			em.persist(pedido);
			retorno = true;
		} else {
			System.out.println("Lancar excecao de pedido ja existente!");
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return retorno;
	}
	
	public PedidoEntity editarPedido(PedidoEntity pedido) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		em.merge(pedido);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return pedido;
	}
	
	//apagar do BD
	/*public void apagarPedido(int id) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//consultar BD
		PedidoEntity pedido = em.find(PedidoEntity.class, id);
		
		em.remove(pedido);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}*/
	
	//consultar do BD
	public PedidoEntity consultarPedido(int id) {
		EntityManager em = getEM();
		PedidoEntity pedido = null;
		
		pedido = em.find(PedidoEntity.class, id);
		
		em.close();
		emf.close();
		return pedido;
	}
	
	public List<PedidoEntity> listarPedido() {
		EntityManager em = getEM();
		
		List<PedidoEntity> listaP;
		
		String queryStr = "SELECT pj FROM PedidoEntity pj"; //The query now changed to database independent
		
		Query query = em.createQuery(queryStr);
		listaP = query.getResultList();
		
		//System.out.println("Result Size: "+query.getResultList().size());
		
		em.close();
		emf.close();
		return listaP;
	}
	
}
