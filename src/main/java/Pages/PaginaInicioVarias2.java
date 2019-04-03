package Pages;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base.TestBase;

public class PaginaInicioVarias2 extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	@FindBy(xpath="//*[@id=\"Ventana\"]/form[1]/table[2]/tbody/tr/td[2]/select") 	WebElement e_direccion;

	@FindBy(xpath="//*[@id=\"Ventana\"]/form[1]/table[2]/tbody/tr/td[4]/select")  	WebElement e_contacto;

	@FindBy(xpath="//*[@id=\"datosbase\"]/table[1]/caption")						WebElement e_datosbase_label;
	
	@FindBy(xpath="//*[@id=\"lblEjecutivo\"]")										WebElement e_lblEjecutivo;
	
	@FindBy(xpath="//*[@id=\"vObjTblDatCta\"]/tbody/tr[3]/td[2]/select")			WebElement e_area;
	
	@FindBy(xpath="//*[@id=\"FilaSubPrd\"]/td[2]/select")							WebElement e_SubPrd;
	
	@FindBy(xpath="//*[@id=\"vObjTblDatCta\"]/tbody/tr[3]/td[4]/select")			WebElement e_garantia;
	
	@FindBy(xpath="//*[@id=\"vObjTblDatCta\"]/tbody/tr[2]/td[3]/a/u")				WebElement e_cambio_ejec ;
	
	@FindBy(xpath="//*[@id=\"datosbase\"]/table[4]/tbody/tr/td[2]/select")			WebElement e_Tipotalonario;
	
	@FindBy(xpath="//*[@id=\"datosbase\"]/table[4]/tbody/tr/td[4]/input")			WebElement e_numtalonario;
	
	@FindBy(xpath="//*[@id=\"datosbase\"]/table[6]/tbody/tr/td[2]/input")			WebElement e_linea;
	
	@FindBy(xpath="//*[@id=\"datosbase\"]/table[9]/tbody/tr/td[4]/select")			WebElement e_correo;
	
	@FindBy(xpath="//*[@id=\"datosbase\"]/table[11]/tbody/tr/td[5]/input")			WebElement e_SolLinCre;
	
	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public PaginaInicioVarias2() {
		PageFactory.initElements(driver, this);
	}
	
	// ACCIONES PARA VALIDAR
	public String ValidacionPaginaInicioVarias2() {
		return driver.getTitle();
	}
	
	
	public  ArrayList<String> ValidaelementosPaginaInicioVarias2(ArrayList<String> arr_elem2) throws InterruptedException{

		int cont_elem_fall=0;
		System.out.println("------->>   cont_elem_fall   <<--------"+cont_elem_fall);
		
		String v_pag = "PaginaInicio";
		System.out.println("------->>   v_pag   <<--------"+v_pag);
		v_desc_elem = "e_direccion";
		locator = By.xpath("CliHdrDireccion");
	//	arr_elem2 = waitForElementPresent2 (locator, e_direccion,  10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem, arr_elem2);
		
		v_desc_elem = "e_contacto";
		locator = By.xpath("\"//*[@id=\"Ventana\"]/form[1]/table[2]/tbody/tr/td[4]/select\"");
	//	e_direccion = waitForElementPresent (locator,  10, v_pag, v_cargo_exito, v_no_cargo_exito, v_desc_elem);
		
		if(e_direccion==null)			{  cont_elem_fall++; }
		if(e_contacto==null)			{  cont_elem_fall++; }
		if(e_datosbase_label==null)		{  cont_elem_fall++; }
		if(e_lblEjecutivo==null)		{  cont_elem_fall++; }
		if(e_area==null)				{  cont_elem_fall++; }
		if(e_SubPrd==null)				{  cont_elem_fall++; }
		if(e_garantia==null)			{  cont_elem_fall++; }
		if(e_cambio_ejec==null)	    	{  cont_elem_fall++; }
		if(e_Tipotalonario==null)		{  cont_elem_fall++; }
		if(e_numtalonario==null)		{  cont_elem_fall++; }
		if(e_linea==null)				{  cont_elem_fall++; }
		if(e_correo==null)				{  cont_elem_fall++; }
		if(e_SolLinCre==null)			{  cont_elem_fall++; }

		WebElement elemente = driver.findElement(By.xpath("//*[@id=\"CmdAceptar\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", elemente); 
		
		 if(elemente!=null){
			 System.out.println("------->>   Encontró el elemente  <<--------");
			 
			}else {
				System.out.println("------->>   No Encontró el elemente  <<--------");
			}

		 Actions hover=new Actions(driver);
		 hover.moveToElement(driver.findElement(By.xpath("id('background-experience')/div[1]/div/button[1]"))).perform();
		 driver.findElement(By.xpath("id('background-experience')/div[1]/div/button[1]")).click();
		 Thread.sleep(5000);
		 
//		 Actions hover2=new Actions(driver); hover.moveToElement(driver.findElement(By.xpath("id('background-experience')/div[1]/div/button[1]"))).click().perform(); Thread.sleep(5000); 

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("window.scrollBy(0,600)", ""); 
		
		return arr_elem2;

	}

	public void login(String v_numtalonario){
		e_numtalonario.sendKeys(v_numtalonario);

	}
}
