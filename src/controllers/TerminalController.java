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

public class TerminalController implements Initializable {
	
	private Stage stage;
	private Scene scene;
	private String singlePart;
	private String refInterne;
	private String refFour;
	private String fournisseur;
	private String refClient;
	private String client;
	private String useValue;
	private String family;
	private String section;
	private String type;
	private String material;
	private String ang;
	private String WP;
	
	public void goToHome(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/interfaces/Sample.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		recupererInfoTerminal();	}
	
	@FXML
	private ChoiceBox<String> myChoiceBox;
	  ObservableList<String> options =
              FXCollections.observableArrayList(
                      "Male",
                      "Female"
              );
	  @FXML
		private ChoiceBox<String> myChoiceBox2;
		  ObservableList<String> Material =
	              FXCollections.observableArrayList(
	                      "SN (Tin)",
	                      "AU (Gold)",
	                      "AG (Silver)",
	                      "CUZN (Brass)",
	                      "CUSN (Bronze)",
	                      "Other"
	              );
			@FXML
			private ChoiceBox<String> myChoiceBox3;
			  ObservableList<String> SP =
		              FXCollections.observableArrayList(
		                      "Y",
		                      "N",
		                      "RM"
		              );
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			myChoiceBox.setItems(options);
			myChoiceBox2.setItems(Material);
			myChoiceBox3.getItems().addAll(SP);
		}
	  
    
	    @FXML
	    private TextField otherMaterial;
		  
		@FXML
		public void handleChoiceBox2(@SuppressWarnings("exports") ActionEvent event) {
		    String selectedMaterial = myChoiceBox2.getValue();
		    if (selectedMaterial.equals("Other")) {
		        otherMaterial.setVisible(true);
		    } else {
		        otherMaterial.setVisible(false);
		    }
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
	    private RadioButton AngF;

	    @FXML
	    private RadioButton AngS;

	    @FXML
	    private ToggleGroup Angle;

	    @FXML
	    private TextField TFFamily;

	    @FXML
	    private TextField TFSec;

	    @FXML
	    private RadioButton WPS;

	    @FXML
	    private RadioButton WPUns;

	    @FXML
	    private ToggleGroup Waterproofness;
	    
	    @FXML
	    private ToggleGroup angle;
	    
	    @FXML
	    void recupererInfoTerminal() {
	    	singlePart = myChoiceBox3.getValue();
	    	refInterne = TFRefInt.getText();
	    	refFour = TFRefF.getText();
	    	fournisseur = TFF.getText();
	    	refClient = TFRefC.getText();
	    	client = TFC.getText();
	    	
	        useValue = "";
	        RadioButton selectedRadioButton = (RadioButton) USE.getSelectedToggle();
	        if (selectedRadioButton != null) {
	            useValue = selectedRadioButton.getText();
	        }
	    	family = TFFamily.getText();
	        section = TFSec.getText();
	    	type = myChoiceBox.getValue();
	        material = myChoiceBox2.getValue();
	        
	        if (otherMaterial.equals("Other")) {
    	        material = otherMaterial.getText();
    	    }
	        
	        WP = "";
	        RadioButton selectedRadioButton1 = (RadioButton) Waterproofness.getSelectedToggle();
	        if (selectedRadioButton1 != null) {
	            WP = selectedRadioButton1.getText();
	        }
	        ang = "";
	        RadioButton selectedRadioButton2 = (RadioButton) angle.getSelectedToggle();
	        if (selectedRadioButton2 != null) {
	            ang = selectedRadioButton2.getText();
	        }
	        System.out.println(singlePart + " " + refInterne + " " + refFour+ " " +  fournisseur  + " " + refClient + " " + client +" " + useValue +" " + family + " " + section + " " + type +" " + WP +" " + material +" " + ang  );
	     
	    }
	    private ConnexionMysql databaseController = new ConnexionMysql();
	    @FXML
	    void saveData(ActionEvent event) {
	    	singlePart = myChoiceBox3.getValue();
	        refInterne = TFRefInt.getText();
	        refFour = TFRefF.getText();
	        fournisseur = TFF.getText();
	        refClient = TFRefC.getText();
	        client = TFC.getText();
	        
	        RadioButton selectedRadioButton = (RadioButton) USE.getSelectedToggle();
	        if (selectedRadioButton != null) {
	            useValue = selectedRadioButton.getText();
	        }
	        family = TFFamily.getText();
	        section = TFSec.getText();
	    	type = myChoiceBox.getValue();
	        material = myChoiceBox2.getValue();
	        
	        if (material.equals("Other")) {
	        	material = otherMaterial.getText();
        
    	     }
	        
	        WP = "";
	        RadioButton selectedRadioButton1 = (RadioButton) Waterproofness.getSelectedToggle();
	        if (selectedRadioButton1 != null) {
	            WP = selectedRadioButton1.getText();
	        }
	        ang = "";
	        RadioButton selectedRadioButton2 = (RadioButton) angle.getSelectedToggle();
	        if (selectedRadioButton2 != null) {
	            ang = selectedRadioButton2.getText();
	        }
	    
	        databaseController.saveDataToDatabaseTerm( refInterne, singlePart, useValue, refFour, fournisseur, refClient, client , family ,section ,type ,material , WP , ang);
	    

	    }

    		
    }