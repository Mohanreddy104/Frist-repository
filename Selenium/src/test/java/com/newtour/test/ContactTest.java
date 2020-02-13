package com.newtour.test;

import org.testng.annotations.Test;

import com.newtour.pages.ContactPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
// contact page 
public class ContactTest extends WebDriverTestCase{
	ContactPage contact;
	@Test
	public void  clickContact()
	{
	    contact=new ContactPage();
		contact.launchPage(null);
		contact.ContactBtn();
	}

}
