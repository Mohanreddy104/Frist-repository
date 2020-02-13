package com.newtour.steps;

import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;

public class RegisterCSVSteps {
	

	@QAFTestStep(description="User enter user data fname {0} and lname {1} and phone {2} and email {3} and address {4}")
	public void registeruserData(String fname ,String lname, String phone, String email,String address)
	{
		CommonStep.sendKeys(fname, "register.firstname.text");
		CommonStep.sendKeys(lname, "register.lastname.text");
     	CommonStep.sendKeys(phone, "register.phone.text");
		CommonStep.sendKeys(email, "register.email.text");
		CommonStep.sendKeys(address, "register.address1.text");
	}
	
}
                                                            