package application;

import java.sql.*;


public class ConnexionMysql {
	
	public Connection cnx = null;
	public PreparedStatement st;
	public ResultSet result;

	public static Connection connexionBD() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestioncomposants", "root", "");
			return cnx;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Connexion échouée");
			e.printStackTrace();
			return null;
		}
	}

	public void saveDataToDatabaseCo( String refInterne, String singlePart, String useValue, String refFour,
			String fournisseur, String refClient, String client ,String family , String coding , String color , String type , String WP) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO connector (refInterneCo,singlePartCo, useValueCo, refFourCo, fournisseurCo, refClientCo, clientCo ,familyCo ,codingCo , colorCo ,typeCo, waterproofnessCo) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, family);
			statement.setString(9, coding);
			statement.setString(10, color);
			statement.setString(11, type);
			statement.setString(12, WP);

			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseTerm(String refInterne ,String singlePart,  String useValue, String refFour,
			String fournisseur, String refClient, String client ,String family , String section , String type , String material , String WP , String angle) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO terminal ( RefInterneTerm,singlePartTerm , UsageTerm, RefFournisseurTerm, FournisseurTerm, RefClientTerm, ClientTerm ,FamilyTerm ,SectionTerm , TypeTerm ,MaterialTerm, WaterproofnessTerm , AngleTerm) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, family);
			statement.setString(9, section);
			statement.setString(10, type);
			statement.setString(11, material);
			statement.setString(12, WP);
			statement.setString(13, angle);

			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseSeal(String refInterne,String singlePart, String useValue, String refFour,
			String fournisseur, String refClient, String client ,String section , String color) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO seal ( RefInterneSe, singlePartSe,  UsageSe, RefFournisseurSe, FournisseurSe, RefClientSe, ClientSe ,SectionSe , ColorSe ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, section);
			statement.setString(9, color);


			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabasePlug( String refInterne, String singlePart, String useValue, String refFour,
			String fournisseur, String refClient, String client ,String family , String color) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO plug ( RefInternePl, singlePartPl,  UsagePl, RefFournisseurPl, FournisseurPl, RefClientPl, ClientPl ,FamilyPl , ColorPl ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, family);
			statement.setString(9, color);


			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseRing( String refInterne, String singlePart ,String useValue, String refFour,
			String fournisseur, String refClient, String client ,String ang ,String family , int HD , String WP ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO ring  (RefInterneRi,singlePartRi, UsageRi, RefFournisseurRi, FournisseurRi, RefClientRi, ClientRi ,FamilyRi , AngleRi , HoleDiameterRi , WaterproofnessRi ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? , ? , ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, family);
			statement.setString(9, ang);
			statement.setInt(10, HD);
			statement.setString(11 ,WP);
			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseWire(String refInterne,String singlePart,  String useValue, String refFour,
			String fournisseur, String refClient, String client ,String section ,String type , String temperatureClass ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO wire ( RefInterneWr, singlePartWr, UsageWr, RefFournisseurWr, FournisseurWr, RefClientWr, ClientWr ,SectionWr , TypeWr ,TemperatureClassWr ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? , ?  )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, section);
			statement.setString(9, type);
			statement.setString(10 ,temperatureClass);
			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseTape( String refInterne,String singlePart, String useValue, String refFour,
			String fournisseur, String refClient, String client ,String tape , int wth , String color , String temperatureClass ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO tape ( RefInterneTape,singlePartTape, UsageTape, RefFournisseurTape, FournisseurTape, RefClientTape, ClientTape , TypeTape , WidthTape , ColorTape , TemperatureClassTape) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? , ? , ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, tape);
			statement.setInt(9, wth);
			statement.setString(10 ,color);
			statement.setString(11 ,temperatureClass);
			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseTube( String refInterne, String singlePart ,String useValue, String refFour,
			String fournisseur, String refClient, String client ,String tube , int diameter , int length , String temperatureClass ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO tube ( RefInterneTube, singlePartTube, UsageTube, RefFournisseurTube, FournisseurTube, RefClientTube, ClientTube , TypeTube , DiameterTube , LengthTube , TemperatureClassTube) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? , ? , ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, tube);
			statement.setInt(9, diameter);
			statement.setInt(10 ,length);
			statement.setString(11 ,temperatureClass);
			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseFoam( String refInterne,String singlePart, String useValue, String refFour,
			String fournisseur, String refClient, String client ,String dimension ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO foam ( RefInterneFoam, singlePartFoam, UsageFoam, RefFournisseurFoam, FournisseurFoam, RefClientFoam, ClientFoam , DimensionFoam) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, dimension);

			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void saveDataToDatabaseMasticSeal( String refInterne, String singlePart, String useValue, String refFour,
			String fournisseur, String refClient, String client ,String dimension , String type ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO masticseal (RefInterneMS, singlePartMS , UsageMS, RefFournisseurMS, FournisseurMS, RefClientMS, ClientMS , DimensionMS, TypeMS ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, dimension);
			statement.setString(9, type);

			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void saveDataToDatabaseGrommet(String refInterne, String singlePart, String useValue, String refFour,
			String fournisseur, String refClient, String client ,String material , String type ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO grommet ( RefInterneG, singlePartG , UsageG, RefFournisseurG, FournisseurG, RefClientG, ClientG , MaterialG , TypeG ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setString(8, material);
			statement.setString(9, type);

			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void saveDataToDatabaseHeatshrink( String refInterne,  String singlePart, String useValue, String refFour,
			String fournisseur, String refClient, String client , int length , int diameter , String temperatureClass , String WP ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO heatshrink (RefInterneHS, singlePartHS ,UsageHS, RefFournisseurHS, FournisseurHS, RefClientHS, ClientHS , LengthHS , DiameterHS , TemperatureClassHS ,WaterproofnessHS ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setInt(8, length);
			statement.setInt(9, diameter);
			statement.setString(10, temperatureClass);
			statement.setString(11, WP);

			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseLabel( String refInterne, String singlePart, String useValue, String refFour,
			String fournisseur, String refClient, String client , int length , int width , String color ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO label ( refInterneLab, singlePartLab, useValueLab, refFourLab, fournisseurLab, refClientLab, clientLab ,lengthLab ,widthLab , colorLab  ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);
			statement.setInt(8, length);
			statement.setInt(9, width);
			statement.setString(10, color);

			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseClip( String refInterne, String singlePart , String useValue, String refFour,
			String fournisseur, String refClient, String client ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO clip ( refInterneClip, singlePartClip , useValueClip, refFourClip, fournisseurClip, refClientClip, clientClip ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);


			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataToDatabaseCover( String refInterne, String singlePart ,String useValue, String refFour,
			String fournisseur, String refClient, String client ) {
		try {
			// Établir la connexion à la base de données
			cnx = connexionBD();

			// Préparer la requête INSERT
			String query = "INSERT INTO cover ( refInterneCover,singlePartCover, useValueCover, refFourCover, fournisseurCover, refClientCover, clientCover ) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ? )";
			PreparedStatement statement = cnx.prepareStatement(query);

			// Définir les valeurs des paramètres dans la requête
			statement.setString(1, refInterne);
			statement.setString(2, singlePart);
			statement.setString(3, useValue);
			statement.setString(4, refFour);
			statement.setString(5, fournisseur);
			statement.setString(6, refClient);
			statement.setString(7, client);


			
			// Exécuter la requête INSERT
			statement.executeUpdate();

			// Fermer les ressources
			statement.close();
			cnx.close();

			System.out.println("Données sauvegardées avec succès dans la base de données !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	 public void showConnector() {
		 
		 String sql=" select * from conenctor";
		 try {
			st=cnx.prepareStatement(sql);
			result=st.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }

}
