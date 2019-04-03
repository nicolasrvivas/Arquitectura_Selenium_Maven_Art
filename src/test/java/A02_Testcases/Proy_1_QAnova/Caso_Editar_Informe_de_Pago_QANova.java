package A02_Testcases.Proy_1_QAnova;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Proy_1_QAnova.CompraPasaje;
import Pages.Proy_1_QAnova.CompraPasaje2;
import Pages.Proy_1_QAnova.CompraPasaje3;
import Pages.Proy_1_QAnova.CompraPasaje4;
import Pages.Proy_1_QAnova.EditarInformePago;
import Pages.Proy_1_QAnova.InformePago;
import Pages.Proy_1_QAnova.PaginaInicio;
import Reporter.ReporterWord;
import Util.Captura_Pantalla;

public class Caso_Editar_Informe_de_Pago_QANova extends TestBase {
	PaginaInicio loginPage;
	CompraPasaje comprapasajePage;
	CompraPasaje2 comprapasaje2Page;
	CompraPasaje3 comprapasaje3Page;
	CompraPasaje4 comprapasaje4Page;
	InformePago informepagoPage;
	EditarInformePago editarinformepagoPage;
	
	public Caso_Editar_Informe_de_Pago_QANova(){
	   	super();
	}
	  
   	@BeforeMethod
	public void setUp(){
		Inicializacion();
		loginPage = new PaginaInicio();	
		comprapasajePage = new CompraPasaje();	
		comprapasaje2Page = new CompraPasaje2();
		comprapasaje3Page = new CompraPasaje3();
		comprapasaje4Page = new CompraPasaje4();
		informepagoPage = new InformePago();
		editarinformepagoPage = new EditarInformePago();
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
		
	/*  ------------------------------------------------------------------  */
		//int var_result = loginPage.ValidaelementosPaginaInicio();
		//Assert.assertEquals(var_result, 0);
		arr_Elementos = loginPage.ValidaelementosPaginaInicio(arr_Elementos);
		// Assert.assertEquals(var_result, 0);
	/*	if(var_result==0) {
			varEvidencia.add("Validación de elementos: "+title0+";");
			varEvidencia.add("Elementos Cargados con Éxito;");
			varEvidencia.add("Passed;");
		}else {
			varEvidencia.add("Validación de elementos: "+title0+";");
			varEvidencia.add("Falla en carga de Elementos: "+var_result+";");
			varEvidencia.add("Failed;");
		}
		takeScreenShotTest(driver,"imagen_"+cont);
		cont++;
		*/
		arr_datos = loginPage.login(prop.getProperty("d_usuario"), 
						      prop.getProperty("d_password"),
						      arr_datos);
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
		
	/*  ------------------------------------------------------------------  */

		String title3 = comprapasaje4Page.ValidacionCompraPasaje4();
		Assert.assertEquals(title3, "Compra de Pasajes - Practica QA Nova");

		if(title3.equals("Compra de Pasajes - Practica QA Nova")) {
			arr_Evidencia.add("Ingreso Compra Pasajes;");
			arr_Evidencia.add("Se ingreso Correctamente a la Compra de Pasajes2;");
			arr_Evidencia.add("Passed;");
		}else {
			arr_Evidencia.add("Ingreso Compra Pasajes;");
			arr_Evidencia.add("No se ingreso Correctamente a la Compra de Pasajes2;");
			arr_Evidencia.add("Failed;");
		}
		
		Captura_Pantalla.takeScreenShotTest(driver,"imagen_"+cont);
		cont++;
		
		
		/*  ------------------------------------------------------------------  */
		
		String title34 = comprapasaje4Page.cambiopagina();
		System.out.println("<<---------------------------->>");
		System.out.println(title34);
		System.out.println("<<---------------------------->>");
		
		String title4 = editarinformepagoPage.ValidacionEditarInformePago();
		Assert.assertEquals(title4, "Editar Informe de Pago - Practica QA Nova");
		arr_Elementos = editarinformepagoPage.ValidaelementosEditarInformePago(arr_Elementos);
//		Assert.assertEquals(var_result, 0);
		System.out.println("<<---------------------------->>");
		System.out.println("     Test EditarInformePagoPage");
		System.out.println("<<---------------------------->>");
		
		String datotabla4 = editarinformepagoPage.ExtraerDatoTabla4();
		System.out.println("<<---------------------------->>");
		System.out.println(datotabla4); 
		System.out.println("<<---------------------------->>");
		
		String title5 = editarinformepagoPage.ValidacionEditarInformePago();
		Assert.assertEquals(title5, "Editar Informe de Pago - Practica QA Nova");
		if(title5.equals("Compra de Pasajes - Practica QA Nova")) {
			arr_Evidencia.add("Ingreso Compra Pasajes;");
			arr_Evidencia.add("Se ingreso Correctamente a la Compra de Pasajes2;");
			arr_Evidencia.add("Passed;");
		}else {
			arr_Evidencia.add("Ingreso Compra Pasajes;");
			arr_Evidencia.add("No se ingreso Correctamente a la Compra de Pasajes2;");
			arr_Evidencia.add("Failed;");
		}
		
		Captura_Pantalla.takeScreenShotTest(driver,"imagen_"+cont);
		cont++;
		
		/*  ------------------------------------------------------------------  */

		try {
			
			ReporterWord rw = new ReporterWord();		

			rw.createWord("D:/Prueba 1",arr_datos,arr_Evidencia,arr_Elementos,"imagen_");

		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		driver.quit();
	} 
}
