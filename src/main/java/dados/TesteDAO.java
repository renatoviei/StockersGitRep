package dados;

public class TesteDAO {
	
public static void main(String [] args) {
		
		LojaEntity le = new LojaEntity();
		LojaDAO ldao = LojaDAO.getInstanceLoja();
		
		//exemplo criando loja
		/*le.setEmail("epsilon@testando.com");
		le.setLojaNomeEmpresa("teste co");
		le.setCep("50000000");
		le.setCidade("raincife");
		le.setCnpj("333eee");
		le.setEstado("morto");
		le.setNomeResponsavel("relampago marquinhos");
		le.setPais("hasil");
		le.setRazaoSocial("sei n");
		le.setRua("no meio do nada");
		le.setSenha("123");
		le.setTelefoneEmpresa(12345678);
		
		ldao.cadastrarLoja(le);
		
		le.setEmail("nada@testando.com");
		le.setLojaNomeEmpresa("bug co");
		le.setCep("11111111");
		le.setCidade("raincife");
		le.setCnpj("444eee");
		le.setEstado("vivo");
		le.setNomeResponsavel("kenichi");
		le.setPais("manga");
		le.setRazaoSocial("lutar");
		le.setRua("ryouzanpaku");
		le.setSenha("senha123");
		le.setTelefoneEmpresa(87654321);
		
		ldao.cadastrarLoja(le);*/
		
		System.out.println(ldao.consultarLoja("bug co").getEmail());
		System.out.println(ldao.consultarLoja("teste co").getEmail());
		
		System.out.println("sucesso?");
			
		}

}
