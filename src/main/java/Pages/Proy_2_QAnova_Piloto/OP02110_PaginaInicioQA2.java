package Pages.Proy_2_QAnova_Piloto;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import Base.TestBase;
// import Util.Genera_Archivo;
import Util.Buscar_Elementos;

public class OP02110_PaginaInicioQA2 extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	WebElement e_user=null;
	WebElement e_pass=null;
	WebElement e_btnLogin=null;
	WebElement e_logo=null;
	WebElement e_link_carga_de_informacion=null;
	WebElement e_link_matriz_de_informacion=null;
	WebElement e_link_descarga_de_archivos=null;
	WebElement e_link_editar_informe_pago=null;
	WebElement e_element=null;
	
	public  ArrayList<String> Validaelementos_PaginaInicioQA2(ArrayList<String> arr_elem2){
		
	/* ================	//    OJO    Imprimir codigo fuente en consola  =================  */
	//	String pageSource = driver.getPageSource();
	//	Genera_Archivo.Escribir_Archivos(pageSource,"Codigo_Page.html");
	//	System.out.println("------->>   pageSource  <<--------");
	//	System.out.println(pageSource);
	//	System.out.println("------->>   pageSource  <<--------");
	//	Un texto cualquiera guardado en una variable
	/* ==================================================================================  */
		System.out.println("------->>   Entro en   <<-------- [Validaelementos_PaginaInicioQA2 ]  <<<--- ");
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
