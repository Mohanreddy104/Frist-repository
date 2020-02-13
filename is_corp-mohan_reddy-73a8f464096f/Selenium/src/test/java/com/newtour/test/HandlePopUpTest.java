package com.newtour.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.newtour.pages.BookAFlightPage;
import com.newtour.pages.SigninPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class HandlePopUpTest extends WebDriverTestCase{
	BookAFlightPage verifyPopUp;
	@QAFDataProvider(key="signin.data")
	@Test(description=" verify popup message dispaly")
	public void Countryfield(Map<String , String >data) {
		verifyPopUp=new BookAFlightPage();
		verifyPopUp.launchPage(null);
		new SigninPage().signin(data.get("username"), data.get("password"));
		verifyPopUp.bookAFlightCountryField();
	}

}
