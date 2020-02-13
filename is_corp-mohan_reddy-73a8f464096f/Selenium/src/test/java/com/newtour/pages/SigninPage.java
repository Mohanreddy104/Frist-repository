package com.newtour.pages;

import java.util.regex.Matcher;

import com.newtour.beans.SigninPageBean;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class SigninPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "signin.username.text")
	private QAFWebElement userName;
	@FindBy(locator = "signin.password.text")
	private QAFWebElement Password;
	@FindBy(locator = "signin.singin.btn")
	private QAFWebElement signinBtn;
	@FindBy(locator="signin.sign-in.txt")
	private QAFWebElement sign_in;
	public QAFWebElement getUserName() {
		return userName;
	}
	public QAFWebElement getPassword() {
		return Password;
	}
	public QAFWebElement getSigninBtn() {
		return signinBtn;
	}
	public void signin(String username, String password) {
		getUserName().sendKeys(username);
		getPassword().sendKeys(password);
		Validator.assertTrue(getSigninBtn().isPresent(), "not clicking on signinBtn", "clicking on signinBtn");
		getSigninBtn().click();
		String actualTitle = driver.getTitle();
//		Validator.verifyTrue(actualTitle.contains("Find a Flight"), "Click on Signin button system should not  navigate to FindaFlight page",
//                "Click on Signin button system should navigate to Find a Flight page successfully");
		if(sign_in.isPresent())
		{
			Reporter.log("user is not able to login");
		}
		else
		Reporter.log("user is able to sign in successfully ");
	}
	public void signinUsingBeans()
	{
		SigninPageBean rbean=new SigninPageBean();
		rbean.fillFromConfig("signin.data");
		rbean.fillUiElements();
		getSigninBtn().click();
	}
	public void Signin() {
		getUserName().sendKeys("guest");
		getPassword().sendKeys("guest");
		getSigninBtn().click();
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}

}
