package Pages.Proy_2_QAnova_Piloto;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import Base.TestBase;
import Pages.Proy_2_Genericos.GP02015_Return_Page_Title;
import Pages.Proy_2_Genericos.GP02020_Return_Var_Elem_no_localizados;
// import Util.Genera_Archivo;
import Util.Buscar_Elementos;
import Util.Captura_Pantalla;

public class OP02110_PaginaInicioQA3 extends TestBase {

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
	int v_cont_4=0;
	ArrayList<String> arr_datos_4;
	ArrayList<String> arr_Elementos_4;
	ArrayList<String> arr_Evidencia_4;
	
	public String Ejec_PaginaInicioQA2(String v_usuario,String v_password,String v_name_imagen, 
										int v_cont_3, 
										ArrayList<String> arr_datos_3,
										ArrayList<String> arr_Elementos_3,
										ArrayList<String> arr_Evidencia_3){

	/*  -------------------------------------- Validación Título ------------------------------------  */

		String title0 = GP02015_Return_Page_Title.Titulo_Pagina_Presente(10,"Presentación QA Técnico");

	/*  ---------------------------------------------------------------------------------------------  */
	/*                       Si titulo es cortrecto graba evidencia                                    */
		
		if(title0.equals("Presentación QA Técnico")) {
			arr_Evidencia_3.add("Validación Titulo;");
			arr_Evidencia_3.add("Se obtuvo el título esperado: "+title0+";");
			arr_Evidencia_3.add("Passed;");
			v_valid_proceso="EXITO";
		}else {
			arr_Evidencia_3.add("Validación Titulo;");
			arr_Evidencia_3.add("No se obtuvo el título esperado: "+title0+";");
			arr_Evidencia_3.add("Failed;");
			v_valid_proceso="FALLA";
		}

		Captura_Pantalla.takeScreenShotTest(driver,v_name_imagen+v_cont_3);
		v_cont_3++;
		
	/*  --------------------------------------------------------------------------------------------- */
	/*                Graba y validación de elementos en arreglo evidencias                           */		
		if (v_valid_proceso=="EXITO"){

			elem_no_localizados=0;
			arr_Elementos_3 = Validaelementos_PaginaInicioQA2(arr_Elementos_3);
			
			elem_no_localizados = GP02020_Return_Var_Elem_no_localizados.Valida_elementos_localizados();
			
			if (elem_no_localizados == 0) {
				v_valid_proceso="EXITO";
			}else {
				v_valid_proceso="FALLA";
			}
		}
		
	/*  --------------------------------------------------------------------------------------------- */

	/*  Graba y validación de datos  en arreglo datos de entrada     */
		if (v_valid_proceso=="EXITO"){
			arr_datos_3 = login_PaginaInicioQA2(v_usuario,v_password,arr_datos_3);
		}

	/*  --------------------------------------------------------------------------------------------  */
		/*  Graba y validación de título al cambiar de pagina  en arreglo evidencias  */
		if (v_valid_proceso=="EXITO"){
			String valid = GP02015_Return_Page_Title.Titulo_Pagina_Presente(20,"Carga de información - Presentación QA Técnico");

			if(valid.equals("Carga de información - Presentación QA Técnico")) {
				arr_Evidencia_3.add("Carga de información;");
				arr_Evidencia_3.add("Se ingreso Correctamente a Carga de información;");
				arr_Evidencia_3.add("Passed;");
				v_valid_proceso="EXITO";
			}else {
				arr_Evidencia_3.add("Carga de información;");
				arr_Evidencia_3.add("No se ingreso Correctamente a Carga de información;");
				arr_Evidencia_3.add("Failed;");
				v_valid_proceso="FALLA";
			}
			
			Captura_Pantalla.takeScreenShotTest(driver,v_name_imagen+v_cont_3);
			v_cont_3++;
			
		}

	/*  --------------------------------------------------------------------------------------------  */
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
	
	public  ArrayList<String> Validaelementos_PaginaInicioQA2(ArrayList<String> arr_elem2){
		
	/* ================	//    OJO    Imprimir codigo fuente en consola  =================  */
	//	String pageSource = driver.getPageSource();
	//	Genera_Archivo.Escribir_Archivos(pageSource,"Codigo_Page.html");
	//	System.out.println("------->>   pageSource  <<--------");
	//	System.out.println(pageSource);
	//	System.out.println("------->>   pageSource  <<--------");
	//	Un texto cualquiera guardado en una variable
	/* ==================================================================================  */
		
		String v_pag = "PaginaInicio";
		elem_no_localizados=0;

		v_desc_elem = "Logo";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imHeader_imObjectImage_03\"]";
		e_logo = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_logo!=null) {
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

		v_desc_elem = "Link_Carga_de_Informacion";
		v_metodo = "xpath";
		v_find = "/html/body/div[3]/div[2]/div[2]/ul/li[1]/a/span/span/span[2]";
		e_link_carga_de_informacion = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_carga_de_informacion!=null) {
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
		

		v_desc_elem = "link_Matriz_de_información";
		v_metodo = "xpath";
		v_find = "/html/body/div[3]/div[2]/div[2]/ul/li[2]/a/span/span/span[1]";
		e_link_matriz_de_informacion = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_matriz_de_informacion!=null) {
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
	
		v_desc_elem = "link_Matriz_de_información";
		v_metodo = "xpath";
		v_find = "/html/body/div[3]/div[2]/div[2]/ul/li[2]/a/span/span/span[1]";
		e_link_matriz_de_informacion = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_matriz_de_informacion!=null) {
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
	
		v_desc_elem = "Link_descarga_de_archivos";
		v_metodo = "xpath";
		v_find = "/html/body/div[3]/div[2]/div[2]/ul/li[3]/a/span/span/span[1]";
		e_link_descarga_de_archivos = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_descarga_de_archivos!=null) {
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

		v_desc_elem = "usuario";
		v_metodo = "name";
		v_find = "imUname";
		e_user = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_user!=null) {
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

		v_desc_elem = "Contraseña";
		v_metodo = "name";
		v_find = "imPwd";
		e_pass = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_pass!=null) {
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

		v_desc_elem = "Botón_ingresar";
		v_metodo = "className";
		v_find = "imLoginSubmit";
		e_btnLogin = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_btnLogin!=null) {
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

	public ArrayList<String> login_PaginaInicioQA2(String uss, String pwd,ArrayList<String> arr_datos_2){

		e_user.sendKeys(uss);
		e_pass.sendKeys(pwd);
		e_btnLogin.click();
		
	//  Carga Datos de entrada al login en el arreglo
		arr_datos_2.add("Usuario;");
		arr_datos_2.add(uss+";");
		arr_datos_2.add("Password;");
		arr_datos_2.add(pwd+";");
		
		return arr_datos_2;
	}
	
}
