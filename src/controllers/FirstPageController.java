package controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;


import javafx.stage.Stage;

public class FirstPageController implements Initializable {
	
	private Stage stage;
	private Scene scene;
	

	
	
	
	public void goToGC(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/interfaces/HomePage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void goToGP(@SuppressWarnings("exports") ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/interfaces/HomePage2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	

	    
		
 

    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		


	}
   

}