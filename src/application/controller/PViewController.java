package application.controller;

import java.time.LocalDate;

import application.model.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;

public class PViewController {

    @FXML
    private Button btnReady;
    @FXML
    private Label lblHName;
    @FXML
    private Label lblTime;
    @FXML
    private DatePicker dtApptDate;
    @FXML
    private Label lblError;
    @FXML
    private ComboBox<String> cbDoctor;
    @FXML
    private ComboBox<String> cbAppt;
    
    private Patient p;
    
    @FXML
	 public void initialize() {
    	p.setAddress("123 Fake Dr");
    	p.setName("N. Otreal");
    	p.setPhonenum("555-5555");
    	p.setReady("");
    }
    
    @FXML    
    void apptChosen(DragEvent event) {
    	
    }

    @FXML
    void dateChosen(ActionEvent event) {
    	cbDoctor.setDisable(false);
    }

    @FXML
    void doctorChosen(DragEvent event) {
    	cbAppt.setDisable(false);
    }

    @FXML
    void updateServer(ActionEvent event) {
    	LocalDate date = dtApptDate.getValue();
    	p.setDoctorName(cbDoctor.getValue());
    	p.setAppttime(cbAppt.getValue());
    	p.setReady("Ready");
    }

}


