import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;

public class Formulario02 {

	private JFrame frame;
	private JTextField txtDigiteSeuNome;
	private JTextField txtDigiteSeuEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario02 window = new Formulario02();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(61, 0, 121));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		lblNewLabel.setBounds(195, 11, 42, 22);
		frame.getContentPane().add(lblNewLabel);
		
		txtDigiteSeuNome = new JTextField();
		txtDigiteSeuNome.setForeground(new Color(125, 125, 125));
		txtDigiteSeuNome.setText("Digite seu nome...");
		txtDigiteSeuNome.setBackground(new Color(201, 183, 223));
		txtDigiteSeuNome.setBounds(131, 36, 163, 20);
		frame.getContentPane().add(txtDigiteSeuNome);
		txtDigiteSeuNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(174, 67, 79, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtDigiteSeuEmail = new JTextField();
		txtDigiteSeuEmail.setForeground(new Color(125, 125, 125));
		txtDigiteSeuEmail.setText("Digite seu email...");
		txtDigiteSeuEmail.setBackground(new Color(201, 183, 223));
		txtDigiteSeuEmail.setBounds(122, 98, 182, 20);
		frame.getContentPane().add(txtDigiteSeuEmail);
		txtDigiteSeuEmail.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(128, 0, 255));
		btnNewButton.setBounds(171, 157, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
