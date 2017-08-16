package GUI;

import java.beans.EventHandler;
import java.io.IOException;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import Negocio.Fachada;
import Negocio.IFachada;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaLogin extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Stockers");
		primaryStage.setResizable(false);
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(TelaLogin.class.getResource("view/TelaLoginView.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Scene scene = new Scene(page);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
