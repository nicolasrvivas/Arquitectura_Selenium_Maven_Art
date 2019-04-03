package A02_Testcases.Proy_2_QAnova_Piloto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.Proy_2_QAnova_Piloto.OP02100_Data_Entrada_Excel;
import Pages.Proy_2_QAnova_Piloto.OP02110_PaginaInicioQA3;
import Pages.Proy_2_QAnova_Piloto.OP02200_LogoffQA2;
import Pages.Proy_2_QAnova_Piloto.OP02200_LogoffQA3;
import Pages.Proy_2_Genericos.GP02010_PageFactory_Init;
import Pages.Proy_2_Genericos.GP02015_Return_Page_Title;
import Pages.Proy_2_Genericos.GP02020_Return_Var_Elem_no_localizados;
import Reporter.ReporterWord;
import Util.Fecha_Hora_Sistema;
import Util.UPdateExcelFile;
import Util.WriteExcelFile;


public class CP02110_Login_QANova2_test extends TestBase {
	GP02010_PageFactory_Init 				GP02010_PageFactory_Init_Page;
	OP02110_PaginaInicioQA3 				OP02110_PaginaInicioQA3_Page;
	GP02015_Return_Page_Title 				GP02015_Return_Page_Title_Page;
	GP02020_Return_Var_Elem_no_localizados 	GP02020_Return_Var_Elem_no_localizados_Page;
	OP02200_LogoffQA2 						OP02200_LogoffQA2_Page;
	OP02200_LogoffQA3						OP02200_LogoffQA3_Page;
	WriteExcelFile 							WriteExcelFile_Page;
	UPdateExcelFile 						UPdateExcelFile_Page;
	Fecha_Hora_Sistema						Fecha_Hora_Sistema_Page;
	OP02100_Data_Entrada_Excel				OP02100_Data_Entrada_Excel_Page;

	
	public CP02110_Login_QANova2_test(){
	   	super();
	}
	  
   	@BeforeMethod
	public void setUp_CP02110_Login_QANova2_test(){
		
		GP02010_PageFactory_Init_Page  				= new GP02010_PageFactory_Init();
		OP02110_PaginaInicioQA3_Page   				= new OP02110_PaginaInicioQA3();
		GP02015_Return_Page_Title_Page 				= new GP02015_Return_Page_Title();
		GP02020_Return_Var_Elem_no_localizados_Page = new GP02020_Return_Var_Elem_no_localizados();
		WriteExcelFile_Page 						= new WriteExcelFile();
		UPdateExcelFile_Page 						= new UPdateExcelFile();
		OP02200_LogoffQA2_Page 						= new OP02200_LogoffQA2();
		OP02200_LogoffQA3_Page						= new OP02200_LogoffQA3();
		Fecha_Hora_Sistema_Page						= new Fecha_Hora_Sistema();
		OP02100_Data_Entrada_Excel_Page				= new OP02100_Data_Entrada_Excel();
	}
   	
	@Test(priority=1)

