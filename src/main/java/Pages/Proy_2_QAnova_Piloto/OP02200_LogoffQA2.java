package Pages.Proy_2_QAnova_Piloto;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.TestBase;
import Util.Buscar_Elementos;

public class OP02200_LogoffQA2 extends TestBase {

	//DECLARACIONES DE LOS OBJETOS
	static WebElement e_logoff=null;
	

	public static  ArrayList<String> ValidaelementosPaginaLogoff(ArrayList<String> arr_elem2){
		
		String v_pag = "PaginaLogoff";
		elem_no_localizados=0;

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
			 elem_no_localizados++;
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
			
			System.out.println("------->>        Error al generar el e_logoff.click          <<--------"+e);	


		}
	}
	
}
