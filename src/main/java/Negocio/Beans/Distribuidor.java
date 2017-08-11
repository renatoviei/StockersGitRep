package Negocio.Beans;

import java.util.ArrayList;

public class Distribuidor {

	private String login;
	private String senha;
	private ArrayList<Loja> lojasCadastradas = new ArrayList<Loja>();

	public Distribuidor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Loja> getLojasCadastradas() {
		return lojasCadastradas;
	}

	public void setLojasCadastradas(ArrayList<Loja> lojasCadastradas) {
		this.lojasCadastradas = lojasCadastradas;
	}

}
