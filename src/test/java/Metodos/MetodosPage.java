package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosPage {
	WebDriver driver;
	public void abrirNavegador (String Url) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get(Url);
		
	}
	
	public void clicar (By elemento) {
		driver.findElement(elemento).click();
		
	}
	
	public void preencher (By elemento, String valor) {
		WebElement campo = driver.findElement(elemento);
		campo.sendKeys(valor);
	}
	
	public void fecharPagina () {
		driver.quit();
	}
}


