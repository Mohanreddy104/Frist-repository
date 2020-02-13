package com.newtour.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.newtour.pages.BookAFlightPage;
import com.newtour.pages.FlightConfirmationPage;
import com.newtour.pages.SigninPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class BackToFlightsTest extends WebDriverTestCase{
	FlightConfirmationPage backToFlight;
	BookAFlightPage validation;
	BookAFlightPage bookAFlight;
	
	@Test(priority=1)
	public void backToFlight()
	{
	//FlightConfirmationPage backToFlight=new FlightConfirmationPage();
    backToFlight=new FlightConfirmationPage();
	backToFlight.launchPage(null);
	new SigninPage().signinUsingBeans();
	backToFlight.Navigation();
	}
	
	// validation on first name and last name field
	@Test(priority=2)
	@QAFDataProvider(key="data.bookFlight.user")
	public void validation(Map<String, String> data)
	{
		validation=new BookAFlightPage();
		validation.launchPage(null);
		new SigninPage().signinUsingBeans();
		validation.bookAFlighValidationsFields(data.get("firstname"),data.get("lastname"));
	}

    //bookflightpage card field 
	@Test(priority=3)
	@QAFDataProvider(key="data.cardNumber.user")
	public void cardField(Map<String , String > data)
	{
	    bookAFlight=new BookAFlightPage();
		bookAFlight.launchPage(null);
		new SigninPage().signinUsingBeans();
		bookAFlight.bookAFlighCardNumberField(data.get("creditNumber"));
	}
	// BookAFlightPage expirationdata field
	@Test(priority=4)
	@QAFDataProvider(key="data.expirationDate.user")
	public void expirationDateField(Map<String , String>data)
	{
	    bookAFlight=new BookAFlightPage();
		bookAFlight.launchPage(null);
		new SigninPage().signinUsingBeans();
		bookAFlight.bookAFlighExpirationField(data.get("month"), data.get("year"));
	}
}
