package Pages.Proy_2_Genericos;


import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.TestBase;
import Util.Buscar_Elementos;

public class GP02030_Link_Matriz_Informacion extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	static WebElement e_link_Matriz_Informacion=null;

	
	public static String  cambio_Matriz_Informacion(ArrayList<String> arr_elem2){
		elem_no_localizados=0;
		String v_pag = "Carga_de_información";
	
		v_desc_elem = "link_Matriz_Informacion";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imMnMnNode4\"]/a/span/span/span[1]";
		e_link_Matriz_Informacion = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_Matriz_Informacion!=null) {
		// Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
//			 e_link_Matriz_Informacion.click();
			 Actions actions = new Actions(driver);
			 actions.moveToElement(e_link_Matriz_Informacion);
			 actions.click();
			 actions.sendKeys("SOME DATA");
			 actions.build().perform();
			 v_valid_proceso="EXITO";
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
			 v_valid_proceso="FALLA";
		}

		return v_valid_proceso;
	}
	

	
}
