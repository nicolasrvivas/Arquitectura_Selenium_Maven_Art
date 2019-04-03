package Pages.Proy_2_QAnova_Piloto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import Base.TestBase;
import BaseDatos.Conexion_BD;
// import Util.Genera_Archivo;

public class OP02100_Data_Entrada_BD extends TestBase {

 // DECLARACIONES DE LOS OBJETOS 
	
	WebElement e_user						= null;
	WebElement e_pass						= null;
	WebElement e_btnLogin					= null;
	WebElement e_logo						= null;
	WebElement e_link_carga_de_informacion	= null;
	WebElement e_link_matriz_de_informacion	= null;
	WebElement e_link_descarga_de_archivos	= null;
	WebElement e_link_editar_informe_pago	= null;
	WebElement e_element					= null;
	static String v_valid_proceso_4				= null;
	
	
	public ArrayList<String> Ejec_PaginaInicioQA2(String v_caso_nombre){
		ArrayList<String> arr_data2 = new ArrayList<String>();
//		String d_caso 				= null;
    /*  =============================================================================================  */
	/*  --------------------         Conexion a la base de datos         ----------------------------  */
	/*  ---------------------------------------------------------------------------------------------  */

		System.out.println("------->>   Consulta Base de Datos [proy_qanova_piloto] tabla  [datos_carga]  <<--------");
		String v_databaseURL = "jdbc:mysql://localhost:3306/proy_qanova_piloto";
		String v_user 		 = "root";
		String v_password 	 = "P@ssw0rd";
		String query 		 = "Select * from datos_carga where BD_CASO='"+v_caso_nombre+"'";
		ResultSet rs 		  = null;
		java.sql.Connection connection = null;
		connection = Conexion_BD.SetUpConnection_DB(v_databaseURL, v_user, v_password);
		
		rs = Conexion_BD.getTableFromDataBase(query, connection);
		
		String vtre_linea = "+---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+";
		String vtre_patron_1 = "| %7s | %30s | %12s | %10s | %32s | %32s | %25s | %11s | %11s | %11s | %12s |";
		String vtre_titulo_1 = String.format(vtre_patron_1, "Caso", "Descripción Caso", "Usuario", "Pass", "campo_text", "Campo_Area_de_Texto", "campo_mail", "campo_fecha", "campo_lista", "seleccion", "radio_button");
		System.out.println(vtre_linea);
		System.out.println(vtre_titulo_1);
		
		try {
			while(rs.next()){

													        
					arr_data2.add(rs.getString(1));	
					arr_data2.add(rs.getString(2));
					arr_data2.add(rs.getString(3));
					arr_data2.add(rs.getString(4));
					arr_data2.add(rs.getString(5));
					arr_data2.add(rs.getString(6));
					arr_data2.add(rs.getString(7));
					arr_data2.add(rs.getString(8));
					arr_data2.add(rs.getString(9));
					arr_data2.add(rs.getString(10));
					arr_data2.add(rs.getString(11));

					String vtre_detalle = String.format(vtre_patron_1, arr_data2.get(0), arr_data2.get(1), arr_data2.get(2), arr_data2.get(3), arr_data2.get(4), arr_data2.get(5), arr_data2.get(6), arr_data2.get(7), arr_data2.get(8), arr_data2.get(9), arr_data2.get(10));

					System.out.println(vtre_linea);
					System.out.println(vtre_detalle);

					v_valid_proceso_4="EXITO";

			  }
		
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("    ---->>>>    No genero data el Select   <<<----   ");
			v_valid_proceso_4="FALLA";
		}
			System.out.println(vtre_linea);
			Conexion_BD.CloseConectionBD(connection);
	
		/*  ---------------------------------------------------------------------------------------------  */
	
		/*  --------------------------------------------------------------------------------------------  */
			return arr_data2;
		}
	
	public static String Retorna_valid_proceso(){
		
		return v_valid_proceso_4;
	}
		
}
