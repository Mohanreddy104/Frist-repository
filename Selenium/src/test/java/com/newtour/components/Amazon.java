package com.newtour.components;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Amazon extends QAFWebComponent {

	public Amazon(String locator) {
		super(locator);
		// TODO Auto-generated constructor stub
	}
	@FindBy(locator="amazon.producttitle.txt")
	private QAFWebElement productTitle;
	@FindBy(locator="amazon.productprice.txt")
	private QAFWebElement productPrice;
	@FindBy(locator="amazon.productreting.txt")
	private QAFWebElement productReting;
	public QAFWebElement getProductTitle() {
		return productTitle;
	}
	public QAFWebElement getProductPrice() {
		return productPrice;
	}
	public QAFWebElement getProductReting() {
		return productReting;
	}

	
}
