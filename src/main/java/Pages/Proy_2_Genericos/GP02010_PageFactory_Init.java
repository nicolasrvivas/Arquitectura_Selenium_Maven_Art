package Pages.Proy_2_Genericos;


import org.openqa.selenium.support.PageFactory;
import Base.TestBase;

public class GP02010_PageFactory_Init extends TestBase {

	
	// INICIALIZA LOS OBJETOS OBTENIDOS DESDE LA CLASE HEREDADA
	public GP02010_PageFactory_Init() {
		PageFactory.initElements(driver, this);
	}
	

	
}
