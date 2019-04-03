package Pages.Proy_2_QAnova_Piloto;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebElement;
import Base.TestBase;
// import Util.Genera_Archivo;
import Util.ReadExcelFile;

public class OP02100_Data_Entrada_Excel extends TestBase {

 // DECLARACIONES DE LOS OBJETOS 
	
	WebElement e_user						= null;
	WebElement e_pass						= null;
	WebElement e_btnLogin					= null;
	WebElement e_logo						= null;
	WebElement e_link_carga_de_informacion	= null;
	WebElement e_link_matriz_de_informacion	= null;
	WebElement e_link_descarga_de_archivos	= null;
	WebElement e_link_editar_informe_pago	= null;
	WebElement e_element					= null;
	String v_valid_proceso_5				= "FALLA";
	int v_nro_fila							= 0;
	ArrayList<String> arr_data2 			= new ArrayList<String>();
	String d_caso 							= null;
	
	public String Ejec_Lee_EXCEL_DAta(String v_caso_nombre, String v_filePath, String v_filename,String v_hoja){

		v_valid_proceso_5="FALLA";
	/*  -------------------------------------- Validación Título ------------------------------------  */
//		 //Prepare the path of excel file

	    //Call read file method of the class to read data

	    Sheet Sheet_Carga_Informacion = ReadExcelFile.readExcel(v_filePath,v_filename,v_hoja);    
	    
	    if (Sheet_Carga_Informacion==null) {
	    	v_valid_proceso_5="FALLA";
	    } else {
		 //Find number of rows in excel file
		    int rowCount = Sheet_Carga_Informacion.getLastRowNum()-Sheet_Carga_Informacion.getFirstRowNum();
		    
		 //Create a loop over all the rows of excel file to read it
		    int k = 0;
		    for (k = 0; k < rowCount+1; k++) {
		        Row row = Sheet_Carga_Informacion.getRow(k);
		        d_caso = row.getCell(2).getStringCellValue();
		        
		        if(d_caso.equals(v_caso_nombre)) {
		    		switch (d_caso) {
		    		case "Caso_1":
		    			arr_data2.add(row.getCell(0).getStringCellValue());
			        	arr_data2.add(row.getCell(1).getStringCellValue());
		              	arr_data2.add(row.getCell(4).getStringCellValue());
		 	        	arr_data2.add(row.getCell(5).getStringCellValue());
		 	        	arr_data2.add(row.getCell(13).getStringCellValue());
		    			break;
		    		case "Caso_2":
		    			arr_data2.add(row.getCell(0).getStringCellValue());
			        	arr_data2.add(row.getCell(1).getStringCellValue());
		              	arr_data2.add(row.getCell(2).getStringCellValue());
		 	        	arr_data2.add(row.getCell(3).getStringCellValue());
		 	        	arr_data2.add(row.getCell(4).getStringCellValue());
		 	        	arr_data2.add(row.getCell(5).getStringCellValue());
		 	        	arr_data2.add(row.getCell(6).getStringCellValue());
		 	        	arr_data2.add(row.getCell(7).getStringCellValue());
		 	        	arr_data2.add(row.getCell(8).getStringCellValue());
		 	        	arr_data2.add(row.getCell(9).getStringCellValue());
//		 	        	arr_data2.add(row.getCell(10).getStringCellValue());
		 	        	try{
                            arr_data2.add(row.getCell(10).getStringCellValue());
                            }catch (Exception e){
                                arr_data2.add("");
                            }
		 	        	arr_data2.add(row.getCell(11).getStringCellValue());
		 	        	arr_data2.add(row.getCell(12).getStringCellValue());
		 	        	arr_data2.add(row.getCell(13).getStringCellValue());
		    			break;
		    		case "Caso_3":
		    			arr_data2.add(row.getCell(0).getStringCellValue());
			        	arr_data2.add(row.getCell(1).getStringCellValue());
		              	arr_data2.add(row.getCell(4).getStringCellValue());
		 	        	arr_data2.add(row.getCell(5).getStringCellValue());
		 	        	arr_data2.add(row.getCell(6).getStringCellValue());
		 	        	arr_data2.add(row.getCell(13).getStringCellValue());
		    			break;
		    		case "Caso_4":
		    			arr_data2.add(row.getCell(0).getStringCellValue());
			        	arr_data2.add(row.getCell(1).getStringCellValue());
		              	arr_data2.add(row.getCell(4).getStringCellValue());
		 	        	arr_data2.add(row.getCell(5).getStringCellValue());
		 	        	arr_data2.add(row.getCell(6).getStringCellValue());
		 	        	arr_data2.add(row.getCell(13).getStringCellValue());
		    			break;
		    		case "Caso_5":
		    			arr_data2.add(row.getCell(0).getStringCellValue());
			        	arr_data2.add(row.getCell(1).getStringCellValue());
		              	arr_data2.add(row.getCell(2).getStringCellValue());
		 	        	arr_data2.add(row.getCell(3).getStringCellValue());
		 	        	arr_data2.add(row.getCell(4).getStringCellValue());
		 	        	arr_data2.add(row.getCell(5).getStringCellValue());
		 	        	arr_data2.add(row.getCell(6).getStringCellValue());
		 	        	arr_data2.add(row.getCell(7).getStringCellValue());
		 	        	arr_data2.add(row.getCell(8).getStringCellValue());
		 	        	arr_data2.add(row.getCell(9).getStringCellValue());
		 	        	arr_data2.add(row.getCell(10).getStringCellValue());
		 	        	arr_data2.add(row.getCell(11).getStringCellValue());
		 	        	arr_data2.add(row.getCell(12).getStringCellValue());
		 	        	arr_data2.add(row.getCell(13).getStringCellValue());
		    			break;
		    		}	
	 	        	v_nro_fila = k;
	 	        	v_valid_proceso_5="EXITO";
		        	break;
		        }
		    }
//		    System.out.println("  --->>> k  <<<--- "+k);
	    }
	   
	    return v_valid_proceso_5;
	}
	
	
	public String busca_nro_fila_resultados(String v_caso_nombre, String v_filePath, String v_filename,String v_hoja){

		v_valid_proceso_5="FALLA";

	 //Call read file method of the class to read data
	    Sheet Sheet_Carga_Informacion = ReadExcelFile.readExcel(v_filePath,v_filename,v_hoja);    
	    
	 //Find number of rows in excel file
	    int rowCount = Sheet_Carga_Informacion.getLastRowNum()-Sheet_Carga_Informacion.getFirstRowNum();
	    
	 //Create a loop over all the rows of excel file to read it
	    int k = 0;
	    for (k = 0; k < rowCount+1; k++) {
	        Row row = Sheet_Carga_Informacion.getRow(k);
	        d_caso = row.getCell(0).getStringCellValue();
	        
	        if(d_caso.equals(v_caso_nombre)) {
 	        	v_nro_fila = k;
 	        	v_valid_proceso_5="EXITO";
	        	break;
	        }
	        
	    }

	    return v_valid_proceso_5;
	}
	
