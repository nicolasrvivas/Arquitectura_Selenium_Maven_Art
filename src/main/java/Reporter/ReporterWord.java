package Reporter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.TextAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;

import Base.TestBase;


public class ReporterWord extends TestBase {
	private XWPFDocument documento = new XWPFDocument();
	
	//Create Word
    public void createWord(String nomDoc,ArrayList<String> varTData, ArrayList<String> varEvidencia, ArrayList<String> varElem,String v_name_imagen) throws IOException {
    	
    	//CrearHeaderFoter();		
		
    	LocalDateTime fecha = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");		
		String format = fecha.format(formato).toString();   			
		
    	//Para el titulo
		XWPFParagraph titulo_doc = documento.createParagraph();
    	titulo_doc.setAlignment(ParagraphAlignment.CENTER);
    	titulo_doc.setVerticalAlignment(TextAlignment.TOP);
    	XWPFRun r1 = titulo_doc.createRun();
    	r1.setBold(true);
    	r1.setText("INFORME DE EJECUCIÓN");
    	r1.setFontFamily("Calibri");
    	r1.setFontSize(18);
    	r1.setTextPosition(10);
    	r1.setUnderline(UnderlinePatterns.SINGLE);
    	
    	
    	createInfoTable(nomDoc,format,varEvidencia,varElem);
          	
    	//Table 2
    	createDataTestTable(varTData);
    	
    	//Table Evidencia
    	
    	createEvidenciaTable(varEvidencia, v_name_imagen);
    	
    	//Table Elementos
    	createDataTestelement(varElem);
    	
    	
//    	//Declaramos el parrafo y le asignamos algunas propiedades
//    	XWPFParagraph parrafo = documento.createParagraph();
//    	parrafo.setAlignment(ParagraphAlignment.BOTH);
    	
    	try {
    		if(format.indexOf("-") > 0) {
    			format = format.replace("-", "");
    		}
    		if(format.indexOf("/") > 0) {
    			format = format.replace("/", "");
    		}
    		if(format.indexOf(":") > 0) {
    			format = format.replace(":", "");
    		}
    		if(format.indexOf(" ") > 0) {
    			format = format.replace(" ", "");
    		}
    	    FileOutputStream word = new FileOutputStream(nomDoc+"_"+format+".docx");
    	    documento.write(word);
    	    word.close();
    	   // Desktop.getDesktop().open(nomDoc+".docx");
    	} catch (FileNotFoundException ex) {
    	  //  Logger.getLogger(JF_Validar.class.getName()).log(Level.SEVERE, null, ex);
    	} catch (IOException ex) {
    	   // Logger.getLogger(JF_Validar.class.getName()).log(Level.SEVERE, null, ex);
    	}
    }
    
    
 //   private void CrearHeaderFoter(){
    	
//    	CTSectPr sectPr = documento.getDocument().getBody().addNewSectPr();
//		XWPFHeaderFooterPolicy policy = new XWPFHeaderFooterPolicy(documento, sectPr);
		

    	//write header content
//    	CTP ctpHeader = CTP.Factory.newInstance();
//    	CTR ctrHeader = ctpHeader.addNewR();
//    	CTPicture ctHeader = ctrHeader..addNewT();
//    	ctHeader.setStringValue("");
////    	
//    	XWPFParagraph headerParagraph = new XWPFParagraph(ctpHeader, documento);    	
//    	XWPFParagraph[] parsHeader = new XWPFParagraph[1];
//    	
//    	headerParagraph..getDocument().addPictureData(new FileInputStream(new File("http://www.bancoestado.cl/imagenes/_img/logo-banco-estado.jpg")), Document.PICTURE_TYPE_JPEG);
//    	documento.createPicture(blipId, documento.getNextPicNameNumber(Document.PICTURE_TYPE_JPEG), 200, 200);
//        
//    	parsHeader[0] = headerParagraph;
//    	policy.createHeader(XWPFHeaderFooterPolicy.DEFAULT, parsHeader);
    		    
    		    
    	//write footer content
//    	CTP ctpFooter = CTP.Factory.newInstance();
//    	CTR ctrFooter = ctpFooter.addNewR();
//    	CTText ctFooter = ctrFooter.addNewT();
//    	String footerText = "This is footer";
//    	ctFooter.setStringValue(footerText);	
//    	XWPFParagraph footerParagraph = new XWPFParagraph(ctpFooter, documento);
//    	XWPFParagraph[] parsFooter = new XWPFParagraph[1];
//    	parsFooter[0] = footerParagraph;
//    	policy.createFooter(XWPFHeaderFooterPolicy.DEFAULT, parsFooter);
//    }
    
