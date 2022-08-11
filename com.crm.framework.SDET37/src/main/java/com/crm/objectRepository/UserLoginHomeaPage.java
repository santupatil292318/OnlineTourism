package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author santu
 *
 */
public class UserLoginHomeaPage {

	//declaration
	@FindBy(linkText = "Issue Tickets")
	private WebElement issuticketLink;
	
	@FindBy(xpath = "//a[text()=' / Write Us ']")
	private WebElement writeusLink;
	
	@FindBy(xpath = "//a[text()='/ Logout']")
	private WebElement logoutLink;
	
	
	//initialization
	public UserLoginHomeaPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getIssuticketLink() {
		return issuticketLink;
	}

	public WebElement getWriteusLink() {
		return writeusLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	
}
