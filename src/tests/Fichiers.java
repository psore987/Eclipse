package tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import td1.Haras;

public class Fichiers {

	public static void main(String[] args) {
		
		creerDossier();
		ecrireFichier();
		lireFichier();
	}
		
	private static void lireFichier() {
		
		// Chemin vers le fichier à lire
        String cheminFichier = "C://Users//Pascal//Desktop/docJava.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(cheminFichier))) {
            // Utilisez le BufferedReader pour lire les lignes du fichier ou du flux d'entrée
            String ligne;

            while ((ligne = bufferedReader.readLine()) != null) {
                System.out.println(ligne);
            }
            bufferedReader.close(); // on ferme le fichier
        } catch (IOException e) {
            e.printStackTrace();
        }
      }


	private static void creerDossier() {
	
		// création de dossier
		File dossier = new File("C://Users//Pascal//Desktop//Dossier");
		
		if (!dossier.exists()) {
				dossier.mkdir();
		}
		else
		{ 
			System.out.println("Le dossier existe déjà !");
		}
		
	}
	
	private static void ecrireFichier() {
		
		ArrayList<String> liste = new ArrayList<String>(); // on instancie une nouvelle ArrayList
		
		liste.add("Bonjour1");
		liste.add("Bonjour2");
		liste.add("Bonjour3");
		
		// création de fichier
				File fichier = new File("C://Users//Pascal//Desktop/docJava.txt");
				
				if (!fichier.exists()) {
		            try {
						fichier.createNewFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 
				else
				{ 
					try {
						System.out.println("Le fichier existe déjà !");
						// on va écrire dedans ...
						FileWriter fw = new FileWriter(fichier); // instance de FileWriter
						BufferedWriter bw = new BufferedWriter(fw); // instance de Buffer d'IO
						
						for (String element : liste) { // on parcourt l'ArryList
							bw.write(element);
							bw.newLine();
						}
						bw.close(); // on ferme le buffer
						fw.close(); // on ferme le Writer
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
	}

}
