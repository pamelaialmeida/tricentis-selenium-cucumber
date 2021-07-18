package br.com.tricentis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuotePage extends TricentisPage{

	public SendQuotePage(WebDriver driver) {
		super(driver);
	}
	
	public SendQuotePage fillInEmail(String email) {
		WebElement fieldEmail = checkElementAvailability(By.id("email"));
		fieldEmail.clear();
		fieldEmail.sendKeys(email);
		return this;
	}
	
	public SendQuotePage fillInPhone(String phone) {
		WebElement fieldPhone = checkElementAvailability(By.id("phone"));
		fieldPhone.clear();
		fieldPhone.sendKeys(phone);
		return this;
	}
	
	public SendQuotePage fillInUsername(String username) {
		WebElement fieldUsername = checkElementAvailability(By.id("username"));
		fieldUsername.clear();
		fieldUsername.sendKeys(username);
		return this;
	}
	
	public SendQuotePage fillInPassword(String password) {
		WebElement fieldPassword = checkElementAvailability(By.id("password"));
		fieldPassword.clear();
		fieldPassword.sendKeys(password);
		return this;
	}
	
	public SendQuotePage fillInConfirmPassword(String confirmPassword) {
		WebElement fieldConfirmPassword = checkElementAvailability(By.id("confirmpassword"));
		fieldConfirmPassword.clear();
		fieldConfirmPassword.sendKeys(confirmPassword);
		return this;
	}
	
	public SendQuotePage fillInComments(String comments) {
		WebElement fieldComments = checkElementAvailability(By.id("Comments"));
		fieldComments.clear();
		fieldComments.sendKeys(comments);
		return this;
	}
	
	public void clickOnSendButton() {
		checkElementAvailability(By.id("sendemail")).click();
	}
	
	public String getSuccessMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/h2")));
		WebElement successMessage = driver.findElement(By.xpath("/html/body/div[4]/h2"));
		return successMessage.getText();
	}
	
	public boolean verifyThatSendQuoteTabIsSelected() {
		WebElement tabSendQuote = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[5]"));
		String attributeValue = tabSendQuote.getAttribute("class");
		if(attributeValue.equals("idealsteps-step-active")) {
			return true;
		}
		return false;
	}

}
