package com.newtour.pages;

import com.newtour.beans.RegisterBeans;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class RegisterBeanPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	@FindBy(locator="register.register.link")
	private QAFWebElement registerlink;
	@FindBy(locator="register.firstname.text")
	private QAFWebElement firstNameField;
	@FindBy(locator="register.lastname.text")
	private QAFWebElement lastNameField;
	@FindBy (locator="register.phone.text")
	private QAFWebElement phoneField;
	@FindBy(locator="register.email.text")
	private QAFWebElement emailField;
	@FindBy (locator="register.address1.text")
	private QAFWebElement address1Field;
	@FindBy(locator="register.city.text")
	private QAFWebElement cityField;
	@FindBy(locator="register.state.text")
	private QAFWebElement stateField;
	@FindBy (locator="register.postalcode.text")
	private QAFWebElement postalCodeField;
	@FindBy (locator="register.country.text")
	private QAFWebElement countryField;
	@FindBy(locator="register.username.text")
	private QAFWebElement userNameField;
	@FindBy (locator="register.password.text")
	private QAFWebElement passwordField;
	@FindBy (locator="register.cofirmpassword.text")
	private QAFWebElement confirmPasswordField;
	@FindBy(locator="register.submit.text")
	private QAFWebElement submitBtn;
	@FindBy(locator="register.message.text")
	private QAFWebElement messageText;
	public QAFWebElement getRegisterlink() {
		return registerlink;
	}
	public QAFWebElement getFirstNameField() {
		return firstNameField;
	}
	public QAFWebElement getLastNameField() {
		return lastNameField;
	}
	public QAFWebElement getPhoneField() {
		return phoneField;
	}
	public QAFWebElement getEmailField() {
		return emailField;
	}
	public QAFWebElement getAddress1Field() {
		return address1Field;
	}
	public QAFWebElement getCityField() {
		return cityField;
	}
	public QAFWebElement getStateField() {
		return stateField;
	}
	public QAFWebElement getPostalCodeField() {
		return postalCodeField;
	}
	public QAFWebElement getCountryField() {
		return countryField;
	}
	public QAFWebElement getUserNameField() {
		return userNameField;
	}
	public QAFWebElement getPasswordField() {
		return passwordField;
	}
	public QAFWebElement getConfirmPasswordField() {
		return confirmPasswordField;
	}
	public QAFWebElement getSubmitBtn() {
		return submitBtn;
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}
	public void registerUser()
	{
		RegisterBeans rbean=new RegisterBeans();
		getRegisterlink().click();
		rbean.fillFromConfig("data.register.user");
	    // rbean.fillRandomData();
		rbean.fillUiElements();
		Reporter.log("enter xml data to Register page it register successfully ");
		getSubmitBtn().click();
		Validator.verifyTrue(messageText.getText().contains("Thank you for registering. You may now sign-in using the user name and password you've just entered"),
		"Thank you for registering message is not display","Thank you for registering message is display");	
	}
	public void invalidRegister(String fname,String lname,String phone,String email)
	{
		getRegisterlink().click();
		getFirstNameField().waitForPresent(30000);
		getFirstNameField().sendKeys(fname);
		getLastNameField().sendKeys(lname);
		getPhoneField().sendKeys(phone);
		getEmailField().sendKeys(email);
		getSubmitBtn().click();
		Reporter.log("User should be registered successfully");
		Validator.verifyTrue(messageText.getText().contains("Thank you for registering. You may now sign-in using the user name and password you've just entered"),
				"Thank you for registering message is not display","Thank you for registering message is display");	
	}

}
