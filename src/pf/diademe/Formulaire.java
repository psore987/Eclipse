package pf.diademe;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Formulaire extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// les boutons sont créés comme des variables (attributs) de classe
	private JButton btn1 = new JButton("Cliquez ici");
	private JButton btn2 = new JButton("Cliquez ici aussi ! ");
	private JLabel lbl1 = new JLabel("Texte à remplacer");
	private JPanel contentPane = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulaire formulaire = new Formulaire();
					formulaire.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulaire() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		//Label1
		lbl1.setBounds(170, 36, 180, 30);
		contentPane.add(lbl1);

		// Bouton 1
		btn1.setBounds(49, 32, 85, 21);
		contentPane.add(btn1);
		btn1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					btn1Click(e);
				}
			});
		
		//bouton 2
		btn2.setBounds(50, 56, 180, 30);
		contentPane.add(btn2);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn2Click(e);
			}
		});
		
	}
	
	//événements
	public void btn2Click(ActionEvent e) {
		lbl1.setText("Bouton 2 cliqué");
		System.out.println("Bouton 2 cliqué");
	}
	
	public void btn1Click(ActionEvent e) {
		lbl1.setText("Bouton 1 cliqué");
		System.out.println("Bouton 1 cliqué");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

