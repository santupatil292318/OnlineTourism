package com.crm.objectRepository.manageEnqueries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author santu
 *
 */
public class CreateEnqueryPage  {

	//declaration
	//Full name
	@FindBy(id = "fname")
	private WebElement fnameEdt;
	
	//Email
	@FindBy(id = "email")
	private WebElement emailEdt;
	
	//mobileNumber
	@FindBy(id = "mobileno")
	private WebElement mobileNumberEdt;
	
	//subject
	@FindBy(id = "subject")
	private WebElement subjectEdt;
	
	//description
	@FindBy(id = "description")
	private WebElement descriptionEdt;
	
	//submitbtn
	@FindBy(name = "submit1")
	private WebElement submitBtn;
	
	
	//initialization
	public CreateEnqueryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization

	public WebElement getFnameEdt() {
		return fnameEdt;
	}


	public WebElement getEmailEdt() {
		return emailEdt;
	}


	public WebElement getMobileNumberEdt() {
		return mobileNumberEdt;
	}


	public WebElement getSubjectEdt() {
		return subjectEdt;
	}


	public WebElement getDescriptionEdt() {
		return descriptionEdt;
	}


	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public void createenquery(String fullname,String Email,String mobileNum,String subject,String description)
	{
		fnameEdt.sendKeys(fullname);
		emailEdt.sendKeys(Email);
		mobileNumberEdt.sendKeys(mobileNum);
		subjectEdt.sendKeys(subject);
		descriptionEdt.sendKeys(description);
		submitBtn.click();
	}
	
	
	
	
}
