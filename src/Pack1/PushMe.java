package Pack1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class PushMe implements ActionListener {
    static public void main(String argv[]) {
        new PushMe();
    }

    // Le constructeur de la classe PushMe
    public PushMe() {
      
		Frame f = new Frame("Ma fenêtre");
        
        
        Button b = new Button("Push me");
        b.addActionListener(this);

        f.add(b); // On ajoute le bouton dans la fenêtre
        f.setLocationRelativeTo(null);
        f.pack();
        f.setVisible(true);
    }

    // gestionnaire d'évènement définit dans ActionListener
    public void actionPerformed(ActionEvent event) {
        System.out.println("Bouton " + event.getSource() + " cliqué !");
        
    }
}
