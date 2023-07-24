package controllers;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SubController implements Initializable {
	
	private Stage stage;
	private Scene scene;
	
	public void goToHome(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/interfaces/Sample.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	private ChoiceBox<String> myChoiceBox;
	  ObservableList<String> options =
              FXCollections.observableArrayList(
                      "Sensors",
                      "Connectors"
              );
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			myChoiceBox.setItems(options);

		}
		 @FXML
		    private Label LabDim;
		    @FXML
		    private Label LabType;
		    @FXML
		    private Label LabMat;
		    @FXML
		    private Label LabDiam;
    
}

  
    