package Pages.Cardif;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Pages.Proy_2_Genericos.GP02015_Return_Page_Title;
// import Util.Genera_Archivo;
import Util.Buscar_Elementos;
import Util.Captura_Pantalla;

public class OP02110_PaginaInicioCardif extends TestBase {

 // DECLARACIONES DE LOS OBJETOS 
	
	WebElement e_link					= null;
	WebElement e_nombre_completo		= null;
	WebElement e_nombre_conductor		= null;
	WebElement e_rut_asegurado			= null;
	WebElement e_patente				= null;
	WebElement e_fecha_siniestro		= null;
	WebElement e_hora_siniestro			= null;
	WebElement e_minuto_siniestro       = null;
	WebElement e_region					= null;
	WebElement e_comuna					= null;
	WebElement e_relato_de_los_hechos	= null;
	
	int v_cont_4=0;
	ArrayList<String> arr_datos_4		= null;
	ArrayList<String> arr_Elementos_4;
	ArrayList<String> arr_Evidencia_4;
	int elem_no_localizados_4			= 0;
	
	public String Ejec_PaginaInicioCardif(String v_name_imagen, 
										int v_cont_3, 
										ArrayList<String> arr_datos_3,
										ArrayList<String> arr_Elementos_3,
										ArrayList<String> arr_Evidencia_3){
		String v_valid_proceso = null;
	/*  -------------------------------------- Validación Título ------------------------------------  */

		String title0 = GP02015_Return_Page_Title.Titulo_Pagina_Presente(10,"BNP Paribas Cardif Chile - Inicio");

	/*  ---------------------------------------------------------------------------------------------  */
	/*                       Si titulo es cortrecto graba evidencia                                    */
		
		if(title0.equals("BNP Paribas Cardif Chile - Inicio")) {
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

			arr_Elementos_3 = Validaelementos_PaginaInicioCardif(arr_Elementos_3);

			if (elem_no_localizados_4 == 0) {
				v_valid_proceso="EXITO";
			}else {
				v_valid_proceso="FALLA";
			}
		}
		
		/*  --------------------------------------------------------------------------------------------- */
		/*                Graba y validación de elementos en arreglo evidencias                           */		
			if (v_valid_proceso=="EXITO"){

				v_valid_proceso = Clic_Seguros_Automotriz();

			}
			
	/*  --------------------------------------------------------------------------------------------- */
	/*  -------------------------------------- Validación Título ------------------------------------  */

			if (v_valid_proceso=="EXITO"){
				String title1 = GP02015_Return_Page_Title.Titulo_Pagina_Presente(10,"BNP Paribas Cardif Chile | Denuncia tu siniestro");
	
			/*  ---------------------------------------------------------------------------------------------  */
			/*                       Si titulo es cortrecto graba evidencia                                    */
				
				if(title1.equals("BNP Paribas Cardif Chile | Denuncia tu siniestro")) {
					arr_Evidencia_3.add("Validación Titulo;");
					arr_Evidencia_3.add("Se obtuvo el título esperado: "+title1+";");
					arr_Evidencia_3.add("Passed;");
					v_valid_proceso="EXITO";
				}else {
					arr_Evidencia_3.add("Validación Titulo;");
					arr_Evidencia_3.add("No se obtuvo el título esperado: "+title1+";");
					arr_Evidencia_3.add("Failed;");
					v_valid_proceso="FALLA";
				}
	
				Captura_Pantalla.takeScreenShotTest(driver,v_name_imagen+v_cont_3);
				v_cont_3++;

			}
			
	/*  --------------------------------------------------------------------------------------------- */
	/*                Graba y validación de elementos en arreglo evidencias                           */		
		if (v_valid_proceso=="EXITO"){
			
			JavascriptExecutor jse2 = (JavascriptExecutor)driver; 
			jse2.executeScript("window.scrollBy(0,400)", "");
			
			arr_Elementos_3 = Validaelementos_Información_del_siniestro(arr_Elementos_3);
			System.out.println("--->>>   text   --->>>  ["+v_valid_proceso+"]  <<<---");
			if (elem_no_localizados_4 == 0) {
				v_valid_proceso="EXITO";
			}else {
				v_valid_proceso="FALLA";
			}
		}
	/*  --------------------------------------------------------------------------------------------  */
		if (v_valid_proceso=="EXITO"){
			arr_datos_3 =  Datos_Información_del_siniestro("Susana Saravia Medina",
														"Camila Lopéz Saravia",
														"1-9",
														"FFFH48",
														"19 Marzo 2019",
														"19",
														"15",
														"REGIÓN METROPOLITANA",
														"SANTIAGO",
														"Conductor de camión, no respeto semaforo en luz roja y colisiona mi automovil en la parte trasera del lado del conductor", 
														arr_datos_3);		
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
	public  ArrayList<String> Validaelementos_PaginaInicioCardif(ArrayList<String> arr_elem2){
		
	/* ================	//    OJO    Imprimir codigo fuente en consola  =================  */
	//	String pageSource = driver.getPageSource();
	//	Genera_Archivo.Escribir_Archivos(pageSource,"Codigo_Page.html");
	//	System.out.println("------->>   pageSource  <<--------");
	//	System.out.println(pageSource);
	//	System.out.println("------->>   pageSource  <<--------");
	//	Un texto cualquiera guardado en una variable
	/* ==================================================================================  */
		
		String v_pag = "Cardif";
		elem_no_localizados=0;

		v_desc_elem = "Link_Seguro_Automotriz";
		v_metodo = "xpath";
		v_find = "//*[@id='content']/div[2]/div[1]/div[1]/div[1]/div/div/div/ul/li[1]/a";
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

	
	public String Clic_Seguros_Automotriz(){
		
	
		String v_valid_proceso_4		= null;

		try {
			  e_link.click();
			  v_valid_proceso_4		= "EXITO";
			}catch(Exception e) {
				v_valid_proceso_4	= "FALLA";
			}

		return v_valid_proceso_4;
	}
	
	public  ArrayList<String> Validaelementos_Información_del_siniestro(ArrayList<String> arr_elem2){
		
		
	/* ================	//    OJO    Imprimir codigo fuente en consola  =================  */
	//	String pageSource = driver.getPageSource();
	//	Genera_Archivo.Escribir_Archivos(pageSource,"Codigo_Page.html");
	//	System.out.println("------->>   pageSource  <<--------");
	//	System.out.println(pageSource);
	//	System.out.println("------->>   pageSource  <<--------");
	//	Un texto cualquiera guardado en una variable
	/* ==================================================================================  */
		
		String v_pag = "Información_del_siniestro";
		elem_no_localizados=0;

		v_desc_elem = "nombre_completo";
		v_metodo = "xpath";
		v_find = "//*[@id='text-03\']";
		e_nombre_completo = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
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

		v_desc_elem = "nombre_conductor";
		v_metodo = "xpath";
		v_find = "//*[@id='text-04\']";
		e_nombre_conductor = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_nombre_conductor!=null) {
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

		v_desc_elem = "rut_asegurado";
		v_metodo = "xpath";
		v_find = "//*[@id='text-05\']";
		e_rut_asegurado= Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_rut_asegurado!=null) {
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
		
		v_desc_elem = "patente";
		v_metodo = "xpath";
		v_find = "//*[@id='text-07\']";
		e_patente = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_patente!=null) {
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
		
		v_desc_elem = "fecha_siniestro";
		v_metodo = "xpath";
		v_find = "//*[@id='text-06\']";
		e_fecha_siniestro = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_fecha_siniestro!=null) {
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
		
		v_desc_elem = "hora_siniestro";
		v_metodo = "xpath";
		v_find = "//*[@id=\'text-08\']";
		e_hora_siniestro = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_hora_siniestro!=null) {
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
		
		v_desc_elem = "minuto_siniestro";
		v_metodo = "xpath";
		v_find = "//*[@id='text-09\']";
		e_minuto_siniestro= Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_minuto_siniestro!=null) {
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
		
		v_desc_elem = "region";
		v_metodo = "xpath";
		v_find = "//*[@id='select-form-02-button']/span[1]";

		e_region = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_region!=null) {
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
		
		
		v_desc_elem = "comuna";
		v_metodo = "xpath";
		v_find = "//*[@id='select-form-01-button\']/span[1]";
		e_comuna = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_comuna!=null) {
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
		
		v_desc_elem = "relato_de_los_Hechos";
		v_metodo = "xpath";
		v_find = "//*[@id='text-area-01\']";
		e_relato_de_los_hechos = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_relato_de_los_hechos!=null) {
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
	

	
	public ArrayList<String> Datos_Información_del_siniestro(String v_nombre_completo,
															String v_nombre_conductor,
															String v_rut_asegurado,
															String v_patente,
															String v_fecha_siniestro,
															String v_hora_siniestro,
															String v_minuto_siniestro,
															String v_region,
															String v_comuna,
															String v_relato_de_los_hechos,															
															ArrayList<String> arr_datos_2){

		e_nombre_completo.sendKeys(v_nombre_completo);		
		e_nombre_conductor.sendKeys(v_nombre_conductor);		
		e_rut_asegurado.sendKeys(v_rut_asegurado);			
		e_patente.sendKeys(v_patente);				
		e_fecha_siniestro.sendKeys(v_fecha_siniestro);		
		e_hora_siniestro.sendKeys(v_hora_siniestro);		
		e_minuto_siniestro.sendKeys(v_minuto_siniestro);  
		
	/*  -----------------------------------------   */
		
		
		List<WebElement> options = e_region.findElements(By.tagName("option")); 
		System.out.println("--->>>   option.getText().trim()   --->>>  ["+e_region.getText().trim()+"]  <<<---");
		for (WebElement option : options) { 
			System.out.println("--->>>   option.getText().trim()   --->>>  ["+option.getText().trim()+"]  <<<---");
			if(v_region.equals(option.getText().trim())) {
					option.click(); 
			}
		} 
	/*  -----------------------------------------   */
//		e_region.click();
//
//		e_region.sendKeys(v_region);	
////		e_region.click();
//		e_region.sendKeys(Keys.ENTER);
//		
//		Select list1 = new Select(e_region);
//		list1.selectByVisibleText(v_region);
		
//		e_comuna.sendKeys(v_comuna);
//		Select list2 = new Select(e_comuna);
//		list2.selectByVisibleText(v_comuna);
		
		e_relato_de_los_hechos.sendKeys(v_relato_de_los_hechos);	
		

		
	//  Carga Datos de entrada al login en el arreglo
		arr_datos_2.add("nombre completo;");
		arr_datos_2.add(v_nombre_completo+";");
	
		arr_datos_2.add("nombre conductor;");
		arr_datos_2.add(v_nombre_conductor+";");
	
		arr_datos_2.add("rut asegurado;");
		arr_datos_2.add(v_rut_asegurado+";");
		
		arr_datos_2.add("patente;");
		arr_datos_2.add(v_patente+";");
		
		arr_datos_2.add("fecha siniestro;");
		arr_datos_2.add(v_fecha_siniestro+";");
		
		arr_datos_2.add("hora siniestro;");
		arr_datos_2.add(v_hora_siniestro+";");
		
		arr_datos_2.add("minuto siniestro;");
		arr_datos_2.add(v_minuto_siniestro+";");
		
	    arr_datos_2.add("region;");
		arr_datos_2.add(v_region+";");
		
		arr_datos_2.add("comuna;");
		arr_datos_2.add(v_comuna+";");
			
		return arr_datos_2;
	}
	
}
