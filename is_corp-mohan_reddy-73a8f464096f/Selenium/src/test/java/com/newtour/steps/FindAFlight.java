package com.newtour.steps;

import java.time.LocalDate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.newtour.pages.FindAFlightPage;
import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Validator;

public class FindAFlight {
	FindAFlightPage dropdwon=new FindAFlightPage();
	LocalDate date =LocalDate.now();
	LocalDate yes=date.plusDays(1);
	LocalDate month=date.plusMonths(3);
	
	/*	@QAFTestStep(description="user is in home page")
	public void openHomPage()
	{
		CommonStep.get("/");
	}
	@QAFTestStep(description="enter user name {0} and password {1}")
	public void enterUserNameAndPassword(String username,String password)
	{
		CommonStep.sendKeys(username,"logout.username.text");
		CommonStep.sendKeys(password, "logout.password.text");
	}*/
	@QAFTestStep(description="click on signin button")
	public void clickOnSignin()
	{
		CommonStep.click("logout.singin.btn");
	}
	
	@QAFTestStep(description="enter all the data in find a flight page type {0} and passengers {1} and DepartingFrom {2} and on {3} and Arrivingin {4} and return {5}")
	public void enterDataOnFindAFlightPage(String tripType ,String passengers ,String departing,String fromDay,String arriving,String returningDay )
	{
		CommonStep.sendKeys(tripType, "flight.roundtrip.rbtn");
		CommonStep.sendKeys(passengers, "flight.passengers.text");
		CommonStep.sendKeys(departing, "flight.departing.text");
		CommonStep.sendKeys(fromDay, "flight.formday.text");
		//selectdropdown(getArriving()).selectByIndex(LocalDate.now().plusDays(1).getDayOfMonth()-1)
		CommonStep.sendKeys(arriving, "flight.arriving.text");
		CommonStep.sendKeys(returningDay, "flight.returningday.text");
	}
	@QAFTestStep(description="click continue button")
	public void clickOnContinueButton()
	{
		CommonStep.click("flight.findflight.btn");
	}
	@QAFTestStep(description="click on reserveflight button")
	public void clickFlightFinder()
	{
		CommonStep.click("flight.reserveflights.btn");
	}
	@QAFTestStep(description="click on secureparchase button")
	public void clickSecureParchase()
	{
		CommonStep.click("bookingflight.secureparchase.btn");
	}
	@QAFTestStep(description="verify user is entering all the values successfully")
	public void verifyUserEnterAllData()
	{
		Validator.assertTrue(CommonStep.verifyPresent("bookinglight.backtoflights.btn"), "user is not able to enter the data in find a flight", "user is  able to enter the all the data in flight finder page");
	}

}
