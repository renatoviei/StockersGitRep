package GUI;

import Negocio.Fachada;
import Negocio.IFachada;
import Negocio.Beans.ProdutoEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TratadorEventoTelaMenuUsuario {
	
	@FXML
	private Button pesquisarProd;
	@FXML
	private Button ConfPedido;
	@FXML
	private TextField nomeProduto;
	@FXML
	private ListView listaCarrinho;
	@FXML
	private CheckBox ckboxGatos;
	@FXML
	private CheckBox ckboxCachorros;
	@FXML
	private ListView<ProdutoEntity> listColeiras;
	private ObservableList<ProdutoEntity> listColeirasData = FXCollections.observableArrayList();
	@FXML
	private ListView<ProdutoEntity> listRoupas;
	@FXML
	private ListView<ProdutoEntity> listAcessorios;
	@FXML
	private ListView<ProdutoEntity> listMedicamentos;
	@FXML
	private ListView<ProdutoEntity> listHigiene;
	@FXML
	private ListView<ProdutoEntity> listAlimenticios;
	
	private IFachada f = Fachada.getInstance();
	
	@FXML
	private void initialize() {
		pesquisarProd.setOnAction((event) -> {
			System.out.println("testando");
			listColeirasData.addAll(f.listarProduto());		//PEGANDO DADOS MAS NADA APARECE NA GUI (precisa dar refresh? outro show?)
			
		});
		
	}

}
