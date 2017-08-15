package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PagamentoDAO implements IPagamentoDAO {
	private static PagamentoDAO instance;
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	private PagamentoDAO() {
		
	}
	
	public static synchronized PagamentoDAO getInstance() {
		if (instance == null) {
			instance = new PagamentoDAO();
		}
		return instance;
	}
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	public void cadastrarPagamento(PagamentoEntity pagamento) {
		EntityManager em = getEM();
		em.getTransaction().begin();
		
		//verifica se ainda não está no banco?
		PagamentoEntity spagamento = em.find(PagamentoEntity.class, pagamento.getCodigo());
		
		if(spagamento == null) {
			//então salva
			em.persist(pagamento);
		} else {
			System.out.println("Lancar excecao de pagamento ja existente!");
		}
				
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public PagamentoEntity editarPagamento(PagamentoEntity pagamento) {
		EntityManager em = getEM();
		em.getTransaction().begin();
		
		em.merge(pagamento);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return pagamento;
	}
	
	//apagar do BD
	/*public void apagarPagamento(String codigo) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//consultar BD
		PagamentoEntity pagamento = em.find(PagamentoEntity.class, codigo);
		
		em.remove(pagamento);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}*/
	
	//consultar do BD
	public PagamentoEntity consultarPagamento(String codigo) {
		EntityManager em = getEM();
		PagamentoEntity pagamento = null;
		
		pagamento = em.find(PagamentoEntity.class, codigo);
		
		em.close();
		emf.close();
		return pagamento;
	}

}
