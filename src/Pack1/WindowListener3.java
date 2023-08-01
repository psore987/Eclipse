package Pack1;


import java.awt.*;
import java.axt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class WindowListener3 extends JFrame {

	/**
	 * 
	 */
	
	// les boutons sont créés comme des variables (attributs) de classe
	private JButton btn1 = new JButton("Cliquez ici");
	private JButton btn2 = new JButton("Cliquez ici aussi ! ");
	private JLabel lbl1 = new JLabel("");
	
	
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowListener3 frame = new WindowListener3();
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
	public WindowListener3() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		btn1.setBounds(49, 32, 85, 21);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1Click(e);
			}
		});
		
		getContentPane().add(btn1);
		
		lbl1.setForeground(new Color(0,0,0));
		lbl1.setBounds(170, 26, 180, 30);
		getContentPane().add(lbl1);

		
		btn2.setBounds(50, 56, 180, 30);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn2Click(e);
			}
		});

	
		getContentPane().add(btn2);
	}	
	
	public void btn1Click(ActionEvent e) {
		btn2.setText("Ouille ! ");
		System.out.println("Bouton 1 Cliqué");
	}
	
	public void btn2Click(ActionEvent e) {
		lbl1.setText("Vraiment ?");
		System.out.println("Bouton 2 cliqué");
	}

}