package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import models.connector;
import javafx.scene.control.ChoiceBox;

public class SearchController implements Initializable {
	
	private Stage stage;
	private Scene scene;

	


	
	public void goToHome(@SuppressWarnings("exports") ActionEvent event) throws IOException {
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaces/HomePage.fxml"));
	    Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    scene = new Scene(root);
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	
	    @FXML
	    private ChoiceBox<connector> ChoiceBox;

	    @FXML
	    private TableColumn<connector, String> ColF;

	    @FXML
	    private TableColumn<connector, String> ColRefF;

	    @FXML
	    private TableColumn<connector, String> ColRefInt;

	    @FXML
	    private TableColumn<connector, String> ColsinglePart;

	    @FXML
	    private TableColumn<connector, String> ColuseValue;

	    @FXML
	    private TableView<connector> GeneralInfo;
	
	
	
    }