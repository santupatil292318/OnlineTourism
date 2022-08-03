package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSigninPage {
	//decleration
	@FindBy(id = "email") private WebElement emailText;
	@FindBy(id = "password") private WebElement passwordText;
	@FindBy(linkText = "Forgot password") private WebElement forgotpasswordLink;
	@FindBy(name = "signin") private WebElement signinBtn;
	
	//initialization
	public  UserSigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

	//utilization
	public WebElement getEmailText() {
		return emailText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getForgotpasswordLink() {
		return forgotpasswordLink;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}
}
