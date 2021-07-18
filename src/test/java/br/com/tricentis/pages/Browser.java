package br.com.tricentis.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	private WebDriver driver;
	
	public WebDriver createDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\eclipse-workspace\\SampleAppTricentis\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;		
	}
	

}
