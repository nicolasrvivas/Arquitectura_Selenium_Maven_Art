package A02_Testcases.Proy_2_QAnova_Piloto;


import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Util.UPdateExcelFile;


public class Prueba_WriteExcel_QANova extends TestBase {
	UPdateExcelFile 			UPdateExcelFile_Page;

	
	public Prueba_WriteExcel_QANova(){
	   	super();
	}
	  
   	@BeforeMethod
	public void setUp(){
//		Inicializacion();
   		UPdateExcelFile_Page = new UPdateExcelFile();
	}
   	
	@Test(priority=1)
	public void loginTest() throws IOException{

		String filePath = "D:\\Informe\\Datos";
		String fileName = "Prueba_Excel_hoja1.xlsx";
		String sheetName = "Hoja1";
		String v_dataToWrite = "Caso_7_OK_OK";
		int v_fila_grab = 7;
		int v_celda_grab = 5;
		int v_hoja = 0;
		
		UPdateExcelFile_Page.writeExcel(filePath,fileName,sheetName,v_dataToWrite,v_fila_grab,v_celda_grab,v_hoja);
		
	} 
}
