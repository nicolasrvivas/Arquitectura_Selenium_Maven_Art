package Pages.Proy_2_QAnova_Piloto;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Base.TestBase;
import Pages.Proy_2_Genericos.GP02020_Return_Var_Elem_no_localizados;
import Pages.Proy_2_Genericos.GP02030_Link_Matriz_Informacion;
import Pages.Proy_2_Genericos.GP02035_Valid_Titulo_Matriz_Informacion;
import Util.Buscar_Elementos;
import Util.Captura_Pantalla;

public class OP02140_Eliminar_Datos_MatrizInformacion extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	
	WebElement e_sub_titulo=null;
	WebElement e_sub_titulo_tabla=null;
	WebElement btn_delete=null;
	WebElement e_tabla_web=null;
	WebElement e_box_filtro=null;
	WebElement e_boton_filtro=null;
	WebElement e_Label_titulo_tabla=null;
	WebElement e_Link_Descarga_de_Archivos=null;
	int v_cont_4=0;
	ArrayList<String> arr_datos_4;
	ArrayList<String> arr_Elementos_4;
	ArrayList<String> arr_Evidencia_4;
	
	public String Ejec_Eliminar_Datos_MatrizInformacion(String v_name_imagen,
														String vs_campo_texto2,
														int v_cont_3, 
														ArrayList<String> arr_datos_3,
														ArrayList<String> arr_Elementos_3,
														ArrayList<String> arr_Evidencia_3){

		System.out.println(" ----->>>  cambiopagina ");
		v_valid_proceso = GP02030_Link_Matriz_Informacion.cambio_Matriz_Informacion(arr_Elementos_i);

	/*  ------------------------------------------------------------------------------------  */
	
		if (v_valid_proceso=="EXITO"){
		
			System.out.println("<<---------------------------->>");
			System.out.println("     Test matrizInformacionPage");
			System.out.println("<<---------------------------->>");
			
			String title4 = GP02035_Valid_Titulo_Matriz_Informacion.Validaelementos_Matriz_Informacion();
	
			if(title4.equals("Matriz de información")) {
				arr_Evidencia_3.add("Matriz de información;");
				arr_Evidencia_3.add("Se ingreso Correctamente a Matriz de información;");
				arr_Evidencia_3.add("Passed;");
				v_valid_proceso="EXITO";
			}else {
				arr_Evidencia_3.add("Matriz de Información;");
				arr_Evidencia_3.add("No se ingreso Correctamente a Matriz de información;");
				arr_Evidencia_3.add("Failed;");
				v_valid_proceso="FALLA";
			}
			
			Captura_Pantalla.takeScreenShotTest(driver,v_name_imagen+v_cont_3);
			v_cont_3++;
		}
	/*  ------------------------------------------------------------------------------------  */
		
		if (v_valid_proceso=="EXITO"){
			arr_Elementos_3 = ValidaelementosEditarInformePago(arr_Elementos_3);
			elem_no_localizados = GP02020_Return_Var_Elem_no_localizados.Valida_elementos_localizados();
			
			if (elem_no_localizados == 0) {
				v_valid_proceso="EXITO";
			}else {
				v_valid_proceso="FALLA";
			}
		}
	
	/* -------------------------------------------------------------------------------------  */

		
		if (v_valid_proceso=="EXITO"){
			ExtraerDatoTabla4(vs_campo_texto2);

		}
		
	/* -------------------------------------------------------------------------------------  */
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
	
	public ArrayList<String> ValidaelementosEditarInformePago(ArrayList<String> arr_elem2){
		
		elem_no_localizados=0;
		String v_pag = "Matriz_de_información";
	 
		v_desc_elem = "Sub_Titulo_Matriz_de_información";
		v_metodo = "id";
		v_find = "imPgTitle";
		e_sub_titulo = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_sub_titulo!=null) {
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
		
		v_desc_elem = "Tabla_Web";
		v_metodo = "xpath";
		v_find = "//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[1]";
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
		v_find = "pluginAppObj_4_01_filter_field";
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
		v_find = "pluginAppObj_4_01_filter_button";
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
		v_metodo = "xpath";
		v_find = "//*[@id=\"pluginAppObj_4_01_jtable\"]/div/div[3]/div[1]";
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

		v_desc_elem = "Link_Descarga_de_Archivos";
		v_metodo = "xpath";
		v_find = "//*[@id=\"imMnMnNode5\"]/a/span/span/span[1]";
		e_Link_Descarga_de_Archivos = Buscar_Elementos.waitForElementPresent3 (v_metodo, v_find, 10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		if (e_Link_Descarga_de_Archivos!=null) {
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
	
	public void ExtraerDatoTabla4(String vs_campo_texto2) {
		String v_pag = "Editar Informe de Pago";
		WebElement source = driver.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/div[4]/div[1]/span[2]/select"));
		
				
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
        java.util.List<WebElement>  rows = driver.findElements(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr"));
        int rowtab = rows.size();
        
        if (v_imprimir <=0) {
	        WebElement tableRowt = baseTable3.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[1]"));
	        
	        WebElement vtw_id = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[1]"));
	        WebElement vtw_campo_texto = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[2]"));
	        WebElement vtw_campo_mail = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[3]"));
	        WebElement vtw_campo_area_de_texto = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[4]"));
	        WebElement vtw_campo_fecha = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[5]"));
	        WebElement vtw_campo_lista = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[6]"));
	        WebElement vtw_campo_seleccion_multiple = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[7]"));
	        WebElement vtw_campo_radiobutton = tableRowt.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/thead/tr/th[8]"));
	        
	        String vt_id = vtw_id.getText();
			String vt_campo_texto = vtw_campo_texto.getText();
			String vt_campo_mail = vtw_campo_mail.getText();
			String vt_campo_area_de_texto = vtw_campo_area_de_texto.getText();
			String vt_campo_fecha = vtw_campo_fecha.getText();
			String vt_campo_lista = vtw_campo_lista.getText();
			String vt_campo_seleccion_multiple = vtw_campo_seleccion_multiple.getText();;
			String vt_campo_radiobutton = vtw_campo_radiobutton.getText();;

			String vt_linea = "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
			String vt_patron = "| %5s | %30s |%30s | %40s | %11s | %11s | %24s | %18s |";
			String vt_resultado = String.format(vt_patron,vt_id,vt_campo_texto,vt_campo_mail,vt_campo_area_de_texto,vt_campo_fecha,vt_campo_lista,vt_campo_seleccion_multiple,vt_campo_radiobutton);
			//"S000000001\\r\\n\"
			System.out.println(vt_linea+"\n");
			System.out.println(vt_resultado+"\n");
			System.out.println(vt_linea+"\n");
			v_imprimir++;
        	}
        
        for(int i=1; i<=rowtab; i++)   
        	{
    	    	esperarSegundos(driver, 1);
        	    WebElement tableRow3 = baseTable3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]"));
        	    
       			WebElement v_campo_texto = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 2 +"]"));
       			
        	    String vs_campo_texto = v_campo_texto.getText();
//        	    String vs_campo_texto2 = "Prueba Nicolas";
//        	    System.out.println(" ----->>>  vs_campo_texto2   --->>>  ["+vs_campo_texto2+"]  <<<---");
        	    if (vs_campo_texto.equals(vs_campo_texto2)) {
        	    	
	        	    WebElement v_id = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 1 +"]"));
	       			WebElement v_campo_mail = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 3 +"]"));
	       			WebElement v_campo_area_de_texto = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 4 +"]"));
	       			WebElement v_campo_fecha = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 5 +"]"));
	       			WebElement v_campo_lista = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 6 +"]"));
	       			WebElement v_campo_seleccion_multiple = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 7 +"]"));
	       			WebElement v_campo_radiobutton = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]/td[" + 8 +"]"));

       			
	       			String vs_id = v_id.getText();
	       			String vs_campo_mail = v_campo_mail.getText();
	       			String vs_campo_area_de_texto = v_campo_area_de_texto.getText();
	       			String vs_campo_fecha = v_campo_fecha.getText();
	       			String vs_campo_lista = v_campo_lista.getText();
	       			String vs_campo_seleccion_multiple = v_campo_seleccion_multiple.getText();
	       			String vs_campo_radiobutton = v_campo_radiobutton.getText();
	       			String vt_linea = "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
	       			String patron = "| %5s | %30s |%30s | %40s | %11s | %11s | %24s | %18s |";
	       			String resultado = String.format(patron,vs_campo_texto,vs_id,vs_campo_mail ,vs_campo_area_de_texto,vs_campo_fecha,vs_campo_lista,vs_campo_seleccion_multiple,vs_campo_radiobutton);
	       			System.out.println(vt_linea+"\n");
	       			System.out.println(resultado+"\n");
	       			System.out.println(vt_linea+"\n");
	       			
	    	    	WebElement boton = tableRow3.findElement(By.xpath("//*[@id=\"pluginAppObj_4_01_jtable\"]/div/table/tbody/tr[" + i + "]/td[10]/button"));
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
	       			rows = driver.findElements(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/table/tbody/tr"));
	        	    rowtab = rows.size();
	        	    if (i==rowtab) {
	        	    	break;
	        	    }
        	    }
    	    }
        
        esperarSegundos(driver, 3);
        
        WebElement  source2 = driver.findElement(By.xpath("//*[@id=\'pluginAppObj_4_01_jtable\']/div/div[4]/div[1]/span[2]/select"));
        
        Select list2 = new Select(source2);
		
		List<WebElement> elements2 = list2.getOptions();
        
        v_elementos2 = elements2.size();
        if (v_elementos1>v_elementos2) {
        	
        	v_elementos1--;
        }
        v_elementos1 = v_elementos2;
  
		esperarSegundos(driver, 1);
		
        }
        

		}
}
