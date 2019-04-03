package Pages.Proy_1_QAnova;


import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Util.Buscar_Elementos;

public class CompraPasaje2 extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	WebElement e_costo_ida1=null;
	WebElement e_costo_ida2=null;
	WebElement e_costo_ida3=null;
	WebElement e_costo_ida_checkbox=null;
	WebElement e_costo_vuelta=null;
	WebElement e_costo_vuelta1=null;
	WebElement e_costo_vuelta2=null;
	WebElement e_costo_vuelta3=null;
	WebElement e_nombre=null;
	WebElement e_rut=null;
	WebElement e_btnenviar=null;

	WebElement e_label_Itinerario_según_disponibilidad=null;
	WebElement e_label_Ida=null;
	WebElement e_label_Vuelta=null;
	WebElement e_label_Información_Cliente=null;
	WebElement e_label_Nombre_Completo=null;
	WebElement e_label_RUT=null;
	WebElement e_btnAnterior=null;
	WebElement e_btnResetear=null;

	
		// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
		public CompraPasaje2() {
			PageFactory.initElements(driver, this);
		}
		
		// ACCIONES PARA VALIDAR
		public String ValidacionCompraPasaje2() {
			esperarSegundos(driver, 3);
			return driver.getTitle();
		}
		
		public ArrayList<String> ValidaelementosCompraPasaje2(ArrayList<String> arr_elem2){

			String v_pag = "CompraPasaje2";
			elem_no_localizados=0;

			v_desc_elem = "costo_ida_checkbox";
			v_metodo = "id";
			v_find = "imObjectForm_5_11_wrapper";
			e_costo_ida_checkbox = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_costo_ida_checkbox!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
			
			v_desc_elem = "costo_ida1";
			v_metodo = "id";
			v_find = "imObjectForm_5_11_0";
			e_costo_ida1 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_costo_ida1!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
			
			v_desc_elem = "costo_ida2";
			v_metodo = "id";
			v_find = "imObjectForm_5_11_1";
			e_costo_ida2 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_costo_ida2!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}

			v_desc_elem = "costo_ida3";
			v_metodo = "id";
			v_find = "imObjectForm_5_11_2";
			e_costo_ida3 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_costo_ida3!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}

			v_desc_elem = "costo_vuelta";
			v_metodo = "id";
			v_find = "imObjectForm_5_12_wrapper";
			e_costo_vuelta = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_costo_vuelta!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
			
			v_desc_elem = "costo_vuelta1";
			v_metodo = "id";
			v_find = "imObjectForm_5_12_0";
			e_costo_vuelta1 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_costo_vuelta1!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
			
			v_desc_elem = "costo_vuelta2";
			v_metodo = "id";
			v_find = "imObjectForm_5_12_1";
			e_costo_vuelta2 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_costo_vuelta2!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
			
			v_desc_elem = "costo_vuelta3";
			v_metodo = "id";
			v_find = "imObjectForm_5_12_2";
			e_costo_vuelta3 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_costo_vuelta3!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}

			v_desc_elem = "Nombre";
			v_metodo = "name";
			v_find = "Nombre";
			e_nombre = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_nombre!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
	 
			v_desc_elem = "Rut";
			v_metodo = "name";
			v_find = "Rut";
			e_rut = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_rut!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
	 
			v_desc_elem = "btnenviar";
			v_metodo = "id";
			v_find = "imObjectForm_5_submit";
			e_btnenviar = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_btnenviar!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}

			v_desc_elem = "label_Itinerario_según_disponibilidad";
			v_metodo = "id";
			v_find = "imObjectForm_5_10_legend";
			e_label_Itinerario_según_disponibilidad = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_label_Itinerario_según_disponibilidad!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}

			v_desc_elem = "label_Ida";
			v_metodo = "id";
			v_find = "imObjectForm_5_11_label";
			e_label_Ida = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_label_Ida!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
	
			v_desc_elem = "label_Vuelta";
			v_metodo = "id";
			v_find = "imObjectForm_5_12_label";
			e_label_Vuelta = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_label_Vuelta!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}

			v_desc_elem = "label_Información_Cliente";
			v_metodo = "id";
			v_find = "imObjectForm_5_13_legend";
			e_label_Información_Cliente = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_label_Información_Cliente!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}

			v_desc_elem = "label_Nombre_Completo";
			v_metodo = "id";
			v_find = "imObjectForm_5_12_label";
			e_label_Nombre_Completo = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_label_Nombre_Completo!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}

			v_desc_elem = "label_RUT";
			v_metodo = "id";
			v_find = "imObjectForm_5_15_label";
			e_label_RUT = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_label_RUT!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
								 

			v_desc_elem = "Boton_Anterior";
			v_metodo = "id";
			v_find = "imObjectForm_5_prev";
			e_btnAnterior = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_btnAnterior!=null) {
				   // Actualuiza arreglo para el documento Word
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_cargo_exito+";");
				 arr_elem2.add("Passed;");
			}else {
				 arr_elem2.add(v_desc_elem+";");
				 arr_elem2.add(v_no_cargo_exito+";");
				 arr_elem2.add("Failled;");
				 elem_no_localizados++;
			}
				 
			v_desc_elem = "Boton_Resetear";
			v_metodo = "id";
			v_find = "imObjectForm_5_prev";
			e_btnResetear = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
			if (e_btnResetear!=null) {
				   // Actualuiza arreglo para el documento Word
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

		
		public ArrayList<String> compra2(String v_costo_ida, String v_costo_vuelta, String v_nombre, String v_rut,ArrayList<String> arr_datos_2){
			
			switch (v_costo_ida) {
			case "Clasico A $ 1.500":
				e_costo_ida1.sendKeys(v_costo_ida);
				break;
			case "Clasico B $ 3.000":
				e_costo_ida2.sendKeys(v_costo_ida);
				break;
			case "Clasico C $ 5.000":
				e_costo_ida3.sendKeys(v_costo_ida);
				break;
			}
			
			switch (v_costo_vuelta) {
			case "Clasico A $ 1.500":
				e_costo_vuelta1.sendKeys(v_costo_vuelta);
				break;
			case "Clasico B $ 3.000":
				e_costo_vuelta2.sendKeys(v_costo_vuelta);
				break;
			case "Clasico C $ 5.000":
				e_costo_vuelta3.sendKeys(v_costo_vuelta);
				break;
			}
			
			e_nombre.sendKeys(v_nombre);
			e_rut.sendKeys(v_rut);
			e_btnenviar.click();
					
		 /*   ------  ArrayList<String> x = new ArrayList<String>();    ----   */

			arr_datos_2.add("Costo Ida;");
			arr_datos_2.add(v_costo_ida+";");
			arr_datos_2.add("Costo Vuelta;");
			arr_datos_2.add(v_costo_vuelta+";");
			arr_datos_2.add("Nombre;");
			arr_datos_2.add(v_nombre+";");
			arr_datos_2.add("Rut;");
			arr_datos_2.add(v_rut+";");

			return arr_datos_2;
					
		/*   ------  -------------------------------------------------  ----   */
		}

}
