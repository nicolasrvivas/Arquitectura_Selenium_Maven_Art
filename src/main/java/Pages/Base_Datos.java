package Pages;

import java.sql.Connection;
import java.sql.ResultSet;
import Base.TestBase;
import BaseDatos.Conexion_BD;

public class Base_Datos extends TestBase {
	
		
	public static Connection Conexion_BD(String v_databaseURL, String v_user, String v_password){

		Connection connection = null;

		connection = Conexion_BD.SetUpConnection_DB(v_databaseURL, v_user, v_password);
		
		return connection;
	}
	
	public static ResultSet Consulta_BD(Connection connection, String query){
		ResultSet rs 		  = null;
		rs = Conexion_BD.getTableFromDataBase(query, connection);
		return rs;
	}
	
	public void Cerrar_Conexion_BD(Connection connection){
		Conexion_BD.CloseConectionBD(connection);
	}
	
}
