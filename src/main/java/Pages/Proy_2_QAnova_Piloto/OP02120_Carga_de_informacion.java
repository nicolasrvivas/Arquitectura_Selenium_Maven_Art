package Pages.Proy_2_QAnova_Piloto;


import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.TestBase;
import Pages.Proy_2_Genericos.GP02015_Return_Page_Title;
import Pages.Proy_2_Genericos.GP02020_Return_Var_Elem_no_localizados;
import Util.Buscar_Elementos;
import Util.Captura_Pantalla;

public class OP02120_Carga_de_informacion extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	WebElement e_titulo;
	WebElement e_campo_texto;
	WebElement e_campo_area;
	WebElement e_campo_mail;
	WebElement e_campo_fecha;
	WebElement e_campo_lista;
	WebElement e_seleccion_1;
	WebElement e_seleccion_2;
	WebElement e_seleccion_3;
	WebElement e_radio_button1;
	WebElement e_radio_button2;
	WebElement e_radio_button3;
	WebElement e_boton_enviar;
	WebElement e_boton_resetear;
	int v_cont_4=0;
	ArrayList<String> arr_datos_4;
	ArrayList<String> arr_Elementos_4;
	ArrayList<String> arr_Evidencia_4;

	public String Ejec_Carga_de_informacion(String v_campo_texto,
											String v_Campo_Area_de_Texto,
											String v_campo_mail,
											String v_campo_fecha,
											String v_campo_lista,
											String v_seleccion,
											String v_radio_button,
											String v_name_imagen,
											int v_cont_3, 
											ArrayList<String> arr_datos_3,
											ArrayList<String> arr_Elementos_3,
											ArrayList<String> arr_Evidencia_3){

	/*  =====================================================================================  */

		arr_Elementos_3 = Validaelementos_Carga_de_informacion(arr_Elementos_3);
		
		elem_no_localizados = GP02020_Return_Var_Elem_no_localizados.Valida_elementos_localizados();

		if (elem_no_localizados == 0) {
			v_valid_proceso="EXITO";
		}else {
			v_valid_proceso="FALLA";
		}
	
	/*  -------------------------------------------------------------------------------------  */	
		if (v_valid_proceso=="EXITO"){
			arr_datos_3 = Carga_Datos(v_campo_texto,
									v_Campo_Area_de_Texto, 
									v_campo_mail,
									v_campo_fecha, 
									v_campo_lista, 
									v_seleccion, 
									v_radio_button,
									arr_datos_3);	
		}
		
    	esperarSegundos(driver, 3);
	/*  -------------------------------------------------------------------------------------  */
	/*  ---------------------------------------------------------------------------------  */
		
		if (v_valid_proceso=="EXITO"){
			String title3 = GP02015_Return_Page_Title.Titulo_Pagina_Presente(20,"Matriz de información - Presentación QA Técnico");
	
			if(title3.equals("Matriz de información - Presentación QA Técnico")) {
				arr_Evidencia_3.add("Matriz de Información;");
				arr_Evidencia_3.add("Se ingreso Correctamente a la Matriz de información;");
				arr_Evidencia_3.add("Passed;");
				v_valid_proceso="EXITO";
			}else {
				arr_Evidencia_3.add("Matriz de Información;");
				arr_Evidencia_3.add("No se ingreso Correctamente a la Matriz de información;");
				arr_Evidencia_3.add("Failed;");
				v_valid_proceso="FALLA";
			}
			
			Captura_Pantalla.takeScreenShotTest(driver,v_name_imagen+v_cont_3);
			v_cont_3++;
		}

	/*  ---------------------------------------------------------------------------------  */
		arr_datos_4		= arr_datos_3;
		arr_Elementos_4	= arr_Elementos_3;
		arr_Evidencia_4	= arr_Evidencia_3;
		v_cont_4 		= v_cont_3;
		return v_valid_proceso;
	}
	
	public ArrayList<String> Retorna_arr_datos(){
		
		return arr_datos_4;
	}
	
	public ArrayList<String> Retorna_arr_elementos(){
		
		return arr_Elementos_4;
	}
	
	public ArrayList<String> Retorna_arr_evidencia(){
		
		return arr_Evidencia_4;
	}
	
	public int Retorna_cont(){
		
		return v_cont_4;
	}
	
	public ArrayList<String> Validaelementos_Carga_de_informacion(ArrayList<String> arr_elem2){

		elem_no_localizados=0;
		String v_pag = "Carga_de_información";

		v_desc_elem = "Titulo";
		v_metodo = "id";
		v_find = "imPgTitle";
		e_titulo = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_titulo!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
			 
		v_desc_elem = "Campo_Texto";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imObjectForm_1_2\"]";
		e_campo_texto = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_texto!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		
		v_desc_elem = "campo_area";
		v_metodo = "name";
		v_find = "Campo_Area_de_Texto";
		e_campo_area = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_area!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		
		v_desc_elem = "campo_mail";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imObjectForm_1_3\"]";
		e_campo_mail = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_mail!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "campo_fecha";
		v_metodo = "id";
		v_find = "imObjectForm_1_5";
		e_campo_fecha = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_fecha!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "campo_lista";
		v_metodo = "id";
		v_find = "imObjectForm_1_6";
		e_campo_lista = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_lista!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "seleccion_1";
		v_metodo = "id";
		v_find = "imObjectForm_1_7_0";
		e_seleccion_1 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_seleccion_1!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		 
		v_desc_elem = "seleccion_2";
		v_metodo = "id";
		v_find = "imObjectForm_1_7_0";
		e_seleccion_2 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_seleccion_2!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		
		v_desc_elem = "seleccion_3";
		v_metodo = "id";
		v_find = "imObjectForm_1_7_2";
		e_seleccion_3 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_seleccion_3!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
					 
		v_desc_elem = "radio_button1";
		v_metodo = "id";
		v_find = "imObjectForm_1_8_0";
		e_radio_button1 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_radio_button1!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "radio_button2";
		v_metodo = "id";
		v_find = "imObjectForm_1_8_1";
		e_radio_button2 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_radio_button2!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "radio_button3";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imObjectForm_1_8_2\"]";
		e_radio_button3 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_radio_button3!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "boton_enviar";
		v_metodo = "id";
		v_find = "imObjectForm_1_submit";
		e_boton_enviar = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_boton_enviar!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "boton_resetear";
		v_metodo = "xpath";
		v_find = "/html/body/div[3]/div[3]/div[2]/div[2]/div/div/div[2]/form/div/input[2]";
		e_boton_resetear = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_boton_resetear!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		 
		return arr_elem2;
	}
	   
	public ArrayList<String> Carga_Datos(String v_campo_texto,   String v_campo_area, String v_campo_mail, String v_campo_fecha, String v_campo_lista, String v_seleccion, String v_radio_button,ArrayList<String> arr_datos_2){
	
		e_campo_texto.sendKeys(v_campo_texto);
		e_campo_area.sendKeys(v_campo_area);
		e_campo_mail.sendKeys(v_campo_mail);
		e_campo_fecha.sendKeys(v_campo_fecha);
		e_campo_lista.sendKeys(v_campo_lista);

		switch (v_seleccion) {
		case "selección 1":
			e_seleccion_1.sendKeys(v_seleccion);
			break;
		case "selección 2":
			e_seleccion_2.sendKeys(v_seleccion);
			break;
		case "selección 3":
			e_seleccion_3.sendKeys(v_seleccion);
			break;
		}		
		
		switch (v_radio_button) {
		case "cr 1":
			e_radio_button1.sendKeys(v_radio_button);
			break;
		case "cr 2":
			e_radio_button2.sendKeys(v_radio_button);
			break;
		case "cr 3":
			e_radio_button3.sendKeys(v_radio_button);
			break;
		}

		
		try { 
			
			Actions builder = new Actions(driver);
			builder.moveToElement(e_boton_enviar).perform();
			builder.moveToElement(e_boton_enviar).click().perform();
	    	
//			e_boton_enviar.click();

		}
		catch (Exception e) {
			
			System.out.println("------->>        Error al generar el e_boton_enviar.click          <<--------"+e);	

		}
		
		/*   ------  ArrayList<String> x = new ArrayList<String>();    ----   */

		arr_datos_2.add("Campo Texto;");
		arr_datos_2.add(v_campo_texto+";");
		arr_datos_2.add("Campo Area;");
		arr_datos_2.add(v_campo_area+";");
		arr_datos_2.add("Campo Mail;");
		arr_datos_2.add(v_campo_mail+";");
		arr_datos_2.add("Campo Fecha;");
		arr_datos_2.add(v_campo_fecha+";");
		arr_datos_2.add("Campo Lista;");
		arr_datos_2.add(v_campo_lista+";");
		arr_datos_2.add("seleccion;");
		arr_datos_2.add(v_seleccion+";");
		arr_datos_2.add("Radio Button;");
		arr_datos_2.add(v_radio_button+";");
		return arr_datos_2;
			
		/*   ------  -------------------------------------------------  ----   */
	}
	
	
}
