import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario01 {
public static void main(String[] args) {
	JPanel panel = new JPanel(); //CRIANDO PAINEL
	JTextField campoNome = new JTextField(20); //CRIANDO O CAMPO PARA ESCREVER 
	JLabel lblNome = new JLabel("Nome"); //NOME
	JTextField campoEmail = new JTextField(20); //CRIANDO CAMPO PARA ESCREVER
	JLabel lblEmail = new JLabel("Email"); //EMAIL
	JButton btnSalvar = new JButton("Salvar"); //BOTÃO
	
	panel.add(lblNome);
	panel.add(campoNome);
	panel.add(lblEmail);
	panel.add(campoEmail);
	panel.add(btnSalvar);
	
	btnSalvar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			Connection conn = null;
			PreparedStatement stnt = null;
			try
			{
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Agenda", "root", "12345678");
				String sql = "INSERT INTO Usuario(nome, email) VALUES(?,?)";
				stnt = conn.prepareStatement(sql);
				stnt.setString(1, campoNome.getText());
				stnt.setString(2, campoEmail.getText());
				stnt.executeUpdate();
				System.out.println("Dados salvos com sucesso!");
			}catch (SQLException ex)
			{
				System.out.println("Erro ao salvar no banco");
			}
		}
	});
	
	JFrame frame = new JFrame();
	frame.setTitle("Primeiro Formulário");
	frame.setSize(270, 400);
	frame.add(panel);
	frame.setVisible(true);
}
}