	public 	String loginTest(ArrayList<String> arr_Casos_CP){
	
	//  Variables globales del caso
		String v_caso = "Caso_1";
		String v_caso_nombre = "CP02110_Login_QANova2_test";
		String v_name_imagen = v_caso_nombre+"_";
		String v_valid_proceso="EXITO"; 
		int v_nro_fila					= 0;
		
		String d_URL					= null;
		String d_Navegador				= null;
		String d_Usuario 				= null;
		String d_Pass 					= null;
		String d_Ciclo					= null;
		String v_valid_proceso_e		= null;
		
		System.out.println("------->>   Test loginPage   <<--------");
		
	/*  =====================================================================================  */
	/*  ------------            Carga datos entrada desde EXCEL                  ------------  */
	/*  -------------------------------------------------------------------------------------  */	
		v_valid_proceso = OP02100_Data_Entrada_Excel_Page.Ejec_Lee_EXCEL_DAta(v_caso,
																	prop.getProperty("d_directorio"),
																	"TestData.xlsx",
																	"Hoja1");
		
		if (v_valid_proceso=="EXITO"){
			arr_data 	= OP02100_Data_Entrada_Excel_Page.Retorna_arr_data2();
			d_URL 					= arr_data.get(0);
			d_Navegador				= arr_data.get(1);
	        d_Usuario				= arr_data.get(4);
	        d_Pass 					= arr_data.get(5);

		}
	/*  -------------------------------------------------------------------------------------  */
	/*  ------------           Fin Carga datos entrada desde EXCEL               ------------  */
	/*  =====================================================================================  */
	/*  -------------------------------------------------------------------------------------  */
	/*  ------------                    Inicia Paso Login                        ------------  */
	/*  -------------------------------------------------------------------------------------  */		
		cont=1;
		v_valid_proceso = OP02110_PaginaInicioQA3_Page.Ejec_PaginaInicioQA2(d_Usuario, 
																			d_Pass, 
																			v_name_imagen,
																			cont,
																			arr_datos,
																			arr_Elementos,
																			arr_Evidencia);
		arr_datos 		= OP02110_PaginaInicioQA3_Page.Retorna_arr_datos();
		arr_Elementos 	= OP02110_PaginaInicioQA3_Page.Retorna_arr_elementos();
		arr_Evidencia 	= OP02110_PaginaInicioQA3_Page.Retorna_arr_evidencia();
		cont 			= OP02110_PaginaInicioQA3_Page.Retorna_cont();


	/*  -------------------------------------------------------------------------------------  */
	/*  ------------                    Fin Paso Login                           ------------  */
	/* --------------------------------------------------------------------------------------  */

	/*  -------------------------------------------------------------------------------------  */
	/*  ------------                    Inicio Logoff                            ------------  */
	/* --------------------------------------------------------------------------------------  */
		if (v_valid_proceso=="EXITO"){
			v_valid_proceso = OP02200_LogoffQA3.Ejec_PaginaLogoff(arr_Elementos);
			arr_Elementos 	= OP02200_LogoffQA3.Retorna_arr_elementos();
		}
	/*  -------------------------------------------------------------------------------------  */
	/*  ------------                    Fin Logoff                               ------------  */
	/* --------------------------------------------------------------------------------------  */
		
	/*  -------------------------------------------------------------------------------------  */	
	/*                Genera documento word con las evidencias del caso                        */
	/*  -------------------------------------------------------------------------------------  */	
		try {
		ReporterWord rw = new ReporterWord();		

			rw.createWord("D:/Informe/"+v_caso_nombre, arr_datos, arr_Evidencia, arr_Elementos, v_name_imagen);

		} catch (FileNotFoundException e) {
	       	System.out.println("------->>        Error al generar el reporte word      FileNotFoundException    <<--------"+e);	
	       	e.printStackTrace();
        } catch (IOException e) {
	       	System.out.println("------->>        Error al generar el reporte word      IOException    <<--------"+e);	
	       	e.printStackTrace();

        } catch (Exception e) {
	       	System.out.println("------->>        Error al generar el reporte word       Exception   <<--------"+e);	
	       	e.printStackTrace();e.printStackTrace();
       } 
		
		/*  =====================================================================================  */
		/*  ------------            Carga datos entrada desde EXCEL                  ------------  */
		/*  -------------------------------------------------------------------------------------  */

			v_valid_proceso_e = OP02100_Data_Entrada_Excel_Page.busca_nro_fila_resultados(v_caso,
																	prop.getProperty("d_FilePath_Resul"),
																	prop.getProperty("d_FileName_Resul"),
																	prop.getProperty("d_sheetName_Resul"));

		
		if (v_valid_proceso_e=="EXITO"){
			
			v_nro_fila 	= OP02100_Data_Entrada_Excel_Page.Retorna_v_nro_fila();

		}
		/*  -------------------------------------------------------------------------------------  */
		/*  ------------           Fin Carga datos entrada desde EXCEL               ------------  */
		/*  =====================================================================================  */
		if (v_valid_proceso_e=="EXITO"){

			UPdateExcelFile_Page.ejec_writeExcel(prop.getProperty("d_FilePath_Resul"),
											prop.getProperty("d_FileName_Resul"),
											prop.getProperty("d_sheetName_Resul"),
											"Caso_1",
											"Ciclo 1",v_nro_fila,1,
											Fecha_Hora_Sistema_Page.fecha_Sistema(),v_nro_fila,2,
											Fecha_Hora_Sistema_Page.hora_Sistema(),v_nro_fila,3,
											d_Usuario,v_nro_fila,4,
											v_valid_proceso,v_nro_fila,5,
											0);
		}
		
		if (v_valid_proceso_e=="EXITO"){

			String[] valueToWrite = {"Caso_1",
									"Ciclo 1",
									Fecha_Hora_Sistema_Page.fecha_Sistema(),
									Fecha_Hora_Sistema_Page.hora_Sistema(),
									v_valid_proceso};
			
			WriteExcelFile_Page.writeExcel(prop.getProperty("d_FilePath_Resul"),
											prop.getProperty("d_FileName_Resul"),
											prop.getProperty("d_sheetName_Resul"),
											valueToWrite);

		}
		
		if (v_valid_proceso=="FALLA") {
			v_valid_proceso=v_valid_proceso_e;
		}
		driver.quit();
		return v_valid_proceso;

	} 
}
