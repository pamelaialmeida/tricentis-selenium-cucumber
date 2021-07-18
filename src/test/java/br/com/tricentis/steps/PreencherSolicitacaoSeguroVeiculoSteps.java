package br.com.tricentis.steps;

import java.awt.AWTException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import br.com.tricentis.pages.Browser;
import br.com.tricentis.pages.EnterInsurantDataPage;
import br.com.tricentis.pages.EnterProductData;
import br.com.tricentis.pages.EnterVehicleDataPage;
import br.com.tricentis.pages.SelectPriceOptionPage;
import br.com.tricentis.pages.SendQuotePage;
import br.com.tricentis.pages.TricentisPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PreencherSolicitacaoSeguroVeiculoSteps {
	
	private WebDriver driver;
	private TricentisPage tricentisPage;
	private EnterVehicleDataPage enterVehicleDataPage;
	private EnterInsurantDataPage enterInsurantDataPage;
	private EnterProductData enterProductData;
	private SelectPriceOptionPage selectPriceOptionPage;
	private SendQuotePage sendQuotePage;
	
	@Before
	public void setUp() {
		driver = new Browser().createDriver();
	}
	
	@Dado("que estou na pagina de solicitacao de seguro de veiculos")
	public void que_estou_na_pagina_de_solicitacao_de_seguro_de_veiculos() {
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
	}
	
	@Quando("seleciono a opcao de seguro {string}")
	public void seleciono_a_opcao_de_seguro(String insuranceOption) {
		tricentisPage = new TricentisPage(driver);
		enterVehicleDataPage = tricentisPage.selectInsurance(insuranceOption);
	}
	
	@Entao("a aba Enter Vehicle Data eh apresentada para a opcao de seguro {string}")
	public void a_aba_enter_vehicle_data_eh_apresentada_para_a_opcao_de_seguro(String selectedInsuranceOption) {
		Assert.assertEquals(selectedInsuranceOption + " Insurance", enterVehicleDataPage.checkSelectedInsurance());
		Assert.assertTrue(enterVehicleDataPage.verifyThatEnterVehicleDataTabIsSelected());
	}
	
	@Quando("preencho o campo Make com o valor {string}")
	public void preencho_o_campo_make_com_o_valor(String make) {
		enterVehicleDataPage.selectMake(make);
	}
	
	@Quando("preencho o campo Model com o valor {string}")
	public void preencho_o_campo_model_com_o_valor(String model) {
		enterVehicleDataPage.selectModel(model);
	}
	@Quando("preencho o campo Cylinder Capacity com o valor {string}")
	public void preencho_o_campo_cylinder_capacity_com_o_valor(String cylinderCapacity) {
		enterVehicleDataPage.fillInCylinderCapacity(cylinderCapacity);
	}
	
	@Quando("preencho o campo Engine Performance com o valor {string}")
	public void preencho_o_campo_engine_performance_com_o_valor(String enginePerformance) {
		enterVehicleDataPage.fillInEnginePerformance(enginePerformance);
	}
	
	@Quando("preencho o campo  Date of Manufacture com o valor {string} no formato MM\\/dd\\/yyyy")
	public void preencho_o_campo_date_of_manufacture_com_o_valor_no_formato_mm_dd_yyyy(String dateOfManufacture) {
		enterVehicleDataPage.fillInDateOfManufacture(dateOfManufacture);
	}
	
	@Quando("preencho o campo Number of Seats com o valor {string}")
	public void preencho_o_campo_number_of_seats_com_o_valor(String numberOfSeats) {
		enterVehicleDataPage.selectNumberOfSeats(numberOfSeats);
	}
	
	@Quando("preencho o campo Right Hand Drive com o valor {string}")
	public void preencho_o_campo_right_hand_drive_com_o_valor(String rightHandDrive) {
		enterVehicleDataPage.selectRightHandDrive(rightHandDrive);
	}
	
	@Quando("preencho o campo Fuel Type com o valor {string}")
	public void preencho_o_campo_fuel_type_com_o_valor(String fuelType) {
		enterVehicleDataPage.selectFuelType(fuelType);
	}
	
	@Quando("preencho o campo Payload com o valor {string}")
	public void preencho_o_campo_payload_com_o_valor(String payload) {
		enterVehicleDataPage.fillInPayload(payload);
	}
	
	@Quando("preencho o campo Total Weight com o valor {string}")
	public void preencho_o_campo_total_weight_com_o_valor(String totalWeight) {
		enterVehicleDataPage.fillInTotalWeight(totalWeight);
	}
	
	@Quando("preencho o campo List Price com o valor {string}")
	public void preencho_o_campo_list_price_com_o_valor(String listPrice) {
		enterVehicleDataPage.fillInListPrice(listPrice);
	}
	
	@Quando("preencho o campo License Plate Number com o valor {string}")
	public void preencho_o_campo_license_plate_number_com_o_valor(String licensePlateNumber) {
		enterVehicleDataPage.fillInLicensePlateNumber(licensePlateNumber);
	}
	
	@Quando("preencho o campo Annual Mileage com o valor {string}")
	public void preencho_o_campo_annual_mileage_com_o_valor(String annualMileage) {
		enterVehicleDataPage.fillInAnnualMileage(annualMileage);
	}
	
	@Quando("clico no botao Next da aba Enter Vehicle Data")
	public void clico_no_botao_next_da_aba_enter_vehicle_data() {
		enterInsurantDataPage = enterVehicleDataPage.clickOnNextEnterVehicleDataButton();
	}
	
	@Entao("a aba Enter Insurant Data eh apresentada")
	public void a_aba_enter_insurant_data_eh_apresentada() {
		Assert.assertTrue(enterInsurantDataPage.verifyThatEnterInsurantDataTabIsSelected());
	}
	
	@Quando("estou na aba Enter Insurant Data")
	public void estou_na_aba_enter_insurant_data() {
		Assert.assertTrue(enterInsurantDataPage.verifyThatEnterInsurantDataTabIsSelected());
	}
	
	@Quando("preencho o campo First Name com o valor {string}")
	public void preencho_o_campo_first_name_com_o_valor(String firstName) {
		enterInsurantDataPage.fillInFirstName(firstName);
	}
	
	@Quando("preencho o campo Last Name com o valor {string}")
	public void preencho_o_campo_last_name_com_o_valor(String lastName) {
		enterInsurantDataPage.fillInLastName(lastName);
	}
	
	@Quando("preencho o campo Birth Date com o valor {string} no formato MM\\/dd\\/yyyy")
	public void preencho_o_campo_birth_date_com_o_valor_no_formato_mm_dd_yyyy(String dateOfBirth) {
		enterInsurantDataPage.fillInDateOfBirth(dateOfBirth);
	}
	
	@Quando("seleciono no campo gender o valor {string}")
	public void seleciono_no_campo_gender_o_valor(String gender) {
		enterInsurantDataPage.selectGender(gender);
	}
	
	@Quando("preencho o campo Street Address com o valor {string}")
	public void preencho_o_campo_street_address_com_o_valor(String streetAddress) {
		enterInsurantDataPage.fillInStreetAddress(streetAddress);
	}
	
	@Quando("seleciono no campo country o valor {string}")
	public void seleciono_no_campo_country_o_valor(String country) {
		enterInsurantDataPage.selectCountry(country);
	}
	
	@Quando("preencho o campo zipcode com o valor {string}")
	public void preencho_o_campo_zipcode_com_o_valor(String zipCode) {
		enterInsurantDataPage.fillInZipCode(zipCode);
	}
	
	@Quando("preencho o campo city com o valor {string}")
	public void preencho_o_campo_city_com_o_valor(String city) {
		enterInsurantDataPage.fillInCity(city);
	}
	
	@Quando("seleciono no campo occupation o valor {string}")
	public void seleciono_no_campo_occupation_o_valor(String occupation) {
		enterInsurantDataPage.selectOccupation(occupation);
	}
	
	@Quando("seleciono no campo hobbies os valores {string}")
	public void seleciono_no_campo_hobbies_os_valores(String hobbies) {
		enterInsurantDataPage.selectHobbies(hobbies);		
	}
	
	@Quando("preencho o campo website com o valor {string}")
	public void preencho_o_campo_website_com_o_valor(String website) {
		enterInsurantDataPage.fillInWebsite(website);
	}
	
	@Quando("seleciono a foto {string} para envio")
	public void seleciono_a_foto_para_envio(String picture) throws AWTException {
		String pathToPicture = "D:\\Eclipse\\eclipse-workspace\\SampleAppTricentis\\fotos\\" + picture;
		enterInsurantDataPage.selectPicture(pathToPicture);
	}
	
	@Quando("clico no botao Next da aba Enter Insurant Data")
	public void clico_no_botao_next_da_aba_enter_insurant_data() {
		enterProductData = enterInsurantDataPage.clickOnNextEnterInsurantDataButton();
	}
	
	@Entao("a aba Enter Product Data eh apresentada")
	public void a_aba_enter_product_data_eh_apresentada() {
		Assert.assertTrue(enterProductData.verifyThatEnterProductDataTabIsSelected());
	}
	
	@Quando("estou na aba Enter Product Data")
	public void estou_na_aba_enter_product_data() {
		Assert.assertTrue(enterProductData.verifyThatEnterProductDataTabIsSelected());
	}
	
	@Quando("preencho o campo Start Date com o valor {string} no formato MM\\/dd\\/yyyy")
	public void preencho_o_campo_start_date_com_o_valor_no_formato_mm_dd_yyyy(String startDate) {
		enterProductData.fillInStartDate(startDate);
	}
	
	@Quando("seleciono no campo Insurance Sum o valor {string}")
	public void seleciono_no_campo_insurance_sum_o_valor(String insuranceSum) {
		enterProductData.selectInsuranceSum(insuranceSum);
	}
	
	@Quando("seleciono no campo Merit Rating o valor {string}")
	public void seleciono_no_campo_merit_rating_o_valor(String meritRating) {
		enterProductData.selectMeritRating(meritRating);
	}
	
	@Quando("seleciono no campo Damage Insurance o valor {string}")
	public void seleciono_no_campo_damage_insurance_o_valor(String damageInsurance) {
		enterProductData.selectDamageInsurance(damageInsurance);
	}
	
	@Quando("seleciono no campo Optional Products os valores {string}")
	public void seleciono_no_campo_optional_products_os_valores(String optionalProducts) {
		enterProductData.selectOptionalProducts(optionalProducts);
	}
	
	@Quando("seleciono no campo Courtesy Car o valor {string}")
	public void seleciono_no_campo_courtesy_car_o_valor(String courtesyCar) {
		enterProductData.selectCourtesyCar(courtesyCar);
	}
	
	@Quando("clico no botao Next da aba Enter Product Data")
	public void clico_no_botao_next_da_aba_enter_product_data() {
		selectPriceOptionPage = enterProductData.clickOnNextEnterProductDataButton();
	}
	
	@Entao("a aba Select Price Option eh apresentada")
	public void a_aba_select_price_option_eh_apresentada() {
		Assert.assertTrue(selectPriceOptionPage.verifyThatSelectPriceOptionTabIsSelected());
	}
	
	@Quando("estou na aba Select Price Option")
	public void estou_na_aba_select_price_option() {
		Assert.assertTrue(selectPriceOptionPage.verifyThatSelectPriceOptionTabIsSelected());
	}
	
	@Quando("seleciono a opcao de preco {string}")
	public void seleciono_a_opcao_de_preco(String priceOption) {
		selectPriceOptionPage.selectPriceOption(priceOption);
	}
	
	@Quando("clico no botao Next da aba Select Price Option")
	public void clico_no_botao_next_da_aba_select_price_option() {
		sendQuotePage = selectPriceOptionPage.clickOnNextSelectPriceOptionButton();
	}
	
	@Entao("a aba Send Quote eh apresentada")
	public void a_aba_send_quote_eh_apresentada() {
		Assert.assertTrue(sendQuotePage.verifyThatSendQuoteTabIsSelected());
	}
	
	@Quando("estou na aba Send Quote")
	public void estou_na_aba_send_quote() {
		Assert.assertTrue(sendQuotePage.verifyThatSendQuoteTabIsSelected());
	}
	
	@Quando("preencho o campo email com o valor {string}")
	public void preencho_o_campo_email_com_o_valor(String email) {
		sendQuotePage.fillInEmail(email);
	}
	
	@Quando("preencho o campo phone com o valor {string}")
	public void preencho_o_campo_phone_com_o_valor(String phone) {
		sendQuotePage.fillInPhone(phone);
	}
	
	@Quando("preencho o campo username com o valor {string}")
	public void preencho_o_campo_username_com_o_valor(String username) {
		sendQuotePage.fillInUsername(username);
	}
	
	@Quando("preencho o campo password com o valor {string}")
	public void preencho_o_campo_password_com_o_valor(String password) {
		sendQuotePage.fillInPassword(password);
	}
	
	@Quando("preencho o campo confirmpassword com o valor {string}")
	public void preencho_o_campo_confirmpassword_com_o_valor(String confirmPassword) {
		sendQuotePage.fillInConfirmPassword(confirmPassword);
	}
	
	@Quando("preencho o campo comments com o valor {string}")
	public void preencho_o_campo_comments_com_o_valor(String comments) {
		sendQuotePage.fillInComments(comments);
	}
	
	@Quando("clico no botao Send da aba Send Quote")
	public void clico_no_botao_send_da_aba_send_quote() {
		sendQuotePage.clickOnSendButton();
	}
	
	@Entao("eh apresentada a mensagem de sucesso {string}")
	public void eh_apresentada_a_mensagem_de_sucesso(String message) {
		String successMessage = sendQuotePage.getSuccessMessage();
		Assert.assertEquals(message, successMessage);
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
}
