package com.newtour.test;

import org.testng.annotations.Test;

import com.newtour.pages.FlightConfirmationPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class LogOutTest extends WebDriverTestCase {
	FlightConfirmationPage LogOut;
	@Test
	public void logOut() {
		LogOut = new FlightConfirmationPage();
		LogOut.launchPage(null);
		LogOut.logOut("guest", "guest");
	}
}
