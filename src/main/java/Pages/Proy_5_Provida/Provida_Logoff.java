package Pages.Proy_5_Provida;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
import Util.Genera_Archivo;
import Util.Buscar_Elementos;

public class Provida_Logoff extends TestBase {

	//DECLARACIONES DE LOS OBJETOS
	WebElement e_btnLogoff=null;
	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public Provida_Logoff() {
		PageFactory.initElements(driver, this);
	}
	
	// ACCIONES PARA VALIDAR
	public String ValidacionPaginaInicio() {
		return driver.getTitle();
	}

	public  ArrayList<String> ValidaelementosPaginaInicio(ArrayList<String> arr_elem2){
	/* ================	//    OJO    Imprimir codigo fuente en consola  =================  */
		String pageSource = driver.getPageSource();
		Genera_Archivo.Escribir_Archivos(pageSource,"Codigo_Page_Provida_Login.html");


		String v_pag = "ProvidaPaginaLogoff";
		elem_no_localizados=0;

		v_desc_elem = "Salir";
		v_metodo = "xpath";
		v_find = "/html/body/form/font/table/tbody/tr[4]/td/input";
		e_btnLogoff = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_btnLogoff!=null) {
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
			 System.out.println("  --->>>  elem_no_localizados  <<<---  "+elem_no_localizados);
		}
		
		return arr_elem2;
	}

	public  void logoff(){
		
		//ArrayList<String> x = new ArrayList<String>();
		e_btnLogoff.click();
	}
	
}
