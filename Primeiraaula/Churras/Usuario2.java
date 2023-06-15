
public class Usuario2 {
	// ATRIBUTOS OU PROPRIEDADES
	private int id;
	private String nome;
	private String email;
	private String foto;
	
	// CONSTRUTOR
	public Usuario2(int id, String nome, String email, String foto) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.foto = foto;
	}
	
	// METÓDOS (GETTERS OU SETTERS)
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getFoto() {
		return foto;
	}

}
