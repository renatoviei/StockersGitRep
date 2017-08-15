package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdmDAO implements IAdmDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	
	//consultar do BD
	public AdmEntity consultarAdm(String login) {
		EntityManager em = getEM();
		AdmEntity adm = null;
		
		adm = em.find(AdmEntity.class, login);
		
		em.close();
		emf.close();
		return adm;
	}

}
