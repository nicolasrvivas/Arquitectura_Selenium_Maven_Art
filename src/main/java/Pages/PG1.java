package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {

	public static void main(String[] args) {
		System.setProperty("\"webdriver.chrome.driver","C:/driverSelenium/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://www.qanovagroup.com/piloto/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
			} else {
			System.out.println("Test Failed");
			}
			//Cerrar firefox
//			driver.close();
		
	}
}
