package Pages.Proy_3_Empresa;

import java.sql.Connection;
import java.sql.ResultSet;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import Base.TestBase;

import Util.ReadExcelFile;
import BaseDatos.Conexion_BD;

public class Consulta_BD_empresa_01 extends TestBase {
	
		
	public static Connection Conexion_BD(String v_databaseURL, String v_user, String v_password){

		Connection connection = null;

//		String v_databaseURL = "jdbc:mysql://localhost:3306/empresa_01";
//		String v_user 		 = "root";
//		String v_password 	 = "P@ssw0rd";
//		String query 		 = "select * from datos_empleado";
		
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
	
	public void Consulta_Excel(){
//	---------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	//  Definición de datos de entrada desde excel
		String d_Usuario = null;
		String d_Pass = null;
		String d_campo_text = null;
		String d_Campo_Area_de_Texto = null;
		String d_campo_mail = null;
		String d_campo_fecha = null;
		String d_campo_lista = null;
		String d_seleccion = null;
		String d_radio_button = null;
		
   	//-------------------------------------------------------------------------------------------

	//Prepare the path of excel file
	    String filePath = prop.getProperty("d_directorio");

	    //Call read file method of the class to read data
	    
	    Sheet Sheet_Carga_Informacion = ReadExcelFile.readExcel(filePath,"TestData.xlsx","Hoja1");
	    
	    
	 //Find number of rows in excel file
	    int rowCount = Sheet_Carga_Informacion.getLastRowNum()-Sheet_Carga_Informacion.getFirstRowNum();
	
	    String vtre_linea = "+----------------------------------------------------------------------------------------------------------------------------------+";
        String vtre_patron_1 = "| %10s | %10s | %20s | %27s | %19s | %12s | %12s |";
        String vtre_titulo_1 = String.format(vtre_patron_1, "Usuario", "Pass", "campo_text", "Campo_Area_de_Texto", "campo_mail", "campo_fecha", "campo_lista","seleccion","radio_button");
	    System.out.println(vtre_linea);
        System.out.println(vtre_titulo_1);
        
	 //Create a loop over all the rows of excel file to read it
	    for (int i = 1; i < rowCount+1; i++) {
	
	        Row row = Sheet_Carga_Informacion.getRow(i);
	        
	        d_Usuario = row.getCell(1).getStringCellValue();
	        d_Pass = row.getCell(2).getStringCellValue();
	        d_campo_text = row.getCell(3).getStringCellValue();
	        d_Campo_Area_de_Texto = row.getCell(4).getStringCellValue();
	        d_campo_mail = row.getCell(5).getStringCellValue();
	        d_campo_fecha = row.getCell(6).getStringCellValue();
	        d_campo_lista = row.getCell(7).getStringCellValue();
	        d_seleccion = row.getCell(8).getStringCellValue();
	        d_radio_button = row.getCell(9).getStringCellValue();
	        String vtre_detalle_1 = String.format(vtre_patron_1, d_Usuario, d_Pass, d_campo_text, d_Campo_Area_de_Texto, d_campo_mail, d_campo_fecha, d_campo_lista, d_seleccion, d_radio_button);
	        System.out.println(vtre_linea);
	        System.out.println(vtre_detalle_1);
	    }
	    System.out.println(vtre_linea);
	//	---------------------------------------------------------------------------------------------
	  }
}
