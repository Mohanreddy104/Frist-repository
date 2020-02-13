package com.newtour.steps;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class InvalidLoginStep {
	@QAFTestStep(description="Invalid login")
	public void OpenApp()
	{
		CommonStep.get("/");
	}
	@QAFTestStep(description="user login with invalid {0} and invalid {1}")
	public void InvalidLogin(String username , String password)
	{
		CommonStep.sendKeys(username, "signin.username.text");
		CommonStep.sendKeys(password, "signin.password.text");
		CommonStep.click("signin.singin.btn");
	}
	@QAFTestStep(description="user is not able to login")
	public void successLogin()
	{
		Reporter.logWithScreenShot("user is successfully login");
		
	}

}
