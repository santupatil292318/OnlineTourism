package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author neetha
 *
 */
public class CreateEnquiryPage {
	
public CreateEnquiryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 	

	@FindBy(id = "fname")
	private WebElement fnameEdt;

	@FindBy(id = "email")
	private WebElement emailEdt;

	@FindBy(id = "mobileno")
	private WebElement mobilenoEdt;

	@FindBy(id ="subject")
	private WebElement subjectEdt;

	@FindBy(id = "description")
	private WebElement descriptionEdt;

	@FindBy(name = "submit1")
	private WebElement submitbtnEdt;

	public WebElement getfnameEdt() 
	{
		return fnameEdt;	
	}
	public WebElement getemailEdt() 
	{
		return emailEdt;	
	}
	public WebElement getmobilenoEdt() 
	{
		return mobilenoEdt;	
	}
	public WebElement getsubjectEdt() 
	{
		return subjectEdt;	
	}
	public WebElement getdescriptionEdt() 
	{
		return descriptionEdt;	
	}
	public WebElement getsubmitbtnEdt() 
	{
		return submitbtnEdt;	
	}

	public void enquiryForm(String Fullname, String email, String number, String Subject, String Description)
	{
		fnameEdt.sendKeys(Fullname);
		emailEdt.sendKeys(email);
		mobilenoEdt.sendKeys(number);
		subjectEdt.sendKeys(Subject);
		descriptionEdt.sendKeys(Description);
		submitbtnEdt.click();

	}


}