	public String remove_row(String v_caso_nombre, String v_filePath, String v_filename,String v_hoja,int v_nro_fila_e){ 

		v_valid_proceso_5="FALLA";
	 	    
	    Sheet Sheet_Carga_Informacion = ReadExcelFile.readExcel(v_filePath,v_filename,v_hoja); 
	    
	    if (Sheet_Carga_Informacion == null){
			   v_valid_proceso_5="FALLA";
		   } else { 
	    
				 //Find number of rows in excel file
				    int rowCount = Sheet_Carga_Informacion.getLastRowNum()-Sheet_Carga_Informacion.getFirstRowNum();
				    
				 //Create a loop over all the rows of excel file to read it
				    int k = 0;
				    for (k = 0; k < rowCount+1; k++) {
					    
				        Row row = Sheet_Carga_Informacion.getRow(k);
				        d_caso = row.getCell(0).getStringCellValue();
				        
				        if(d_caso.equals(v_caso_nombre)) {
			 	        	Sheet_Carga_Informacion.removeRow(Sheet_Carga_Informacion.getRow(k));
			 	        	v_valid_proceso_5="EXITO";
				        	break;
				        }
				    }
		   }
		return v_valid_proceso_5;
	}
	
	public int Retorna_v_nro_fila(){
		
		return v_nro_fila;
	}
	
	
	public ArrayList<String> Retorna_arr_data2(){
		
		return arr_data2;
	}
		
}
