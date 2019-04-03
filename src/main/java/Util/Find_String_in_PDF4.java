package Util;


import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Base.TestBase;
//import Reporter.ReporterWord;


public class Find_String_in_PDF4 extends TestBase{
 
	public static boolean verifyPDFContent(String reqTextInPDF) {
		
//		System.setProperty("webdriver.chrome.driver",prop.getProperty("D_DriverSelenium")+"\\chromedriver.exe");
		ChromeOptions opcion = new ChromeOptions();
		opcion.addArguments("disable-infobars");
		opcion.addArguments("--incognito");
		driver = new ChromeDriver(opcion);	
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
        return text.contains(reqTextInPDF);
    }

    public static void main( String [] args) throws IOException{
    	System.out.println("  /* ------------------------------------------------------------------------- */"); 
        System.out.println("  Busca   --->>>>  Download PDF file  --->>>  ["+verifyPDFContent("Download PDF file")+"]  <<<---");
        System.out.println("  /* ------------------------------------------------------------------------- */"); 
    }
	
}


