package A02_Testcases.Proy_3_Empresa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.Proy_3_Empresa.Consulta_BD_empresa_01;

public class Caso_Conexion_BD_empresa01_Test extends TestBase {
	Consulta_BD_empresa_01 Consulta_BD_empresa_01Page;

	
	public Caso_Conexion_BD_empresa01_Test(){
	   	super();
	}
	  
   	@BeforeMethod
	public void setUp(){
		Consulta_BD_empresa_01Page = new Consulta_BD_empresa_01();
	}
   	
	@Test(priority=1)
	public void Consulta_BD_Test(){
	
//      -----------------------------------------------------------------------------------
		System.out.println("------->>   Consulta Base de Datos empresa_01   <<--------");
		String v_databaseURL = "jdbc:mysql://localhost:3306/empresa_01";
		String v_user 		 = "root";
		String v_password 	 = "P@ssw0rd";
		String query 		 = "select * from datos_empleado";
		ResultSet rs 		  = null;
		Connection connection = null;
		connection = Consulta_BD_empresa_01Page.Conexion_BD(v_databaseURL, v_user, v_password);
		
		rs = Consulta_BD_empresa_01Page.Consulta_BD(connection, query);
		
		String vtre_linea = "+----------------------------------------------------------------------------------------------------------------------------------+";
        String vtre_patron_1 = "| %10s | %15s | %15s | %15s | %15s | %30s | %10s |";
        String vtre_titulo_1 = String.format(vtre_patron_1, "Rut", "Nombre 1", "Nombre 2", "Apellido 1", "Apellido 2", "Direccion", "Telefono");
	    System.out.println(vtre_linea);
        System.out.println(vtre_titulo_1);

		try {
			while(rs.next()){
				//        int EmpId= rs.getInt("EmpId");
				//        String EmpName= rs.getString("EmpName");
				//        String EmpAddress=rs.getString(3);
				//        String EmpDept=rs.getString("EmpDept");
				//        Double EmpSal= rs.getDouble(5);
				//        System.out.println(EmpId+"\t"+EmpName+"\t"+EmpAddress+"\t"+EmpSal+"\t"+EmpDept);
			        String my_rut 		= rs.getString(1);								        
			        String my_nombre1 	= rs.getString(2);	
			        String my_nombre2 	= rs.getString(3);
			        String my_apellido1 = rs.getString(4);
			        String my_apellido2 = rs.getString(5);
			        String my_direccion = rs.getString(6);
			        String my_telefono 	= rs.getString(7);
			        String vtre_detalle = String.format(vtre_patron_1, my_rut, my_nombre1, my_nombre2, my_apellido1, my_apellido2, my_direccion, my_telefono);
					System.out.println(vtre_linea);
			        System.out.println(vtre_detalle);
			    }
			
		} catch (SQLException ex) {
		   ex.printStackTrace();
		   System.out.println("    ---->>>>    No genero data el Select   <<<----   ");

		}
		System.out.println(vtre_linea);
		Consulta_BD_empresa_01Page.Cerrar_Conexion_BD(connection);

//        -----------------------------------------------------------------------------------

		Consulta_BD_empresa_01Page.Consulta_Excel();

	} 
}
