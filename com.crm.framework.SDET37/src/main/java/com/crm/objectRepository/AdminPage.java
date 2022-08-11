package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author Syed Zeeshan
 *
 */
public class AdminPage {
	//declaration

	@FindBy(name = "username")
	private WebElement usernametxtEdt;

	@FindBy(name = "password")
	private WebElement passwordtxtEdt;


	@FindBy(name = "login")
	private WebElement submitBtn;
	
	@FindBy(linkText = "Back to home")
	private WebElement backToPage;
	
	@FindBy(xpath = "//a[text()=' Logout']")
	private WebElement adminLogout;

	//initialization
	public AdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	//Utilization
	public WebElement getUsernametxtEdt()
	{
		return usernametxtEdt;
	}

	public WebElement getPasswordtxtEdt() {
		return passwordtxtEdt;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public WebElement getBackToPage() {
		return backToPage;
	}
	
	public WebElement getAdminLogout() {
		return adminLogout;
	}
	/**
	 * Login as Admin to the application
	 * @param username
	 * @param password
	 * click on submit button
	 */

	public void loginToApp(String username,String password)
	{
		usernametxtEdt.sendKeys(username);
		passwordtxtEdt.sendKeys(password);
		submitBtn.click();
	}
	
	/**
	 * logout as admin
	 */
	public void AdminLogout() {
		adminLogout.click();
	}
}
