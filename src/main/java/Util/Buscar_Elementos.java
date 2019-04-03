package Util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;
import Util.Captura_Pantalla;

public class Buscar_Elementos extends TestBase {
	
	/* -------------------------------------------------------------------- */
	/* -       Identifica si se encuentra el elemento en la página       - */
	/* -       Genera un Print en memoria con los datos del elemnti       - */
	/* -       LLama a otra rutina para realizar Captuire de pantalla     - */
	/* -       LLama a otra rutina para realizar Captuire de pantalla     - */
	/* -       LLama a otra rutina para realizar Captuire de pantalla     - */
	/* -       LLama a otra rutina para realizar Captuire de pantalla     - */
	/* -------------------------------------------------------------------- */
	public static WebElement waitForElementPresent(final By by, int timeOutInSeconds, String v_pag, String v_desc_exito, String v_desc_falla, String v_nombrefile, int elem_no_localizados) {

        WebElement element; 

        try{
            driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS); //nullify implicitlyWait() 

            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));  //  Busca el elemento en la página 
            
            driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS); //reset implicitlyWait
	        //String vr_elemento = by.getName();
            //Date v_date = new Date();
            
            Actions build = new Actions(driver);
            build.moveToElement(element).build().perform();    // Simula mover el cursor sobre el elemento
            		
            String css_background = element.getCssValue("background-color").toString();   // toma la confuración de background-color original
            String css_border_color = element.getCssValue("border-color").toString();     // toma la confuración de border-color original

            Calendar Cal= Calendar.getInstance();     //  Estas dos instrucciones para tomar la fecha y hora del sistema
            String v_fecha= Cal.get(Calendar.DATE)+"/"+(Cal.get(Calendar.MONTH)+1)+"/"+Cal.get(Calendar.YEAR)+" "+Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Calendar.MINUTE)+":"+Cal.get(Calendar.SECOND); 
            
            //    Reporte en memoria de evidencia de la busqueda del elemento en caso de éxito
			String v_nombre_imagen = v_pag + "_"+v_nombrefile;
			
			String vtre_linea = "+-------------------------------------------------------------------------------------------------------+";
			String vtre_patron_1 = "| %20s | %25s  | %48s  |";     
			String vtre_patron_2 = "| %61s  | %35s  |"; 
			String vtre_titulo_1 = String.format(vtre_patron_1, "Fecha", "Pagina", "Evidencia");
			String vtre_titulo_2 = String.format(vtre_patron_2, "Elemento", "Estatus");
			String vtre_resultado_1 = String.format(vtre_patron_1, v_fecha, v_pag, v_nombre_imagen+".png");
			String vtre_resultado_2 = String.format(vtre_patron_2, by, v_desc_exito);
			
            System.out.println(vtre_linea);
            System.out.println(vtre_titulo_1);
            System.out.println(vtre_resultado_1);
            System.out.println(vtre_linea);
            System.out.println(vtre_titulo_2);
            System.out.println(vtre_resultado_2);
            System.out.println(vtre_linea);
            
            highLighterMethod(driver,element);
            Captura_Pantalla.takeScreenShotTest(driver, v_nombre_imagen);
            highLighterMethod2(driver,element,css_background,css_border_color);
            //driver.navigate().refresh();
            return element; //return the element
        } catch (Exception e) {
//          Reporte en memoria de evidencia de la busqueda del elemento en caso de falla
        	 Calendar Cal= Calendar.getInstance();     //  Estas dos instrucciones para tomar la fecha y hora del sistema
             String v_fecha= Cal.get(Calendar.DATE)+"/"+(Cal.get(Calendar.MONTH)+1)+"/"+Cal.get(Calendar.YEAR)+" "+Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Calendar.MINUTE)+":"+Cal.get(Calendar.SECOND); 
        	
			String v_nombre_imagen = v_pag + "_"+v_nombrefile;
			
			String vtre_linea = "+-------------------------------------------------------------------------------------------------------+";
			String vtre_patron_1 = "| %20s | %25s  | %48s  |";     
			String vtre_patron_2 = "| %61s  | %35s  |"; 
			String vtre_titulo_1 = String.format(vtre_patron_1, "Fecha", "Pagina", "Evidencia");
			String vtre_titulo_2 = String.format(vtre_patron_2, "Elemento", "Estatus");
			String vtre_resultado_1 = String.format(vtre_patron_1, v_fecha, v_pag, v_nombre_imagen+".png");
			String vtre_resultado_2 = String.format(vtre_patron_2, by, v_desc_falla);
			
            System.out.println(vtre_linea);
            System.out.println(vtre_titulo_1);
            System.out.println(vtre_resultado_1);
            System.out.println(vtre_linea);
            System.out.println(vtre_titulo_2);
            System.out.println(vtre_resultado_2);
            System.out.println(vtre_linea);
            System.out.println(vtre_linea);

            Captura_Pantalla.takeScreenShotTest(driver, v_nombre_imagen);
            elem_no_localizados++;
            //e.printStackTrace();
        } 
        return null; 
    }
	
	/* -------------------------------------------------------------------- */
	/* -       Identifica si se encuentra el elemento en la página       - */
	/* -       Genera un Print en memoria con los datos del elemnti       - */
	/* -       LLama a otra rutina para realizar Captuire de pantalla     - */
	/* -       LLama a otra rutina para realizar Captuire de pantalla     - */
	/* -       LLama a otra rutina para realizar Captuire de pantalla     - */
	/* -       LLama a otra rutina para realizar Captuire de pantalla     - */
	/* -------------------------------------------------------------------- */
	public static WebElement waitForElementPresent3(String v_metodo, String v_find, int timeOutInSeconds, String v_pag, String v_desc_exito, String v_desc_falla, String v_nombrefile) {

        WebElement element = null; 


		try{
            driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS); //nullify implicitlyWait() 

            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds); 
            
			switch (v_metodo) {
			case "xpath":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(v_find)));  //  Busca el elemento en la página 
				break;
			case "id":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(v_find)));  //  Busca el elemento en la página 
				break;
			case "name":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(v_find)));  //  Busca el elemento en la página
				break;
			case "className":
				element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(v_find)));  //  Busca el elemento en la página 
				break;
			//case "css":
			//	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.css(v_find)));  //  Busca el elemento en la página 
			//	break;
			}
            
			     
            driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS); //reset implicitlyWait
	        //String vr_elemento = by.getName();
            //Date v_date = new Date();
            
            Actions build = new Actions(driver);
            build.moveToElement(element).build().perform();    // Simula mover el cursor sobre el elemento
            		
            String css_background = element.getCssValue("background-color").toString();   // toma la confuración de background-color original
            String css_border_color = element.getCssValue("border-color").toString();     // toma la confuración de border-color original

            Calendar Cal= Calendar.getInstance();     //  Estas dos instrucciones para tomar la fecha y hora del sistema
            String v_fecha= Cal.get(Calendar.DATE)+"/"+(Cal.get(Calendar.MONTH)+1)+"/"+Cal.get(Calendar.YEAR)+" "+Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Calendar.MINUTE)+":"+Cal.get(Calendar.SECOND); 
            
            //    Reporte en memoria de evidencia de la busqueda del elemento en caso de éxito
			String v_nombre_imagen = v_pag + "_"+v_nombrefile;
			
			String vtre_linea = "+-------------------------------------------------------------------------------------------------------+";
			String vtre_patron_1 = "| %20s | %25s  | %48s  |";     
			String vtre_patron_2 = "| %61s  | %35s  |"; 
			String vtre_titulo_1 = String.format(vtre_patron_1, "Fecha", "Pagina", "Evidencia");
			String vtre_titulo_2 = String.format(vtre_patron_2, "Elemento", "Estatus");
			String vtre_resultado_1 = String.format(vtre_patron_1, v_fecha, v_pag, v_nombre_imagen+".png");
			String vtre_resultado_2 = String.format(vtre_patron_2, v_find, v_desc_exito);
			
            System.out.println(vtre_linea);
            System.out.println(vtre_titulo_1);
            System.out.println(vtre_resultado_1);
            System.out.println(vtre_linea);
            System.out.println(vtre_titulo_2);
            System.out.println(vtre_resultado_2);
            System.out.println(vtre_linea);
            
            highLighterMethod(driver,element);
            Captura_Pantalla.takeScreenShotTest(driver, v_nombre_imagen);
            highLighterMethod2(driver,element,css_background,css_border_color);

            return element; //return the element
        } catch (Exception e) {
//          Reporte en memoria de evidencia de la busqueda del elemento en caso de falla
        	 Calendar Cal= Calendar.getInstance();     //  Estas dos instrucciones para tomar la fecha y hora del sistema
             String v_fecha= Cal.get(Calendar.DATE)+"/"+(Cal.get(Calendar.MONTH)+1)+"/"+Cal.get(Calendar.YEAR)+" "+Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Calendar.MINUTE)+":"+Cal.get(Calendar.SECOND); 
        	
			String v_nombre_imagen = v_pag + "_"+v_nombrefile;
			
			String vtre_linea = "+-------------------------------------------------------------------------------------------------------+";
			String vtre_patron_1 = "| %20s | %25s  | %48s  |";     
			String vtre_patron_2 = "| %61s  | %35s  |"; 
			String vtre_titulo_1 = String.format(vtre_patron_1, "Fecha", "Pagina", "Evidencia");
			String vtre_titulo_2 = String.format(vtre_patron_2, "Elemento", "Estatus");
			String vtre_resultado_1 = String.format(vtre_patron_1, v_fecha, v_pag, v_nombre_imagen+".png");
			String vtre_resultado_2 = String.format(vtre_patron_2, v_find, v_desc_falla);
			
            System.out.println(vtre_linea);
            System.out.println(vtre_titulo_1);
            System.out.println(vtre_resultado_1);
            System.out.println(vtre_linea);
            System.out.println(vtre_titulo_2);
            System.out.println(vtre_resultado_2);
            System.out.println(vtre_linea);
            System.out.println(vtre_linea);

            Captura_Pantalla.takeScreenShotTest(driver, v_nombre_imagen);
            //e.printStackTrace();
        } 
        return null; 
    }
	
	public static ArrayList<String> waitForElementPresente(final By by, WebElement element, int timeOutInSeconds, String v_pag, String v_desc_exito, String v_desc_falla, String v_nombrefile, int elem_no_localizados, ArrayList<String> arr_elem3) {

	//  Simula mover el cursor sobre el elemento
		Actions build = new Actions(driver);
        build.moveToElement(element).build().perform();    
        		
     // Toma la confuración de background-color original
        String css_background = element.getCssValue("background-color").toString();
        
     // Toma la confuración de border-color original
        String css_border_color = element.getCssValue("border-color").toString();  
        
     //  Estas dos instrucciones para tomar la fecha y hora del sistema
        Calendar Cal= Calendar.getInstance();     
        String v_fecha= Cal.get(Calendar.DATE)+"/"+(Cal.get(Calendar.MONTH)+1)+"/"+Cal.get(Calendar.YEAR)+" "+Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Calendar.MINUTE)+":"+Cal.get(Calendar.SECOND); 
            
            //    Reporte en memoria de evidencia de la busqueda del elemento en caso de éxito
		String v_nombre_imagen = v_pag + "_"+v_nombrefile;
		
		String vtre_linea = "+-------------------------------------------------------------------------------------------------------+";
		String vtre_patron_1 = "| %20s | %25s  | %48s  |";     
		String vtre_patron_2 = "| %61s  | %35s  |"; 
		String vtre_titulo_1 = String.format(vtre_patron_1, "Fecha", "Pagina", "Evidencia");
		String vtre_titulo_2 = String.format(vtre_patron_2, "Elemento", "Estatus");
		String vtre_resultado_1 = String.format(vtre_patron_1, v_fecha, v_pag, v_nombre_imagen+".png");
		String vtre_resultado_2 = String.format(vtre_patron_2, by, v_desc_exito);

     // Imprime Evidencia
        System.out.println(vtre_linea);
        System.out.println(vtre_titulo_1);
        //System.out.println(vtre_linea);
        System.out.println(vtre_resultado_1);
        System.out.println(vtre_linea);
        System.out.println(vtre_titulo_2);
        //System.out.println(vtre_linea);
        System.out.println(vtre_resultado_2);
        System.out.println(vtre_linea);
        
     // Resalta elemento
        highLighterMethod(driver,element);
        
     // Captura Imagen
        Captura_Pantalla.takeScreenShotTest(driver, v_nombre_imagen);
        
     // Devuelve estado original del elemento
        highLighterMethod2(driver,element,css_background,css_border_color);
        
     // Actualuiza arreglo para el documento Word
		 arr_elem3.add(v_nombrefile+";");
		 arr_elem3.add(v_desc_exito+";");
		 arr_elem3.add("Passed;");
		 
			 

        return arr_elem3; 
    }
	
	public static ArrayList<String> waitForElementPresentf(final By by, WebElement element, int timeOutInSeconds, String v_pag, String v_desc_exito, String v_desc_falla, String v_nombrefile, int elem_no_localizados, ArrayList<String> arr_elem3) {

	//  Simula mover el cursor sobre el elemento
		Actions build = new Actions(driver);
        build.moveToElement(element).build().perform();    
        		

     //  Estas dos instrucciones para tomar la fecha y hora del sistema
        Calendar Cal= Calendar.getInstance();     
        String v_fecha= Cal.get(Calendar.DATE)+"/"+(Cal.get(Calendar.MONTH)+1)+"/"+Cal.get(Calendar.YEAR)+" "+Cal.get(Calendar.HOUR_OF_DAY)+":"+Cal.get(Calendar.MINUTE)+":"+Cal.get(Calendar.SECOND); 
            
            //    Reporte en memoria de evidencia de la busqueda del elemento en caso de éxito
		String v_nombre_imagen = v_pag + "_"+v_nombrefile;
		
		String vtre_linea = "+-------------------------------------------------------------------------------------------------------+";
		String vtre_patron_1 = "| %20s | %25s  | %48s  |";     
		String vtre_patron_2 = "| %61s  | %35s  |"; 
		String vtre_titulo_1 = String.format(vtre_patron_1, "Fecha", "Pagina", "Evidencia");
		String vtre_titulo_2 = String.format(vtre_patron_2, "Elemento", "Estatus");
		String vtre_resultado_1 = String.format(vtre_patron_1, v_fecha, v_pag, v_nombre_imagen+".png");
		String vtre_resultado_2 = String.format(vtre_patron_2, by, v_desc_falla);

	 //  Reporte en memoria de evidencia de la busqueda del elemento en caso de falla
     // Imprime Evidencia
        System.out.println(vtre_linea);
        System.out.println(vtre_titulo_1);
        //System.out.println(vtre_linea);
        System.out.println(vtre_resultado_1);
        System.out.println(vtre_linea);
        System.out.println(vtre_titulo_2);
        //System.out.println(vtre_linea);
        System.out.println(vtre_resultado_2);
        System.out.println(vtre_linea);

     // Captura Imagen
        Captura_Pantalla.takeScreenShotTest(driver, v_nombre_imagen);
       
     // Actualuiza arreglo para el documento Word
		 arr_elem3.add(v_nombrefile+";");
		 arr_elem3.add(v_desc_falla+";");
		 arr_elem3.add("Passed;");
	 
	     elem_no_localizados++;

        return arr_elem3; 
    }

    //   Función para cambiar el background y border del elemento para tomar un ScreemShot
	public static void highLighterMethod(WebDriver driver, WebElement elementh){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: AQUA; border: 2px solid LIME;');", elementh);
		
//		MAROON
//		YELLOW
//		OLIVE
//		LIME
//		GREEN
//		AQUA
//		TEAL
//		BLUE
//		NAVY
//		FUCHSIA
//		PURPLE

	}
	
