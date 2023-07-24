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

import application.ConnexionMysql;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ConnectorController implements Initializable {
	
	private Stage stage;
	private Scene scene;
	private String family;
	private String coding;
	private String color;
	private String type;
	private String singlePart;
	private String refInterne;
	private String refFour;
	private String fournisseur;
	private String refClient;
	private String client;
	private String useValue;



	

	public void goToHome(@SuppressWarnings("exports") ActionEvent event) throws IOException {
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("/interfaces/sample.fxml"));
	    Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	    scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	}

	@FXML
	private ChoiceBox<String> myChoiceBox2;
	  ObservableList<String> SP =
              FXCollections.observableArrayList(
                      "Y",
                      "N",
                      "RM"
              );
	
	@FXML
	private ChoiceBox<String> myChoiceBox;
	  ObservableList<String> options =
              FXCollections.observableArrayList(
                      "Male",
                      "Female"
              );
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myChoiceBox.getItems().addAll(options);
		myChoiceBox2.getItems().addAll(SP);
	}
	    @FXML
	    private RadioButton RNv;

	    @FXML
	    private RadioButton RObs;

	    @FXML
	    private RadioButton RUti;

	    @FXML
	    private TextField TFC;

	    @FXML
	    private TextField TFF;


	    @FXML
	    private TextField TFRefC;

	    @FXML
	    private TextField TFRefF;

	    @FXML
	    private TextField TFRefInt;

	    @FXML
	    private ToggleGroup USE;
	
	    @FXML  
	    private TextField TFFam;
    
        @FXML
        private RadioButton RBNo;

        @FXML
        private RadioButton RBYes;

        @FXML
        private TextField TFCod;

        @FXML
        private TextField TFColor;

        @FXML
        private ToggleGroup Waterproofness;
        
    @FXML
    void recupererInfoConnector() {
    	
    	refInterne = TFRefInt.getText();
    	refFour = TFRefF.getText();
    	fournisseur = TFF.getText();
    	refClient = TFRefC.getText();
    	client = TFC.getText();
    	singlePart = myChoiceBox2.getValue();
        useValue = "";
        RadioButton selectedRadioButton = (RadioButton) USE.getSelectedToggle();
        if (selectedRadioButton != null) {
            useValue = selectedRadioButton.getText();
        }
    	family = TFFam.getText();
        coding = TFCod.getText();
        color = TFColor.getText();
        type = myChoiceBox.getValue();
        String WP = "";
        RadioButton selectedRadioButton2 = (RadioButton) Waterproofness.getSelectedToggle();
        if (selectedRadioButton2 != null) {
            WP = selectedRadioButton2.getText();
        }
        System.out.println( refInterne + " " + refFour+ " " +  fournisseur  + " " + refClient + " " + client +" " +singlePart + " " +  useValue +" "+ family + " " + coding + " " + color +" " + WP +" " + type  );
      

    }
    
    private ConnexionMysql databaseController = new ConnexionMysql();
    @FXML
    void saveData(ActionEvent event) {
    	singlePart = myChoiceBox2.getValue();
        refInterne = TFRefInt.getText();
        refFour = TFRefF.getText();
        fournisseur = TFF.getText();
        refClient = TFRefC.getText();
        client = TFC.getText();
        
        RadioButton selectedRadioButton = (RadioButton) USE.getSelectedToggle();
        if (selectedRadioButton != null) {
            useValue = selectedRadioButton.getText();
        }
    	family = TFFam.getText();
        coding = TFCod.getText();
        color = TFColor.getText();
        type = myChoiceBox.getValue();
        String WP = "";
        RadioButton selectedRadioButton2 = (RadioButton) Waterproofness.getSelectedToggle();
        if (selectedRadioButton2 != null) {
            WP = selectedRadioButton2.getText();
        }
    
        databaseController.saveDataToDatabaseCo( refInterne, singlePart ,useValue, refFour, fournisseur, refClient, client , family ,coding ,color ,type , WP);
    
    }

    }