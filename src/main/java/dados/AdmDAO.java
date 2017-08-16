package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdmDAO implements IAdmDAO {
	
	private static AdmDAO instance;
	private EntityManagerFactory emf;
	private EntityManager em;
	
	private AdmDAO() {
		
	}
	
	public static synchronized AdmDAO getInstance() {
		if(instance == null) {
			instance = new AdmDAO();
		}
		return instance;
	}
	
	public EntityManager getEM(){
		emf = Persistence.createEntityManagerFactory("Stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	
	//consultar do BD
	public AdmEntity efetuarLogin(String login, String senha) {
		EntityManager em = getEM();
		AdmEntity adm = null;
		
		adm = em.find(AdmEntity.class, login);
		
		if(!adm.getSenha().equals(senha))
			adm = null;
		
		em.close();
		emf.close();
		return adm;
	}

}
