package A02_Testcases.Proy_4_Empleados;

import java.io.IOException;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.Proy_4_Empleados.Carga_Empleados;
import Reporter.ReporterWord;
import Util.Captura_Pantalla;


public class Carga_Empleados_Test extends TestBase {
	Carga_Empleados carga_empleadosPage;


	
	public Carga_Empleados_Test(){
	   	super();
	}
	  
   	
//	public void TestSwitch() {
//		PruebaSwitch sw = new PruebaSwitch();
//		sw.probarSwitch();
//	}
	public String loginTest(){
	
	/*  ------------------------------------------------------------------  */
		System.out.println("------->>   Test loginPage   <<--------");
		String title0 = carga_empleadosPage.ValidacionPaginaInicio();
		System.out.println("------->>   Titulo  ------  "+title0+"  <<--------");

	/*  Graba y validación de título inicial en arreglo evidencias  */
		if(title0.equals("Odoo")) {
			arr_Evidencia.add("Validación Titulo;");
			arr_Evidencia.add("Se obtuvo el título esperado: "+title0+";");
			arr_Evidencia.add("Passed;");
			System.out.println("------->>   Valido Titulo  ------  "+title0+"  <<--------");
		}else {
			arr_Evidencia.add("Validación Titulo;");
			arr_Evidencia.add("No se obtuvo el título esperado: "+title0+";");
			arr_Evidencia.add("Failed;");
			System.out.println("------->>  No Valido Titulo  ------  "+title0+"  <<--------");
		}
		
		Captura_Pantalla.takeScreenShotTest(driver,"imagen_"+cont);
		cont++;
	/*  --------------------------------------------------------- */

	/*  Graba y validación de elementos en arreglo evidencias     */
		elem_no_localizados=0;
		arr_Elementos = carga_empleadosPage.ValidaelementosPaginaInicio(arr_Elementos);
		System.out.println("------->>   Valido Elementos  ------  "+elem_no_localizados+"  <<--------");
//		Assert.assertEquals(elem_no_localizados, elem_no_localizados);
	/*  --------------------------------------------------------- */

	/*  Graba y validación de datos  en arreglo datos de entrada     */
		System.out.println("------->>   va a carga_empleadosPage  <<--------");
		arr_datos = carga_empleadosPage.login(arr_datos);
		System.out.println("------->>   Ejecutó a carga_empleadosPage  <<--------");
	/*  --------------------------------------------------------- */
	
	/*  Genera documento word con las evidencias del caso                        */
		try {
		ReporterWord rw = new ReporterWord();		
			System.out.println("------->>   va a rw.createWord  <<--------");
			rw.createWord(prop.getProperty("d_documento_name"), arr_datos, arr_Evidencia, arr_Elementos,"imagen_");
			System.out.println("------->>   Creó reporte work <<--------");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("------->>   No Creó reporte work <<--------");
			e.printStackTrace();
		}
	/*  ------------------------------------------------------------------------ */
		
		//driver.quit();
		return "Passed";
	} 
}
