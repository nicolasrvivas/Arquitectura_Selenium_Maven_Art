package A01_TestLab.Proy2_QAnova_Piloto;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Util.Find_String_in_PDF3;

public class TL020110_Caso_6 extends TestBase{

//CP000001 - Carga Empleados
	Find_String_in_PDF3						Find_String_in_PDF3_Page;

	public TL020110_Caso_6(){
	   	super();
	}
	
	@BeforeMethod
	public void setUp_TL020110_Caso_1(){
//		Inicializacion();
		Find_String_in_PDF3_Page			= new Find_String_in_PDF3();
	}
	
	
	@Test(priority=1)
	public void Caso_1_Test() {

		System.setProperty("webdriver.chrome.driver","C:\\driverSelenium\\chromedriver.exe");
//		ChromeOptions opcion = new ChromeOptions();
//		opcion.addArguments("disable-infobars");
//		opcion.addArguments("--incognito");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();

		URL url = null;
		try {
			url = new URL("http://www.axmag.com/download/pdfurl-guide.pdf");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("  url --->>>> new URL(---)  --->>>  ["+e+"]  <<<---");
		}
		
		
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(url.openStream());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("  bis --->>>> new BufferedInputStream(---)  --->>>  ["+e+"]  <<<---");
		}
		
		
		PDDocument doc = null;
        try {
        	doc = PDDocument.load(bis);
        } catch (FileNotFoundException e) {
        	System.out.println("  PDDocument --->>>> FileNotFoundException  --->>>  ["+e+"]  <<<---");
        } catch (IOException e) {
        	System.out.println("  PDDocument --->>>> IOException  --->>>  ["+e+"]  <<<---");
        } catch (Exception e) {
        	System.out.println("  PDDocument --->>>> Exception  --->>>  ["+e+"]  <<<---");
        } 
        
        System.out.println("  --->>>>   Numero de paginas   --->>>  ["+doc.getNumberOfPages()+"]  <<<---");
        
        PDFTextStripper pdfStripper = null;
        try {
        	pdfStripper = new PDFTextStripper();
        } catch (FileNotFoundException e) {
        	System.out.println("  PDFTextStripper --->>>> FileNotFoundException  --->>>  ["+e+"]  <<<---");
        } catch (IOException e) {
        	System.out.println("  PDFTextStripper --->>>> IOException  --->>>  ["+e+"]  <<<---");

        } catch (Exception e) {
        	System.out.println("  PDFTextStripper --->>>> Exception  --->>>  ["+e+"]  <<<---");
        }
        
        String text = null;
        try {
        	text = pdfStripper.getText(doc);
        } catch (FileNotFoundException e) {
        	System.out.println("  pdfStripper --->>>> FileNotFoundException  --->>>  ["+e+"]  <<<---");
        } catch (IOException e) {
        	System.out.println("  pdfStripper --->>>> IOException  --->>>  ["+e+"]  <<<---");

        } catch (Exception e) {
        	System.out.println("  pdfStripper --->>>> Exception  --->>>  ["+e+"]  <<<---");
        }
        

        try {
        	doc.close();
        } catch (FileNotFoundException e) {
        	System.out.println("  doc.close --->>>> FileNotFoundException  --->>>  ["+e+"]  <<<---");
        } catch (IOException e) {
        	System.out.println("  doc.close --->>>> IOException  --->>>  ["+e+"]  <<<---");

        } catch (Exception e) {
        	System.out.println("  doc.close --->>>> Exception  --->>>  ["+e+"]  <<<---");
        }
        
        try {
        	bis.close();
        } catch (FileNotFoundException e) {
        	System.out.println("  bis.close --->>>> FileNotFoundException  --->>>  ["+e+"]  <<<---");
        } catch (IOException e) {
        	System.out.println("  bis.close --->>>> IOException  --->>>  ["+e+"]  <<<---");

        } catch (Exception e) {
        	System.out.println("  bis.close --->>>> Exception  --->>>  ["+e+"]  <<<---");
        }
        
        System.out.println("--->>>   text   --->>>  ["+text+"]  <<<---");
	//	System.out.println("  Busca   --->>>>  ANTECEDENTES DE LA CUENTA  --->>>  ["+Find_String_in_PDF3.verifyPDFContent("Consulta")+"]  <<<---");
		System.out.println("------->>   Finalización del CargaTest  EXCEL <<-------- ["+"prueba  --->>>   verifyPDFContent"+"]  <<<--- ");
	}

}
