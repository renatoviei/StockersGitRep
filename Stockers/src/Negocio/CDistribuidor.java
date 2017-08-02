package Negocio;

public class CDistribuidor implements ICDistribuidor {

	public boolean efetuarLoginDistribuidor(String login, String senha) {
		boolean logado = false;
		
		//POSSIVEL LOGIN E SENHA PARA TESTES
		
		if (login.equals("Stockers") && senha.equals("vamolol123")) {

			logado = true;
			System.out.println("Login realizado com sucesso!");
		} else {
			System.out.println("LOGIN NÃO REALIZADO. CONTA NAO EXISTE!");
		}
		return logado;

	}

}
