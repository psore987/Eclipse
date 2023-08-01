package Pack1;


import java.awt.*;
import java.axt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class WindowListener1 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	
	// les boutons sont créés comme des variables (attributs) de classe
	private JButton btn1 = new JButton("Cliquez ici");
	private JButton btn2 = new JButton("Cliquez ici aussi ! ");
	
	
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowListener1 frame = new WindowListener1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowListener1() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		btn1.setBounds(49, 32, 85, 21);
		btn1.addActionListener(this);
		getContentPane().add(btn1);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setForeground(new Color(128, 255, 0));
		lbl1.setBounds(170, 36, 180, 30);
		getContentPane().add(lbl1);

		
		btn2.setBounds(50, 56, 180, 30);
		btn2.addActionListener(this);
		getContentPane().add(btn2);
		
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		if  (event.getSource() == btn1 )  {
		System.out.println(event.getSource() + "Bouton Cliquez ici appuyé");
		} 
		else {
			System.out.println("Autre bouton cliqué");
			
		}	
	}
}
