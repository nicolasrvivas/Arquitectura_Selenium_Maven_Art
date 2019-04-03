package Pages.Proy_5_Provida;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
import Util.Genera_Archivo;
import Util.Buscar_Elementos;

public class Provida_Login extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	WebElement e_user=null;
	WebElement e_pass=null;
	WebElement e_btnLogin=null;
	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public Provida_Login() {
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


		String v_pag = "ProvidaPaginaLogin";
		elem_no_localizados=0;


		v_desc_elem = "usuario";
		v_metodo = "xpath";
		v_find = "/html/body/form/font/table/tbody/tr[1]/td[2]/div/input";
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
		v_metodo = "xpath";
		v_find = "/html/body/form/font/table/tbody/tr[2]/td[2]/input";
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

		v_desc_elem = "Entrar";
		v_metodo = "xpath";
		v_find = "/html/body/form/font/table/tbody/tr[4]/td/input";
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
