package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class UPdateExcelFile {

	String v_valid_proceso_u="EXITO";
	
	public void ejec_writeExcel(String filePath,String fileName,String sheetName,
								String v_caso,
								String dataToWrite1,int v_fila_grab1,int v_celda_grab1, 
								String dataToWrite2,int v_fila_grab2,int v_celda_grab2,
								String dataToWrite3,int v_fila_grab3,int v_celda_grab3,
								String dataToWrite4,int v_fila_grab4,int v_celda_grab4,
								String dataToWrite5,int v_fila_grab5,int v_celda_grab5,
								int sheetnumber){
		
		writeExcel(filePath,fileName,sheetName,dataToWrite1,v_fila_grab1,v_celda_grab1,sheetnumber);
		writeExcel(filePath,fileName,sheetName,dataToWrite2,v_fila_grab2,v_celda_grab2,sheetnumber);
		writeExcel(filePath,fileName,sheetName,dataToWrite3,v_fila_grab3,v_celda_grab3,sheetnumber);
		writeExcel(filePath,fileName,sheetName,dataToWrite4,v_fila_grab4,v_celda_grab4,sheetnumber);
		writeExcel(filePath,fileName,sheetName,dataToWrite5,v_fila_grab5,v_celda_grab5,sheetnumber);
	}
	
	public void writeExcel(String filePath,String fileName,String sheetName,String dataToWrite,int v_fila_grab,int v_celda_grab, int sheetnumber){
		
		
	    //  Create an object of File class to open xlsx file

			FileInputStream inputStream = null;
	        File file = new File(filePath+"\\"+fileName);

	    //  Create an object of FileInputStream class to read excel file

			try { 
				inputStream = new FileInputStream(file);
			    //if alert present, accept and move on.
			} catch (Exception e) {
				System.out.println("------->>        Error al generar crear el objeto     --->>> [ writeExcel ]   <<--------");
				v_valid_proceso_u="FALLA";
//				e.printStackTrace();
			}

	        Workbook Workbook = null;

	    //  Find the file extension by splitting  file name in substring and getting only extension name

	        String fileExtensionName = fileName.substring(fileName.indexOf("."));

	        if (v_valid_proceso_u=="EXITO"){
	        	

		    //  Check condition if the file is xlsx file
	
		        if(fileExtensionName.equals(".xlsx")){
	
		    //  If it is xlsx file then create object of XSSFWorkbook class
	
				    try { 
				    	
				    	Workbook = new XSSFWorkbook(inputStream);
					}
					catch (Exception e) {
						System.out.println("---->> Error al generar crear el objeto <<----->> [Workbook - .xlsx] <<---");
						v_valid_proceso_u="FALLA";
					// e.printStackTrace();
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
						
						System.out.println("---->> Error al generar crear el objeto <<----->> [Workbook - .xlsx] <<---");
						v_valid_proceso_u="FALLA";
					// e.printStackTrace();
	
					}
	
		        }    
		    }

	        if (v_valid_proceso_u=="EXITO"){
		     // Read excel sheet by sheet name    
	
			    Sheet sheet = Workbook.getSheetAt(sheetnumber);
			    
			 // Get the row of your desired cell.
			 // Let's say that your desired cell is at row 2.
			    Row row = sheet.getRow(v_fila_grab);
			    
			 // Get the column of your desired cell in your selected row.
			 // Let's say that your desired cell is at column 2.
			    Cell column = row.getCell(v_celda_grab);
			    
			 // If the cell is String type.If double or else you can change it.
			    String updatename = column.getStringCellValue();
	
			    
			 // New content for desired cell.
			    updatename=dataToWrite;
			    
			 // Print out the updated content.
			    System.out.println(updatename);
			    
			 // Set the new content to your desired cell(column).
			    column.setCellValue(updatename); 
			    
			 // Close the excel file.
			
			    //file.close();
	        }
	        
	        if (v_valid_proceso_u=="EXITO"){
	        	
			    try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("---->> Error al generar crear el objeto <<----->> [inputStream.close] <<---");
					v_valid_proceso_u="FALLA";
				// e.printStackTrace();
				}
		    
	        }
		    //  Close input stream
		
	        FileOutputStream outputStream = null;
	        
	        if (v_valid_proceso_u=="EXITO"){
			    //Create an object of FileOutputStream class to create write data in excel file

			
			    try {
					outputStream = new FileOutputStream(file);
	
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("---->> Error al generar crear el objeto <<----->> [outputStream - file] <<---");
					System.out.println("---->> FileNotFoundException <<----->> [outputStream - file] <<---");
					v_valid_proceso_u="FALLA";
	//				e.printStackTrace();
			    } 
	        }
	        
	        if (v_valid_proceso_u=="EXITO"){
			    //write data in the excel file
			
			    try {
					Workbook.write(outputStream);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("---->> Error al generar crear el objeto <<----->> [Workbook.write - outputStream] <<---");
					v_valid_proceso_u="FALLA";
				// e.printStackTrace();
				}
	        }
	        
	        if (v_valid_proceso_u=="EXITO"){
			    //close output stream
			
			    try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("---->> Error al generar crear el objeto <<----->> [outputStream.close] <<---");
					v_valid_proceso_u="FALLA";
				// e.printStackTrace();
				}
	        }
		    
		}
	
	public String Retorna_v_valid_proceso_u(){
		
		return v_valid_proceso_u;
	}
 }

