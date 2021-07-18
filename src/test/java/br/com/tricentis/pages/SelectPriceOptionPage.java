package br.com.tricentis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectPriceOptionPage extends TricentisPage{
	
	Actions action = new Actions(driver);

	public SelectPriceOptionPage(WebDriver driver) {
		super(driver);
	}
	
	public SelectPriceOptionPage selectPriceOption(String priceOption) {
		WebElement radioPriceOption;
		switch (priceOption.trim()) {
		case "Silver":
			radioPriceOption = checkElementAvailability(By.id("selectsilver"));
			break;
		case "Gold":
			radioPriceOption = checkElementAvailability(By.id("selectgold"));
			break;
		case "Platinum":
			radioPriceOption = checkElementAvailability(By.id("selectplatinum"));
			break;
		case "Ultimate":
			radioPriceOption = checkElementAvailability(By.id("selectultimate"));
			break;
		default:
			throw new IllegalArgumentException("Invalid price option:" + priceOption);
		}
		action.moveToElement(radioPriceOption).click().perform();
		return this;
	}
	
	public SendQuotePage clickOnNextSelectPriceOptionButton() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nextsendquote")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("nextsendquote")));
		driver.findElement(By.id("nextsendquote")).click();		
		return new SendQuotePage(driver);
	}
	
	public boolean verifyThatSelectPriceOptionTabIsSelected() {
		WebElement tabSelectPriceOption = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[4]"));
		String attributeValue = tabSelectPriceOption.getAttribute("class");
		if(attributeValue.equals("idealsteps-step-active")) {
			return true;
		}
		return false;
	}

}
