package Pages.Proy_1_QAnova;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Base.TestBase;
import Util.Buscar_Elementos;

public class EditarInformePago extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	
	WebElement e_sub_titulo=null;
	WebElement e_sub_titulo_tabla=null;
	WebElement btn_delete=null;
	WebElement e_tabla_web=null;
	WebElement e_box_filtro=null;
	WebElement e_boton_filtro=null;
	WebElement e_Label_titulo_tabla=null;
	WebElement e_link_editarInforme_de_pago=null;
	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public EditarInformePago() {
		PageFactory.initElements(driver, this);
	}
	
	// ACCIONES PARA VALIDAR
	public String ValidacionEditarInformePago() {
		esperarSegundos(driver, 3);
		return driver.getTitle();
	}
	
	public ArrayList<String> ValidaelementosEditarInformePago(ArrayList<String> arr_elem2){
		
		elem_no_localizados=0;
		String v_pag = "EditarInformePago";
	 
		v_desc_elem = "Tabla_Web";
		v_metodo = "id";
		v_find = "pluginAppObj_5_02_jtable";
		e_tabla_web = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_tabla_web!=null) {
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

		v_desc_elem = "Box_Filtro";
		v_metodo = "id";
		v_find = "pluginAppObj_5_02_filter_field";
		e_box_filtro = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_box_filtro!=null) {
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

		v_desc_elem = "Botón_Filtro";
		v_metodo = "id";
		v_find = "pluginAppObj_5_02_filter_button";
		e_boton_filtro = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_boton_filtro!=null) {
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

		v_desc_elem = "Label_Titulo_Tabla";
		v_metodo = "className";
		v_find = "jtable-title-text";
		e_Label_titulo_tabla = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_Label_titulo_tabla!=null) {
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

		v_desc_elem = "Link_EditarInforme_de_Pago";
		v_metodo = "id";
		v_find = "imMnMnNode5";
		e_link_editarInforme_de_pago = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_link_editarInforme_de_pago!=null) {
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
	
	public String ExtraerDatoTabla4() {
		String v_pag = "Editar Informe de Pago";
		WebElement source = driver.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/div[4]/div[1]/span[2]/select"));
		
				
		Select list = new Select(source);
		
		List<WebElement> elements = list.getOptions();
		
		int v_imprimir = 0;
		int v_elementos1 = elements.size();
		int v_elementos2 = 0;
		for (int iterator=0; iterator<=v_elementos1-1; iterator++)
		
		{

			list.selectByIndex(iterator);

			esperarSegundos(driver, 1);

		WebElement baseTable3 = driver.findElement(By.tagName("table"));
		
		//No.of Filas
        java.util.List<WebElement>  rows = driver.findElements(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/tbody/tr"));
        int rowtab = rows.size();
        
        if (v_imprimir <=0) {
	        WebElement tableRowt = baseTable3.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[1]"));
	        
	        WebElement vtw_tipoviaje = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[1]"));
	        WebElement vtw_ciudadorigen = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[2]"));
	        WebElement vtw_fechasalida = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[3]"));
	        WebElement vtw_ciudaddestino = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[4]"));
	        WebElement vtw_fecharegreso = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[5]"));
	        WebElement vtw_costoida = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[7]"));
	        WebElement vtw_costovuelta = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[8]"));
	        WebElement vtw_nombre = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[9]"));
	        WebElement vtw_rut = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/thead/tr/th[10]"));
	        
	        String vt_tipoviaje = vtw_tipoviaje.getText();
			String vt_ciudadorigen = vtw_ciudadorigen.getText();
			String vt_fechasalida = vtw_fechasalida.getText();
			String vt_ciudaddestino = vtw_ciudaddestino.getText();
			String vt_fecharegreso = vtw_fecharegreso.getText();
			String vt_nropasajero = "#";
			String vt_costoida = vtw_costoida.getText();;
			String vt_costovuelta = vtw_costovuelta.getText();;
			String vt_nombre = vtw_nombre.getText();;
			String vt_rut = vtw_rut.getText();;
			String vt_linea = "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
			String vt_patron = "| %18s | %20s | %12s | %20s | %13s | %s | %17s | %17s | %20s | %10s | ";
			String vt_resultado = String.format(vt_patron,vt_tipoviaje,vt_ciudadorigen,vt_fechasalida,vt_ciudaddestino,vt_fecharegreso,vt_nropasajero,vt_costoida,vt_costovuelta,vt_nombre,vt_rut);
			//"S000000001\\r\\n\"
			System.out.println(vt_linea);
			System.out.println(vt_resultado);
			v_imprimir++;
        	}
        //System.out.println(" Antes de eliminar  página -->> "+ v_pag+" --->>  Cantidad de Filas "+ rowtab);
        for(int i=1; i<=rowtab; i++)   //This for loop will be total executed 3 times.
        	{
    	    	esperarSegundos(driver, 1);
        	    WebElement tableRow3 = baseTable3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]"));
        	    
       			WebElement v_rut = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 10 +"]"));
       			
        	    String vs_rut = v_rut.getText();
        	    String vs_rut2 = "S000000001";
        	    if (vs_rut.equals(vs_rut2)) {
        	    	
	        	    WebElement v_tipoviaje = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 1 +"]"));
	       			WebElement v_ciudadorigen = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 2 +"]"));
	       			WebElement v_fechasalida = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 3 +"]"));
	       			WebElement v_ciudaddestino = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 4 +"]"));
	       			WebElement v_fecharegreso = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 5 +"]"));
	       			WebElement v_nropasajero = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 6 +"]"));
	       			WebElement v_costoida = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 7 +"]"));
	       			WebElement v_costovuelta = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 8 +"]"));
	       			WebElement v_nombre = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 9 +"]"));
       			
	       			String vs_tipoviaje = v_tipoviaje.getText();
	       			String vs_ciudadorigen = v_ciudadorigen.getText();
	       			String vs_fechasalida = v_fechasalida.getText();
	       			String vs_ciudaddestino = v_ciudaddestino.getText();
	       			String vs_fecharegreso = v_fecharegreso.getText();
	       			String vs_nropasajero = v_nropasajero.getText();
	       			String vs_costoida = v_costoida.getText();
	       			String vs_costovuelta = v_costovuelta.getText();
	       			String vs_nombre = v_nombre.getText();
	       			String vt_linea = "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
	       			String patron = "| %18s | %20s | %12s | %20s | %13s | %s | %17s | %17s | %20s | %10s | ";
	       			String resultado = String.format(patron,vs_tipoviaje,vs_ciudadorigen,vs_fechasalida,vs_ciudaddestino,vs_fecharegreso,vs_nropasajero,vs_costoida,vs_costovuelta,vs_nombre,vs_rut);
	       			System.out.println(vt_linea);
	       			System.out.println(resultado);
	       			
	    	    	WebElement boton = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_5_02_jtable\"]/div/table/tbody/tr[" + i + "]/td[12]/button"));
	    	    	esperarSegundos(driver, 1);
	       			boton.click();
	       			v_desc_elem = "Tipo_Pasaje";
	       			v_metodo = "xpath";
	       			v_find = "//*[@id=\"DeleteDialogButton\"]";
	       			btn_delete = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);

	       			btn_delete.click();
	       	    	rowtab--;
	       	    	i--;
	        	    esperarSegundos(driver, 2);
	       			rows = driver.findElements(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/table/tbody/tr"));
	        	    rowtab = rows.size();
        	    }
    	    }
        
        esperarSegundos(driver, 3);
        
        WebElement  source2 = driver.findElement(By.xpath("//*[@id=\'pluginAppObj_5_02_jtable\']/div/div[4]/div[1]/span[2]/select"));
        
        Select list2 = new Select(source2);
		
		List<WebElement> elements2 = list2.getOptions();
        
        v_elementos2 = elements2.size();
        if (v_elementos1>v_elementos2) {
        	
        	v_elementos1--;
        }
        v_elementos1 = v_elementos2;
  
		esperarSegundos(driver, 1);
		
        }
        
		String vt_lineaf = "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        System.out.println(vt_lineaf);
			return "-->>   Datos de la Tabla Leida  <<---";
		}
}
