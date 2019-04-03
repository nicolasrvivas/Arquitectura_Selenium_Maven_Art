package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion_BD {
	
//	Abrir conexion con la base de datos
    public static Connection SetUpConnection_DB(String v_databaseURL, String v_user, String v_password) {
//	    v_databaseURL = "jdbc:mysql://localhost:3306/empresa_01";
//	    v_user = "root";
//	    v_password = "P@ssw0rd";
    	
    	Connection connection = null;
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        connection = DriverManager.getConnection(v_databaseURL, v_user, v_password);
	        if (connection != null) {
	            System.out.println("Connected to the Database...");
	        }
	    } catch (SQLException ex) {
	       ex.printStackTrace();
	    } catch (ClassNotFoundException ex) {
	       System.out.println("--->>>ClassNotFoundException...");
	       ex.printStackTrace();
	    }
	    return connection;
	}
    
	public static ResultSet getTableFromDataBase(String query, Connection connection) {
		ResultSet rs = null;
		try {
//		    String query = "select * from datos_empleado";
			Statement statement= null;
		    statement = connection.createStatement();
		    rs = statement.executeQuery(query);
		
			} catch (SQLException ex) {
			   ex.printStackTrace();
			}
			return rs;
		}
	
//    Cerrar conexion con la base de datos
    public static void CloseConectionBD(Connection connection) {
    	if (connection != null) {
    	        try {
    	            System.out.println("Closing Database Connection...");
    	            connection.close();
    	        } catch (SQLException ex) {
    	            ex.printStackTrace();
    	        }
    	    }
    	}

}
