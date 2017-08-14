package dados;

import javax.persistence.EntityManager;

public interface ILojaDAO {
	
	public EntityManager getEM();
	public void cadastrarLoja(LojaEntity loja);
	public LojaEntity editarLoja(LojaEntity loja);
	public void apagarLoja(String email);
	public LojaEntity consultarLoja(String nome);

}
