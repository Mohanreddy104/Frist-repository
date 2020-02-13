package com.newtour.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.newtour.pages.RegisterBeanPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class RegisterBeanTest extends WebDriverTestCase {
	RegisterBeanPage register;
	@Test(priority=0 ,enabled=true)
	public void registerNewUser() {
		register=new RegisterBeanPage();
		register.launchPage(null);
		register.registerUser();
	}
	@Test( priority=1,enabled=false)
	@QAFDataProvider(dataFile="resources/testData/InvalidRegister.xls",sheetName="InvalidRegister",key="InvalidRegister")
	public void registerInvalidData(Map<String , String > invalidData)
	{
	      register=new RegisterBeanPage();
		  register.launchPage(null);
	      register.invalidRegister(invalidData.get("fname"), invalidData.get("lname"),invalidData.get("phone"),invalidData.get("email"));
	}
	@Test(description="This is Test RegisterPage Taking value in properties file",enabled=false)
	public void registerWithPropertiesFile()
	{
		register=new RegisterBeanPage();
		register.launchPage(null);
		register.invalidRegister(getProps().getString("firstName"), getProps().getString("lastName"), getProps().getString("phone"), getProps().getString("email"));
	}

}
