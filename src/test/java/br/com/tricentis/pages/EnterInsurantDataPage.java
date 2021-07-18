package br.com.tricentis.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantDataPage extends TricentisPage{
	
	Actions action = new Actions(driver);

	public EnterInsurantDataPage(WebDriver driver) {
		super(driver);
	}
	
	public EnterInsurantDataPage fillInFirstName(String firstName) {
		WebElement fieldFirstName = checkElementAvailability(By.id("firstname"));
		fieldFirstName.clear();
		fieldFirstName.sendKeys(firstName);
		return this;
	}
	
	public EnterInsurantDataPage fillInLastName(String lastName) {
		WebElement fieldLastName = checkElementAvailability(By.id("lastname"));
		fieldLastName.clear();
		fieldLastName.sendKeys(lastName);
		return this;
	}
	
	public EnterInsurantDataPage fillInDateOfBirth(String dateOfBirth) {
		WebElement fieldDateOfBirth = checkElementAvailability(By.id("birthdate"));
		fieldDateOfBirth.clear();
		fieldDateOfBirth.sendKeys(dateOfBirth);
		return this;
	}
	
	public EnterInsurantDataPage selectGender(String gender) {
		WebElement fieldGender;
		switch (gender.trim()) {
		case "Male":
			fieldGender = checkElementAvailability(By.id("gendermale"));			
			break;
		case "Female":
			fieldGender = checkElementAvailability(By.id("genderfemale"));
			break;
		default:
			throw new IllegalArgumentException("Invalid Gender option:" + gender);
		}
		action.moveToElement(fieldGender).click().perform();
		return this;
	}	
	
	public EnterInsurantDataPage fillInStreetAddress(String streetAddress) {
		WebElement fieldStreetAddress = checkElementAvailability(By.id("streetaddress"));
		fieldStreetAddress.clear();
		fieldStreetAddress.sendKeys(streetAddress);
		return this;
	}
	
	public EnterInsurantDataPage selectCountry(String country) {
		WebElement comboCountry = checkElementAvailability(By.id("country"));
		new Select(comboCountry).selectByVisibleText(country);
		return this;
	}
	
	public EnterInsurantDataPage fillInZipCode(String zipCode) {
		WebElement fieldZipCode = checkElementAvailability(By.id("zipcode"));
		fieldZipCode.clear();
		fieldZipCode.sendKeys(zipCode);
		return this;
	}
	
	public EnterInsurantDataPage fillInCity(String city) {
		WebElement fieldCity = checkElementAvailability(By.id("city"));
		fieldCity.clear();
		fieldCity.sendKeys(city);
		return this;
	}
	
	public EnterInsurantDataPage selectOccupation(String occupation) {
		WebElement comboOccupation = checkElementAvailability(By.id("occupation"));
		new Select(comboOccupation).selectByVisibleText(occupation);
		return this;
	}
	
	public EnterInsurantDataPage selectHobbies(String hobbies) {
		String[] hobbiesOptions = hobbies.split(",");
		for(int i = 0; i < hobbiesOptions.length; i++) {
			switch (hobbiesOptions[i].trim()) {
			case "Speeding":
				action.moveToElement(checkElementAvailability(By.id("speeding"))).click().perform();
				break;
			case "Bungee Jumping":
				action.moveToElement(checkElementAvailability(By.id("bungeejumping"))).click().perform();
				break;
			case "Cliff Diving":
				action.moveToElement(checkElementAvailability(By.id("cliffdiving"))).click().perform();
				break;
			case "Skydiving":
				action.moveToElement(checkElementAvailability(By.id("skydiving"))).click().perform();
				break;
			case "Other":
				action.moveToElement(checkElementAvailability(By.id("other"))).click().perform();
				break;
			default:
				throw new IllegalArgumentException("Invalid hobbies option:" + hobbiesOptions[i]);
			}
		}
		return this;
	}	

	public EnterInsurantDataPage fillInWebsite(String website) {
		WebElement fieldWebsite = checkElementAvailability(By.id("website"));
		fieldWebsite.clear();
		fieldWebsite.sendKeys(website);
		return this;
	}
	
	public EnterInsurantDataPage selectPicture(String pathToPicture) throws AWTException {
		copyToClipboard(pathToPicture);
		checkElementAvailability(By.id("open")).click();;
		Robot robot = new Robot();
		robot.delay(1500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		return this;
	}
	
	public EnterProductData clickOnNextEnterInsurantDataButton() {
		checkElementAvailability(By.id("nextenterproductdata")).click();
		return new EnterProductData(driver);
	}
	
	public boolean verifyThatEnterInsurantDataTabIsSelected() {
		WebElement tabEnterInsurantData = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[2]"));
		String attributeValue = tabEnterInsurantData.getAttribute("class");
		if(attributeValue.equals("idealsteps-step-active")) {
			return true;
		}
		return false;
	}
}
