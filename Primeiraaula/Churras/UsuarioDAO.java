import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
	// ATRIBUTO OU PROPRIEDADE
	Connection conexao = null;
	
	// CONSTRUTOR
	public UsuarioDAO() {
		try {
			String url = "jdbc:mysql://localhost:3306/AgendaTerceiroCTI";
			String usuario = "root";
			String senha = "12345678";
			conexao = DriverManager.getConnection(url, usuario, senha);
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void inserirUsuario(Usuario2 usuario) {
		String query = "INSERT INTO Usuario2 (nome, email, foto) VALUE(?, ?, ?)";
		try {
			PreparedStatement statement = conexao.prepareStatement(query);
			statement.setString(1,  usuario.getNome());
			statement.setString(2,  usuario.getEmail());
			statement.setString(3,  usuario.getFoto());
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void atualizarUsuario(Usuario2 usuario) {
		String query = "UPDATE Usuario2 SET nome = ?, email = ?, foto = ? WHERE id = ?";
		try {
			PreparedStatement statement = conexao.prepareStatement(query);
			statement.setString(1,  usuario.getNome());
			statement.setString(2,  usuario.getEmail());
			statement.setString(3,  usuario.getFoto());
			statement.setInt(4,  usuario.getId());
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluirUsuario(int id) {
		String query = "DELETE FROM Usuario WHERE id = ?";
		try {
			PreparedStatement statement = conexao.prepareStatement(query);
			statement.setInt(1,  id);
			statement.executeUpdate();
			statement.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<Usuario2> listarUsuario(){
		List<Usuario2> usuarios = new ArrayList<>();
		String query = "SELECT id, nome, email FROM Usuario";
		try {
			PreparedStatement statement = conexao.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String email = resultSet.getString("email");
				String foto = resultSet.getString("foto");
				Usuario2 usuario = new Usuario2(id, nome, email, foto);
				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
	public Usuario2 retornaUsuario(Object usuarioId) {
		Usuario2 usuario = new Usuario2(0, "", "", null);
		String query = "SELECT id, nome, email, foto FROM Usuario where id = ?";
		try {
			PreparedStatement statement = conexao.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String email = resultSet.getString("email");
				String foto = resultSet.getString("foto");
				usuario.setId(id);
				usuario.setNome(nome);
				usuario.setEmail(email);
				usuario.setFoto(foto);
			}
			statement.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}

}
