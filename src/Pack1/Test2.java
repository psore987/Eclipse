package Pack1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class Test2 extends JFrame {

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
		getContentPane().add(btn1);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setForeground(new Color(128, 255, 0));
		lbl1.setBounds(170, 36, 128, 13);
		getContentPane().add(lbl1);

	}
}
