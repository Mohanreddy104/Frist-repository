package com.newtour.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class ContactPage extends WebDriverBaseTestPage<WebDriverTestPage>{
	
	@FindBy (locator="contact.contactbtn.btn")
	private QAFWebElement contactBtn;
	@FindBy(locator="contact.verifymessage.img")
	private QAFWebElement verifyMessage;
	@FindBy(locator="contact.backtohome.btn")
	private QAFWebElement backToHomeBtn;
	public QAFWebElement getContactBtn() {
		return contactBtn;
	}
	public QAFWebElement getBackToHomeBtn() {
		return backToHomeBtn;
	}
	public void ContactBtn()
	{
		String actualTitle = driver.getTitle();
		getContactBtn().click();
		if(verifyMessage.isDisplayed())
		{
			Reporter.log(" In contact page Under Construction message is displaying");
		}
		else
		{
			Reporter.log("In contact page Under Construction message is not displaying");
			Reporter.logWithScreenShot("message is not displaying");
		
		}
		getBackToHomeBtn().click();
		Validator.verifyTrue(actualTitle.contains("Mercury Tours"), "Click on BackToHome button system should not  navigate to signin page",
                "Click on BackToHome button system should navigate to Sign On page successfully");
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
	}

}
