package A02_Testcases.Proy_3_Empresa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;


public class Conexion_base_datos_empresa01_Test {
   private Connection connection;
   private static Statement statement;
   private static ResultSet rs;

    @BeforeClass
    public void setUp() {
	    String databaseURL = "jdbc:mysql://localhost:3306/empresa_01";
	    String v_user = "root";
	    String v_password = "P@ssw0rd";
	    connection = null;
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        connection = DriverManager.getConnection(databaseURL, v_user, v_password);
	        if (connection != null) {
	            System.out.println("Connected to the Database...");
	        }
	    } catch (SQLException ex) {
	       ex.printStackTrace();
	    }
	    catch (ClassNotFoundException ex) {
	       System.out.println("--->>>ClassNotFoundException...");
	       ex.printStackTrace();
	    }
	}

	@Test
	public void getTableFromDataBase() {
	try {
	    String query = "select * from datos_empleado";
	    statement = connection.createStatement();
	    rs = statement.executeQuery(query);
	
		    while(rs.next()){
		//        int EmpId= rs.getInt("EmpId");
		//        String EmpName= rs.getString("EmpName");
		//        String EmpAddress=rs.getString(3);
		//        String EmpDept=rs.getString("EmpDept");
		//        Double EmpSal= rs.getDouble(5);
		//        System.out.println(EmpId+"\t"+EmpName+"\t"+EmpAddress+"\t"+EmpSal+"\t"+EmpDept);
		        String my_rut = rs.getString(1);								        
		        String my_nombre1 = rs.getString(2);	
		        String my_nombre2 = rs.getString(3);
		        String my_apellido1 = rs.getString(4);
		        String my_apellido2 = rs.getString(5);
		        String my_direccion = rs.getString(6);
		        String my_telefono = rs.getString(7);
		        System. out.println(" | "+my_rut+" | "+my_nombre1+" | "+my_nombre1+" | "+my_nombre2+" | "+my_apellido1+" | "+my_apellido2+" | "+my_direccion+" | "+my_telefono);
		    }
		} catch (SQLException ex) {
		   ex.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
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
