package dados;

import Negocio.Beans.AdmEntity;

public interface IAdmDAO {
	
	public AdmEntity efetuarLogin(String login, String senha);

}
