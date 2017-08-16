package GUI;

import java.io.IOException;

import javax.swing.JOptionPane;

import Negocio.Fachada;
import Negocio.IFachada;
import Negocio.Beans.AdmEntity;
import Negocio.Beans.LojaEntity;
import Negocio.Beans.PedidoEntity;
import Negocio.Beans.ProdutoEntity;
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

public class TratadorEventoTelaMenuAdm {
	
	@FXML
	private TextField nomeLoja;
	
	@FXML
	private ListView<LojaEntity> lojas;
	private ObservableList<LojaEntity> lojaViewData = FXCollections.observableArrayList();
	
	@FXML
	private TextField nomeProduto;
	
	@FXML
	private ListView<ProdutoEntity> produtos;
	private ObservableList<ProdutoEntity> produtoViewData = FXCollections.observableArrayList();
	
	@FXML
	private TextField idPedido;
	
	@FXML
	private ListView<PedidoEntity> pedidos;
	private ObservableList<PedidoEntity> pedidoViewData = FXCollections.observableArrayList();
	
	@FXML
	private Button pesquisarLoja;
	
	@FXML
	private Button todasLojas;
	
	@FXML
	private Button removerLoja;
	
	@FXML
	private Button pesquisarProduto;
	
	@FXML
	private Button todosProdutos;
	
	@FXML
	private Button cadastrarProduto;
	
	@FXML
	private Button removerProduto;
	
	@FXML
	private Button pesquisarPedido;
	
	@FXML
	private Button todosPedidos;
	
	@FXML
	private Button removerPedido;
	
	private IFachada f = Fachada.getInstance();
	
	@FXML
	public void initialize() {
		pesquisarLoja.setOnAction((event) -> {
			LojaEntity lj = f.consultarLoja(nomeLoja.getText());
			lojaViewData.add(lj);
		});
		todasLojas.setOnAction((event) -> {
			for (LojaEntity lj : f.listarLoja()) {
				lojaViewData.add(lj);
			}
		});
		removerLoja.setOnAction((event) -> {
			
		});
		
		pesquisarProduto.setOnAction((event) -> {
			
		});
		todosProdutos.setOnAction((event) -> {
			
		});
		cadastrarProduto.setOnAction((event) -> {
			
		});
		removerProduto.setOnAction((event) -> {
			
		});
		
		pesquisarPedido.setOnAction((event) -> {
			
		});
		todosPedidos.setOnAction((event) -> {
			
		});
		removerPedido.setOnAction((event) -> {
			
		});
	}

}
