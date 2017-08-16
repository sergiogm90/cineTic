package modelo;

public class Cliente {

	private int idcliente;
	private String usuario;
	private String password;
	private String dni;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String codigoPostal;
	private String telefono;
	private String email;

	
	public Cliente() {
		super();
	}


	public Cliente(int idcliente, String usuario, String password, String dni,
			String nombre, String apellidos, String direccion, String codigoPostal,
			String telefono, String email) {
		super();
		this.idcliente = idcliente;
		this.usuario = usuario;
		this.password = password;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.email = email;
	}


	public Cliente(String usuario, String password, String dni, String nombre,
			String apellidos, String direccion, String codigoPostal, String telefono,
			String email) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.email = email;
	}


	public int getIdcliente() {
		return idcliente;
	}


	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", usuario=" + usuario
				+ ", password=" + password + ", dni=" + dni + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", direccion="
				+ direccion + ", codigoPostal=" + codigoPostal + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}

}
