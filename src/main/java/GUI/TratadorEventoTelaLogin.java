package GUI;

import java.io.IOException;

import javax.swing.JOptionPane;

import Negocio.IFachada;
import Negocio.Beans.LojaEntity;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

public class TratadorEventoTelaLogin {

	@FXML
	private Button entrar;
	@FXML
	private TextField email;
	@FXML
	private TextField senha;
	
	private IFachada f;

	@FXML
	private void initialize() {
		System.out.println(email.getText() + " tem " + senha.getText());
		entrar.setOnAction((event) -> {
			if (f.efetuarLoginLoja(email.getText(), senha.getText()).getEmail().equals("vazio")) {
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
