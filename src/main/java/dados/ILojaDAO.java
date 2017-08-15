package dados;

import java.util.List;

public interface ILojaDAO {
	
	public void cadastrarLoja(LojaEntity loja);
	public LojaEntity editarLoja(LojaEntity loja);
	public void apagarLoja(String email);
	public LojaEntity consultarLoja(String nome);
	public List<LojaEntity> listarLoja();

}
