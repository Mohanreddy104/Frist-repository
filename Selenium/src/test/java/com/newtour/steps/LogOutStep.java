package com.newtour.steps;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Validator;

public class LogOutStep {
	@QAFTestStep(description="Open the home page")
	public void open_Home_Page()
	{
		CommonStep.get("/");
	}
	@QAFTestStep(description="user enter the username {0} and password {1}")
	public void login_Valid_Username_and_Password(String username,String password)
	{
		CommonStep.sendKeys(username,"signin.username.text");
		CommonStep.sendKeys(password, "signin.password.text");
		CommonStep.click("signin.singin.btn");
		CommonStep.click("logout.findflight.btn");
		CommonStep.click("logout.reserveflights.btn");
		CommonStep.click("logout.buyflights.btn");
	}
	@QAFTestStep(description="click on logout button")
	public void click_On_Logout()
	{
		CommonStep.click("logout.logout.btn");
	}
	@QAFTestStep(description="verify the logout")
	public void verify_LogOut()
	{
	  Validator.verifyTrue(CommonStep.verifyPresent("signin.singin.btn"), "user is not able to navigate back to home page", "user is successfully navigating to the Home page");
	}
	

}
