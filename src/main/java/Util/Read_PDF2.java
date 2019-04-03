package Util;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import Base.TestBase;

public class Read_PDF2 extends TestBase{
 
	 public static void main(String[] args) throws IOException {
	  // TODO Auto-generated method stub
	  
	  PDDocument pd;
	  pd = PDDocument.load(new File("D:\\Informe\\PDF\\fw4.pdf"));
	  System.out.println("Total Number Of pages :"+pd.getNumberOfPages());
	  
	  PDFTextStripper pdf = new PDFTextStripper();
	  System.out.println("  --------------------pdf.getText(pd)-------------------------------------");
	  System.out.println(pdf.getText(pd));
	  System.out.println("  --------------------pdf.getTextMatrix()-----------------------------");
	  System.out.println(pdf.getTextMatrix());
//	  System.out.println(verifyPDFContent("Charity"));

	 }
	
}
