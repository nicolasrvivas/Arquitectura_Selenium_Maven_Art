package Testcases;



import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.Susana.OP02110_PaginaInicioLoginSusana;
import Pages.Susana.OP02110_PaginaInicioSusana;
import Pages.Susana.OP02120_PaginaCargaInformacionSusana;
import Paquete1.Prueba;


public class Caso_Susana_01 extends TestBase {
//	private static final OP02110_PaginaInicioLoginSusana OP02110_Carga_datos_Susana_Page = null;
	OP02110_PaginaInicioLoginSusana	       OP02110_PaginaIniciologinSusana_Page;
	OP02120_PaginaCargaInformacionSusana   OP02120_PaginaCargaInformacionSusana_Page;
	Prueba									Prueba_Page;

	
	public Caso_Susana_01(){
	   	super();
	}
	  
   	@BeforeMethod
	public void setUp(){
		Inicializacion();
		OP02110_PaginaIniciologinSusana_Page			= new OP02110_PaginaInicioLoginSusana();
		OP02120_PaginaCargaInformacionSusana_Page 		= new OP02120_PaginaCargaInformacionSusana();
		Prueba_Page										= new Prueba();
	}
   	
	@Test(priority=1)
	
	public void Pagina_login_susana(){
		System.out.println("------->>   Inicia el caso   <<--------");
		v_valid_proceso = OP02110_PaginaIniciologinSusana_Page.Ejec_PaginaIniciologinSusana("Carga_Susana", 
																				1, 
																				arr_datos,
																				arr_Elementos,
																				arr_Evidencia);
//		Assert.assertEquals(v_valid_proceso, "EXITO");
		System.out.println("------->>   Inicia el Ejec_Paginacargasusana <<--------");
		v_valid_proceso = OP02120_PaginaCargaInformacionSusana_Page.Ejec_PaginaIniciologincargasusana("Carga_Susana", 
				1, 
				arr_datos,
				arr_Elementos,
				arr_Evidencia);
	} 
	
	@Test(priority=2)
	
	public void Pagina_Prueba_susana(){
		System.out.println("------->>   Inicia el Prueba   <<--------");
		Prueba_Page.ejecutar();
	} 
	
//	@Test(priority=2)
//	
//	public void Pagina_carga_datos_susana(){
//		System.out.println("------->>   Inicia el caso   <<--------");
//		String v_valid_proceso = OP02110_PaginaIniciologinSusana_Page.Ejec_PaginaIniciologinSusana("Caso_Susana", 
//																				1, 
//																				arr_datos,
//																				arr_Elementos,
//																				arr_Evidencia);
//		
//		System.out.println("------->>   Inicia el caso   <<--------");
//		String v_valid_proceso1 = OP02110_Carga_datos_Susana_Page.Ejec_PaginaIniciologinSusana("Caso_Susana", 
//																				1, 
//																				arr_datos,
//																				arr_Elementos,
//																				arr_Evidencia);
//		Assert.assertEquals(v_valid_proceso1, "EXITO");
//
//	} 
}
