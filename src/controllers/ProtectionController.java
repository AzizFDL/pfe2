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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class ProtectionController implements Initializable {
	
	private Stage stage;
	private Scene scene;
	private String singlePart;
	private String refInterne;
	private String refFour;
	private String fournisseur;
	private String refClient;
	private String client;
	private String useValue;
    private String selectedOption;
    private String dimension;
	private String type;
    private String material; 
    private String len;
	private String diam;
	private String temperatureClass;
	private int diameter;
    private int length;
    private String WP;
    
	public void goToHome(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/interfaces/Sample.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		recupererInfoTube();
	}
	
	@FXML
	private ChoiceBox<String> myChoiceBox;
	  ObservableList<String> options =
              FXCollections.observableArrayList(
                      "Foam",
                      "Mastic Seal",
                      "Grommet",
                      "Heatshrink"
              );
	    @FXML
		private ChoiceBox<String> myChoiceBox2;
		  ObservableList<String> SP =
	            FXCollections.observableArrayList(
	                    "Y",
	                    "N",
	                    "RM"
	            );

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			myChoiceBox.setItems(options);
			myChoiceBox2.setItems(SP);

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
	    private ToggleGroup Waterproofness;
	    @FXML
	    private Label LabDim;
	    @FXML
	    private Label LabType;
	    @FXML
	    private Label LabMat;
	    @FXML
	    private Label LabDiam;
	    @FXML
	    private Label LabWp;
	    @FXML
	    private Label LabTemp;
	    @FXML
	    private Label LabLeng;
	    @FXML
	    private TextField TFDim;
	    @FXML
	    private TextField TFType;
	    @FXML
	    private TextField TFTemp;
	    @FXML
	    private RadioButton RbYes ;	   
	    @FXML
	    private RadioButton RbNo ;	 
	    
	    @SuppressWarnings("exports")
		@FXML
	    public void handleChoiceBox(ActionEvent event) {
	        String selectedOption = myChoiceBox.getValue();
		    
	        if (selectedOption.equals("Foam")) {
	            LabLeng.setVisible(false);
	            LabMat.setVisible(false);
	            LabDiam.setVisible(false);
	            LabDim.setVisible(true);
	            TFDim.setVisible(true);
	            LabType.setVisible(false);
	            TFType.setVisible(false);
	            LabTemp.setVisible(false);
	            TFTemp.setVisible(false);
	            LabWp.setVisible(false);
	            RbYes.setVisible(false);
	            RbNo.setVisible(false);
	        } else if (selectedOption.equals("Mastic Seal")) {
	            LabLeng.setVisible(false);
	            LabDiam.setVisible(false);
	            LabDim.setVisible(true);
	            TFDim.setVisible(true);
	            LabType.setVisible(true);
	            TFType.setVisible(true);
	            LabMat.setVisible(false);
	            LabTemp.setVisible(false);
	            TFTemp.setVisible(false);
	            LabWp.setVisible(false);
	            RbYes.setVisible(false);
	            RbNo.setVisible(false);
	        } else if (selectedOption.equals("Grommet")) {
	            LabLeng.setVisible(false);
	            LabDiam.setVisible(false);
	            LabDim.setVisible(false);
	            LabMat.setVisible(true);
	            TFDim.setVisible(true);
	            LabType.setVisible(true);
	            TFType.setVisible(true);
	            LabTemp.setVisible(false);
	            TFTemp.setVisible(false);
	            LabWp.setVisible(false);
	            RbYes.setVisible(false);
	            RbNo.setVisible(false);
	        } else if (selectedOption.equals("Heatshrink")) {
            LabLeng.setVisible(true);
            LabDiam.setVisible(true);
            LabDim.setVisible(false);
            TFDim.setVisible(true);
            LabType.setVisible(false);
            TFType.setVisible(true);
            LabMat.setVisible(false);
            LabTemp.setVisible(true);
            TFTemp.setVisible(true);
            LabWp.setVisible(true);
            RbYes.setVisible(true);
            RbNo.setVisible(true);

        
    } 
	    }
	    
	    @FXML
	    void recupererInfoTube() {
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
	    	    selectedOption = myChoiceBox.getValue(); 
	    	    dimension = TFDim.getText();
	        	type = TFType.getText();
	    	    material = TFDim.getText(); 
	    	    len = TFDim.getText();
	   		    diam = TFType.getText();
	   		    temperatureClass = TFTemp.getText();
	   		    diameter = 0;
	    	    length = 0;
	    	    WP = "";
	            RadioButton selectedRadioButton2 = (RadioButton) Waterproofness.getSelectedToggle();
	            if (selectedRadioButton2 != null) {
	                WP = selectedRadioButton2.getText();
	            }
	    	    
	    	    try {
	    	        diameter = Integer.parseInt(diam);
	    	        // La conversion en entier s'est déroulée avec succès
	    	        // Vous pouvez utiliser la variable valeurEntiere selon vos besoins
	    	    } catch (NumberFormatException e) {
	    	        // La valeur saisie n'est pas un entier valide
	    	        // Vous pouvez gérer cette situation d'erreur ici
	    	    }
	    	    
	    	    
	    	    try {
	    	        length = Integer.parseInt(len);
	    	        // La conversion en entier s'est déroulée avec succès
	    	        // Vous pouvez utiliser la variable valeurEntiere selon vos besoins
	    	    } catch (NumberFormatException e) {
	    	        // La valeur saisie n'est pas un entier valide
	    	        // Vous pouvez gérer cette situation d'erreur ici
	    	    }
	    	
	    	    if (selectedOption.equals("Foam")) {
	    	        System.out.println( dimension );
	    	    }

		         else if (selectedOption.equals("Mastic Seal")) {
			        System.out.println( dimension + " " + type  );
				     
		        }
		        else if (selectedOption.equals("Grommet")) {
			        System.out.println( material + " " + type  );
				     
		        }
		        else if (selectedOption.equals("Heatshrink")) {
			        System.out.println( length + " " + diameter + " " + WP + " " +  temperatureClass  );
				     
		        

}
         

	     
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
    	    selectedOption = myChoiceBox.getValue();
    	    
    	    if (selectedOption.equals("Foam")) {
	    	    dimension = TFDim.getText();
	    	    databaseController.saveDataToDatabaseFoam(  refInterne, singlePart, useValue, refFour,  fournisseur, refClient, client , dimension);
    	    }
    	    
    	    else if (selectedOption.equals("Mastic Seal")) {
	    	    dimension = TFDim.getText();
	        	type = TFType.getText();
	        	databaseController.saveDataToDatabaseMasticSeal(refInterne,singlePart, useValue, refFour, fournisseur, refClient, client , dimension , type );
			     
	        }
    	    
	        else if (selectedOption.equals("Grommet")) {
	        	type = TFType.getText();
	    	    material = TFDim.getText(); 
	    	    databaseController.saveDataToDatabaseGrommet(refInterne,singlePart, useValue, refFour, fournisseur, refClient, client , material , type );
			     
	        }
    	    
	        else if (selectedOption.equals("Heatshrink")) {
	    	    len = TFDim.getText();
	   		    diam = TFType.getText();
	   		    temperatureClass = TFTemp.getText();
	   		    diameter = 0;
	    	    length = 0;
	    	    String WP = "";
	            RadioButton selectedRadioButton2 = (RadioButton) Waterproofness.getSelectedToggle();
	            if (selectedRadioButton2 != null) {
	                WP = selectedRadioButton2.getText();
	            }
	            try {
	    	        diameter = Integer.parseInt(diam);
	    	        // La conversion en entier s'est déroulée avec succès
	    	        // Vous pouvez utiliser la variable valeurEntiere selon vos besoins
	    	    } catch (NumberFormatException e) {
	    	        // La valeur saisie n'est pas un entier valide
	    	        // Vous pouvez gérer cette situation d'erreur ici
	    	    }
	    	    
	    	    
	    	    try {
	    	        length = Integer.parseInt(len);
	    	        // La conversion en entier s'est déroulée avec succès
	    	        // Vous pouvez utiliser la variable valeurEntiere selon vos besoins
	    	    } catch (NumberFormatException e) {
	    	        // La valeur saisie n'est pas un entier valide
	    	        // Vous pouvez gérer cette situation d'erreur ici
	    	    }

	    	    databaseController.saveDataToDatabaseHeatshrink( refInterne,singlePart, useValue, refFour, fournisseur, refClient, client , length , diameter , temperatureClass , WP );
	        }
	    }
	   
    }