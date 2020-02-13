package com.newtour.test;

import org.testng.annotations.Test;

import com.newtour.pages.AmazonComponentPage;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class AmazonTest extends WebDriverTestCase {
	//AmazonComponentPage amazon;
	@Test
	//@QAFTestStep(description="amazon web---" ,threshold=30)
	public void componentTest()
	{
		String title="LG 108 cm (43 inches) 4K UHD Smart LED TV 43UM7290PTF (Ceramic Black) (2019 Model)";
		AmazonComponentPage amazon=new AmazonComponentPage();
		amazon.launchPage(null);
		amazon.productTitle(title);	
	}
}
