package com.crm.objectRepository.manageEnqueries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
/**
 * 
 * @author santu
 *
 */
public class ManageenqueryInfoPage extends WebDriverUtility {

	
	//declaration
	@FindBy(xpath = "//span[text()='san157']")
	private WebElement nameverify;
	
	@FindBy(xpath = "//a[@href='manage-enquires.php?eid=6']")
	private WebElement pendingLink;
	
	//initialization
	public ManageenqueryInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getNameverify() {
		return nameverify;
	}

	public WebElement getPendingLink() {
		return pendingLink;
	}
	
//	public void pendingLink(WebDriver driver)
//	{
//		pendingLink.click();
//		driver.switchTo().alert().accept();
//	}
	
}
