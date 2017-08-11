package Dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LojaDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	//salvar ou atualizar no BD
	public LojaEntity salvarLoja(LojaEntity loja) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//verifica se ainda não está no banco?
		if(loja.getLojaEmail() == null) {
			//então salva
			em.persist(loja);
		} else {	//atualiza
			loja = em.merge(loja);
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		return loja;
	}
	
	//apagar do BD
	public void apagarLoja(String email) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		//consultar BD
		LojaEntity loja = em.find(LojaEntity.class, email);
		
		em.remove(loja);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	//consultar do BD
	public LojaEntity consultarLoja(String email) {
		EntityManager em = getEM();
		LojaEntity loja = null;
		
		loja = em.find(LojaEntity.class, email);
		
		em.close();
		emf.close();
		return loja;
	}
	
	
}
