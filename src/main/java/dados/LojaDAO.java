package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LojaDAO implements ILojaDAO {
	
	private static LojaDAO instanceLoja;
	private EntityManagerFactory emf;
	private EntityManager em;
	
	private LojaDAO() {
		
	}
	
	public static synchronized LojaDAO getInstanceLoja() {
		if (instanceLoja == null) {
			instanceLoja = new LojaDAO();
		}
		return instanceLoja;
	}
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	//salvar ou atualizar no BD
	public void cadastrarLoja(LojaEntity loja) {
		EntityManager em = getEM();
		
		em.getTransaction().begin();
		
		LojaEntity sloja = this.consultarLoja(loja.getEmail()); 
		
		//verifica se ainda não está no banco?
		//if(loja.getLojaEmail() == null) {
		if(sloja == null) {
			//então salva
			em.persist(loja);
		} else {	//atualiza
			System.out.println("Lancar excecao de email ja existente!");
		}
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public LojaEntity editarLoja(LojaEntity loja) {
		EntityManager em = getEM();
		em.getTransaction().begin();
		
		LojaEntity sloja = em.find(LojaEntity.class, email);
		
		if(sloja == null) {
			em.merge(loja);
		} else {
			System.out.println("Lancar excecao de email ja existente!");
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
	
	//metodo listarLoja
	
}
