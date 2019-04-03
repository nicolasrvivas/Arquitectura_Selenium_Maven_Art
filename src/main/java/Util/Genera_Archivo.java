package Util;

import java.io.File;
import java.io.FileWriter;

import Base.TestBase;

public class Genera_Archivo extends TestBase  {
	
	public static void Escribir_Archivos(String Archivo_Imprime, String Nombre_Archivo_Imprime){

	try
	{
		//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
		File archivo=new File(prop.getProperty("d_ruta_informe")+Nombre_Archivo_Imprime);
	
		//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
		FileWriter escribir=new FileWriter(archivo,true);
	
		//Escribimos en el archivo con el metodo write 
		escribir.write(Archivo_Imprime);
	
		//Cerramos la conexion
		escribir.close();
	}

		//Si existe un problema al escribir cae aqui
		catch(Exception e)
		{
		System.out.println("  <<<--- Error al escribir el archivo --->> "+prop.getProperty("d_ruta_informe")+Nombre_Archivo_Imprime);
		}
		
		/* =============================================================================== */
    
	}

}
