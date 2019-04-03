package Pages.Proy_2_Genericos;


import org.openqa.selenium.WebElement;

import Base.TestBase;
import Util.Buscar_Elementos;

public class GP02035_Valid_Titulo_Matriz_Informacion extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	static WebElement e_titulo;
	
	public static String Validaelementos_Matriz_Informacion(){
		elem_no_localizados=0;
		String v_titulo=null;
		String v_pag = "Matriz_de_información";

		v_desc_elem = "Titulo";
		v_metodo = "xpath";
		v_find = "//*[@id=\'imPgTitle\']";
		e_titulo = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_titulo!=null) {
			   // Actualiza arreglo para el documento Word

			 v_titulo = e_titulo.getText();
			 
			 System.out.println("------->>   e_titulo.getText <<------   ["+v_titulo+"]");
			 
		}else {

			 elem_no_localizados++;
		}
		return v_titulo;
	}
	
}
