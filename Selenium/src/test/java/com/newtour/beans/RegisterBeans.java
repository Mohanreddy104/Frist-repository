package com.newtour.beans;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.ui.annotations.UiElement.Type;
import com.qmetry.qaf.automation.util.RandomStringGenerator.RandomizerTypes;
import com.qmetry.qaf.automation.util.Randomizer;
// this is use to runn both randomizer and uielement will run
public class RegisterBeans extends BaseFormDataBean {
	
	@Randomizer(length=15,type=RandomizerTypes.LETTERS_ONLY,minval=10)
	@UiElement(fieldLoc="register.firstname.text",fieldType=Type.selectbox)
    private String firstname;
	@Randomizer(length=15,type=RandomizerTypes.LETTERS_ONLY)
	@UiElement(fieldLoc="register.lastname.text",fieldType=Type.selectbox)
    private String lastname;
	@Randomizer(length=10,type=RandomizerTypes.DIGITS_ONLY,maxval=10)
	@UiElement(fieldLoc="register.phone.text",fieldType=Type.selectbox)
	private String phone;
	@Randomizer(length=10,type=RandomizerTypes.MIXED,suffix="@mailinator.com")
	@UiElement(fieldLoc="register.email.text",fieldType=Type.selectbox)
	private String email;
	@Randomizer(length=30,type=RandomizerTypes.MIXED)
	@UiElement(fieldLoc="register.address1.text",fieldType=Type.selectbox)
	private String address;
	@Randomizer(length=5,type=RandomizerTypes.LETTERS_ONLY)
	@UiElement(fieldLoc="register.city.text",fieldType=Type.selectbox)
	private String city;
	@Randomizer(type=RandomizerTypes.LETTERS_ONLY)
	@UiElement(fieldLoc="register.state.text",fieldType=Type.selectbox)
	private String state;
	@Randomizer(type=RandomizerTypes.DIGITS_ONLY,length=6)
	@UiElement(fieldLoc="register.postalcode.text")
	private String postalcode;
	@UiElement(fieldLoc="register.country.text",fieldType=Type.selectbox)
	private String country;
	@Randomizer(length=6,type=RandomizerTypes.LETTERS_ONLY)
	@UiElement(fieldLoc="register.username.text",fieldType=Type.selectbox)
	private String username;
	@Randomizer(type=RandomizerTypes.MIXED,length=6)
	@UiElement(fieldLoc="password",fieldType=Type.selectbox)
	private String password;
	@Randomizer(length=7,type=RandomizerTypes.MIXED)
	@UiElement(fieldLoc="confirmPassword",fieldType=Type.selectbox)
	private String confirmpassword;
}
