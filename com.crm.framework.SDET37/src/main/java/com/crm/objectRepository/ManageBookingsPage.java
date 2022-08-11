package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageBookingsPage {
    
	//initialisation
	public ManageBookingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(xpath = "//span[text()='#BK-2']/../..//a[text()='Manali Trip']")
	private WebElement updateTripLinkEdt;

	//utilisation
	public WebElement getUpdateTripLinkEdt() {
		return updateTripLinkEdt;
	}
	
	
}
