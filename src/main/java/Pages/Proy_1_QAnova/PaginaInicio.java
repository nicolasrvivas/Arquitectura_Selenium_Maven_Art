package Pages.Proy_1_QAnova;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
import Util.Genera_Archivo;
import Util.Buscar_Elementos;

public class PaginaInicio extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	WebElement e_user=null;
	WebElement e_pass=null;
	WebElement e_btnLogin=null;
	WebElement e_logo=null;
	WebElement e_link_pagina_inicio=null;
	WebElement e_link_compra_pasajes=null;
	WebElement e_link_informe_pago=null;
	WebElement e_link_editar_informe_pago=null;
	WebElement e_element=null;
	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public PaginaInicio() {
		PageFactory.initElements(driver, this);
	}
	
	// ACCIONES PARA VALIDAR
	public String ValidacionPaginaInicio() {
		return driver.getTitle();
	}

	public  ArrayList<String> ValidaelementosPaginaInicio(ArrayList<String> arr_elem2){
	/* ================	//    OJO    Imprimir codigo fuente en consola  =================  */
		String pageSource = driver.getPageSource();
		Genera_Archivo.Escribir_Archivos(pageSource,"Codigo_Page.html");
	//	System.out.println("------->>   pageSource  <<--------");
	//	System.out.println(pageSource);
	//	System.out.println("------->>   pageSource  <<--------");
	//	Un texto cualquiera guardado en una variable
	/* =============================================================== */

		String v_pag = "PaginaInicio";
		elem_no_localizados=0;

		v_desc_elem = "Logo";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imHeader_imObjectImage_01\"]";
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

		v_desc_elem = "Link_Pagina_de_Inicio";
		v_metodo = "id";
		v_find = "imMnMnNode0";
		e_link_pagina_inicio = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_pagina_inicio!=null) {
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
		

		v_desc_elem = "Link_Compra_de_Pasajes";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imMnMnNode4\"]/a/span/span/span[1]";
		e_link_compra_pasajes = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_compra_pasajes!=null) {
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
	
		v_metodo = "id";
		v_find = "imMnMnNode3";
		e_link_informe_pago = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_informe_pago!=null) {
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
	
		v_desc_elem = "Link_Editar_Informe_de_Pago";
		v_metodo = "id";
		v_find = "imMnMnNode5";
		e_link_editar_informe_pago = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_editar_informe_pago!=null) {
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

	public ArrayList<String> login(String uss, String pwd,ArrayList<String> arr_datos_2){
		e_user.sendKeys(uss);
		e_pass.sendKeys(pwd);
		
		//ArrayList<String> x = new ArrayList<String>();
		e_btnLogin.click();
		arr_datos_2.add("Usuario;");
		arr_datos_2.add(uss+";");
		arr_datos_2.add("Password;");
		arr_datos_2.add(pwd+";");
		return arr_datos_2;
	}
	
}
