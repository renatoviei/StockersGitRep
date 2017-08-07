package GUI;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaCadastroProduto extends Application {

	private Stage primaryStage;
	private AnchorPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Stockers");
		showTelaCadastroProdutoView();
	}

	public void showTelaCadastroProdutoView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TelaLogin.class.getResource("view/TelaCadastroProdutoView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
