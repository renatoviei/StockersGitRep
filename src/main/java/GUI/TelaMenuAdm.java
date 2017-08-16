package GUI;

import java.io.IOException;

import Negocio.Beans.AdmEntity;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TelaMenuAdm extends Application {

	private Stage primaryStage;
	private AnchorPane mainLayout;
	private AdmEntity mestre;
	
	public TelaMenuAdm(AdmEntity adm) {
		this.mestre = adm;
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Stockers");
		this.primaryStage.setResizable(false);
		showTelaMenuAdmView();
	}

	public void showTelaMenuAdmView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TelaMenuAdm.class.getResource("view/TelaMenuAdmView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
