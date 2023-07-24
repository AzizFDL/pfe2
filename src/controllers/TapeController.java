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

public class TapeController implements Initializable {
	
	private Stage stage;
	private Scene scene;
	private String singlePart;
	private String refInterne;
	private String refFour;
	private String fournisseur;
	private String refClient;
	private String client;
	private String useValue;
	private String tape;
	private String selectedColor;
	private String temperatureClass;
	private String selectedWidth;
	public void goToHome(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/interfaces/Sample.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	    recupererInfoTape();
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
	private ChoiceBox<String> myChoiceBox4;
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
                      "PVC Tape",
                      "Pet Fleece",
                      "Pet cloth",
                      "Paper Tape"
              );
	  @FXML
		private ChoiceBox<String> myChoiceBox2;
		  ObservableList<String> Color =
	              FXCollections.observableArrayList(
	                      "White",
	                      "Blue",
	                      "Orange",
	                      "Black",
	                      "Yellow",
	                      "Red",
	                      "Green",
	                      "Purple",
	                      "Other"
	              );
		  @FXML
			private ChoiceBox<String> myChoiceBox3;
			  ObservableList<String> width =
		              FXCollections.observableArrayList(
		                      "9",
		                      "12",
		                      "15",
		                      "19",
		                      "38",
		                      "Other"
		              );
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			myChoiceBox.setItems(options);
			myChoiceBox2.setItems(Color);
			myChoiceBox3.setItems(width);
			myChoiceBox4.setItems(SP);


		}
		
	    @FXML
	    private TextField otherColor;
        String color = "";
	    @FXML
	    public void handleChoiceBox2(@SuppressWarnings("exports") ActionEvent event) {
	        String selectedColor = myChoiceBox2.getValue();
	        if (selectedColor.equals("Other")) {
	            otherColor.setVisible(true);
	        } else {
	            otherColor.setVisible(false);
	        }
	    }
	    @FXML
	    private TextField otherWidth;
    
	    @FXML
	    public void handleChoiceBox3(@SuppressWarnings("exports") ActionEvent event) {
	        String selectedWidth = myChoiceBox3.getValue();
	        if (selectedWidth.equals("Other")) {
	            otherWidth.setVisible(true);
	        } else {
	            otherWidth.setVisible(false);
	        }
	    }
	    @FXML
	    private TextField TFTemp;
	    
		  
	    @FXML
	    void recupererInfoTape() {
	    	singlePart = myChoiceBox4.getValue();
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
	    	tape =  myChoiceBox.getValue();
	    	temperatureClass = TFTemp.getText();
	    	selectedColor = myChoiceBox2.getValue();
    	    selectedWidth = myChoiceBox3.getValue();            
    	    int wth = 0;

    	    if (selectedColor.equals("Other")) {
    	        selectedColor = otherColor.getText();
    	    }

    	    try {
    	        wth = Integer.parseInt(selectedWidth);
    	        // La conversion en entier s'est déroulée avec succès
    	        // Vous pouvez utiliser la variable wth selon vos besoins
    	    } catch (NumberFormatException e) {
    	        // La valeur saisie n'est pas un entier valide
    	        // Vous pouvez gérer cette situation d'erreur ici
    	        if (selectedWidth.equals("Other")) {
    	            String customWidth = otherWidth.getText();
    	            try {
    	                wth = Integer.parseInt(customWidth);
    	                // La conversion en entier s'est déroulée avec succès
    	                // Vous pouvez utiliser la variable wth selon vos besoins
    	            } catch (NumberFormatException ex) {
    	                // La valeur saisie dans le TextField n'est pas un entier valide
    	                // Vous pouvez gérer cette situation d'erreur ici
    	            }
    	        }
    	    }

    	    System.out.println(singlePart + " " + refInterne + " " + refFour+ " " +  fournisseur  + " " + refClient + " " + client +" " + useValue +" " +tape + " " + selectedColor + " " + temperatureClass + " " + wth);
    	}

	    private ConnexionMysql databaseController = new ConnexionMysql();
	    @FXML
	    void saveData(ActionEvent event) {
	    	singlePart = myChoiceBox4.getValue();
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
	    	tape =  myChoiceBox.getValue();
	    	temperatureClass = TFTemp.getText();
	    	selectedColor = myChoiceBox2.getValue();
    	    selectedWidth = myChoiceBox3.getValue();            
    	    int wth = 0;

    	    if (selectedColor.equals("Other")) {
    	        selectedColor = otherColor.getText();
    	    }

    	    try {
    	        wth = Integer.parseInt(selectedWidth);
    	        // La conversion en entier s'est déroulée avec succès
    	        // Vous pouvez utiliser la variable wth selon vos besoins
    	    } catch (NumberFormatException e) {
    	        // La valeur saisie n'est pas un entier valide
    	        // Vous pouvez gérer cette situation d'erreur ici
    	        if (selectedWidth.equals("Other")) {
    	            String customWidth = otherWidth.getText();
    	            try {
    	                wth = Integer.parseInt(customWidth);
    	                // La conversion en entier s'est déroulée avec succès
    	                // Vous pouvez utiliser la variable wth selon vos besoins
    	            } catch (NumberFormatException ex) {
    	                // La valeur saisie dans le TextField n'est pas un entier valide
    	                // Vous pouvez gérer cette situation d'erreur ici
    	            }
    	        }
    	    }
	    	

	    
	        databaseController.saveDataToDatabaseTape( refInterne,singlePart , useValue, refFour, fournisseur, refClient, client , tape , wth, selectedColor , temperatureClass );
	    

	    }


	    
	    
    		
    }
    