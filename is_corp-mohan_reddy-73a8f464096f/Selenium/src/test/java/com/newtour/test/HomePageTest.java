package com.newtour.test;


import org.testng.annotations.Test;

import com.newtour.pages.HomePage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class HomePageTest extends WebDriverTestCase{
	 HomePage Home;
	@Test
	public void  homePage()
	{
		 Home = new HomePage();
		 Home.launchPage(null);
		 Home.homePageVerifcation();
	}
	
}
