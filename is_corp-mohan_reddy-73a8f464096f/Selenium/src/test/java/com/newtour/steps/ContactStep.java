package com.newtour.steps;

import java.sql.Driver;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class ContactStep {
	@QAFTestStep(description="user in homepage")
	public void openHomePage()
	{
		CommonStep.get("/");
	}
	@QAFTestStep(description="user click on contact link")
	public void clickOnContact()
	{
		CommonStep.click("contact.contactbtn.btn");
	}
	@QAFTestStep(description="click on backtohome page")
	public void clickOnBackToHome()
	{
		CommonStep.click("contact.backtohome.btn");
	}
	@QAFTestStep(description="clicking on contact it is navigating to home page")
	public void successfullyClick()
	{
		Reporter.logWithScreenShot("user is  successfully");
	}
  

}
