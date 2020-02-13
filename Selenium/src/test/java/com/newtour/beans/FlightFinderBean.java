package com.newtour.beans;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.ui.annotations.UiElement.Type;

public class FlightFinderBean extends BaseFormDataBean{
	@UiElement(fieldLoc="tripType",fieldType=Type.optionbox,order=1) 
	private String tripType;	
	
	@UiElement(fieldLoc="flight.passengers.text",fieldType=Type.selectbox,dependsOnField="tripType",order=2)
	private String passengers;
	@UiElement(fieldLoc="flight.departing.text",fieldType=Type.selectbox,order=3)
	private String departing;
	@UiElement(fieldLoc="flight.frommonth.text",fieldType=Type.selectbox,order=4)
	private String fromMonth;
	@UiElement(fieldLoc="flight.formday.text",fieldType=Type.selectbox,order=5)
	private String fromDay;
	@UiElement(fieldLoc="flight.arriving.text",fieldType=Type.selectbox,order=6)
	private String arriving;
	@UiElement(fieldLoc="flight.returningmonth.text",fieldType=Type.selectbox,order=7)
	private String returningMonth;
	@UiElement(fieldLoc="flight.returningday.text",fieldType=Type.selectbox,order=8)
	private String returningDay;
}
