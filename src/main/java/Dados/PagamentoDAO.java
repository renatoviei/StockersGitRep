package Dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PagamentoDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	//salvar ou atualizar no BD
	public PagamentoEntity salvarPagamento(PagamentoEntity pagamento) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//verifica se ainda não está no banco?
		if(pagamento.getCodigo() == null) {
			//então salva
			em.persist(pagamento);
		} else {	//atualiza
			pagamento = em.merge(pagamento);
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return pagamento;
	}
	
	//apagar do BD
	public void apagarPagamento(String codigo) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//consultar BD
		PagamentoEntity pagamento = em.find(PagamentoEntity.class, codigo);
		
		em.remove(pagamento);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
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
