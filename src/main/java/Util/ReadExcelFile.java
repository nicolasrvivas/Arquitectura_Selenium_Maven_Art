package Util;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	
    public static Sheet readExcel(String filePath,String fileName,String sheetName){

    	String v_valid_proceso_u="EXITO";
    	
//		System.out.println("------->>   filePath  <<-------- ["+filePath+"]  <<<--- ");
//		System.out.println("------->>   fileName  <<-------- ["+fileName+"]  <<<--- ");
//		System.out.println("------->>   sheetName <<-------- ["+sheetName+"]  <<<--- ");
		
		
    	FileInputStream inputStream = null;
    	Workbook Workbook = null;
    	

	    //Create an object of File class to open xlsx file
	    File file =    new File(filePath+"\\"+fileName);
	
	    //Create an object of FileInputStream class to read excel file
	    
		try { 
	    	
			inputStream = new FileInputStream(file);
			
		    //if alert present, accept and move on.
		}
		catch (Exception e) {
			
			System.out.println("------->>        Error al generar crear el objeto    -->> [ readExcel ]   <<--------");
			v_valid_proceso_u="FALLA";
//			e.printStackTrace();

		}
	
		if (v_valid_proceso_u=="EXITO"){
	
		    //Find the file extension by splitting file name in substring  and getting only extension name
		    String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		    //Check condition if the file is xlsx file
	//	    System.out.println("     --->>>    fileExtensionName   --->>>  "+fileExtensionName);
		    if(fileExtensionName.equals(".xlsx")){
		
			    //If it is xlsx file then create object of XSSFWorkbook class
			    
			    try { 
			    	
			    	Workbook = new XSSFWorkbook(inputStream);
					
				    //if alert present, accept and move on.
				}
				catch (Exception e) {
					
					System.out.println("------->>        Error al generar crear el objeto          <<--------");
					v_valid_proceso_u="FALLA";
	//				e.printStackTrace();
	
				}
			
		    }
	
		    //Check condition if the file is xls file
		    else if(fileExtensionName.equals(".xls")){
		
		        //If it is xls file then create object of XSSFWorkbook class
		        
		        try { 
			    	
		        	Workbook = new HSSFWorkbook(inputStream);
					
				    //if alert present, accept and move on.
				}
				catch (Exception e) {
					
					System.out.println("------->>        Error al generar crear el objeto          <<--------");
					v_valid_proceso_u="FALLA";
	//				e.printStackTrace();
	
				}
		        
		
		    }
		}
	    //Read sheet inside the workbook by its name
	    Sheet Sheet = null;
	    if (v_valid_proceso_u=="EXITO"){
	    	Sheet = Workbook.getSheet(sheetName);
	    }
	
	    
	    
	    return Sheet;
    }
    
}


