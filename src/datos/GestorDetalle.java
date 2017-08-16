package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import control.Conexion;
import modelo.Detalle;
import modelo.Prueba;;

public class GestorDetalle implements IGestorDetalle{

	
	public void addDetalle(int idpelicula, int idcliente) {
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			Detalle detalle = null;
			detalle = encontrarDetalleCliente(idcliente,idpelicula);
			if (detalle == null) {
				detalle = new Detalle();
				String query = "INSERT INTO detalle(idcompra, idpelicula, cantidad, idcliente) VALUES ('"+detalle.getIdCompra()+"', '"+idpelicula+"', '1','"+idcliente+"')";
				if (stmt.executeUpdate(query) != 1) {
					// throw new DAOException("Error adding employee");
					}
			}else{
				int cantidad = detalle.getCantidad();				
				cantidad++;
				String query = "UPDATE detalle SET "
	                    + "idcompra='" + detalle.getIdCompra() + "',"
	                    + "idpelicula='" + detalle.getIdPelicula() + "',"
	                    + "cantidad='" + cantidad + "',"
	                    + "idcliente=" + detalle.getIdCliente()
	                    + " WHERE iddetalle=" + detalle.getIdDetalle();
				if (stmt.executeUpdate(query) != 1) {
					// throw new DAOException("Error adding employee");
					}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	
	

	public void reducirDetalle(int idpelicula, int idcliente) {
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			Detalle detalle = encontrarDetalleCliente(idcliente, idpelicula);
			if (detalle.getCantidad() == 1) {
				String query = "DELETE  FROM detalle WHERE iddetalle=" + detalle.getIdDetalle();
				if (stmt.executeUpdate(query) != 1) {
					// throw new DAOException("Error adding employee");
					}
			}else{
				int cantidad = detalle.getCantidad();
				cantidad--;
				System.out.println(cantidad);
				String query = "UPDATE detalle SET "
	                    + "idcompra='" + detalle.getIdCompra() + "',"
	                    + "idpelicula='" + detalle.getIdPelicula() + "',"
	                    + "cantidad='" + cantidad + "',"
	                    + "idcliente=" + detalle.getIdCliente()
	                    + " WHERE iddetalle=" + detalle.getIdDetalle();
				if (stmt.executeUpdate(query) != 1) {
					// throw new DAOException("Error adding employee");
					}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
	}
	
	public void vaciarCarrito(int idcliente) {
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE FROM detalle WHERE idcliente=" + idcliente;
			if (stmt.executeUpdate(query) != 1) {	
			}
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("No encuentra ning�n detalle con ese id");
		}
	}
	
	public void eliminarDetalle(int idDetalle) {
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE FROM detalle WHERE iddetalle=" + idDetalle;
			if (stmt.executeUpdate(query) != 1) {	
			}
		} catch (SQLException se) {
			se.printStackTrace();
			System.out.println("No encuentra ning�n detalle con ese id");
		}
	}

	public Detalle encontrarDetalleCliente(int idcliente, int idpelicula) {
		Connection con = new Conexion().getConnection();
		Detalle d = null;
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM detalle WHERE idcliente=" + idcliente+" AND idpelicula=" + idpelicula;
			ResultSet rs = stmt.executeQuery(query);			
			if (!rs.next()) {
				System.out.println("El cliente con id "+ idcliente+" introducido no est� asociado a ning�n detalle.");
			} else {
				d = new Detalle(rs.getInt("iddetalle"), rs.getInt("idcompra"), rs.getInt("idpelicula"),
						rs.getInt("cantidad"), rs.getInt("idcliente"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return d;
	}
	
	public Detalle encontrarDetalle(int idDetalle){
		Connection con = new Conexion().getConnection();
		Detalle d=null;
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM cliente WHERE idDetalle=" + idDetalle;
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				System.out.println("El id introducido no est� asociado a ning�n detalle.");
			}else{
				d = new Detalle(rs.getInt("idDetalle"), rs.getInt("idCliente"), rs.getInt("idPelicula"),
						rs.getInt("cantidad"), rs.getInt("idCliente"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return d;
		
	}
	
	public List<Detalle> listarDetalle(int idCliente) {
		List<Detalle> listaDetalle= new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM detalle WHERE idcliente="+ idCliente;
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idDetalle = rs.getInt("idpelicula");
				int idPelicula = rs.getInt("idpelicula");
				int idCompra = rs.getInt("idcompra");
				int cantidad = rs.getInt("cantidad");
				Detalle detalle = new Detalle(idCompra, idPelicula, cantidad, idCliente);
				listaDetalle.add(detalle);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaDetalle;
	}

	public List<Prueba> listarCarrito(int idCliente) {
		List<Prueba> listaCarrito = new ArrayList<>();
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT p.idpelicula, p.imagen, p.titulo, d.cantidad, p.precio FROM pelicula p, detalle d WHERE p.idpelicula = d.idpelicula AND idcliente="+ idCliente;
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idpelicula = rs.getInt("idpelicula");
				String imagen = rs.getString("imagen");
				String titulo = rs.getString("titulo");
				int cantidad = rs.getInt("cantidad");
				double precio = rs.getDouble("precio");
				Prueba fila= new Prueba(idpelicula, imagen, titulo, cantidad, precio);
				listaCarrito.add(fila);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return listaCarrito;
	}
	
	public void listarDetalle() {
		Connection con = new Conexion().getConnection();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM detalle";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				int idDetalle = rs.getInt("idDetalle");
				int idCliente = rs.getInt("idCliente");
				int idPelicula = rs.getInt("idPelicula");				
				System.out.println("idDetalle: "+idDetalle+" , idCliente: "+idCliente+" , idPelicula: "+idPelicula);
			}
		} catch (SQLException se) {
			//se.printStackTrace();
			// throw new DAOException("Error getting all employees in DAO: " + se.getMessage(), se);
		}
		
	}


}

