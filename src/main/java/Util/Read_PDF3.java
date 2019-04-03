package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;

import Base.TestBase;


public class Read_PDF3 extends TestBase{
 
	public static WebDriver driver;
	 
	 public static void main(String[] args) throws IOException {


		//Parse text from a PDF into a string variable
	     File f = new File("D:\\Informe\\PDF\\fw4.pdf");

	     PDFParser parser = new PDFParser((RandomAccessRead) new FileInputStream(f));
	     parser.parse();

	     COSDocument cosDoc = parser.getDocument();
	     PDDocument pdDoc = new PDDocument(cosDoc);

	     PDFTextStripper pdfStripper = new PDFTextStripper();
	     String parsedText = pdfStripper.getText(pdDoc);

	     System.out.println(parsedText);

	     //Write parsed text into a file
	     PrintWriter pw = new PrintWriter("Path_to_output_text_file");
	     pw.print(parsedText);
	     pw.close(); 

	  
	  

	 }
	
}
