package A02_Testcases.Proy_1_QAnova;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.Proy_1_QAnova.CompraPasaje;
import Pages.Proy_1_QAnova.PaginaInicio;
import Reporter.ReporterWord;
import Util.Captura_Pantalla;


public class Caso_Login_QANova extends TestBase {
	PaginaInicio loginPage;
	CompraPasaje comprapasajePage;

	
	public Caso_Login_QANova(){
	   	super();
	}
	  
   	@BeforeMethod
	public void setUp(){
		Inicializacion();
		loginPage = new PaginaInicio();	
		comprapasajePage = new CompraPasaje();	
	}
   	
	@Test(priority=1)
//	public void TestSwitch() {
//		PruebaSwitch sw = new PruebaSwitch();
//		sw.probarSwitch();
//	}
	public void loginTest(){
	
	/*  ------------------------------------------------------------------  */
		System.out.println("------->>   Test loginPage   <<--------");
		String title0 = loginPage.ValidacionPaginaInicio();
		Assert.assertEquals(title0, "Practica QA Nova");

	/*  Graba y validación de título inicial en arreglo evidencias  */
		if(title0.equals("Practica QA Nova")) {
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
		arr_Elementos = loginPage.ValidaelementosPaginaInicio(arr_Elementos);
		Assert.assertEquals(elem_no_localizados, elem_no_localizados);
	/*  --------------------------------------------------------- */

	/*  Graba y validación de datos  en arreglo datos de entrada     */
		arr_datos = loginPage.login(prop.getProperty("d_usuario"), 
						      prop.getProperty("d_password"),
						      arr_datos);
	/*  --------------------------------------------------------- */
	
	/*  Graba y validación de título al cambiar de pagina  en arreglo evidencias  */
		esperarSegundos(driver,3);
		String valid = comprapasajePage.ValidacionCompraPasaje();
		if(valid.equals("Compra de Pasajes - Practica QA Nova")) {
			arr_Evidencia.add("Ingreso Compra Pasajes;");
			arr_Evidencia.add("Se ingreso Correctamente a la Compra de Pasajes;");
			arr_Evidencia.add("Passed;");
		}else {
			arr_Evidencia.add("Ingreso Compra Pasajes;");
			arr_Evidencia.add("No se ingreso Correctamente a la Compra de Pasajes;");
			arr_Evidencia.add("Failed;");
		}
		
		Captura_Pantalla.takeScreenShotTest(driver,"imagen_"+cont);
		cont++;
	/*  ------------------------------------------------------------------------ */
		
	/*  Genera documento word con las evidencias del caso                        */
		try {
		ReporterWord rw = new ReporterWord();		

			rw.createWord(prop.getProperty("d_documento_name"), arr_datos, arr_Evidencia, arr_Elementos,"imagen_");

		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	/*  ------------------------------------------------------------------------ */
		
		driver.quit();
	} 
}