//  Función para colocar el background y border original del elemento 
	public static void highLighterMethod2(WebDriver driver, WebElement elementh2,String v_background,String v_border){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: v_background; border: v_border;');", elementh2);
	}
	
	/* ------------------------------------------------------- */
	/* Función para buscar elementos en una pa´gina */
	/* ------------------------------------------------------- */
	public static void buscarelemntosweb() 
	{
		System.out.println("  Entro buscarelemntosweb() - TestBase() - antes de buscar elementos");
		java.util.List<WebElement> list_elemnt = driver.findElements(By.className("imMnMnImg"));
		// by-id
		System.out.println("  Entro buscarelemntosweb() - TestBase() - despues  de buscar elementos");
		System.out.println("   list_elemnt.size()  -->>  "+list_elemnt.size());
 
		for (int i = 0; i<=list_elemnt.size(); i=i+1)
 
		{
			System.out.println("------------------------------------------------------------------------------------------------------------");
			System.out.println(" | getTex() -->> "+i+"   "+list_elemnt.get(i).getText()+" | "+
							   "  getTagName() -->> "+list_elemnt.get(i).getTagName()+" | "+
							   "  getClass() -->> "+list_elemnt.get(i).getClass()+" "+
							   "  getLocation() -->> "+list_elemnt.get(i).getLocation()+" | ");
		/*	System.out.println(" | getTex() -->> "+list_elemnt.get(i).getText()+" | "+
							   "  getTagName() -->> "+list_elemnt.get(i).getTagName()+" | "+
							   "  getClass() -->> "+list_elemnt.get(i).getClass()+" "+
							   "  getLocation() -->> "+list_elemnt.get(i).getLocation()+" | "+
							   "  getRect() -->> "+list_elemnt.get(i).getRect()+" | ");
			System.out.println("------------------------------------------------------------------------------------------------------------");
		*/
		}
		System.out.println("   Salio del ciclo for");
	}
	
	


}
