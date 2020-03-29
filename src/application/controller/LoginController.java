package application.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.stage.Stage;

public class LoginController {

	    @FXML
	    private Button btnHospital;
	    @FXML
	    private Button btnView;

	    @FXML
	    void toHView(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/HospitalView.fxml"));
			loader.setController(new Appcontroller());
			Parent p = loader.load();
			Scene MainScene = new Scene(p);
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(MainScene);
			window.show();
	    }

	    @FXML
	    void toPView(ActionEvent event) throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/PatientView.fxml"));
			loader.setController(new PViewController());
			Parent p = loader.load();
			Scene MainScene = new Scene(p);
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(MainScene);
			window.show();
	    }


}
