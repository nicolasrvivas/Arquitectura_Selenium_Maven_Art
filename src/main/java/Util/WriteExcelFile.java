package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {
	
	String v_valid_proceso_w="EXITO";

	public String writeExcel(String filePath,String fileName,String sheetName, String[] dataToWrite){
//	public void writeExcel(String filePath,
//							String fileName,
//							String sheetName,
//							String dataCaso,
//							String dataCiclo,
//							String v_fecha,
//							String v_hora,
//							String v_usuario,
//							String v_valid_proceso){
	
		
    //  Create an object of File class to open xlsx file

		FileInputStream inputStream = null;
        File file = new File(filePath+"\\"+fileName);

    //  Create an object of FileInputStream class to read excel file

		try { 
			inputStream = new FileInputStream(file);
		    //if alert present, accept and move on.
		} catch (Exception e) {
			System.out.println("------->>  package Util -  class WriteExcelFile - Funcion writeExcel <<--------");
			System.out.println("------->>        Error al generar crear el objeto    inputStream     <<--------");
			v_valid_proceso_w="FALLA";
//			e.printStackTrace();
		}

        Workbook Workbook = null;

    //  Find the file extension by splitting  file name in substring and getting only extension name

        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        
        if (v_valid_proceso_w=="EXITO"){

	    //  Check condition if the file is xlsx file
	
	        if(fileExtensionName.equals(".xlsx")){
	
	    //  If it is xlsx file then create object of XSSFWorkbook class
	
			    try { 
			    	
			    	Workbook = new XSSFWorkbook(inputStream);
				}
				catch (Exception e) {
					System.out.println("------->>  package Util -  class WriteExcelFile - Funcion writeExcel <<--------");
					System.out.println("------->>        Error al generar crear el objeto     Workbook       <<--------");
					v_valid_proceso_w="FALLA";
//					e.printStackTrace();
				}
	
	        }
	
	    //  Check condition if the file is xls file
	
	        else if(fileExtensionName.equals(".xls")){
	
	    //  If it is xls file then create object of XSSFWorkbook class
	
		        try { 
			    	
		        	Workbook = new HSSFWorkbook(inputStream);
					
				    //if alert present, accept and move on.
				}
				catch (Exception e) {
					System.out.println("------->>  package Util -  class WriteExcelFile - Funcion writeExcel <<--------");
					System.out.println("------->>        Error al generar crear el objeto   Workbook         <<--------");
					v_valid_proceso_w="FALLA";
//					e.printStackTrace();
	
				}
	
	        }    

        }
        
	    if (v_valid_proceso_w=="EXITO"){
		    //   Read excel sheet by sheet name    
		
		    Sheet sheet = Workbook.getSheet(sheetName);
		    
		    //Get the current count of rows in excel file
		
		    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		    //Get the first row from the sheet
		
		    Row row = sheet.getRow(0);
		
		    //Create a new row and append it at last of sheet
		
		    Row newRow = sheet.createRow(rowCount+1);
		
		//   Create a loop over the cell of newly created Row
		
		//   System.out.println("    ----->>>> row.getLastCellNum()  <<<---  ["+row.getLastCellNum()+"]  <<<---");
	
		    for(int j = 0; j < row.getLastCellNum(); j++){
		
		     // Fill data in row
	
		        Cell cell = newRow.createCell(j);
		
		        cell.setCellValue(dataToWrite[j]);
		        
		    }
	    }
	    
	    if (v_valid_proceso_w=="EXITO"){
		    //  Close input stream
		
		    try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("------->>  package Util -  class WriteExcelFile - Funcion writeExcel     <<--------");
				System.out.println("------->>        Error al generar crear el objeto   inputStream.close    <<--------");
				v_valid_proceso_w="FALLA";
	//			e.printStackTrace();
			}
	    }
	
	    //Create an object of FileOutputStream class to create write data in excel file
	
	    FileOutputStream outputStream = null;
	
	    if (v_valid_proceso_w=="EXITO"){
	
		    try {
				outputStream = new FileOutputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("------->>  package Util -  class WriteExcelFile - Funcion writeExcel     <<--------");
				System.out.println("------->>        Error al generar crear el objeto   outputStream         <<--------");
				v_valid_proceso_w="FALLA";
	//			e.printStackTrace();
			}
	
	    }
	    //write data in the excel file
	
	    if (v_valid_proceso_w=="EXITO"){
	
		    try {
				Workbook.write(outputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("------->>  package Util -  class WriteExcelFile - Funcion writeExcel     <<--------");
				System.out.println("------->>        Error al generar crear el objeto   Workbook.write       <<--------");
				v_valid_proceso_w="FALLA";
	//			e.printStackTrace();
			}
	    }
	    //close output stream
	    if (v_valid_proceso_w=="EXITO"){
	    
		    try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("------->>  package Util -  class WriteExcelFile - Funcion writeExcel     <<--------");
				System.out.println("------->>        Error al generar crear el objeto   outputStream.close   <<--------");
				v_valid_proceso_w="FALLA";
	//			e.printStackTrace();
			}
	    }
	    return v_valid_proceso_w;
    
    }
	

}

