package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import control.Conexion;
import modelo.Compra;

public class GestorCompra implements IGestorCompra{

	//Hay que crear un m�todo para asociar una compra con un cliente, pero antonio ha dicho que lo dejemos para m�s adelante a ver lo que nos da tiempo terminar.

	public void addCompra(Compra c) {
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "INSERT INTO compra(fecha,idCliente) VALUES ('c.getFecha()','c.getidCliente')";
			if (stmt.executeUpdate(query) != 1) {

			}
		} catch (SQLException se) {
			System.out.println("Error");
		}
	}

	public void eliminarCompra(int idCompra) {
		Connection con = new Conexion().getConnection();
		if (con == null) {
			System.out.println("No se ha podido conectar");
		}
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE FROM compra WHERE idCompra=" + idCompra;
			if (stmt.executeUpdate(query) != 1) {
			}
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("No encuentra ninguna compra con ese id");
		}
	}

	public Compra encontrarCompra(int idCompra){
		Connection con = new Conexion().getConnection();
		Compra co=null;
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM compra WHERE idCompra=" + idCompra;
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				System.out.println("El id introducido no est� asociado a ninguna compra.");
			}else{
				co= new Compra(rs.getInt("idCompra"), rs.getDate("fecha"), rs.getInt("idCliente"));
			}

		} catch (SQLException se) {
			se.printStackTrace();
		}
		return co;
	}

	public void listarCompra(){
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM compra";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idCompra = rs.getInt("idCompra");
				Date fecha = rs.getDate("fecha");
				int idCliente = rs.getInt("idCliente");
				System.out.println("idCompra: "+idCompra+" , fecha: "+fecha+" , idCliente: "+idCliente);
			}
		} catch (SQLException se) {
			System.out.println("Error");
		}
	}

}
