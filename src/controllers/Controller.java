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

import javafx.stage.Stage;

public class Controller implements Initializable {
	
	private Stage stage;
	private Scene scene;
	
    
	
	
	
	public void goToHome(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/interfaces/HomePage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	

	

	    
		
 
	@FXML
	private ChoiceBox<String> myChoiceBox;
	  ObservableList<String> options =
              FXCollections.observableArrayList(
                      "Connector",
                      "Terminal",
                      "Seal",
                      "Plug",
                      "Ring",
                      "Wire",
                      "Lining (Tape)",
                      "Lining (Tube)",
                      "Protection",
                     "Sub assemblies",
                     "Label",
                     "Cover",
                     "Clip"      
                      
              );
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myChoiceBox.setItems(options);


	}
    @FXML
    private void handleChoiceBoxSelection(ActionEvent event) {
        String selectedOption = myChoiceBox.getValue();
        if (selectedOption != null) {
            try {
                String fxmlFile = "";
                switch (selectedOption) {
                    case "Connector":
                        fxmlFile = "/interfaces/Connectors.fxml";
                        break;
                    case "Terminal":
                        fxmlFile = "/interfaces/Terminals.fxml";
                        break;
                    case "Seal":
                        fxmlFile = "/interfaces/Seals.fxml";
                        break;
                    case "Plug":
                        fxmlFile = "/interfaces/Plug.fxml";
                        break;
                    case "Ring":
                        fxmlFile = "/interfaces/Rings.fxml";
                        break;
                    case "Wire":
                        fxmlFile = "/interfaces/Wires.fxml";
                        break;
                    case "Lining (Tape)":
                        fxmlFile = "/interfaces/Tapes.fxml";
                        break;
                    case "Lining (Tube)":
                        fxmlFile = "/interfaces/Tubes.fxml";
                        break;
                    case "Protection":
                        fxmlFile = "/interfaces/Protections.fxml";
                        break;
                    case "Sub assemblies":
                        fxmlFile = "/interfaces/SubAssemblies.fxml";
                        break;
                    case "Label":
                        fxmlFile = "/interfaces/Label.fxml";
                        break;
                    case "Clip":
                        fxmlFile = "/interfaces/Clip.fxml";
                        break;
                    case "Cover":
                        fxmlFile = "/interfaces/Cover.fxml";
                        break;
                    default:
                        break;
                }

                if (!fxmlFile.isEmpty()) {
                    Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
                    
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    
                    
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
   



}
