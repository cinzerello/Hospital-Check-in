package application.controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.model.Patient;

public class Appcontroller implements Initializable {
	@FXML DatePicker dtDate;
	@FXML TableColumn <String,Patient> colName;
	@FXML TableColumn <String,Patient> colPhone;
	@FXML TableColumn <String,Patient> colReady;
	@FXML TableColumn <String,Patient> colDoctor;
	@FXML TableColumn <String,Patient> colAddress;
	@FXML TableColumn <String,Patient> colAptTime;
	
	
	@FXML TableView<Patient> tApptInfo;
	
	 ObservableList<Patient> data = FXCollections.observableArrayList(
				new Patient("John doe","(210) 121-1212", "Yes","Dr.Wily","1234 Fake address","12:34"),
				new Patient("Jane Doe","(420) 696-4204","No","Dr.Light","1234 Also fake","23:24")
		);
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
		colPhone.setCellValueFactory(new PropertyValueFactory<>("Phonenum"));
		colReady.setCellValueFactory(new PropertyValueFactory<>("Ready"));
		colDoctor.setCellValueFactory(new PropertyValueFactory<>("DoctorName"));
		colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
		colAptTime.setCellValueFactory(new PropertyValueFactory<>("Appttime"));
		tApptInfo.setItems(data);
	
	}
	
	
	
	

}
