package br.com.tricentis.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleDataPage extends TricentisPage{
	
	Actions action = new Actions(driver);
	
	public EnterVehicleDataPage(WebDriver driver) {
		super(driver);
	}
	
	public EnterVehicleDataPage selectMake(String make) {
		WebElement comboMake = checkElementAvailability(By.id("make"));
		new Select(comboMake).selectByVisibleText(make);
		return this;
	}
	
	public EnterVehicleDataPage fillInEnginePerformance(String enginePerformance) {
		WebElement fieldEnginePerformance = checkElementAvailability(By.id("engineperformance"));
		fieldEnginePerformance.clear();
		fieldEnginePerformance.sendKeys(enginePerformance);
		return this;
	}
	
	public EnterVehicleDataPage fillInDateOfManufacture(String dateOfManufacture) {
		WebElement fieldDateOfManufacture = checkElementAvailability(By.id("dateofmanufacture"));
		fieldDateOfManufacture.clear();
		fieldDateOfManufacture.sendKeys(dateOfManufacture);
		return this;
	}
	
	public EnterVehicleDataPage selectNumberOfSeats(String numberOfSeats) {
		String selectedInsuranceType = checkSelectedInsurance();
		WebElement comboNumberOfSeats;
		if(selectedInsuranceType.equals("Motorcycle Insurance")) {
			comboNumberOfSeats = checkElementAvailability(By.id("numberofseatsmotorcycle"));
		}else {
			comboNumberOfSeats = checkElementAvailability(By.id("numberofseats"));
		}
		new Select(comboNumberOfSeats).selectByVisibleText(numberOfSeats);
		return this;
	}
	
	public EnterVehicleDataPage selectFuelType(String fuelType) {
		WebElement comboFuelType = checkElementAvailability(By.id("fuel"));
		new Select(comboFuelType).selectByVisibleText(fuelType);
		return this;
	}
	
	public EnterVehicleDataPage fillInListPrice(String listPrice) {
		WebElement fieldListPrice = checkElementAvailability(By.id("listprice"));
		fieldListPrice.clear();
		fieldListPrice.sendKeys(listPrice);
		return this;
	}
		
	public EnterVehicleDataPage fillInLicensePlateNumber(String licensePlateNumber) {
		WebElement fieldLicensePlateNumber = checkElementAvailability(By.id("licenseplatenumber"));
		fieldLicensePlateNumber.clear();
		fieldLicensePlateNumber.sendKeys(licensePlateNumber);
		return this;
	}
	
	public EnterVehicleDataPage fillInAnnualMileage(String annualMileage) {
		WebElement fieldAnnualMileage = checkElementAvailability(By.id("annualmileage"));
		fieldAnnualMileage.clear();
		fieldAnnualMileage.sendKeys(annualMileage);
		return this;
	}
	
	public EnterVehicleDataPage fillInPayload(String payload) {
		WebElement fieldPayload = checkElementAvailability(By.id("payload"));
		fieldPayload.clear();
		fieldPayload.sendKeys(payload);
		return this;
	}
	
	public EnterVehicleDataPage fillInTotalWeight(String totalWeight) {
		WebElement fieldTotalWeight = checkElementAvailability(By.id("totalweight"));
		fieldTotalWeight.clear();
		fieldTotalWeight.sendKeys(totalWeight);
		return this;
	}
	
	public EnterVehicleDataPage selectModel(String model) {
		WebElement comboModel = checkElementAvailability(By.id("model"));
		new Select(comboModel).selectByVisibleText(model);
		return this;
	}
	
	public EnterVehicleDataPage fillInCylinderCapacity(String cylinderCapacity) {
		WebElement fieldCylinderCapacity = checkElementAvailability(By.id("cylindercapacity"));
		fieldCylinderCapacity.clear();
		fieldCylinderCapacity.sendKeys(cylinderCapacity);
		return this;
	}
	
	public EnterVehicleDataPage selectRightHandDrive(String rightHandDrive) {
		WebElement rightHandDriveOption;
		switch (rightHandDrive.trim()) {
		case "Yes":
			rightHandDriveOption = checkElementAvailability(By.id("righthanddriveyes"));
			break;
		case "No":
			rightHandDriveOption = checkElementAvailability(By.id("righthanddriveno"));
			break;
		default:
			throw new IllegalArgumentException("Invalid Right Hand Drive option:" + rightHandDrive);
		}		
		action.moveToElement(rightHandDriveOption).click().perform();
		return this;
	}	
	
	public EnterInsurantDataPage clickOnNextEnterVehicleDataButton() {
		checkElementAvailability(By.id("nextenterinsurantdata")).click();
		return new EnterInsurantDataPage(driver);
	}

	public boolean verifyThatEnterVehicleDataTabIsSelected() {
		WebElement tabEnterVehicleData = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[1]"));
		String attributeValue = tabEnterVehicleData.getAttribute("class");
		if(attributeValue.equals("idealsteps-step-active")) {
			return true;
		}
		return false;
	}
	
}
