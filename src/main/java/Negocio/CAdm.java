package Negocio;

import dados.AdmDAO;
import dados.AdmEntity;
import dados.IAdmDAO;

public class CAdm implements ICAdm {
	
	private static CAdm instance;
	private IAdmDAO iadm;
	
	private CAdm() {
		this.iadm = AdmDAO.getInstance();
	}
	
	public static synchronized CAdm getInstance() {
		if(instance == null) {
			instance = new CAdm();
		}
		return instance;
	}
	
	public AdmEntity efetuarLoginAdm(String login, String senha) {
		return iadm.efetuarLogin(login, senha);
	}

}
