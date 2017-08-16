package dados;

import java.util.List;

import Negocio.Beans.LojaEntity;

public interface ILojaDAO {
	
	public boolean cadastrarLoja(LojaEntity loja);
	public LojaEntity editarLoja(LojaEntity loja);
	public void apagarLoja(String email);
	public LojaEntity consultarLoja(String nome);
	public List<LojaEntity> listarLoja();
	public LojaEntity efetuarLogin(String email, String senha);

}
