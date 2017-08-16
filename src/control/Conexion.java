package control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	Connection connection = null;
    String BD = "cinetic";
    String driverClassName = "com.mysql.jdbc.Driver";
    String driverUrl = "jdbc:mysql://localhost:3306/"+BD;
    String user = "root";
    String password = "1111";

    public Conexion() {
        try {         
            Class.forName(driverClassName);
            connection = DriverManager.getConnection(driverUrl, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("No se encuentra el driver");
        } catch (SQLException e) {
            System.out.println("Excepcion SQL: " + e.getMessage());
            System.out.println("Estado SQL: " + e.getSQLState());
            System.out.println("Código del Error: " + e.getErrorCode());
            System.out.println("ERROR. No se puede conectar con la Bases de Datos: " + e);
            System.exit(-1);
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException se) {
            System.out.println("Excepcion desconectando: " + se);
        }
    }
}

