package com.newtour.test;

import org.testng.annotations.Test;

import com.newtour.pages.FindAFlightPage;
import com.newtour.pages.SigninPage;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class FindAFlightTest extends WebDriverTestCase{
	FindAFlightPage flights;
	FindAFlightPage finder;
	//find a filght
    @Test(priority=1)
    public void flights()  {
    
    	flights =new FindAFlightPage();
    	flights.launchPage(null);
    	new SigninPage().signinUsingBeans();
    	flights.flightBookingPage(); 
    	flights.flightSelectPage();
    	flights.bookingFlight();
    }
    //differentLocation And Date
	@QAFDataProvider(key="data.flights.user")
	@Test(priority=2)
	public void QAfFlight()
	{
		flights=new FindAFlightPage();
		flights.launchPage(null);
		new SigninPage().signinUsingBeans();            
		flights.flights();
		
	}
	//Same locations book a flight
	@Test(priority=3)
	public void flightFinderPage() 
	{
		 finder=new FindAFlightPage();
		finder.launchPage(null);
		new SigninPage().signinUsingBeans();
		finder.sameLocations();
	}

}
