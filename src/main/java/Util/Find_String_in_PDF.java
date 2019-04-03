package Util;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import Base.TestBase;
//import Reporter.ReporterWord;


public class Find_String_in_PDF extends TestBase{
 
	public static boolean verifyPDFContent(String reqTextInPDF) {

		PDDocument doc = null;
        try {
        	doc = PDDocument.load(new File("D:\\Informe\\PDF\\cta_uni.pdf"));
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
        	System.out.println("  close --->>>> FileNotFoundException  --->>>  ["+e+"]  <<<---");
        } catch (IOException e) {
        	System.out.println("  close --->>>> IOException  --->>>  ["+e+"]  <<<---");

        } catch (Exception e) {
        	System.out.println("  close --->>>> Exception  --->>>  ["+e+"]  <<<---");
        }
        System.out.println("--->>>   text   --->>>  ["+text+"]  <<<---");
        return text.contains(reqTextInPDF);
    }

    public static void main( String [] args) throws IOException{
        System.out.println("  Buscqueda   --->>>>  000-0-011922-9  --->>>  ["+verifyPDFContent("000-0-011922-9")+"]  <<<---");
    }
	
}


