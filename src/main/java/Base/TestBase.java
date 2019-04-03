package Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import Util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public ArrayList<String> arr_datos 		= new ArrayList<String>();
	public ArrayList<String> arr_Evidencia 	= new ArrayList<String>();
	public ArrayList<String> arr_Elementos 	= new ArrayList<String>();
	public static ArrayList<String> arr_datos_i 	= new ArrayList<String>();
	public static ArrayList<String> arr_Evidencia_i = new ArrayList<String>();
	public static ArrayList<String> arr_Elementos_i = new ArrayList<String>();
	public ArrayList<String> varElementos 	= new ArrayList<String>();
	public ArrayList<String> arr_Casos 		= new ArrayList<String>();
	public ArrayList<String> arr_data 		= new ArrayList<String>();
	public static String v_cargo_exito 		= "Cargo Elemento con Exito"; 
	public static String v_no_cargo_exito 	= "No Cargo Elemento con Exito";
	public static String v_desc_elem 		= null;
	public int cont 						= 1;
	public By locator;
	public static int elem_no_localizados 	= 0;
	public static int v_cont 				= 0;
	public static String v_valid_proceso	= "EXITO"; 
	public static String v_metodo			= null;
	public static String v_find				= null;
	
	
	
	// archivo de configuración de propiedades
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//   Espera o wait en segundos 
	public static void esperarSegundos(WebDriver driver, int segundos){
	       
	      synchronized(driver){
	         try {
	            driver.wait(segundos * 1000);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	}
	
	// set Propiedades para el navegador a usar
	public static void Inicializacion() {
		
		String tipoNavegador = prop.getProperty("browser");

//		"chrome"
		if(tipoNavegador.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",prop.getProperty("D_DriverSelenium")+"\\chromedriver.exe");
			ChromeOptions opcion = new ChromeOptions();
			opcion.addArguments("disable-infobars");
			opcion.addArguments("--incognito");
			driver = new ChromeDriver(opcion);	
			driver.manage().window().maximize();
			
//			"ff"
		}else if(tipoNavegador.equals("ff")) {
			
			System.setProperty("webdriver.gecko.driver",prop.getProperty("D_DriverSelenium")+"\\geckodriver.exe");
			FirefoxOptions opcion = new FirefoxOptions();
//			opcion.addArguments("--incognito");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
//			"explorer"
		}else if(tipoNavegador.equals("explorer")) {
			
			System.setProperty("webdriver.ie.driver",prop.getProperty("D_DriverSelenium")+"\\IEDriverServer.exe");
			InternetExplorerOptions opcion = new InternetExplorerOptions();
			driver = new InternetExplorerDriver(opcion);
			driver.manage().window().maximize();
			
//			"edge"
		}else if(tipoNavegador.equals("edge")) {
			
			System.setProperty("webdriver.ie.driver",prop.getProperty("D_DriverSelenium")+"\\MicrosoftWebDriver.exe");
		    driver = new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		
		//System.out.println("   configura Tiempo de Espera  ");
		// configura Tiempo de Espera
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT , TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT , TimeUnit.SECONDS);
		
		//System.out.println("   inicia URL  ");
		// Inicia el url de la pagina a probar 
		
		driver.get(prop.getProperty("url"));

		driver.navigate();
		driver.manage().window().maximize() ;
		

	}
}
