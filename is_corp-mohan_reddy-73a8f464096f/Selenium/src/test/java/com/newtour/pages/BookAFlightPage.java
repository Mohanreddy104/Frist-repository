package com.newtour.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class BookAFlightPage extends WebDriverBaseTestPage<WebDriverTestPage>{
	
	@FindBy(locator="flight.findflight.btn")
	private QAFWebElement continueBtn;
	@FindBy(locator="flight.reserveflights.btn")
	private QAFWebElement reserveFlightsBtn;
	@FindBy(locator="bookingflight.secureparchase.btn")
	private QAFWebElement secureparchaseBtn;
	@FindBy(locator="bookingflight.firstname.text")
	private QAFWebElement firstNamefield;
	@FindBy(locator="bookingflight.lastname.text")
	private QAFWebElement lastNamefield;
	@FindBy(locator="bookingflight.delcountry.text")
	private QAFWebElement delCountry;
	public QAFWebElement getDelCountry() {
		return delCountry;
	}
	@FindBy(locator="bookingflight.month.text")
	private QAFWebElement monthField;
	public QAFWebElement getMonthField() {
		return monthField;
	}
	public QAFWebElement getYearField() {
		return yearField;
	}
	@FindBy(locator="bookingflight.year.text")
	private QAFWebElement yearField;
	@FindBy(locator="bookingflight.creditnumber.text")
	private QAFWebElement cardField;

	public QAFWebElement getCardField() {
		return cardField;
	}

	public QAFWebElement getContinueBtn() {
		return continueBtn;
	}
	public QAFWebElement getReserveFlightsBtn() {
		return reserveFlightsBtn;
	}
	public QAFWebElement getSecureparchaseBtn() {
		return secureparchaseBtn;
	}
	public QAFWebElement getfirstNamefield() {
		return firstNamefield;
	}
	public QAFWebElement getlastNamefield() {
		return lastNamefield;
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.manage().window().maximize();
		driver.get("/");
	}
	public void bookAFlighValidationsFields(String firstname,String lastname) {
		getContinueBtn().click();
		getReserveFlightsBtn().click();
		getfirstNamefield().sendKeys(firstname);
		getlastNamefield().sendKeys(lastname);
		Validator.assertTrue(getSecureparchaseBtn().isPresent(), "not clicking on secureparchase button", "clicking on secureparchase button" );
		getSecureparchaseBtn().click();
	}
	public void bookAFlighExpirationField(String month,String year)
	{

	 getContinueBtn().click();
	 getReserveFlightsBtn().click();
	 getMonthField().sendKeys(month);
	 getYearField().sendKeys(year);
	 Validator.verifyTrue(getSecureparchaseBtn().isPresent(), "Click on Secureparchase button system should not  navigate to Flight Confirmation page",
             "Click on Secureparchase button system should navigate to Flight Confirmation page successfully");
	 Reporter.log("User is navigate to Flight Confirmation page successfully");
	 getSecureparchaseBtn().click();
	}
	public void bookAFlighCardNumberField(String cardNumber)
	{
		getContinueBtn().click();
		getReserveFlightsBtn().click();
		Validator.assertTrue(getCardField().isPresent(), "not entering the carddate", "entering the carddate" );
		getCardField().sendKeys(cardNumber);
		Validator.assertTrue(getSecureparchaseBtn().isPresent(), "not clicking on secureparchase button", "clicking on secureparchase button" );
		getSecureparchaseBtn().click();
		Validator.verifyTrue(new FindAFlightPage().getBackToHome().isPresent(), "Click on Secureparchase button system should not  navigate to Flight Confirmation page",
                "Click on Secureparchase button system should navigate to Flight Confirmation page successfully");
		Reporter.log(" it is navigating to Flight Confirmation page successfully");
		
	}
	public void bookAFlightCountryField() {
		getContinueBtn().click();
		 Validator.assertTrue(getReserveFlightsBtn().isPresent(), "not clicking on reserveflight button", "clicking on reserveflight button" );
		getReserveFlightsBtn().click();
		Select selectDropDwon = new Select(delCountry);
		selectDropDwon .selectByVisibleText("AUSTRALIA");
		Alert alert= driver.switchTo().alert();
		String alertMsg= alert.getText();
		Reporter.log(" popup is coming and this is the message:"+alertMsg);
		alert.accept();
		Reporter.log("after selecting the country");
		Validator.verifyTrue(getSecureparchaseBtn().isPresent(), "Click on Secureparchase button system should not  navigate to Flight Confirmation page",
                "Click on Secureparchase button system should navigate to Flight Confirmation page successfully");
		Validator.assertTrue(getSecureparchaseBtn().isPresent(), "not clicking on secureparchase button", "clicking on secureparchase button" );
		getSecureparchaseBtn().click();
	}
}
