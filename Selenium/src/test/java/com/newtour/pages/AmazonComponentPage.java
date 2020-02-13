package com.newtour.pages;

import java.util.List;

import com.newtour.components.Amazon;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.util.Reporter;

public class AmazonComponentPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "amazon.product.row")
	private List<Amazon> productItem;
	public List<Amazon> getProductItem() {
		return productItem;
	}

	public void productTitle(String title) {
		List<Amazon> listItems = getProductItem();
		for (Amazon list : listItems) {
			System.out.println("TV found :"+list.getProductTitle().getText());
			if (list.getProductTitle().getText().contains(title)) {
				Reporter.log("TV found Tv prices =" + list.getProductPrice().getText());
			} 
			else {
				System.out.println("TV NOT found");
			}
		}
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		driver.get("/");

	}

}
