package A01_TestLab.Proy2_QAnova_Piloto;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import A02_Testcases.Proy_2_QAnova_Piloto.CP02150_BNP_Paribas_Cardif_test;
import Base.TestBase;

public class TL020110_Caso_7 extends TestBase{

//CP000001 - Carga Empleados
	CP02150_BNP_Paribas_Cardif_test				CP02150_BNP_Paribas_Cardif_test_Case;
	String v_valid_proceso;
	public TL020110_Caso_7(){
	   	super();
	}
	
	@BeforeMethod
	public void setUp_TL020110_Caso_1(){
		Inicializacion();
		CP02150_BNP_Paribas_Cardif_test_Case			= new CP02150_BNP_Paribas_Cardif_test();
		CP02150_BNP_Paribas_Cardif_test_Case.setUp_BNP_Paribas_Cardif_test();
	}
	
	
	@Test(priority=1)
	public void Caso_1_Test() {

		v_valid_proceso = CP02150_BNP_Paribas_Cardif_test_Case.BNP_Cardif_Case();
		        
        System.out.println("--->>>   text   --->>>  ["+v_valid_proceso+"]  <<<---");
	//	System.out.println("  Busca   --->>>>  ANTECEDENTES DE LA CUENTA  --->>>  ["+Find_String_in_PDF3.verifyPDFContent("Consulta")+"]  <<<---");
		System.out.println("------->>   Finalización del CargaTest  EXCEL <<-------- ["+"prueba  --->>>   verifyPDFContent"+"]  <<<--- ");
	}

}