    //INFORMACION DE LA 1RA TABLA
    private void createInfoTable(String nomDoc, String format, ArrayList<String> estado,ArrayList<String> elemens) {
    	 	
    	//Para la Tabla
    	XWPFParagraph TablaStyle = documento.createParagraph();
    	TablaStyle.setAlignment(ParagraphAlignment.CENTER);    	
    	XWPFTable tabla = documento.createTable();   	
    	
    	XWPFTableRow tableRowOne = tabla.getRow(0);
        tableRowOne.getCell(0).setText("Nombre del Caso");
        tableRowOne.addNewTableCell().setText(nomDoc);
        XWPFTableRow tableRowTwo = tabla.createRow();
        tableRowTwo.getCell(0).setText("Fecha de Ejecución");
        tableRowTwo.getCell(1).setText(format);
        XWPFTableRow tableRowThree = tabla.createRow();
        tableRowThree.getCell(0).setText("Estado de la Ejecución");
        String status = "Passed";
        for(String est : estado) {
        	if(est.contains("Fail")) {
        		status = "Failed";
        	}
        }
        for(String ele : elemens) {
        	if(ele.contains("Fail")) {
        		status = "Failed";
        	}
        }
        tableRowThree.getCell(1).setText(status);           
        
        CTTbl tablaS  = tabla.getCTTbl();
        CTTblPr pr = tablaS.getTblPr();
        CTTblWidth  tblW = pr.getTblW();
        tblW.setW(BigInteger.valueOf(5000));
        tblW.setType(STTblWidth.PCT);
        pr.setTblW(tblW);
        tablaS.setTblPr(pr);        
    }
    
    private void createDataTestTable(ArrayList<String> varTipo) {
    	    	   	
    	if(varTipo.size() != 0) {
    		
    		//Para el Titulo 2    	
        	XWPFParagraph subTitle = documento.createParagraph();
        	subTitle.setAlignment(ParagraphAlignment.LEFT);
        	XWPFRun r2 = subTitle.createRun();
        	r2.setBold(true);
        	r2.addBreak();
        	r2.setText("DATOS DE PRUEBA");
        	r2.setFontFamily("Calibri");
        	r2.setFontSize(16);
        	r2.setTextPosition(10);
        	r2.setUnderline(UnderlinePatterns.SINGLE);
        	
        	//Para la Tabla 
    		XWPFParagraph TablaStyle = documento.createParagraph();
        	TablaStyle.setAlignment(ParagraphAlignment.CENTER);    	
        	XWPFTable tabla = documento.createTable(); 
        	
        	for(int i = 0; i <= varTipo.size()-1; i++) {
        		if(i == 0) {
        			XWPFTableRow tableRowOne = tabla.getRow(0);
        			tableRowOne.getCell(0).setText(varTipo.get(i).substring(0, varTipo.get(i).length()-1));
        			tableRowOne.addNewTableCell().setText(varTipo.get(i+1).substring(0,varTipo.get(i+1).length()-1));
        		}else {
        			if(i % 2 == 0) {
        				XWPFTableRow tableRowTwo = tabla.createRow();
        				tableRowTwo.getCell(0).setText(varTipo.get(i).substring(0, varTipo.get(i).length()-1));
        				tableRowTwo.getCell(1).setText(varTipo.get(i+1).substring(0,varTipo.get(i+1).length()-1));
        			}
        			
        		}
        	}    	          
            
            CTTbl tablaS  = tabla.getCTTbl();
            CTTblPr pr = tablaS.getTblPr();
            CTTblWidth  tblW = pr.getTblW();
            tblW.setW(BigInteger.valueOf(5000));
            tblW.setType(STTblWidth.PCT);
            pr.setTblW(tblW);
            tablaS.setTblPr(pr);   
    	}    	     
    }
    
