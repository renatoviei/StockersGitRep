package Negocio;

import java.util.List;

import dados.LojaEntity;

public interface ICLoja {

	public void cadastrarLoja(LojaEntity loja);
	public LojaEntity editarLoja(LojaEntity loja);
	public void apagarLoja(String email);
	public LojaEntity consultarLoja(String nome);
	public List<LojaEntity> listarLoja();
	public LojaEntity efetuarLoginLoja(String email, String senha);

}
