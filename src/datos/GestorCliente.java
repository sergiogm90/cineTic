package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import control.Conexion;
import modelo.Cliente;



public class GestorCliente implements IGestorCliente{

	public void addCliente(Cliente cl) {
		try {
			Connection conexion = new Conexion().getConnection();
			Statement st = conexion.createStatement();
		
			String query =  "INSERT INTO cliente(usuario, password,dni, nombre, apellidos,direccion,codigoPostal, telefono, email) VALUES "
					+ "('"+cl.getUsuario()+"','"+cl.getPassword()+"','"+cl.getDni()+"', '"+cl.getNombre()+"','"+cl.getApellidos()+"','"+cl.getDireccion()+"','"+cl.getCodigoPostal()+"','"+cl.getTelefono()+"','"+cl.getEmail()+"')";
					
			st.executeUpdate(query);
			
			System.out.println("Datos insertados correctamente");

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}


/*	public void eliminarCliente(int idCliente) {
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE * FROM cliente WHERE idCliente=" + idCliente;
			if (stmt.executeUpdate(query) != 1) {

			}
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("No encuentra ning�n cliente con ese id");
		}
	}*/


	public Cliente encontrarCliente(String usuario) {
		Connection con = new Conexion().getConnection();
		Cliente cl=null;
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM cliente WHERE usuario='" +usuario+"'";
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				System.out.println("El nombre introducido no esta asociado a ningún usuario.");
			}else{
				cl= new Cliente(rs.getInt("idcliente"),rs.getString("usuario") ,rs.getString("password"),rs.getString("dni"),rs.getString("nombre"),rs.getString("apellidos"),rs.getString("direccion") ,rs.getString("codigoPostal"), rs.getString("telefono"),rs.getString("email"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return cl;
	}
	
	public List<Cliente> listarCliente() {
		List<Cliente> listaClientes= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM cliente";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idcliente = rs.getInt("idcliente");
				String dni = rs.getString("dni");
				String nombre = rs.getString("nombre");
				String apellidos = rs.getString("apellidos");
				String direccion = rs.getString("direccion");
				String cp = rs.getString("codigoPostal");
				String telefono = rs.getString("telefono");
				String email = rs.getString("email");
				String usuario = rs.getString("usuario");
				String password = rs.getString("password");
				Cliente cliente = new Cliente(idcliente,usuario, password, dni, nombre, apellidos, direccion, cp, telefono, email);
				listaClientes.add(cliente);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaClientes;
	}

	public boolean loginCliente(String usuario,String password){
		boolean respuesta;
		
		Cliente cl=encontrarCliente(usuario);
		System.out.println(cl);
		
		if(cl==null){
			respuesta=false;
		}
		
		else{
			if(cl.getPassword().equals(password)==true){
				respuesta=true;
			}
			else{
				respuesta=false;
			}
		}
		return respuesta;
	}
}

