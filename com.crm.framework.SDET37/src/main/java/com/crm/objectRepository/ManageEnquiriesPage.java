package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageEnquiriesPage {
	
	//initialization
	public ManageEnquiriesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//declaration
	@FindBy(xpath="//span[text()='ABC']")
	private WebElement enquiryText;


	
	//utilization
	
	public WebElement getEnquiryText() {
		return enquiryText;
	}
}
