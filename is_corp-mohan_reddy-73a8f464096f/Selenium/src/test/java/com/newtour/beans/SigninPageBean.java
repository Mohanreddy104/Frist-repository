package com.newtour.beans;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.ui.annotations.UiElement.Type;

public class SigninPageBean extends BaseFormDataBean {
	@UiElement(fieldLoc="signin.username.text",fieldType=Type.selectbox,order=1)
	private String username;
	
	@UiElement(fieldLoc="signin.password.text",fieldType=Type.selectbox,order=2)
	private String password;

}
