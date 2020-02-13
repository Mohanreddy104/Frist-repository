package com.newtour.steps;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.util.Reporter;

public class LoginBDDSteps {
	//@QAFDataProvider(dataFile="./resources/testData/login.xls",sheetName="Login",key="Signin")
	@QAFTestStep(description="user open new tour application")
	public void openApplicationInBroser() {
		CommonStep.get("/");
	}
	@QAFTestStep(description="user login with valid username {0} and valid password {1}")
	public void doLogin(String username , String password)
	{
		CommonStep.waitForPresent("signin.username.text");
		CommonStep.sendKeys(username,"signin.username.text");
		CommonStep.sendKeys(password, "signin.password.text");
		CommonStep.click("signin.singin.btn");
	}
	@QAFTestStep(description="user Click on signin button")
	public void verifysuccess()
	{
		Reporter.logWithScreenShot("login successfully");
	}

}