    private void createDataTestelement(ArrayList<String> varTipoElement) {
	   	
    	if(varTipoElement.size() != 0) {
    		
    		//Para el Titulo 2    	
        	XWPFParagraph subTitle = documento.createParagraph();
        	subTitle.setPageBreak(true);
        	subTitle.setAlignment(ParagraphAlignment.LEFT);
        	XWPFRun r2 = subTitle.createRun();
        	r2.setBold(true);
        	r2.addBreak();
        	r2.setText("Elementos de La Prueba");
        	r2.setFontFamily("Calibri");
        	r2.setFontSize(16);
        	r2.setTextPosition(10);
        	r2.setUnderline(UnderlinePatterns.SINGLE);
        	
        	//Para la Tabla 
    		XWPFParagraph TablaStyle = documento.createParagraph();
        	TablaStyle.setAlignment(ParagraphAlignment.CENTER);    	
        	XWPFTable tabla = documento.createTable(); 
        	
        	for(int i = 0; i <= varTipoElement.size()-1; i++) {
        		if(i == 0) {
        			XWPFTableRow tableRowOne = tabla.getRow(0);
        			tableRowOne.getCell(0).setText(varTipoElement.get(i).substring(0, varTipoElement.get(i).length()-1));
        			tableRowOne.addNewTableCell().setText(varTipoElement.get(i+1).substring(0,varTipoElement.get(i+1).length()-1));
        			tableRowOne.addNewTableCell().setText(varTipoElement.get(i+2).substring(0,varTipoElement.get(i+2).length()-1));
 
        		}else {
        			if(i % 3 == 0) {
        				XWPFTableRow tableRowTwo = tabla.createRow();
        				tableRowTwo.getCell(0).setText(varTipoElement.get(i).substring(0, varTipoElement.get(i).length()-1));
        				tableRowTwo.getCell(1).setText(varTipoElement.get(i+1).substring(0,varTipoElement.get(i+1).length()-1));
        				tableRowTwo.getCell(2).setText(varTipoElement.get(i+2).substring(0,varTipoElement.get(i+2).length()-1));
        			}
        			
        		}
        	}    	          
            
            CTTbl tablaS  = tabla.getCTTbl();
            CTTblPr pr = tablaS.getTblPr();
            CTTblWidth  tblW = pr.getTblW();
            tblW.setW(BigInteger.valueOf(5000));
            tblW.setType(STTblWidth.PCT);
            pr.setTblW(tblW);
            tablaS.setTblPr(pr);   
    	}    	     
    }
    
//    private void createDataBaseTable(ArrayList<String> varTipo) {
//    	    	   	    	
//    	System.out.println(varTipo.size());
//    	if(varTipo.size() != 0) {
//    		
//    		//Para el Titulo 3 BD    	
//        	XWPFParagraph subTitle = documento.createParagraph();
//        	subTitle.setAlignment(ParagraphAlignment.LEFT);
//        	XWPFRun r2 = subTitle.createRun();
//        	r2.setBold(true);
//        	r2.addBreak();
//        	r2.setText("INFORMACION QUERY");
//        	r2.setFontFamily("Calibri");
//        	r2.setFontSize(16);
//        	r2.setTextPosition(10);
//        	r2.setUnderline(UnderlinePatterns.SINGLE);
//        	
//        	//Para la Tabla
//    		XWPFParagraph TablaStyle = documento.createParagraph();
//        	TablaStyle.setAlignment(ParagraphAlignment.CENTER);    	
//        	XWPFTable tabla = documento.createTable(); 
//        	
//        	for(int i = 0; i <= varTipo.size()-1; i++) {
//        		if(i == 0) {
//        			XWPFTableRow tableRowOne = tabla.getRow(0);
//        			tableRowOne.getCell(0).setText(varTipo.get(i));
//        			tableRowOne.addNewTableCell().setText(varTipo.get(i+1));
//        		}else {
//        			if(i % 2 == 0) {
//        				XWPFTableRow tableRowTwo = tabla.createRow();
//        				tableRowTwo.getCell(0).setText(varTipo.get(i));
//        				tableRowTwo.getCell(1).setText(varTipo.get(i+1));
//        			}
//        			
//        		}
//        	}    	          
//            
//            CTTbl tablaS  = tabla.getCTTbl();
//            CTTblPr pr = tablaS.getTblPr();
//            CTTblWidth  tblW = pr.getTblW();
//            tblW.setW(BigInteger.valueOf(5000));
//            tblW.setType(STTblWidth.PCT);
//            pr.setTblW(tblW);
//            tablaS.setTblPr(pr);   
//    	}
//    	     
//    }

private void createEvidenciaTable(ArrayList<String> varTipo, String v_name_imagen) {
   	
	System.out.println(varTipo.size());
	if(varTipo.size() != 0) {

		//Para el Titulo 3 BD    	

		
    	XWPFParagraph subTitle = documento.createParagraph();
    	subTitle.setPageBreak(true);
    	subTitle.setAlignment(ParagraphAlignment.LEFT);
    	XWPFRun r2 = subTitle.createRun();
    	r2.setBold(true);
    	r2.addBreak();
    	r2.setText("EVIDENCIA FLUJO");
    	r2.setFontFamily("Calibri");
    	r2.setFontSize(16);
    	r2.setTextPosition(10);
    	r2.setUnderline(UnderlinePatterns.SINGLE);
    	
    	//Para la Tabla
		 
    	int cont = 1;
    	for(int i = 0; i <= varTipo.size()-1; i++) {
    		XWPFParagraph TablaStyle = documento.createParagraph();

    	    TablaStyle.setAlignment(ParagraphAlignment.CENTER);    	
    	    
    		if(i == 0) {
    			XWPFTable tabla = documento.createTable();    	    	
    			XWPFTableRow tableRowOne = tabla.getRow(0);
    			tableRowOne.getCell(0).setText(varTipo.get(i).substring(0, varTipo.get(i).length()-1));
    			tableRowOne.addNewTableCell().setText(varTipo.get(i+1).substring(0,varTipo.get(i+1).length()-1));
    			tableRowOne.addNewTableCell().setText(varTipo.get(i+2).substring(0,varTipo.get(i+2).length()-1));
    			
        		CTTbl tablaS  = tabla.getCTTbl();
                CTTblPr pr = tablaS.getTblPr();
                CTTblWidth  tblW = pr.getTblW();
                tblW.setW(BigInteger.valueOf(5000));
                tblW.setType(STTblWidth.PCT);
                pr.setTblW(tblW);
                tablaS.setTblPr(pr);
                
                XWPFParagraph imgStyle = documento.createParagraph();
                
                XWPFRun img = imgStyle.createRun();
                img.addBreak();
    	        InputStream pic;
    			try {
    				pic = new FileInputStream(prop.getProperty("d_ruta_informe")+v_name_imagen+cont+".png");
    				img.addPicture(pic, Document.PICTURE_TYPE_PNG, "1", Units.toEMU(400), Units.toEMU(200));
    				cont++;
    			} catch (FileNotFoundException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			} catch (InvalidFormatException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			} 
    		}else {
    			if(i % 3 == 0) {
    				XWPFTable tabla = documento.createTable();    		    	
    				XWPFTableRow tableRowOne = tabla.getRow(0);
        			tableRowOne.getCell(0).setText(varTipo.get(i).substring(0, varTipo.get(i).length()-1));
        			tableRowOne.addNewTableCell().setText(varTipo.get(i+1).substring(0,varTipo.get(i+1).length()-1));
        			tableRowOne.addNewTableCell().setText(varTipo.get(i+2).substring(0,varTipo.get(i+2).length()-1));
        			
            		CTTbl tablaS  = tabla.getCTTbl();
                    CTTblPr pr = tablaS.getTblPr();
                    CTTblWidth  tblW = pr.getTblW();
                    tblW.setW(BigInteger.valueOf(5000));
                    tblW.setType(STTblWidth.PCT);
                    pr.setTblW(tblW);
                    tablaS.setTblPr(pr);
                    
                    XWPFParagraph imgStyle = documento.createParagraph();
                    
                    XWPFRun img = imgStyle.createRun();
                    img.addBreak();
        	        InputStream pic;
        			try {
        				pic = new FileInputStream(prop.getProperty("d_ruta_informe")+v_name_imagen+cont+".png");
        				img.addPicture(pic, Document.PICTURE_TYPE_PNG, "1", Units.toEMU(400), Units.toEMU(200));
        				cont++;
        			} catch (FileNotFoundException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			} catch (InvalidFormatException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			} catch (IOException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			} 
    			}
    			    	        
    		}
    		
    	}    	          
        
          
	}
	     
}
}
