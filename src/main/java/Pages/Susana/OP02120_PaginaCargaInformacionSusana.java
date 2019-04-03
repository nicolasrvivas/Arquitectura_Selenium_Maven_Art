package Pages.Susana;

import java.util.ArrayList;
import org.openqa.selenium.WebElement;

import Base.TestBase;
import Pages.Proy_2_Genericos.GP02016_Return_Page_Title;
// import Util.Genera_Archivo;
import Util.Buscar_Elementos;
import Util.Captura_Pantalla;

public class OP02120_PaginaCargaInformacionSusana extends TestBase {

	private static final String OP02120_Data_Entrada_Excel_Page = null;
	private static final int String = 0;
	// DECLARACIONES DE LOS OBJETOS
	private static final int ArrayList = 0;

	WebElement e_link 				= null;
	WebElement e_nombre_del_usuario = null;
	WebElement e_contraseña 		= null;
	WebElement e_link_ingresar_demo = null;
	WebElement e_campo_de_texto		= null;
	WebElement e_campo_mail  		= null;
	WebElement e_campo_area_de_texto= null;
	WebElement e_campo_fecha 		= null;
	WebElement e_campo_lista 		= null;
	WebElement e_seleccion_1 		= null;
	WebElement e_seleccion_2 		= null;
	WebElement e_seleccion_3 		= null;		
    WebElement e_cr_1				= null;
    WebElement e_cr_2 				= null;
    WebElement e_cr_3		        = null;
    WebElement e_link_enviar        = null;
    
	int v_cont_4 = 0;
	ArrayList<String> arr_datos_4 = null;
	ArrayList<String> arr_Elementos_4;
	ArrayList<String> arr_Evidencia_4;
	int elem_no_localizados_4 = 0;
	WebElement e_btn_ingresar_a_demo1;

	public String Ejec_PaginaIniciologincargasusana(String v_name_imagen, 
										int v_cont_3, 
										ArrayList<String> arr_datos_3,
										ArrayList<String> arr_Elementos_3,										
										ArrayList<String> arr_Evidencia_3){
		String v_valid_proceso = null;
	/*  -------------------------------------- Validación Título ------------------------------------  */
		String title0 = "Carga de información - Presentación QA Técnico";
		v_valid_proceso = GP02016_Return_Page_Title.Titulo_Pagina_Presente(10,title0);
		
//		System.out.println("------->>   title0   <<-------->>>>"+v_valid_proceso);

	/*  ---------------------------------------------------------------------------------------------  */
	/*                       Si titulo es correcto graba evidencia                                    */
		
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
		
	System.out.println("------->>  Despues de validar titulo   <<--------"+v_valid_proceso);
		
//		 Validaelementos_PaginaInicioSusana2
		 
		 
	/*  --------------------------------------------------------------------------------------------- */
	/*                Graba y validación de elementos en arreglo evidencias                           */
		if (v_valid_proceso=="EXITO"){

			arr_Elementos_3 = Validaelementos_PaginaIniciologinSusana(arr_Elementos_3);

			if (elem_no_localizados_4 == 0) {
				v_valid_proceso="EXITO";
			}else {
				v_valid_proceso="FALLA";
			}
		}
	System.out.println("------->>  Despues de Validaelementos_PaginaIniciologinSusana   <<--------"+v_valid_proceso);
		

	/*  --------------------------------------------------------------------------------------------- */
	System.out.println("------->>   Antes de  Datos_del_Usuario    <<-------->>>>"+v_valid_proceso);
		if (v_valid_proceso=="EXITO"){
			arr_datos_3 =  Datos_del_Usuario("ssaraviam",
											"camy1995",		
											"campo nuevo ssm",
											"ssaravia@gmail.com",
											"validacion de datos area informatica, matriz de modelo conceptual, modelo físico",
											"02-04-2019",
											"valor 22",
											"selecciom 1",
											"selecciom 2",
											"selecciom 3",
											"cr 1",
											"cr 2",
											"cr 3",
											"link_enviar",
											"link_demo",
											arr_datos_3);	
			
			
		System.out.println("------->>  Despues de Datos_del_Usuario   <<--------"+v_valid_proceso);
	/*  --------------------------------------------------------------------------------------------- */
	/*                Graba y validación de elementos en arreglo evidencias   */
	                       
		if (v_valid_proceso=="EXITO"){

			v_valid_proceso = Click_ingresar_a_demo();


		}
	System.out.println("------->>  Despues de Click_ingresar_a_demo   <<--------"+v_valid_proceso);
	/*  -------------------------------------- Validación Título ------------------------------------  */
		if (v_valid_proceso=="EXITO"){
			String title1 = "Carga de información - Presentación QA Técnico";
			v_valid_proceso = GP02016_Return_Page_Title.Titulo_Pagina_Presente(10,title1);

			
//								Assert.assertEquals(title1, "EXITO");
	System.out.println("------->>  Despues de Titulo_Pagina_Presente   <<--------"+v_valid_proceso);
			
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
	}
		return v_valid_proceso;

}
		


	private java.lang.String Click_link_enviar() {
		// TODO Auto-generated method stub
		return null;
	}



	public ArrayList<String> Retorna_arr_datos() {

		return arr_datos_4;
	}

	public ArrayList<String> Retorna_arr_elementos() {

		return arr_Elementos_4;
	}

	public ArrayList<String> Retorna_arr_evidencia() {

		return arr_Evidencia_4;
	}

	public int Retorna_cont() {

		return v_cont_4;
	}

	public ArrayList<String> Validaelementos_PaginaIniciologinSusana(ArrayList<String> arr_elem2) {

	
		String v_pag = "CargaSusana";
		elem_no_localizados = 0;

		v_desc_elem = "nombre_del_usuario";
		v_metodo = "xpath";
		v_find = "//*[@id='imUname']";
		e_nombre_del_usuario = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito,
				v_no_cargo_exito, v_desc_elem);
		if (e_nombre_del_usuario != null) {
			// Actualiza arreglo para el documento Word
			arr_elem2.add(v_desc_elem + ";");
			arr_elem2.add(v_cargo_exito + ";");
			arr_elem2.add("Passed;");
		} else {
			System.out.println("   No Encontro el elemento");
			arr_elem2.add(v_desc_elem + ";");
			arr_elem2.add(v_no_cargo_exito + ";");
			arr_elem2.add("Failled;");
			elem_no_localizados_4++;
		}

		v_desc_elem = "contraseña";
		v_metodo = "xpath";
		v_find = "//*[@id='imPwd']";
		e_contraseña = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito,
				v_no_cargo_exito, v_desc_elem);
		if (e_contraseña != null) {
			// Actualiza arreglo para el documento Word
			arr_elem2.add(v_desc_elem + ";");
			arr_elem2.add(v_cargo_exito + ";");
			arr_elem2.add("Passed;");
		} else {
			System.out.println("   No Encontro el elemento");
			arr_elem2.add(v_desc_elem + ";");
			arr_elem2.add(v_no_cargo_exito + ";");
			arr_elem2.add("Failled;");
			elem_no_localizados_4++;
		}
		
