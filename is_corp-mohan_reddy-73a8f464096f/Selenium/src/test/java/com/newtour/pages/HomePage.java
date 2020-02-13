package com.newtour.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class HomePage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	
	@FindBy(locator="homepage.featureddesctination.img")
	private QAFWebElement featuredDesctination;
	@FindBy(locator="homepage.speciol.img")
	private QAFWebElement speciol;
	@FindBy(locator="homepage.tourtips.img")
	private QAFWebElement tourTips;
	@FindBy(locator="homepage.findafilght.img")
	private QAFWebElement findAFilght;
	@FindBy (locator="homepage.destination.link")
	private QAFWebElement destination;
	@FindBy(locator="homepage.vacations.link")
	private QAFWebElement vacations;
	@FindBy (locator="homepage.register.img")
	private QAFWebElement register;
	@FindBy(locator="homepage.links.img")
	private QAFWebElement links;
	
	public QAFWebElement getFeaturedDesctination() {
		return featuredDesctination;
	}
	public QAFWebElement getSpeciol() {
		return speciol;
	}
	public QAFWebElement getTourTips() {
		return tourTips;
	}
	public QAFWebElement getFindAFilght() {
		return findAFilght;
	}
	public QAFWebElement getDestination() {
		return destination;
	}
	public QAFWebElement getVacations() {
		return vacations;
	}
	public QAFWebElement getRegister() {
		return register;
	}
	public QAFWebElement getLinks() {
		return links;
	}
	public void homePageVerifcation()
	{
		Validator.verifyTrue(getFeaturedDesctination().isPresent(), "featuredDesctination components is not present in home page",
				"featuredDesctination components is present in home page");
		Validator.verifyTrue(getSpeciol().isPresent(), "speciol components is not present in home page", 
				"speciol components is present in home page");
		Validator.verifyTrue(getTourTips().isPresent(), "tourTips components is not presentin home page", 
				"tourTips components is present in home page");
		Validator.verifyTrue(getFindAFilght().isPresent(), "findAFilght components is not present in home page",
				"findAFilght components is present in home page");
		Validator.verifyTrue(getDestination().isPresent(), "destination link is not present in home page", 
				"destination link is present in home page");
		Validator.verifyTrue(getVacations().isPresent(), "vacations link is not present in home page", "vacations link is present in home page");
		Validator.verifyTrue(getRegister().isPresent(), "registe components is not present in home page", "registe components is present in home page");
		Validator.verifyTrue(getLinks().isPresent(), "links components is not present ", "links components is present in home page");
	}
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		driver.get("/");
		
	}

}
