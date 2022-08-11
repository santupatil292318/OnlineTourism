package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author syed zeeshan
 *
 */
public class ManageUserPage {
	//declaration
	@FindBy(xpath = "//table[@id='table']")
	private WebElement manageUserText;
	
	//initialization
	public ManageUserPage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}

	//utilization
	public WebElement getManageUserText() {
		return manageUserText;
	}
	
	

}
