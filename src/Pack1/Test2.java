package Pack1;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class Test2 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2 frame = new Test2();
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
	public Test2() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("Cliquez ici");
		btn1.setBounds(49, 32, 85, 21);
		btn1.addActionListener(this);
		getContentPane().add(btn1);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setForeground(new Color(128, 255, 0));
		lbl1.setBounds(170, 36, 180, 30);
		getContentPane().add(lbl1);

		JButton btn2 = new JButton("Cliquez ici aussi ! ");
		btn2.setBounds(50, 56, 180, 30);
		btn2.addActionListener(this);
		getContentPane().add(btn2);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Bouton cliqué");
		
	}
}
