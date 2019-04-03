package Paquete1;

import java.util.ArrayList;

import Pages.Proy_2_Genericos.GP02016_Return_Page_Title;
import Pages.Proy_2_QAnova_Piloto.OP02200_LogoffQA3;

public class Prueba {
	
 public void ejecutar() {
	
	 String v_validacion_titulo = GP02016_Return_Page_Title.Titulo_Pagina_Presente(10,"Qanova");
	 
	 
	 if (v_validacion_titulo.equals("EXITO")) {
	 String valid_proceso = validar_elementos();
	 if (valid_proceso.equals("EXITO")) {
		 cargar_datos();
	 } else {
		 
	 }
	 ArrayList<String> arr_Elementos_3=null;
	 OP02200_LogoffQA3.Ejec_PaginaLogoff(arr_Elementos_3);
	 }
	
 }

 public String validar_elementos() {
	
	 
	 
	 
	 
	 return "ESTATUS";
 }
 
 public void cargar_datos() {
		
		
		
 }
}
