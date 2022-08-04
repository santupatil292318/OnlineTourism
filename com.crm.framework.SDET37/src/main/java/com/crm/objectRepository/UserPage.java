package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Santosh Patil
 *
 */
public class UserPage {
	//declaration
	@FindBy(id = "email") 
	private WebElement emailText;
	
	@FindBy(id = "password") 
	private WebElement passwordText;
	
	@FindBy(linkText = "Forgot password")
	private WebElement forgotpasswordLink;
	
	@FindBy(name = "signin") 
	private WebElement signinBtn;
	
	@FindBy(linkText = "/ Logout")
	private WebElement userLogout;
	
	//initialization
	public  UserPage(WebDriver driver)
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
	

	public WebElement getUserLogout() {
		return userLogout;
	}
	
	/**
	 * Sign in as user to application
	 * @param emailId
	 * @param passWord
	 * @param signinBtn
	 */
	
	public void signInApp(String emailId,String passWord)
	{
		emailText.sendKeys(emailId);
		passwordText.sendKeys(passWord);
		signinBtn.click();
	}
	
	/**
	 * logout as user
	 */
	public void UserLogout() {
		userLogout.click();
	}
}
