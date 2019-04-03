package Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Captura_Pantalla {


    /* -------------------------- */
    /*    Capture de Pantalla     */
    /* -------------------------- */
    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);   
	
    }
    
    /* ---------------------------------------------------------- */
    /*    Capture de Pantalla  y generar archivo de evuidencia    */
    /* ---------------------------------------------------------- */
    public static void takeScreenShotTest(WebDriver driverimage, String imageName) {
        //Directorio donde quedaran las imagenes guardadas
        File directory = new File(System.getProperty("user.dir")+"\\src\\Imagenes");
        //System.out.println("   directorio"+System.getProperty("user.dir")+"\\src\\Imagenes"+"   Imagen validada --->>   "+imageName);
        try {
           if (directory.isDirectory()) {
              //Toma la captura de imagen
              File imagen = ((TakesScreenshot) driverimage).getScreenshotAs(OutputType.FILE);
              //Mueve el archivo a la carga especificada con el respectivo nombre
              FileUtils.copyFile(imagen, new File("d:\\" + imageName + ".png"));
           } else {
              //Se lanza la excepcion cuando no encuentre el directorio
              throw new IOException("ERROR : La ruta especificada no es un directorio!");
           }
        } catch (IOException e) {
           //Impresion de Excepciones
           e.printStackTrace();
        }
     }
    
    

}
