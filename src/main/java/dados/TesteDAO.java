package dados;

import Negocio.Beans.LojaEntity;

public class TesteDAO {
	
public static void main(String [] args) {
		
		LojaEntity le = new LojaEntity();
		LojaDAO ldao = LojaDAO.getInstanceLoja();
		
		//exemplo criando loja
		
		le.setEmail("tudo@testando.com");
		le.setLojaNomeEmpresa("Minha Empresa");
		le.setCep("2222222");
		le.setCidade("Sim Paulo");
		le.setCnpj("555iii");
		le.setEstado("PE");
		le.setNomeResponsavel("ninguem");
		le.setPais("japao");
		le.setRazaoSocial("exterminio");
		le.setRua("aquela");
		le.setSenha("senha123");
		le.setTelefoneEmpresa(11223344);
		
		ldao.cadastrarLoja(le);
		
		for(LojaEntity loja : ldao.listarLoja()) {
			System.out.println(loja.getNomeEmpresa() + " pertence a " + loja.getNomeResponsavel());
		}
		
		System.out.println("sucesso?");
			
		}

}
