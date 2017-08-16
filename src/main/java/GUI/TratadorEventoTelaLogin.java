package GUI;

import java.io.IOException;

import javax.swing.JOptionPane;

import Negocio.IFachada;
import Negocio.Beans.LojaEntity;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TratadorEventoTelaLogin {

	private IFachada f;
	@FXML
	private Button entrar;
	@FXML
	private TextField email;
	@FXML
	private TextField senha;

	@FXML
	private void initialize() {
		entrar.setOnAction((event) -> {
			if (f.efetuarLoginLoja(email.getText(), senha.getText()) == null) {
				JOptionPane.showMessageDialog(null, "Este login não existe");
			} else {
				TelaMenuUsuario menu = new TelaMenuUsuario();
				try {
					menu.showTelaMenuUsuarioView();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
	}
}
