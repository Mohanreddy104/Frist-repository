package com.newtour.steps;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class InvalidRegisterStep {
	@QAFTestStep(description="user register")
	public void openApplication()
	{
		CommonStep.get("/");
	}
	@QAFTestStep(description="click on register button")
	public void clickonregister() {
		CommonStep.waitForVisible("register.register.link", 1000);
		CommonStep.click("register.register.link");
	}
	@QAFTestStep(description="User enter with firstname {0} and lastname {1} and phone {2} and email {3} and address {4}")
	public void register(String firstname ,String lastname, String number, String email,String address)
	{
		CommonStep.sendKeys(firstname, "register.firstname.text");
		CommonStep.sendKeys(lastname, "register.lastname.text");
     	CommonStep.sendKeys(number , "register.phone.text");
		CommonStep.sendKeys(email, "register.email.text");
		CommonStep.sendKeys(address, "register.address1.text");
	}
	@QAFTestStep(description="User click on continue button")
	public void Userclickoncontinuebutton()
	{
		CommonStep.click("register.submit.text");
	}
	@QAFTestStep(description="user register successfully")
	public void userRegister()
	{
		Reporter.logWithScreenShot("user is not able to register successfully");
	}


}
