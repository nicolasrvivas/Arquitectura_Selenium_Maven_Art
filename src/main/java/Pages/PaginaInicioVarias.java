package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Util.Buscar_Elementos;

public class PaginaInicioVarias extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	@FindBy(xpath="//*[@id=\'imHeader_imObjectImage_01\']") 	WebElement e_logo2;
	@FindBy(className="imLoginSubmit")                          WebElement btnLogin;
	@FindBy(id="imHeader_imObjectImage_01")                     WebElement e_logo;
	@FindBy(id="imMnMnNode0")                                   WebElement e_link_pagina_inicio;
	@FindBy(id="imMnMnNode4")                                   WebElement e_link_compra_pasajes;
	@FindBy(id="imMnMnNode3")                                   WebElement e_link_informe_pago;
	@FindBy(id="imMnMnNode5")                                   WebElement e_link_editar_informe_pago;
	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public PaginaInicioVarias() {
		PageFactory.initElements(driver, this);
	}
	
	// ACCIONES PARA VALIDAR
	public String ValidacionPaginaInicioVarias() {
		return driver.getTitle();
	}
	

	public  void ValidaelementosPaginaInicio(){
		
		System.out.println("  Entro ValidaelementosPaginaInicio() - PaginaInicioVarias()");
		Buscar_Elementos.buscarelemntosweb();

	}

	public void login(String uss, String pwd){
	//	user.sendKeys(uss);
		//pass.sendKeys(pwd);

		btnLogin.click();
	}
	
}
