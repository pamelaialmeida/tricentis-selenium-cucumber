package br.com.tricentis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EnterProductData extends TricentisPage {
	
	Actions action = new Actions(driver);

	public EnterProductData(WebDriver driver) {
		super(driver);
	}
	
	public EnterProductData fillInStartDate(String startDate) {
		WebElement fieldStartDate = checkElementAvailability(By.id("startdate"));
		fieldStartDate.clear();
		fieldStartDate.sendKeys(startDate);
		return this;
	}
	
	public EnterProductData selectInsuranceSum(String insuranceSum) {
		WebElement comboInsuranceSum = checkElementAvailability(By.id("insurancesum"));
		new Select(comboInsuranceSum).selectByVisibleText(insuranceSum);
		return this;
	}
	
	public EnterProductData selectMeritRating(String meritRating) {
		WebElement comboMeritRating = checkElementAvailability(By.id("meritrating"));
		new Select(comboMeritRating).selectByVisibleText(meritRating);
		return this;
	}
	
	public EnterProductData selectDamageInsurance(String damageInsurance) {
		WebElement comboDamageInsurance = checkElementAvailability(By.id("damageinsurance"));
		new Select(comboDamageInsurance).selectByVisibleText(damageInsurance);
		return this;
	}
	
	public EnterProductData selectOptionalProducts(String optionalProducts) {
		String[] optionalProductsOptions = optionalProducts.split(",");
		for(int i = 0; i < optionalProductsOptions.length; i++) {
			switch (optionalProductsOptions[i].trim()) {
			case "Euro Protection":
				action.moveToElement(checkElementAvailability(By.id("EuroProtection"))).click().perform();
				break;
			case "Legal Defense Insurance":
				action.moveToElement(checkElementAvailability(By.id("LegalDefenseInsurance"))).click().perform();
				break;
			default:
				throw new IllegalArgumentException("Invalid optional products option:" + optionalProductsOptions[i]);
			}
		}		
		return this;
	}
	
	public EnterProductData selectCourtesyCar(String courtesyCar) {
		WebElement comboCourtesyCar = checkElementAvailability(By.id("courtesycar"));
		new Select(comboCourtesyCar).selectByVisibleText(courtesyCar);
		return this;
	}
	
	public SelectPriceOptionPage clickOnNextEnterProductDataButton() {
		checkElementAvailability(By.id("nextselectpriceoption")).click();
		return new SelectPriceOptionPage(driver);
	}
	
	public boolean verifyThatEnterProductDataTabIsSelected() {
		WebElement tabEnterProductData = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[3]"));
		String attributeValue = tabEnterProductData.getAttribute("class");
		if(attributeValue.equals("idealsteps-step-active")) {
			return true;
		}
		return false;
	}

}
