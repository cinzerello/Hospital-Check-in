package application;

import java.io.IOException;
import application.controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	public void start(Stage s) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("View/LoginView.fxml"));
		loader.setController(new LoginController());
		Parent root = loader.load();
		Scene main = new Scene(root);
		s.setScene(main);
		s.show();
		/*try {
			Parent root = FXMLLoader.load(getClass().getResource("application/View/LoginView.fxml"));
			root.setController(new LoginController());
			primaryStage.setScene(new Scene(root, 1200,800));
			primaryStage.setTitle("Current patient list");
			primaryStage.show();
			stage = primaryStage;
		} catch(Exception e) {
			e.printStackTrace();
		}*/
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
