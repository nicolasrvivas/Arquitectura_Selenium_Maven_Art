package A01_TestLab.Proy2_QAnova_Piloto;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.Proy_2_QAnova_Piloto.OP02100_Data_Entrada_Excel;
import Pages.Proy_2_QAnova_Piloto.OP02110_PaginaInicioQA3;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02110_Login2_QANova_test;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02110_Login_QANova2_test;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02120_Carga_Informacion_Data_QA2_test;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02121_Carga_Informacion_Data_QA2_test;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02130_Matriz_de_Información_Tabla_QA2_test;
import A02_Testcases.Proy_2_QAnova_Piloto.CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test;

public class TL020110_Caso_1 extends TestBase{

//CP000001 - Carga Empleados
	CP02110_Login_QANova2_test 							CP02110_Login_QANova2_test_Case;
	CP02110_Login2_QANova_test 							CP02110_Login2_QANova_test_Case;
	OP02110_PaginaInicioQA3 							OP02110_PaginaInicioQA3_Page;
	CP02120_Carga_Informacion_Data_QA2_test 			CP02120_Carga_Informacion_Data_QA2_test_Case;
	CP02121_Carga_Informacion_Data_QA2_test				CP02121_Carga_Informacion_Data_QA2_test_Case;
	CP02130_Matriz_de_Información_Tabla_QA2_test 		CP02130_Matriz_de_Información_Tabla_QA2_test_Case;
	CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test_Case;
	OP02100_Data_Entrada_Excel							OP02100_Data_Entrada_Excel_Page;

	public TL020110_Caso_1(){
	   	super();
	}
	
	@BeforeMethod
	public void setUp_TL020110_Caso_1(){
		
		Inicializacion();
		CP02110_Login_QANova2_test_Case 						= new CP02110_Login_QANova2_test();
		CP02110_Login2_QANova_test_Case 						= new CP02110_Login2_QANova_test();
		CP02120_Carga_Informacion_Data_QA2_test_Case 			= new CP02120_Carga_Informacion_Data_QA2_test();
		CP02130_Matriz_de_Información_Tabla_QA2_test_Case 		= new CP02130_Matriz_de_Información_Tabla_QA2_test();
		CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test_Case = new CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test();
		CP02121_Carga_Informacion_Data_QA2_test_Case			= new CP02121_Carga_Informacion_Data_QA2_test();
		CP02110_Login2_QANova_test_Case.setUp_CP02110_Login_QANova2_test();
		CP02120_Carga_Informacion_Data_QA2_test_Case.setup_CP02120_Carga_Informacion_Data_QA2_test();
		CP02121_Carga_Informacion_Data_QA2_test_Case.setup_CP02121_Carga_Informacion_Data_QA2_test();
		CP02130_Matriz_de_Información_Tabla_QA2_test_Case.setUp_Matriz_de_Información_Tabla();
		CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test_Case.setUp_Eliminar_Reg_MatrizInformacio();
	}
	
	
	@Test(priority=1)
	public void Caso_1_Test() {
		String cond_caso1 = CP02110_Login2_QANova_test_Case.loginTest();
		System.out.println("------->>   Finalización del CargaTest  EXCEL <<-------- ["+cond_caso1+"]  <<<--- ");
	}

//	@Test(priority=2)
//	public void Caso_2_Test() {
//		String cond_caso2 = CP02120_Carga_Informacion_Data_QA2_test_Case.CargaTest();
//		System.out.println("------->>   Finalización del CargaTest  EXCEL <<-------- ["+cond_caso2+"]  <<<--- ");
//	}
	
//	@Test(priority=3)
//	public void Caso_3_Test() {
//		String cond_caso3 = CP02130_Matriz_de_Información_Tabla_QA2_test_Case.matrizTest();
//		System.out.println("------->>   Finalización de  Matriz_de_Información   <<-------- ["+cond_caso3+"]  <<<--- ");
//	}
//
//	@Test(priority=4)
//	public void Caso_4_Test() {
//		String cond_caso4 = CP02140_Eliminar_Reg_Matriz_de_Información_QA2_test_Case.ElimDatosTest();
//		System.out.println("------->>   Finalización de  Eliminar_Reg_Matriz_de_Información   <<-------- ["+cond_caso4+"]  <<<--- ");
//	}
	
//	@Test(priority=5)
//	public void Caso_5_Test() {
//		String cond_caso2 = CP02121_Carga_Informacion_Data_QA2_test_Case.CargaTest();
//		System.out.println("------->>   Finalización del CargaTest BD  <<-------- ["+cond_caso2+"]  <<<--- ");
//	}
}
