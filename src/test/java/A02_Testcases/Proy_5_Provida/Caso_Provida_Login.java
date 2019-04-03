package A02_Testcases.Proy_5_Provida;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.Proy_5_Provida.Provida_Login;
import Pages.Proy_5_Provida.Provida_Logoff;
import Reporter.ReporterWord;
import Util.Captura_Pantalla;
import Util.ReadExcelFile;


public class Caso_Provida_Login extends TestBase {
	Provida_Login Provida_LoginPage;
	Provida_Logoff Provida_LogoffPage;

	
	public Caso_Provida_Login(){
	   	super();
	}
	  
   	@BeforeMethod
	public void setUp(){
		Inicializacion();
		Provida_LoginPage = new Provida_Login();
		Provida_LogoffPage = new Provida_Logoff();
	}
   	
	@Test(priority=1)
	
	public void loginTest(){
	
		//-------------------------------------------------------------------------------------------
		//  Definición de datos de entrada desde excel
			String d_Usuario = null;
			String d_Pass = null;
			
	   	//-------------------------------------------------------------------------------------------

		//Prepare the path of excel file
		    String filePath = prop.getProperty("d_directorio");

		    //Call read file method of the class to read data
		    
		    Sheet Sheet_Carga_Informacion = ReadExcelFile.readExcel(filePath,"Data_Provida.xlsx","Hoja1");
		    
		    
		 //Find number of rows in excel file
		    int rowCount = Sheet_Carga_Informacion.getLastRowNum()-Sheet_Carga_Informacion.getFirstRowNum();
		
		 //Create a loop over all the rows of excel file to read it
		    for (int i = 1; i < rowCount+1; i++) {
		
		        Row row = Sheet_Carga_Informacion.getRow(i);
		        
		        d_Usuario = row.getCell(1).getStringCellValue();
		        d_Pass = row.getCell(2).getStringCellValue();
	    

		//-------------------------------------------------------------------------------------------	
		        
	/*  ------------------------------------------------------------------  */
		System.out.println("------->>   Test loginPage   <<--------");
		String title0 = Provida_LoginPage.ValidacionPaginaInicio();
		Assert.assertEquals(title0, "AFP Provida Intranet - V2");

	/*  Graba y validación de título inicial en arreglo evidencias  */
		if(title0.equals("AFP Provida Intranet - V1")) {
			arr_Evidencia.add("Validación Titulo;");
			arr_Evidencia.add("Se obtuvo el título esperado: "+title0+";");
			arr_Evidencia.add("Passed;");
		}else {
			arr_Evidencia.add("Validación Titulo;");
			arr_Evidencia.add("No se obtuvo el título esperado: "+title0+";");
			arr_Evidencia.add("Failed;");
		}
		
		Captura_Pantalla.takeScreenShotTest(driver,"imagen_"+cont);
		cont++;
	/*  --------------------------------------------------------- */

	/*  Graba y validación de elementos en arreglo evidencias     */
		elem_no_localizados=0;
		arr_Elementos = Provida_LoginPage.ValidaelementosPaginaInicio(arr_Elementos);
		Assert.assertEquals(elem_no_localizados, elem_no_localizados);
	/*  --------------------------------------------------------- */

	/*  --------------------------------------------------------- */

		
	/*  --------------------------------------------------------- */
		
		// Store the current window handle
		
		System.out.println("------->>>  ANTES   getWindowHandle() <<<-----------   ");
		String winHandleBefore = driver.getWindowHandle();
		System.out.println("------->>>  getWindowHandle() <<<-----------   "+winHandleBefore+"  <<<-------");

		// Perform the click operation that opens new window
		

		/*  Graba y validación de datos  en arreglo datos de entrada     */
			arr_datos = Provida_LoginPage.login(d_Usuario, d_Pass,
							      arr_datos);

		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
			
		    driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		
		elem_no_localizados=0;
		arr_Elementos = Provida_LogoffPage.ValidaelementosPaginaInicio(arr_Elementos);
		Provida_LogoffPage.logoff();
		
		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

		// Continue with original browser (first window)
		
	/*  --------------------------------------------------------- */
		

	 }
	} 
}
