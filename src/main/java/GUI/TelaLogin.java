package GUI;

import java.beans.EventHandler;
import java.io.IOException;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import Negocio.IFachada;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaLogin extends Application {

	private IFachada f;
	private Stage primaryStage;
	private AnchorPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Stockers");
		this.primaryStage.setResizable(false);
		showTelaLoginView();
	}

	public void showTelaLoginView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TelaLogin.class.getResource("view/TelaLoginView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
