package com.newtour.components;

import java.util.List;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SelectPageComponent extends QAFWebComponent {
    @FindBy(locator = "selectflight.radiolist.btn")
    private List<QAFWebElement> radioButton;
    public List<QAFWebElement> getRadioButton() {
        return radioButton;
    }
    @FindBy(locator = "selectflight.flightname.txt")
    private List<QAFWebElement> flightName;

    public List<QAFWebElement> getFlightName() {
        return flightName;
    }
    public SelectPageComponent(String locator) {
        super(locator);
    }
}

