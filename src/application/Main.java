package application;

	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("/interfaces/ChercherComposant.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			stage.setTitle("Gestion des composants");
			Image icon = new Image("C:\\Users\\Osaka Gaming Maroc\\Pictures\\Saved Pictures\\LL.png");
			stage.getIcons().add(icon);
			

			
			String css = this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(css);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);

			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}
