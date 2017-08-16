package Negocio;

import java.util.List;

import Negocio.Beans.LojaEntity;
import dados.ILojaDAO;
import dados.LojaDAO;


public class CLoja implements ICLoja {
	
	private static CLoja instance;
	private ILojaDAO iloja;

	private CLoja() {
		this.iloja = LojaDAO.getInstanceLoja();
	}
	
	public static synchronized CLoja getInstance() {
		if (instance == null) {
			instance = new CLoja();
		}
		return instance;
	}
	
	public void cadastrarLoja(LojaEntity loja) {
		iloja.cadastrarLoja(loja);
	}
	
	public LojaEntity editarLoja(LojaEntity loja) {
		return iloja.editarLoja(loja);
	}
	
	public void apagarLoja(String email) {
		iloja.apagarLoja(email);
	}
	
	public LojaEntity consultarLoja(String nome) {
		return iloja.consultarLoja(nome);
	}
	
	public List<LojaEntity> listarLoja() {
		return iloja.listarLoja();
	}
	
	public LojaEntity efetuarLoginLoja(String email, String senha) {
		return iloja.efetuarLogin(email, senha);
	}

}