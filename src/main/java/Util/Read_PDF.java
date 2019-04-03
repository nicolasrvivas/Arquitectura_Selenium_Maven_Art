package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;

import Base.TestBase;

public class Read_PDF extends TestBase{
 
	public static void main(String[] args) throws IOException {
	File file = new File("D://Informe//PDF//fw4.pdf");
	
	FileInputStream fis = new FileInputStream(file);
	
	PDFParser parser = new PDFParser((RandomAccessRead) fis);
	
	parser.parse();
	
	COSDocument cosDoc = parser.getDocument();
	
	PDDocument pdDoc = new PDDocument(cosDoc);
	
	PDFTextStripper strip = new PDFTextStripper();
	
	String data = strip.getText(pdDoc);
	
	System.out.println("----------------------------------->>   data   <<-------- [------------]  <<<------------------------ ");
	System.out.println(data);
	System.out.println("----------------------------------->>   data   <<-------- [------------]  <<<------------------------ ");
	
	Assert.assertTrue(data.contains("Purpose"));
	System.out.println("----------------------------------->>   data   <<-------- [   Purpose  ]  <<<------------------------ ");
	
	cosDoc.close();
	pdDoc.close();
	
	
	
	}
}
