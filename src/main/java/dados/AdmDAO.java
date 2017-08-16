package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Negocio.Beans.AdmEntity;

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
		emf = Persistence.createEntityManagerFactory("stockers");
		em = emf.createEntityManager();
		//emf.close();
		return em;
	}
	
	
	//consultar do BD
	public AdmEntity efetuarLogin(String login, String senha) {
		EntityManager em = getEM();
		AdmEntity adm;
		
		adm = em.find(AdmEntity.class, login);
		
		if(adm == null) {
			adm = new AdmEntity();
			adm.setLogin("vazio");
			adm.setSenha("vazio");
		} else {
			if (!adm.getSenha().equals(senha)) {
				adm.setLogin("vazio");
				adm.setSenha("vazio");
			}
		}
		
		em.close();
		emf.close();
		return adm;
	}

}
