package A02_Testcases.Proy_6_Registro_Civil;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.Proy_6_Registro_Civil.Registro_Civil;
import Reporter.ReporterWord;
import Util.Captura_Pantalla;


public class Caso_Registro_Civil_test extends TestBase {
	Registro_Civil registro_civil_page;
	
	public Caso_Registro_Civil_test(){
	   	super();
	}
	  
   	@BeforeMethod
	public void setUp(){
		Inicializacion();
		registro_civil_page = new Registro_Civil();	

	}
   	
	@Test(priority=1)
//	public void TestSwitch() {
//		PruebaSwitch sw = new PruebaSwitch();
//		sw.probarSwitch();
//	}
	public void loginTest(){
	
	/*  ------------------------------------------------------------------  */
		System.out.println("------->>   Test loginPage   <<--------");
		String title0 = registro_civil_page.ValidacionRegistro_Civil();
		Assert.assertEquals(title0, "Servicio de Registro Civil");

	/*  Graba y validación de título inicial en arreglo evidencias  */
		if(title0.equals("Servicio de Registro Civil")) {
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
		arr_Elementos = registro_civil_page.ValidaelementosRegistro_Civil(arr_Elementos);
//		Assert.assertEquals(elem_no_localizados, elem_no_localizados);
	/*  --------------------------------------------------------- */

	
	/*  Genera documento word con las evidencias del caso                        */
		try {
		ReporterWord rw = new ReporterWord();		

			rw.createWord(prop.getProperty("d_documento_name"), arr_datos, arr_Evidencia, arr_Elementos,"imagen_");

		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	/*  ------------------------------------------------------------------------ */
		
//		driver.quit();
	} 
}
