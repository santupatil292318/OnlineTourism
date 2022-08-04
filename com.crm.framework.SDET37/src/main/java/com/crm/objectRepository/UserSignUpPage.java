package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserSignUpPage {
	//declaration
	@FindBy(name = "fname")
	public WebElement fullName;
	
	@FindBy(name = "mobilenumber")
	public WebElement mobileNum;
	
	@FindBy(name = "email")
	public WebElement emailId;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(id = "submit")
	public WebElement submitbtn;
	
	public WebElement getFullName()
	{
		return fullName;
	}
	
	public WebElement getMobileNum()
	{
		return mobileNum;
	}
	
	public WebElement getEmailId()
	{
		return emailId;
	}
	
	public WebElement getPassword()
	{
		return password;
	}
	
	public WebElement getSubmitbtn()
	{
		return submitbtn;
	}
	/**
	 * create a user
	 * @param FullName
	 * @param mobileNumber
	 * @param EmailId
	 * @param Password
	 */
	
	public void loginToApp(String FullName,String mobileNumber,String EmailId,String Password)
	{
		fullName.sendKeys(FullName);
		mobileNum.sendKeys(mobileNumber);
		emailId.sendKeys(EmailId);
		password.sendKeys(Password);
		submitbtn.click();
	}

}
