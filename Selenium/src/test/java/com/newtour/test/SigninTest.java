package com.newtour.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.newtour.pages.SigninPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class SigninTest extends WebDriverTestCase {
	SigninPage signin;
		@QAFDataProvider(key="signin.data")
		@Test(priority=1)
		public void sigin(Map<String, String> data)
		{
		  signin = new SigninPage();
		  signin.launchPage(null);
		  signin.signin(data.get("username"), data.get("password"));
		}
		
		 @QAFDataProvider (key="invalidSignin.data")
			@Test(priority=2)
			public void testSigin(Map<String , String> data) throws InterruptedException
			{
			 SigninPage invalidData=new SigninPage();
		     invalidData.launchPage(null);
		     invalidData.signin(data.get("username"),data.get("password"));
			}
	@Test
	public void signin()
	{
		signin=new SigninPage();
		signin.launchPage(null);
		signin.signin(getProps().getString("username"), getProps().getString("password"));
	}
	@QAFDataProvider(dataFile="./resources/testData/Signin.json")
	@Test
	public void signindata(Map<String , String>data)
	{
		signin.launchPage(null);
		signin.signin(data.get("username"), data.get("password"));
	} 
	}


