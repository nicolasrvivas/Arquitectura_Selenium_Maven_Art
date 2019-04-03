package Pages.Proy_2_Genericos;

import org.openqa.selenium.WebElement;
import Base.TestBase;
import Util.Buscar_Elementos;

public class GP02025_Valid_Titulo_Matriz_Informacion extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	WebElement e_titulo;
	
	public String Validaelementos_Matriz(int timeOutInSeconds){
		elem_no_localizados=0;
		String v_titulo=null;
		String v_pag = "Matriz_de_información";
		
		for(int Count = 0;Count<=timeOutInSeconds;Count++){

			v_desc_elem = "Titulo";
			v_metodo = "xpath";
			v_find = "//*[@id=\'imPgTitle\']";
			e_titulo = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_titulo!=null) {
				 v_titulo = e_titulo.getText();
				 break;
			}else {
				if (Count==timeOutInSeconds)
				 elem_no_localizados++;
			}

		}
		return v_titulo;
	}
	
}
