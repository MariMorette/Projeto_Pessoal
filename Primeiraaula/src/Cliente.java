import java.sql.*;
import java.util.*;
public class Cliente {
	public static void main (String[] args ) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite um nome");
		String nome= sc.nextLine();
		try {
			Connection conexao= PrimeiraConexão.getConnection();
			String sql="INSERT INTO Cliente(nome)values(?)";
			PreparedStatement st= conexao.prepareStatement(sql);
			st.setString(1, nome);
			st.executeUpdate();
			conexao.close();
			System.out.println("Adicionado com sucesso");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
