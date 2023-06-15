import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.sql.*;
import java.awt.*;

public class Usuario extends JFrame {
	
	private JTable tabela;
	
	public Usuario() {
		super("Tabela de Usuários");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// CONEXÃO COM O BANCO DE DADOS
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Form", "root", "12345678");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		//CÓDIGO SQL PARA OBTER OS REGISTROS DA TABELA USUÁRIO
		String sql = "select * from Usuario";
		
		//CRIANDO O MODELO DA TABELA
		DefaultTableModel modelo = new DefaultTableModel();
		tabela = new JTable(modelo);
		JScrollPane scroll = new JScrollPane(tabela);
		add(scroll, BorderLayout.CENTER);
		
		//RECUPERANDO OS DADOS DO BANCO DE DADOS
		try {
			Statement stnt = conn.createStatement();
			ResultSet rs = stnt.executeQuery(sql);
			
			//OBTENDO OS METADADOS DA TABELA
			ResultSetMetaData meta = (ResultSetMetaData) rs.getMetaData();
			int colCount = meta.getColumnCount();
			
			//ADICIONANDO AS COLUNAS DA NOSSA TABELA DO BANCO DE DADOS A NOSSA TABELA JAVA
			for (int i = 1; i <= colCount; i++) {
				modelo.addColumn(meta.getColumnName(i));
			}
			
			//ADICIONANDO OS REGISTROS DA NOSSA TABELA NAS LINHAS DA TABELA JAVA
			while (rs.next()) {
				Object[] row = new Object[colCount];
				for (int i = 1; i <= colCount; i++) {
					row[i-1] = rs.getObject(i);
				}
				modelo.addRow(row);
			}
			rs.close();
			stnt.close();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Usuario();
	}
	
	
}
