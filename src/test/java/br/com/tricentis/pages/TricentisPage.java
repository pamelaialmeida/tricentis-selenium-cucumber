package br.com.tricentis.pages;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TricentisPage {
	
	protected WebDriver driver;
		
	public TricentisPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTricentisPageURL() {		
		return driver.getCurrentUrl();
	}
	
	public String getTricentisPageTitle() {
		return driver.findElement(By.id("app_sub_title")).getText();
	}
		
	public WebElement checkElementAvailability(By locator) {
		WebElement element = driver.findElement(locator);
		if(element.isDisplayed() && element.isEnabled()) {
			return element;
		}else {
			throw new NoSuchElementException("Element not found");
		}		
	}
	
	public String checkSelectedInsurance() {				
		WebElement selectedInsurance = driver.findElement(By.id("selectedinsurance"));		
		return selectedInsurance.getText();
	}
	
	public void copyToClipboard(String valueToCopy) {
		StringSelection value = new StringSelection(valueToCopy);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(value, null);
	}
		
	public EnterVehicleDataPage selectInsurance(String insuranceOption) {	
		switch (insuranceOption.trim()) {
		case "Automobile":
			checkElementAvailability(By.id("nav_automobile")).click();
			break;
		case "Truck":
			checkElementAvailability(By.id("nav_truck")).click();
			break;
		case "Motorcycle":
			checkElementAvailability(By.id("nav_motorcycle")).click();
			break;
		case "Camper":
			checkElementAvailability(By.id("nav_camper")).click();
			break;
		default:
			throw new IllegalArgumentException("Invalid insurance option:" + insuranceOption);
		}
		return new EnterVehicleDataPage(driver);
	}

}
