package Pages.Susana;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.TestBase;
import Pages.Proy_2_Genericos.GP02015_Return_Page_Title;
import Pages.Proy_2_Genericos.GP02016_Return_Page_Title;
// import Util.Genera_Archivo;
import Util.Buscar_Elementos;
import Util.Captura_Pantalla;

public class OP02110_PaginaInicioSusana extends TestBase {

 // DECLARACIONES DE LOS OBJETOS 
	
	WebElement e_link					= null;
	WebElement e_nombre_usuario			= null;
	WebElement e_contraseña				= null;
	WebElement e_repite_la_contraseña	= null;
	WebElement e_nombre_completo		= null;
	WebElement e_E_mail		            = null;
	WebElement e_btn_Registrarse		= null;
	
	
	int v_cont_4=0;
	ArrayList<String> arr_datos_4		= null;
	ArrayList<String> arr_Elementos_4;
	ArrayList<String> arr_Evidencia_4;
	int elem_no_localizados_4			= 0;
	
	public String Ejec_PaginaInicioSusana(String v_name_imagen, 
										int v_cont_3, 
										ArrayList<String> arr_datos_3,
										ArrayList<String> arr_Elementos_3,
										
										ArrayList<String> arr_Evidencia_3){
		String v_valid_proceso = null;
	/*  -------------------------------------- Validación Título ------------------------------------  */
		String title0 = "Presentación QA Técnico";
		v_valid_proceso = GP02016_Return_Page_Title.Titulo_Pagina_Presente(10,title0);
		System.out.println("------->>   title0   <<-------->>>>"+v_valid_proceso);

	/*  ---------------------------------------------------------------------------------------------  */
	/*                       Si titulo es cortrecto graba evidencia                                    */
		
		if(v_valid_proceso.equals("EXITO")) {
			arr_Evidencia_3.add("Validación Titulo;");
			arr_Evidencia_3.add("Se obtuvo el título esperado: "+title0+";");
			arr_Evidencia_3.add("Passed;");
			v_valid_proceso="EXITO";
			System.out.println("------->>   title0  EXITO <<-------->>>>"+title0);
		}else {
			arr_Evidencia_3.add("Validación Titulo;");
			arr_Evidencia_3.add("No se obtuvo el título esperado: "+title0+";");
			arr_Evidencia_3.add("Failed;");
			v_valid_proceso="FALLA";
			System.out.println("------->>   title0  FALLA <<-------->>>>"+title0);
		}

		Captura_Pantalla.takeScreenShotTest(driver,v_name_imagen+v_cont_3);
		v_cont_3++;
		
	/*  --------------------------------------------------------------------------------------------- */
	/*                Graba y validación de elementos en arreglo evidencias                           */
		if (v_valid_proceso=="EXITO"){

			arr_Elementos_3 = Validaelementos_PaginaInicioSusana(arr_Elementos_3);

			if (elem_no_localizados_4 == 0) {
				v_valid_proceso="EXITO";
			}else {
				v_valid_proceso="FALLA";
			}
		}
		
		/*  --------------------------------------------------------------------------------------------- */
		/*                Graba y validación de elementos en arreglo evidencias   */
		                       
			if (v_valid_proceso=="EXITO"){

				v_valid_proceso = Click_Carga_información();

			}
			
	/*  --------------------------------------------------------------------------------------------- */
	/*  -------------------------------------- Validación Título ------------------------------------  */
			if (v_valid_proceso=="EXITO"){
				String title1 = "Área reservada - Presentación QA Técnico";
				v_valid_proceso = GP02016_Return_Page_Title.Titulo_Pagina_Presente(10,title1);
				
//								Assert.assertEquals(title1, "EXITO");
				
			/*  ---------------------------------------------------------------------------------------------  */
			/*                       Si titulo es correcto graba evidencia                                    */
				
				if(v_valid_proceso.equals("EXITO")) {
					arr_Evidencia_3.add("Validación Titulo;");
					arr_Evidencia_3.add("Se obtuvo el título esperado: "+title1+";");
					arr_Evidencia_3.add("Passed;");
				}else {
					arr_Evidencia_3.add("Validación Titulo;");
					arr_Evidencia_3.add("No se obtuvo el título esperado: "+title1+";");
					arr_Evidencia_3.add("Failed;");
				}
	
				Captura_Pantalla.takeScreenShotTest(driver,v_name_imagen+v_cont_3);
				v_cont_3++;

			}
			
	/*  --------------------------------------------------------------------------------------------- */
	/*                Graba y validación de elementos en arreglo evidencias                           */	
			
			System.out.println("------->>   Antes de Validaelementos_PaginaInicioSusana    <<-------->>>>"+v_valid_proceso);
		if (v_valid_proceso=="EXITO"){
			
//			JavascriptExecutor jse2 = (JavascriptExecutor)driver; 
//			jse2.executeScript("window.scrollBy(0,400)", "");
			
			arr_Elementos_3 = Validaelementos_PaginaInicioSusana2(arr_Elementos_3);
			System.out.println("--->>>   text   --->>>  ["+v_valid_proceso+"]  <<<---");
			if (elem_no_localizados_4 == 0) {
				v_valid_proceso="EXITO";
			}else {
				v_valid_proceso="FALLA";
			}
		}
	/*  --------------------------------------------------------------------------------------------  */
		System.out.println("------->>   Antes de Pagina_Inicio_Susana    <<-------->>>>"+v_valid_proceso);
		if (v_valid_proceso=="EXITO"){
			arr_datos_3 =  Datos_del_Usuario("Cami_Saravia",
											"Don ramon 1973",
											"Don ramon 1973",
											"Camila Lopéz Saravia",
											"ClSaravia@gmail.com",																				
											arr_datos_3);		
}
	/*  --------------------------------------------------------------------------------------------  */
		
			System.out.println("------->>   Antes de Validaelementos_PaginaInicioSusana    <<-------->>>>"+v_valid_proceso);
		if (v_valid_proceso=="EXITO"){
			
	//		JavascriptExecutor jse2 = (JavascriptExecutor)driver; 
	//		jse2.executeScript("window.scrollBy(0,400)", "");
			
			arr_Elementos_3 = Validaelementos_PaginaInicioSusana1(arr_Elementos_3);
			System.out.println("--->>>   text   --->>>  ["+v_valid_proceso+"]  <<<---");
			if (elem_no_localizados_4 == 0) {
				v_valid_proceso="EXITO";
			}else {
				v_valid_proceso="FALLA";
			}
		}
		
		/*  --------------------------------------------------------------------------------------------- */
		/*                Graba y validación de elementos en arreglo evidencias   */
		                       
			if (v_valid_proceso=="EXITO"){

				v_valid_proceso =  Click_Registrase();

			}
	
	
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
	public  ArrayList<String> Validaelementos_PaginaInicioSusana(ArrayList<String> arr_elem2){
		
	/* ================	//    OJO    Imprimir codigo fuente en consola  =================  */
	//	String pageSource = driver.getPageSource();
	//	Genera_Archivo.Escribir_Archivos(pageSource,"Codigo_Page.html");
	//	System.out.println("------->>   pageSource  <<--------");
	//	System.out.println(pageSource);
	//	System.out.println("------->>   pageSource  <<--------");
	//	Un texto cualquiera guardado en una variable
	/* ==================================================================================  */
		
		String v_pag = "InicioSusana";
		elem_no_localizados=0;

		v_desc_elem = "Link_Carga_información";
		v_metodo = "xpath";
		v_find = "//*[@id='imMnMnNode3']/a/span/span/span[2]";
		e_link = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link!=null) {
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

	
	public String Click_Carga_información(){
		
	
		String v_valid_proceso_4		= null;

		try {
			  e_link.click();
			  v_valid_proceso_4		= "EXITO";
			}catch(Exception e) {
				v_valid_proceso_4	= "FALLA";
			}

		return v_valid_proceso_4;
	}
	
	
	public  ArrayList<String> Validaelementos_PaginaInicioSusana1(ArrayList<String> arr_elem2){
			
		String v_pag = "InicioSusana";
		elem_no_localizados=0;

		v_desc_elem = "Link_Registrarse";
		v_metodo = "xpath";
		v_find = "//*[@id='imRegister_submit']";
		e_btn_Registrarse = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_btn_Registrarse!=null) {
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

	public String Click_Registrase(){
		
		
		String v_valid_proceso_4		= null;

		try {
			e_btn_Registrarse.click();
			  v_valid_proceso_4		= "EXITO";
			    System.out.println("------->>   e_link.click()  EXITO  <<-------->>>>"+v_valid_proceso);
			}catch(Exception e) {
				v_valid_proceso_4	= "FALLA";
				System.out.println("------->>   e_link.click()  FALLA   <<-------->>>>"+v_valid_proceso);
			}

		return v_valid_proceso_4;
	}
	
	
	public  ArrayList<String> Validaelementos_PaginaInicioSusana2(ArrayList<String> arr_elem2){
			
		
	/* ================	//    OJO    Imprimir codigo fuente en consola  =================  */
	//	String pageSource = driver.getPageSource();
	//	Genera_Archivo.Escribir_Archivos(pageSource,"Codigo_Page.html");
	//	System.out.println("------->>   pageSource  <<--------");
	//	System.out.println(pageSource);
	//	System.out.println("------->>   pageSource  <<--------");
	//	Un texto cualquiera guardado en una variable
	/* ==================================================================================  */
		
		String v_pag = "Información_del_usuario";
		elem_no_localizados=0;

		v_desc_elem = "nombre_usuario";
		v_metodo = "xpath";
		v_find = "//*[@id='imRegUname']";
			e_nombre_usuario = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_nombre_usuario!=null) {
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

		v_desc_elem = "contraseña";
		v_metodo = "xpath";
		v_find = "//*[@id='imRegPwd']";
		e_contraseña = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_contraseña!=null) {
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

		v_desc_elem = "repite_la_contraseña";
		v_metodo = "xpath";
		v_find = "//*[@id='imRepeatPwd']";
		e_repite_la_contraseña= Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_repite_la_contraseña!=null) {
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
		
		v_desc_elem = "nombre_completo";
		v_metodo = "xpath";
		v_find = "//*[@id='imRealname']";				 
		e_nombre_completo= Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_nombre_completo!=null) {
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
		
		v_desc_elem = "E_mail";
		v_metodo = "xpath";
		v_find = "//*[@id='imEmail']";
		e_E_mail = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_E_mail!=null) {
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
	

	
	public ArrayList<String> Datos_del_Usuario(String v_nombre_usuario,
															String v_contraseña,
															String v_repite_la_contraseña,
															String v_nombre_completo,
															String v_E_mail,																														
															ArrayList<String> arr_datos_2){

		e_nombre_usuario.sendKeys(v_nombre_usuario);		
		e_contraseña.sendKeys(v_contraseña);		
		e_repite_la_contraseña.sendKeys(v_repite_la_contraseña);			
		e_nombre_completo.sendKeys(v_nombre_completo);				
		e_E_mail.sendKeys(v_E_mail);		
		
		

	//  Carga Datos de entrada al login en el arreglo
		arr_datos_2.add("nombre usuario;");
		arr_datos_2.add(v_nombre_usuario+";");
	
		arr_datos_2.add("contraseña;");
		arr_datos_2.add(v_contraseña+";");
	
		arr_datos_2.add("repite la contraseña;");
		arr_datos_2.add(v_repite_la_contraseña+";");
		
		arr_datos_2.add("nombre completo;");
		arr_datos_2.add(v_nombre_completo+";");
		
		arr_datos_2.add("E_mail;");
		arr_datos_2.add(v_E_mail+";");
		
		
		return arr_datos_2;
	}
	
}
