import java.sql.*;
public class PrimeiraConexão {
	public static Connection getConnection() {
		String url="jdbc:mysql://localhost:3306/cliente";
		String usuario="root";
		String senha="12345678";
		
		Connection conexao=null;
		try {
			conexao=DriverManager.getConnection(url,usuario,senha);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return conexao;
	}

}
