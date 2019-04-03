package Pages.Proy_4_Empleados;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
import Util.Genera_Archivo;
import Util.Buscar_Elementos;

public class Carga_Empleados extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	WebElement e_usuarios=null;
	WebElement e_password=null;
	WebElement e_login=null;
	WebElement e_felicidades=null;
	WebElement e_empleados=null;
	WebElement e_crear=null;
	WebElement e_nombre=null;
	WebElement e_direccion=null;
	WebElement e_ubicacion=null;
	WebElement e_correo=null;
	WebElement e_telefono=null;
	WebElement e_dpto=null;
	WebElement e_puesto=null;
	WebElement e_working=null;
	WebElement e_identificacion=null;
	WebElement e_guardar=null;
	WebElement e_informacion=null;
	
	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public Carga_Empleados() {
		PageFactory.initElements(driver, this);
	}
	
	// ACCIONES PARA VALIDAR
	public String ValidacionPaginaInicio() {
		return driver.getTitle();
	}

	public  ArrayList<String> ValidaelementosPaginaInicio(ArrayList<String> arr_elem2){
	/* ================	//    OJO    Imprimir codigo fuente en consola  =================  */
		String pageSource = driver.getPageSource();
		Genera_Archivo.Escribir_Archivos(pageSource,"Carga_Empleados_Page.html");

//		e_nameorrut.sendKeys(uss);
////		e_imgbnSearch.click();
//		e_imgbnSearch.sendKeys(Keys.TAB);
//		e_imgbnSearch.sendKeys(Keys.ENTER);
		
		String v_pag = "Empleados";
		elem_no_localizados=0;
		
		v_desc_elem = "usuario";
		v_metodo = "xpath";
		v_find = "//*[@id=\"login\"]";
		e_usuarios = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_usuarios!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
			 e_usuarios.sendKeys("pmorales@qanovagroup.com");
		}else {
			System.out.println("   No Encontro el elemento");
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		
//		v_desc_elem = "password";
//		v_metodo = "xpath";
//		v_find = "//*[@id=\"password\"]";
//		e_password = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_password!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_password.sendKeys("qanova2018");
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "login";
//		v_metodo = "xpath";
//		v_find = "/html/body/div/div/form/div[3]/button";
//		e_login = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_login!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_login.click();
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		esperarSegundos(driver, 10);
//		
////		v_desc_elem = "felicidades";
////		v_metodo = "xpath";
////		v_find = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div[1]/div";
////		e_felicidades = waitForElementPresent3 (v_metodo, v_find, 30, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
////		if (e_felicidades!=null) {
////			   // Actualiza arreglo para el documento Word
////			 arr_elem2.add(v_desc_elem+";");
////			 arr_elem2.add(v_cargo_exito+";");
////			 arr_elem2.add("Passed;");
//////			 e_felicidades.click();
////		}else {
////			System.out.println("   No Encontro el elemento");
////			 arr_elem2.add(v_desc_elem+";");
////			 arr_elem2.add(v_no_cargo_exito+";");
////			 arr_elem2.add("Failled;");
////			 elem_no_localizados++;
////		}
//		
//		String pageSource1 = driver.getPageSource();
//		Escribir_Archivos(pageSource1,"Codigo_Page.html");
//		
//		
//		v_desc_elem = "Empleados";
//		v_metodo = "xpath";
//		v_find = "/html/body/nav/div[2]/ul[1]/li[13]/a/span";
//		e_empleados = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_empleados!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_empleados.click();
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "crear";
//		v_metodo = "xpath";
//		v_find = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]";
//		e_crear = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_crear!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_crear.click();
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		esperarSegundos(driver, 10);
//		
//		String pageSource2 = driver.getPageSource();
//		Escribir_Archivos(pageSource2,"Crear_Page.html");
//		
//		v_desc_elem = "Nombre_Apellido";
//		v_metodo = "name";
//		v_find = "name";
//		e_nombre = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_nombre!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_nombre.sendKeys("Nicolas Vivas");
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//
//		v_desc_elem = "direccion";
//		v_metodo = "xpath";
//		v_find = "//*[@id=\"o_field_input_20\"]";
//		e_direccion = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_direccion!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_direccion.clear();
//			 e_direccion.sendKeys("Administrador");
//			 e_direccion.sendKeys(Keys.TAB);
//			 e_direccion.sendKeys(Keys.ENTER);
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//
//	
//		v_desc_elem = "ubicacion";
//		v_metodo = "name";
//		v_find = "work_location";
//		e_ubicacion = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_ubicacion!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_ubicacion.sendKeys("Catedral 1233");
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "Correo";
//		v_metodo = "name";
//		v_find = "work_email";
//		e_correo = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_correo!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_correo.sendKeys("nvivas@qanova.cl");
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "telefono";
//		v_metodo = "name";
//		v_find = "mobile_phone";
//		e_telefono = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_telefono!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_telefono.sendKeys("+56971268627");
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "dpto";
//		v_metodo = "xpath";
//		v_find = "//*[@id=\"o_field_input_25\"]";
//		e_dpto = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_dpto!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_dpto.clear();
//			 e_dpto.sendKeys("Administrador");
//			 e_dpto.sendKeys(Keys.TAB);
//			 e_dpto.sendKeys(Keys.ENTER);
//			 
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "puesto";
//		v_metodo = "xpath";
//		v_find = "//*[@id=\"o_field_input_36\"]";
//		e_puesto = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_puesto!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_puesto.clear();
//			 e_puesto.sendKeys("Tester");
//			 e_puesto.sendKeys(Keys.TAB);
//			 e_puesto.sendKeys(Keys.ENTER);
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "working";
//		v_metodo = "xpath";
//		v_find = "//*[@id=\"o_field_input_40\"]";
//		e_working = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_working!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_working.clear();
//			 e_working.sendKeys("Horario QA Nova");
//			 e_working.sendKeys(Keys.TAB);
//			 e_working.sendKeys(Keys.ENTER);
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "informacion";
//		v_metodo = "xpath";
//		v_find = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[4]/ul/li[2]/a";
//		e_informacion = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_informacion!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
////			 e_informacion.click();
//			 e_informacion.sendKeys(Keys.TAB);
//			 e_informacion.sendKeys(Keys.ENTER);
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "identificacion";
//		v_metodo = "xpath";
//		v_find = "//*[@id=\"o_field_input_44\"]";
//		e_identificacion = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_identificacion!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_identificacion.sendKeys("113896358");
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
//		
//		v_desc_elem = "guardar";
//		v_metodo = "xpath";
//		v_find = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]";
//		e_guardar = waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
//		if (e_guardar!=null) {
//			   // Actualiza arreglo para el documento Word
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_cargo_exito+";");
//			 arr_elem2.add("Passed;");
//			 e_guardar.click();
//		}else {
//			System.out.println("   No Encontro el elemento");
//			 arr_elem2.add(v_desc_elem+";");
//			 arr_elem2.add(v_no_cargo_exito+";");
//			 arr_elem2.add("Failled;");
//			 elem_no_localizados++;
//		}
		
		return arr_elem2;
	}

	public ArrayList<String> login(ArrayList<String> arr_datos_2){

		
		//ArrayList<String> x = new ArrayList<String>();

		arr_datos_2.add("Nombre;");
		arr_datos_2.add("Nicolas Vivas"+";");
		arr_datos_2.add("Dirección;");
		arr_datos_2.add("ACHS"+";");
		arr_datos_2.add("Dirección;");
		arr_datos_2.add("ACHS"+";");
		arr_datos_2.add("Ubicacion;");
		arr_datos_2.add("Cede / Catedral 1233"+";");
		arr_datos_2.add("Telefono Movil;");
		arr_datos_2.add("+56971268627"+";");
		arr_datos_2.add("Dirección;");
		arr_datos_2.add("ACHS"+";");
		arr_datos_2.add("Departamento;");
		arr_datos_2.add("Calidad"+";");
		arr_datos_2.add("Puesto;");
		arr_datos_2.add("Tester"+";");
		arr_datos_2.add("Working;");
		arr_datos_2.add("Horario QA Nova"+";");
		arr_datos_2.add("Identificación;");
		arr_datos_2.add("113896358"+";");
	
		return arr_datos_2;
	}
	
}
