package Pages.Proy_6_Registro_Civil;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
import Util.Buscar_Elementos;

public class Registro_Civil extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	WebElement e_rut=null;
	WebElement e_tipo_documento=null;
	WebElement e_boton_aceptar=null;
	WebElement e_logo=null;
	WebElement e_link_Servicios_en_linea=null;
	WebElement e_Link_Revisa_estado_solicitud=null;
	WebElement e_link_informe_pago=null;
	WebElement e_Cedula_identidad_pasaporte=null;
	WebElement e_element=null;
	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	
	public Registro_Civil() {
		
		PageFactory.initElements(driver, this);
		esperarSegundos(driver, 5);
	}
	
	// ACCIONES PARA VALIDAR
	public String ValidacionRegistro_Civil() {
		return driver.getTitle();
	}

	public  ArrayList<String> ValidaelementosRegistro_Civil(ArrayList<String> arr_elem2){
	/* ================	//    OJO    Imprimir codigo fuente en archivo =================  */
//		String pageSource = driver.getPageSource();
//		Escribir_Archivos(pageSource,"Codigo_Page.html");
	/* =================================================================================  */

		String v_pag = "PaginaInicio";
		elem_no_localizados=0;

		v_desc_elem = "Logo";
		v_metodo = "xpath";
		v_find = "/html/body/header[1]/div[1]/div/a/img";
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

		v_desc_elem = "Link_Servicios_en_linea";
		v_metodo = "xpath";
//		v_find = "//*[@id=\"I1976-1-3\"]/a/span/span[2]";
		v_find = "//*[@id='I1678-1-3']/a/span/span[2]";
		e_link_Servicios_en_linea = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_Servicios_en_linea!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
			 e_link_Servicios_en_linea.click();
		}else {
			System.out.println("   No Encontro el elemento");
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		v_desc_elem = "Link_Revisa_estado_solicitud";
		v_metodo = "xpath";
		v_find = "//*[@id=\"I2014-10-1\"]/a/span/span[2]";
		e_Link_Revisa_estado_solicitud = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_Link_Revisa_estado_solicitud!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
			 e_Link_Revisa_estado_solicitud.click();
		}else {
			System.out.println("   No Encontro el elemento");
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
	
		v_desc_elem = "Cedula_identidad_pasaporte";
		v_metodo = "xpath";
		v_find = "/html/body/section[1]/div[6]/div/div/ul/li[1]/ul/li[1]/a/span/span[2]";
//		v_find = "/html/body/main[2]/div[5]/div/div/ul/li[1]/ul/li[1]/a/span/span[2]";
		e_Cedula_identidad_pasaporte = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_Cedula_identidad_pasaporte!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
			 e_Cedula_identidad_pasaporte.click();
		}else {
			System.out.println("   No Encontro el elemento");
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		esperarSegundos(driver, 3);
		driver.switchTo().defaultContent();  
		driver.switchTo().frame(0); 

		v_desc_elem = "Rut";
		v_metodo = "id";
		v_find = "form:run";
		e_rut = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_rut!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
			 e_rut.sendKeys(prop.getProperty("d_rut_nv"));
			 e_rut.sendKeys(Keys.ENTER);
		}else {
			System.out.println("   No Encontro el elemento");
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		esperarSegundos(driver, 3);
		
		v_desc_elem = "Tipo_Documento";
		v_metodo = "id";
		v_find = "form:styledSelect";
		e_tipo_documento = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_rut!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
			 e_tipo_documento.sendKeys(Keys.TAB);
			 e_tipo_documento.sendKeys(Keys.DOWN);
			 e_tipo_documento.sendKeys(Keys.DOWN);
			 e_tipo_documento.sendKeys(Keys.ENTER);
//			 Select list1 = new Select(e_tipo_documento);
//			 list1.selectByVisibleText("Cédula de identidad a extranjeros");
		}else {
			System.out.println("   No Encontro el elemento");
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		
		esperarSegundos(driver, 3);
		v_desc_elem = "Boton_Aceptar";
		v_metodo = "xpath";
		v_find = "//*[@id='form']/div[1]/table/tbody/tr/td[2]/table/tbody/tr/td/a";
		e_boton_aceptar = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_boton_aceptar!=null) {
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
		

		
		try { 
			
			e_boton_aceptar.click();;

			Alert alert = driver.switchTo().alert();
			String v_alertText = alert.getText();
	        System.out.println("Mensaje de Alert data: " + v_alertText); 
	        alert.accept();
	        
	        esperarSegundos(driver, 3);
			JavascriptExecutor jse2 = (JavascriptExecutor)driver; 
			jse2.executeScript("window.scrollBy(0,350)", "");
	        
			return arr_elem2;	 
			
			}catch (NoAlertPresentException e) {

		        esperarSegundos(driver, 3);
		        JavascriptExecutor jse2 = (JavascriptExecutor)driver; 
				jse2.executeScript("window.scrollBy(0,350)", "");

		        return arr_elem2;	

			} 

	}

	public ArrayList<String> login(String uss, String pwd,ArrayList<String> arr_datos_2){
		arr_datos_2.add("Usuario;");
		arr_datos_2.add(uss+";");
		arr_datos_2.add("Password;");
		arr_datos_2.add(pwd+";");
		return arr_datos_2;
	}
	
}
