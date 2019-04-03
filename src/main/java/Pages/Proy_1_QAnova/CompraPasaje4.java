package Pages.Proy_1_QAnova;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CompraPasaje4 extends TestBase {

	//DECLARACIONES DE LOS OBJETOS 
	@FindBy(css="#imMnMnNode5 ")
	WebElement bnt_informepago;
	

	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public CompraPasaje4() {
		PageFactory.initElements(driver, this);
	}
	
	// ACCIONES PARA VALIDAR
	public String ValidacionCompraPasaje4() {
		esperarSegundos(driver, 3);
		return driver.getTitle();
	}
	   
	public String  cambiopagina(){
		bnt_informepago.click();
		return "-->>   Cambio a la Pagina --->>>   Editar Informe de Pago  <<---";
	}
}
