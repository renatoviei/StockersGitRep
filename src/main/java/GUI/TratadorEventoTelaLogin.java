package GUI;

import java.io.IOException;

import javax.swing.JOptionPane;

import Negocio.Fachada;
import Negocio.IFachada;
import Negocio.Beans.AdmEntity;
import Negocio.Beans.LojaEntity;
import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class TratadorEventoTelaLogin {

	@FXML
	private Button entrar;
	@FXML
	private TextField email;
	@FXML
	private TextField senha;

	private IFachada f = Fachada.getInstance();

	@FXML
	private void initialize() {
		entrar.setOnAction((event) -> {
			LojaEntity loja = f.efetuarLoginLoja(email.getText(), senha.getText());
			if (loja.getEmail().equals("vazio")) {
			} else {
				TelaMenuUsuario tela = new TelaMenuUsuario(loja);
				Stage stage = new Stage();
				try {
					tela.start(stage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				((Node)(event.getSource())).getScene().getWindow().hide();
			}
			
			AdmEntity adm = f.efetuarLoginAdm(email.getText(), senha.getText());
			if (adm.getLogin().equals("vazio")) {
				JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
			} else {
				TelaMenuAdm tela = new TelaMenuAdm(adm);
				Stage stage = new Stage();
				try {
					tela.start(stage);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				((Node)(event.getSource())).getScene().getWindow().hide();
			}
			
		});
	}
}
