package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMySQL {
    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.1.89:3306/BdCli";
        String user = "user1";
        String password = "password";

        try {
            // Enregistrement du pilote MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Établissement de la connexion à la base de données
            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println("GetConnection ok");
  	      //étape 3: créer l'objet statement 
  	      Statement stmt = connection.createStatement();
  	      ResultSet res = stmt.executeQuery("SELECT * FROM Produit,Categorie WHERE Produit.CodeCat = Categorie.CodeCat");

  	      //étape 4: exécuter la requête
  	      while(res.next())
  	        System.out.println(res.getInt(1)+"  "+res.getString(2)
  	        +"  "+res.getString(3)+"  "+res.getString(4)+"  "+res.getString(5)+"  "+res.getString(6));
  	      System.out.println("Je suis passé ici ! ");

            // Fermeture de la connexion
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

