package Pages.Proy_2_Genericos;


import java.util.concurrent.TimeUnit;

import Base.TestBase;

public class GP02015_Return_Page_Title extends TestBase {


	// Retorna el Titulo de una pagina
	public static String Titulo_Pagina_Presente(int timeOutInSeconds,String v_titulo) {

		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS); //nullify implicitlyWait()
		String title = null;
		for(int Count = 0;Count<=timeOutInSeconds;Count++){
			title = driver.getTitle();
			esperarSegundos(driver, 1);
			if(title.equals(v_titulo)) {
				break;
			} else {
				if (Count==timeOutInSeconds) {
					  break;
					}
			  } 
		}
		return title;
	}

	
}
