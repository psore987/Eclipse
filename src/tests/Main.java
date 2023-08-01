package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	  public static void main(String args[])
	  {
	    try
	    {
	      //étape 1: charger la classe de driver
	    	
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	System.out.println("Pilote chargé.");

	      //étape 2: créer l'objet de connexion
	      Connection conn = DriverManager.getConnection(
	      "jdbc:mysql://192.168.1.89:3306/BdCli", "user1", "password");
	      System.out.println("GetConnection ok");
	      //étape 3: créer l'objet statement 
	      Statement stmt = conn.createStatement();
	      ResultSet res = stmt.executeQuery("SELECT * FROM Produit");

	      //étape 4: exécuter la requête
	      while(res.next())
	        System.out.println(res.getInt(1)+"  "+res.getString(2)
	        +"  "+res.getString(3));
	      System.out.println("Je suis passé ici ! ");

	      //étape 5: fermez l'objet de connexion
	      conn.close();
	    }
	    catch(Exception e){ 
	      System.out.println(e);
	    }
	  }
	}