package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PedidoDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	//salvar ou atualizar no BD
	public PedidoEntity salvarPedido(PedidoEntity pedido) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//verifica se ainda não está no banco?
		if(pedido.getId() == 0) {
			//então salva
			em.persist(pedido);
		} else {	//atualiza
			pedido = em.merge(pedido);
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return pedido;
	}
	
	//apagar do BD
	public void apagarPedido(int id) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//consultar BD
		PedidoEntity pedido = em.find(PedidoEntity.class, id);
		
		em.remove(pedido);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	//consultar do BD
	public PedidoEntity consultarPedido(int id) {
		EntityManager em = getEM();
		PedidoEntity pedido = null;
		
		pedido = em.find(PedidoEntity.class, id);
		
		em.close();
		emf.close();
		return pedido;
	}
	
}
