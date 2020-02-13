package com.newtour.steps;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class RegisterSteps {
	@QAFTestStep(description="user register")
	public void openBrowser()
	{
		CommonStep.get("/");
	}
	@QAFTestStep(description="click on register button")
	public void clickOnRegister() {
		//CommonStep.waitForVisible("register.register.link", 1000);
		CommonStep.click("register.register.link");
		System.out.println("this is clicking");
	}
	@QAFTestStep(description="User enter with firstname {o} and lastname {1} and phone {2} and email {3} and address {4}")
	public void registerUser(String firstname ,String lastname, String phone, String email,String address)
	{
		CommonStep.click("register.register.link");
		CommonStep.sendKeys(firstname, "register.firstname.text");
		CommonStep.sendKeys(lastname, "register.lastname.text");
     	CommonStep.sendKeys(phone , "register.phone.text");
		CommonStep.sendKeys(email, "register.email.text");
		CommonStep.sendKeys(address, "register.address1.text");
	}
	@QAFTestStep(description="User click on continue button")
	public void UserclickOnContinueButton()
	{
		CommonStep.click("register.submit.text");
	}
	@QAFTestStep(description="user register successfully")
	public void userRegister()
	{
		Reporter.logWithScreenShot("user register successfully");
	}

}