		elem_no_localizados = 0;

		v_desc_elem = "link_ingresar_demo";
		v_metodo = "xpath";
		v_find = "//*[@id='imLogin']/form/div[3]/input"; 
		e_link_ingresar_demo = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_ingresar_demo != null) {
			// Actualiza arreglo para el documento Word
			  
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		} else {
			System.out.println("   No Encontro el elemento");
			arr_elem2.add(v_desc_elem + ";");
			arr_elem2.add(v_no_cargo_exito + ";");
			arr_elem2.add("Failled;");
			elem_no_localizados_4++;}		
		
		
			elem_no_localizados = 0;
	
			v_desc_elem = "campo_de_texto";
			v_metodo = "xpath"; 
			v_find = "//*[@id='imObjectForm_1_2_container']"; 
			e_campo_de_texto = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_de_texto != null) {
			// Actualiza arreglo para el documento Word
			  
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		} else {
			System.out.println("   No Encontro el elemento");
			arr_elem2.add(v_desc_elem + ";");
			arr_elem2.add(v_no_cargo_exito + ";");
			arr_elem2.add("Failled;");
			elem_no_localizados_4++;
		
		}
	
			elem_no_localizados = 0;
		
			v_desc_elem = "campo_mail";
			v_metodo = "xpath";
			v_find = "//*[@id'imObjectForm_1_3_container']"; 
			e_campo_mail = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_mail != null) {
			// Actualiza arreglo para el documento Word
			  
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		} else {
			System.out.println("   No Encontro el elemento");
			arr_elem2.add(v_desc_elem + ";");
			arr_elem2.add(v_no_cargo_exito + ";");
			arr_elem2.add("Failled;");
			elem_no_localizados_4++;
			
		}
		
			elem_no_localizados = 0;
			
			v_desc_elem = "campo_area_de_texto";
			v_metodo = "xpath";
			v_find = "//*[@id'imObjectForm_1_3_container']"; 
			e_campo_area_de_texto = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_area_de_texto != null) {
			// Actualiza arreglo para el documento Word
			  
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		} else {
			System.out.println("   No Encontro el elemento");
			arr_elem2.add(v_desc_elem + ";");
			arr_elem2.add(v_no_cargo_exito + ";");
			arr_elem2.add("Failled;");
			elem_no_localizados_4++;
					
		}
		
		elem_no_localizados = 0;
		
		v_desc_elem = "campo_fecha";
		v_metodo = "xpath";
		v_find = "//*[@id'imObjectForm_1_3_container']";
		e_campo_fecha = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_fecha != null) {
		// Actualiza arreglo para el documento Word
		   arr_elem2.add(v_desc_elem+";");
		 arr_elem2.add(v_cargo_exito+";");
		 arr_elem2.add("Passed;");
		} else {
		System.out.println("   No Encontro el elemento");
		arr_elem2.add(v_desc_elem + ";");
		arr_elem2.add(v_no_cargo_exito + ";");
		arr_elem2.add("Failled;");
		elem_no_localizados_4++;
		
		}
		
		elem_no_localizados = 0;
		
		v_desc_elem = "campo_lista";
		v_metodo = "xpath";
		v_find = "//*[@id'imObjectForm_1_3_container']";
		e_campo_lista = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_campo_lista != null) {
		// Actualiza arreglo para el documento Word
		   arr_elem2.add(v_desc_elem+";");
		 arr_elem2.add(v_cargo_exito+";");
		 arr_elem2.add("Passed;");
		} else {
		System.out.println("   No Encontro el elemento");
		arr_elem2.add(v_desc_elem + ";");
		arr_elem2.add(v_no_cargo_exito + ";");
		arr_elem2.add("Failled;");
		elem_no_localizados_4++;
		
		}
		
		elem_no_localizados = 0;
		
		v_desc_elem = "seleccion_1";
		v_metodo = "xpath";
		v_find = "//*[@id'imObjectForm_1_3_container']";
		e_seleccion_1 = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_seleccion_1 != null) {
		// Actualiza arreglo para el documento Word
		   arr_elem2.add(v_desc_elem+";");
		 arr_elem2.add(v_cargo_exito+";");
		 arr_elem2.add("Passed;");
		} else {
		System.out.println("   No Encontro el elemento");
		arr_elem2.add(v_desc_elem + ";");
		arr_elem2.add(v_no_cargo_exito + ";");
		arr_elem2.add("Failled;");
		elem_no_localizados_4++;
		
		}
		elem_no_localizados = 0;
		
		v_desc_elem = "seleccion_2";
		v_metodo = "xpath";
		v_find = "//*[@id'imObjectForm_1_3_container']";
		e_seleccion_2 = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_seleccion_2 != null) {
		// Actualiza arreglo para el documento Word
		   arr_elem2.add(v_desc_elem+";");
		 arr_elem2.add(v_cargo_exito+";");
		 arr_elem2.add("Passed;");
		} else {
		System.out.println("   No Encontro el elemento");
		arr_elem2.add(v_desc_elem + ";");
		arr_elem2.add(v_no_cargo_exito + ";");
		arr_elem2.add("Failled;");
		elem_no_localizados_4++;
		
		}
	
	elem_no_localizados = 0;

	v_desc_elem = "seleccion_3";
	v_metodo = "xpath";
	v_find = "//*[@id'imObjectForm_1_3_container']";
	e_seleccion_3 = Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
	if (e_seleccion_3 != null) {
	// Actualiza arreglo para el documento Word
	   arr_elem2.add(v_desc_elem+";");
	 arr_elem2.add(v_cargo_exito+";");
	 arr_elem2.add("Passed;");
	} else {
	System.out.println("   No Encontro el elemento");
	arr_elem2.add(v_desc_elem + ";");
	arr_elem2.add(v_no_cargo_exito + ";");
	arr_elem2.add("Failled;");
	elem_no_localizados_4++;

	}
	
	elem_no_localizados = 0;

	v_desc_elem = "cr_1";
	v_metodo = "xpath";
	v_find = "//*[@id'imObjectForm_1_3_container']";
	e_cr_1= Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
	if (e_cr_1 != null) {
	// Actualiza arreglo para el documento Word
	   arr_elem2.add(v_desc_elem+";");
	 arr_elem2.add(v_cargo_exito+";");
	 arr_elem2.add("Passed;");
	} else {
	System.out.println("   No Encontro el elemento");
	arr_elem2.add(v_desc_elem + ";");
	arr_elem2.add(v_no_cargo_exito + ";");
	arr_elem2.add("Failled;");
	elem_no_localizados_4++;

	}
	
	elem_no_localizados = 0;

	v_desc_elem = "cr_2";
	v_metodo = "xpath";
	v_find = "//*[@id'imObjectForm_1_3_container']";
	e_cr_2= Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
	if (e_cr_2 != null) {
	// Actualiza arreglo para el documento Word
	   arr_elem2.add(v_desc_elem+";");
	 arr_elem2.add(v_cargo_exito+";");
	 arr_elem2.add("Passed;");
	} else {
	System.out.println("   No Encontro el elemento");
	arr_elem2.add(v_desc_elem + ";");
	arr_elem2.add(v_no_cargo_exito + ";");
	arr_elem2.add("Failled;");
	elem_no_localizados_4++;
	
	}
	
	
	elem_no_localizados = 0;

	v_desc_elem = "cr_3";
	v_metodo = "xpath";
	v_find = "//*[@id'imObjectForm_1_3_container']";
	e_cr_3= Buscar_Elementos.waitForElementPresent3(v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
	if (e_cr_3 != null) {
	// Actualiza arreglo para el documento Word
	   arr_elem2.add(v_desc_elem+";");
	 arr_elem2.add(v_cargo_exito+";");
	 arr_elem2.add("Passed;");
	} else {
	System.out.println("   No Encontro el elemento");
	arr_elem2.add(v_desc_elem + ";");
	arr_elem2.add(v_no_cargo_exito + ";");
	arr_elem2.add("Failled;");
	elem_no_localizados_4++;
	
	}
	
	return arr_elem2;
}
	
	public String Click_ingresar_a_demo() {

		String v_valid_proceso_4 = null;

		try {

			e_link_ingresar_demo.click();
			v_valid_proceso_4 = "EXITO";
		} catch (Exception e) {
			v_valid_proceso_4 = "FALLA";
		}
		
		return v_valid_proceso_4;
	}


	public ArrayList<String> Datos_del_Usuario(String v_nombre_del_usuario, 
											   String v_contraseña,
											   String v_link_ingresar_demo,
											   String v_campo_de_texto,
											   String v_campo_mail,
											   String v_campo_area_de_texto,
											   String v_campo_fecha,
											   String v_campo_lista,
											   String v_seleccion_1,
											   String v_seleccion_2,
											   String v_seleccion_3,
											   String v_cr_1,
											   String v_cr_2,
											   String v_cr_3,
											   String v_link_enviar,

			ArrayList<String> arr_datos_2) {

		e_nombre_del_usuario.sendKeys(v_nombre_del_usuario);
		e_contraseña.sendKeys(v_contraseña);
		e_link_ingresar_demo.sendKeys(v_link_ingresar_demo);
		e_campo_de_texto.sendKeys(v_campo_de_texto);
		e_campo_mail.sendKeys(v_campo_mail);
		e_campo_area_de_texto.sendKeys(v_campo_area_de_texto);
		e_campo_fecha.sendKeys(v_campo_fecha);
		e_campo_lista.sendKeys(v_campo_lista);
		e_seleccion_1.sendKeys(v_seleccion_1);
		e_seleccion_2.sendKeys(v_seleccion_2);
		e_seleccion_3.sendKeys(v_seleccion_3);
		e_cr_1.sendKeys(v_cr_1);
		e_cr_2.sendKeys(v_cr_2);
		e_cr_3.sendKeys(v_cr_3);
		e_link_enviar.sendKeys(v_link_enviar);
		
		
		
	
		// Carga Datos de entrada al login en el arreglo
		
		arr_datos_2.add("nombre del usuario;");
		arr_datos_2.add(v_nombre_del_usuario + ";");

		arr_datos_2.add("contraseña;");
		arr_datos_2.add(v_contraseña + ";");
		
		arr_datos_2.add("link ingresar demo;");
		arr_datos_2.add(v_link_ingresar_demo + ";");
		
		arr_datos_2.add("campo de texto;");
		arr_datos_2.add(v_campo_de_texto + ";");
		
		arr_datos_2.add("campo mail;");
		arr_datos_2.add(v_campo_mail + ";");
		
		arr_datos_2.add("campo area de texto;");
		arr_datos_2.add(v_campo_area_de_texto + ";");
		
		arr_datos_2.add("campo fecha;");
		arr_datos_2.add(v_campo_fecha + ";");
		
		arr_datos_2.add("campo lista;");
		arr_datos_2.add(v_campo_lista + ";");
		
		arr_datos_2.add("seleccion 1");
		arr_datos_2.add(v_seleccion_1 + ";");
		
		arr_datos_2.add("seleccion 2");
		arr_datos_2.add(v_seleccion_2 + ";");
		
		arr_datos_2.add("seleccion 3");
		arr_datos_2.add(v_seleccion_3 + ";");
					
			
		
		return arr_datos_2;	
	}

}
