package Pages.Proy_2_QAnova_Piloto;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.TestBase;
import Util.Buscar_Elementos;

public class OP02200_LogoffQA3 extends TestBase {

	static //DECLARACIONES DE LOS OBJETOS
	WebElement e_logoff=null;
	static int elem_no_localizados_4=0;
	static ArrayList<String> arr_Elementos_4;
	

	public static  String Ejec_PaginaLogoff(ArrayList<String> arr_Elementos_3){

		elem_no_localizados=0;
		
		arr_Elementos_3 = ValidaelementosPaginaLogoff(arr_Elementos_3);
		
		if (elem_no_localizados_4 == 0) {
			v_valid_proceso="EXITO";
			logoff();
			esperarSegundos(driver, 3);
		}else {
			v_valid_proceso="FALLA";
		}
		
		arr_Elementos_4	= arr_Elementos_3;
		return v_valid_proceso;
	/*  ------------------------------------------------------------------------------------  */
		
	}
	
	public static ArrayList<String> Retorna_arr_elementos(){
		
		return arr_Elementos_4;
	}
	
	public static  ArrayList<String> ValidaelementosPaginaLogoff(ArrayList<String> arr_elem2){
		
		String v_pag = "PaginaLogoff";
		elem_no_localizados_4=0;

		v_desc_elem = "Logoff";
		v_metodo = "id";
		v_find = "imHeader_pluginAppObj_02";
		e_logoff = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_logoff!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			System.out.println("   No Encontro el elemento");
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados_4++;
		}


		return arr_elem2;
	}


	public static void logoff(){

		try { 
	    	
			Actions builder = new Actions(driver);
			builder.moveToElement(e_logoff).perform();
			builder.moveToElement(e_logoff).click().perform();
//			e_logoff.click();
			
		}
		catch (Exception e) {
			
			System.out.println("------->>   [Error al generar el e_logoff.click ]   <<--------");	
			System.out.println(e);
			System.out.println("------->>   [-----------------------------------]   <<--------");	

		}
	}
	
}
