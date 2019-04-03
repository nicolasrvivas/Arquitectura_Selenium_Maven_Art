package A01_TestLab.Proy2_QAnova_Piloto;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Proy_2_QAnova_Piloto.OP02110_PaginaInicioQA2;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02110_Login_QANova2_test;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02120_Carga_Informacion_Data_QA2_test;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02130_Matriz_de_Información_Tabla_QA2_test;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test;

public class TL020110_Caso_2 extends TestBase{

//  CP000001 - Carga Empleados
	CP02110_Login_QANova2_test 							CP02110_Login_QANova2_test_Case;
	CP02120_Carga_Informacion_Data_QA2_test 			CP02120_Carga_Informacion_Data_QA2_test_Case;
	CP02130_Matriz_de_Información_Tabla_QA2_test 		CP02130_Matriz_de_Información_Tabla_QA2_test_Case;
	CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test_Case;
	OP02110_PaginaInicioQA2 							OP02110_PaginaInicioQA2_Page;

	public TL020110_Caso_2(){
	   	super();
	}
	
	@BeforeMethod
	public void setUp_TL020110_Caso_1(){
		Inicializacion();
		CP02110_Login_QANova2_test_Case 						= new CP02110_Login_QANova2_test();	
		CP02120_Carga_Informacion_Data_QA2_test_Case 			= new CP02120_Carga_Informacion_Data_QA2_test();
		CP02130_Matriz_de_Información_Tabla_QA2_test_Case 		= new CP02130_Matriz_de_Información_Tabla_QA2_test();
		CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test_Case = new CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test();
		OP02110_PaginaInicioQA2_Page   							= new OP02110_PaginaInicioQA2();
		CP02110_Login_QANova2_test_Case.setUp_CP02110_Login_QANova2_test();
		CP02120_Carga_Informacion_Data_QA2_test_Case.setup_CP02120_Carga_Informacion_Data_QA2_test();
		CP02130_Matriz_de_Información_Tabla_QA2_test_Case.setUp_Matriz_de_Información_Tabla();
		CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test_Case.setUp_Eliminar_Reg_MatrizInformacio();
	}
		
	@Test(priority=2)
	public void Caso_2_Test() {
		String cond_caso2 = CP02120_Carga_Informacion_Data_QA2_test_Case.CargaTest();
		System.out.println("------->>   Finalización del CargaTest   <<-------- ["+cond_caso2+"]  <<<--- ");
	}
	

}
