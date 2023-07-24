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

public class LabelController implements Initializable {
	
	private Stage stage;
	private Scene scene;
	private String color;
	private String singlePart;
	private String refInterne;
	private String refFour;
	private String fournisseur;
	private String refClient;
	private String client;
	private String useValue;
	private int length;
	private int width;
	private String len;
	private String wid;
	
	public void goToHome(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/interfaces/Sample.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		recupererInfoSeal();
	}
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
		// TODO Auto-generated method stub
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
    private TextField TFColor;

    @FXML
    private TextField TFLen;
    
    @FXML
    private TextField TFWid;
    
    @FXML
    void recupererInfoSeal() {
    	singlePart = myChoiceBox2.getValue();
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
    	len = TFLen.getText();
    	wid = TFWid.getText();
        color = TFColor.getText();
        System.out.println(singlePart + " " + refInterne + " " + refFour+ " " +  fournisseur  + " " + refClient + " " + client +" " + useValue  + " " + length + " "+ width +" "+ color );
	     
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

    	len = TFLen.getText();
    	wid = TFWid.getText();
        color = TFColor.getText();

        try {
	        length = Integer.parseInt(len);
	        // La conversion en entier s'est déroulée avec succès
	        // Vous pouvez utiliser la variable valeurEntiere selon vos besoins
	    } catch (NumberFormatException e) {
	        // La valeur saisie n'est pas un entier valide
	        // Vous pouvez gérer cette situation d'erreur ici
	    }
        
        try {
	        width = Integer.parseInt(wid);
	        // La conversion en entier s'est déroulée avec succès
	        // Vous pouvez utiliser la variable valeurEntiere selon vos besoins
	    } catch (NumberFormatException e) {
	        // La valeur saisie n'est pas un entier valide
	        // Vous pouvez gérer cette situation d'erreur ici
	    }
        databaseController.saveDataToDatabaseLabel(refInterne , singlePart , useValue, refFour, fournisseur, refClient, client , length, width, color );
    

    }
       
     
    

}
