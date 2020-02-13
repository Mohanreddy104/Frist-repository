package com.newtour.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class FlightConfirmationPage  extends WebDriverBaseTestPage<WebDriverTestPage>{
	
	@FindBy(locator = "logout.username.text")
	private QAFWebElement userNameField;
	@FindBy(locator = "logout.password.text")
	private QAFWebElement PassWordField;
	@FindBy(locator = "logout.singin.btn")
	private QAFWebElement signinBtn;
	@FindBy(locator="logout.findflight.btn")
	private QAFWebElement continueBtn;
	@FindBy(locator="logout.reserveflights.btn")
	private QAFWebElement reserveFlightsBtn;
	@FindBy(locator="logout.buyflights.btn")
	private QAFWebElement securePracheseBtn;
	@FindBy(locator="logout.logout.btn")
	private QAFWebElement logOutBtn;
	@FindBy(locator="bookinglight.backtoflights.btn")
	private QAFWebElement backToFlightsBtn;

	public QAFWebElement getBackToFlightsBtn() {
		return backToFlightsBtn;
	}
	public QAFWebElement getUserNameField() {
		return userNameField;
	}
	public QAFWebElement getPassWordField() {
		return PassWordField;
	}
	public QAFWebElement getSigninBtn() {
		return signinBtn;
	}
	public QAFWebElement getContinueBtn() {
		return continueBtn;
	}
	public QAFWebElement getReserveFlightsBtn() {
		return reserveFlightsBtn;
	}
	
	public QAFWebElement getSecurePracheseBtn() {
		return securePracheseBtn;
	}
	public QAFWebElement getlogOutBtn() {
		return logOutBtn;
	}
	public void logOut(String username, String password) {
		waitForPageToLoad();
		String actualTitle = driver.getTitle();
		String expectedTitle="Mercury Tours";
		getUserNameField().sendKeys(username);
		getPassWordField().sendKeys(password);
		getSigninBtn().click();
		getContinueBtn().click();
		getReserveFlightsBtn().click();
		getSecurePracheseBtn().click();
		Validator.verifyTrue(getlogOutBtn().isPresent(), "user is able to not clicking on logout button",
                "user is able to clicking on logout button");
		getlogOutBtn().click();
		Validator.verifyTrue(actualTitle.contains(expectedTitle), "Click on Logout button system should not  navigate to signin page",
                "Click on Logout button system should navigate to Sign On page successfully");
	
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}
	public void Navigation()
	{
	     getContinueBtn().click();
		getReserveFlightsBtn().click();
		Validator.assertTrue(getSecurePracheseBtn().isPresent(), "not clicking on secureparchase button", "clicking on secureparchase button" );
		getSecurePracheseBtn().click();
	    Reporter.log(" flight booking page");
	    getBackToFlightsBtn().click();
	    Validator.verifyTrue(driver.getTitle().contains("Mercury Tours"),
                "User is not redirected to Book a Flight Page", "User is redirected to Book a Flight Page");
	    Reporter.log("this is navigation to flights page successfully");
		
	}

}
