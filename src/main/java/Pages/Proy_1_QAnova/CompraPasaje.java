package Pages.Proy_1_QAnova;


import java.util.ArrayList;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Util.Buscar_Elementos;

public class CompraPasaje extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	WebElement e_tipo_pasaje;
	//@FindBy(id="imObjectForm_5_2_1") 	WebElement e_tipo_pasaje;
	WebElement e_tipo_pasaje1;
	WebElement e_tipo_pasaje2;

	WebElement e_ciudad_origen;
	WebElement e_fecha_salida;
	WebElement e_ciudad_destino;
	WebElement e_fecha_regreso;
	WebElement e_nro_pasajeros;
	WebElement e_btn_next;
	
	WebElement e_label_pasajes;
	WebElement e_label_selec_tipo_Viaje;
	WebElement e_label_selec_ciudad_fecha;
	WebElement e_label_ciudad_origen;
	WebElement e_label_fecha_salida;
	WebElement e_label_ciudad_destino;
	WebElement e_label_fecha_regreso;
	WebElement e_label_selecciona_número_pasajeros;
	WebElement e_nro_pajeros;
	WebElement e_btn_resetear;
	
	
	
	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public CompraPasaje() {
		PageFactory.initElements(driver, this);
	}
	
	// ACCIONES PARA VALIDAR
	public String ValidacionCompraPasaje() {
		esperarSegundos(driver, 3);
		return driver.getTitle();
	}
	
	public ArrayList<String> ValidaelementosCompraPasaje(ArrayList<String> arr_elem2){

		elem_no_localizados=0;
		String v_pag = "CompraPasaje";

		v_desc_elem = "Tipo_Pasaje";
		v_metodo = "id";
		v_find = "imObjectForm_5_2_1";
		e_tipo_pasaje = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_tipo_pasaje!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
			 
		v_desc_elem = "Tipo_Pasaje1";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imObjectForm_5_2_0\"]";
		e_tipo_pasaje1 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_tipo_pasaje!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		
		v_desc_elem = "Tipo_Pasaje2";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imObjectForm_5_2_1\"]";
		e_tipo_pasaje2 = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_tipo_pasaje!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
		
		v_desc_elem = "Ciudad_Origen";
		v_metodo = "name";
		v_find = "Ciudad_Origen";
		e_ciudad_origen = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_ciudad_origen!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "Fecha_Salida";
		v_metodo = "name";
		v_find = "Fecha_Salida";
		e_fecha_salida = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_fecha_salida!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "Ciudad_Destino";
		v_metodo = "name";
		v_find = "Ciudad_Destino";
		e_ciudad_destino = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_ciudad_destino!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
	 
		v_desc_elem = "Fecha_Regreso";
		v_metodo = "name";
		v_find = "Fecha_Regreso";
		e_fecha_regreso = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_fecha_regreso!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "Nro_Pasajeros";
		v_metodo = "name";
		v_find = "Nro_Pasajeros";
		e_nro_pasajeros = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_nro_pasajeros!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "Boton_Next";
		v_metodo = "id";
		v_find = "imObjectForm_5_next";
		e_btn_next = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_btn_next!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
							 
		v_desc_elem = "label_Pasajes";
		v_metodo = "id";
		v_find = "imObjectTitle_4_03_text";
		e_label_pasajes = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_label_pasajes!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "label_Selecciona_Tipo_Viaje";
		v_metodo = "id";
		v_find = "imObjectForm_5_1_legend";
		e_label_selec_tipo_Viaje = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_label_selec_tipo_Viaje!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "label_Selecciona_Ciudad_y_Fecha";
		v_metodo = "id";
		v_find = "imObjectForm_5_3_legend";
		e_label_selec_ciudad_fecha = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_label_selec_ciudad_fecha!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "label_Ciudad_Origen";
		v_metodo = "id";
		v_find = "imObjectForm_5_4_label";
		e_label_ciudad_origen = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_label_ciudad_origen!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "label_fecha_Salida";
		v_metodo = "id";
		v_find = "imObjectForm_5_5_label";
		e_label_fecha_salida = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_label_fecha_salida!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "label_Ciudad_Destino";
		v_metodo = "id";
		v_find = "imObjectForm_5_6_label";
		e_label_ciudad_destino = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_label_ciudad_destino!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "label_Fecha_Regreso";
		v_metodo = "id";
		v_find = "imObjectForm_5_7_label";
		e_label_fecha_regreso = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_label_fecha_regreso!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}

		v_desc_elem = "label_Selecciona_número_pasajeros";
		v_metodo = "id";
		v_find = "imObjectForm_5_8_legend";
		e_label_selecciona_número_pasajeros = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_label_selecciona_número_pasajeros!=null) {
			   // Actualiza arreglo para el documento Word
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_cargo_exito+";");
			 arr_elem2.add("Passed;");
		}else {
			 arr_elem2.add(v_desc_elem+";");
			 arr_elem2.add(v_no_cargo_exito+";");
			 arr_elem2.add("Failled;");
			 elem_no_localizados++;
		}
	 
		v_desc_elem = "Boton_resetear";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imObjectForm_5_reset\"]";
		e_btn_resetear = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_btn_resetear!=null) {
			   // Actualiza arreglo para el documento Word
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
	   
	public ArrayList<String> compra(String v_tipo_pasaje,   String v_ciudad_origen, String v_fecha_salida, String v_ciudad_destino, String v_fecha_regreso, String v_nro_pasajeros,ArrayList<String> arr_datos_2){
		e_tipo_pasaje.sendKeys(v_tipo_pasaje);

		switch (v_tipo_pasaje) {
		case "Viaje Solo Ida":
			e_tipo_pasaje.sendKeys(v_tipo_pasaje);
			break;
		case "Viaje Ida y vuelta":
			e_tipo_pasaje.sendKeys(v_tipo_pasaje);
			break;
		}
		
		e_ciudad_origen.sendKeys(v_ciudad_origen);
		e_fecha_salida.sendKeys(v_fecha_salida);
		e_ciudad_destino.sendKeys(v_ciudad_destino);
		e_fecha_regreso.sendKeys(v_fecha_regreso);
		e_nro_pasajeros.sendKeys(v_nro_pasajeros);
		e_btn_next.click();
		
		/*   ------  ArrayList<String> x = new ArrayList<String>();    ----   */

		arr_datos_2.add("Tipo Pasaje;");
		arr_datos_2.add(v_tipo_pasaje+";");
		arr_datos_2.add("Ciudad Origen;");
		arr_datos_2.add(v_ciudad_origen+";");
		arr_datos_2.add("Fecha Salida;");
		arr_datos_2.add(v_fecha_salida+";");
		arr_datos_2.add("Ciudad Destino;");
		arr_datos_2.add(v_ciudad_destino+";");
		arr_datos_2.add("Fecha Regreso;");
		arr_datos_2.add(v_fecha_regreso+";");
		arr_datos_2.add("Nro Pasajeros;");
		arr_datos_2.add(v_nro_pasajeros+";");
			return arr_datos_2;
			
		/*   ------  -------------------------------------------------  ----   */
	}
}
