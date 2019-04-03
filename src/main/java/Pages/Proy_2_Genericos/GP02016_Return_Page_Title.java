package Pages.Proy_2_Genericos;


import java.util.concurrent.TimeUnit;

import Base.TestBase;

public class GP02016_Return_Page_Title extends TestBase {


	// Retorna el Titulo de una pagina
	public static String Titulo_Pagina_Presente(int timeOutInSeconds,String v_titulo) {
		
		String v_valid_proceso_t	= "FALLA";
		
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS); //nullify implicitlyWait()
		
		String title = null;
		
		for(int Count = 0;Count<=timeOutInSeconds;Count++){
			
			title = driver.getTitle();
			
			esperarSegundos(driver, 1);
			
			if(title.equals(v_titulo)) {
				v_valid_proceso_t = "EXITO";
				break;
			} 
			
		}
		
		if(v_valid_proceso_t.equals("FALLA")) {
		
		
		System.out.println("------->>  titulo obetenido   <<-------->>>>"+title);

		}

		return v_valid_proceso_t;
	}

	
}
