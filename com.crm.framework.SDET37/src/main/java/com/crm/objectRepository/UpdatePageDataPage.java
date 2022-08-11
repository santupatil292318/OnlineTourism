package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class UpdatePageDataPage extends WebDriverUtility{
	
	//initialization
	public UpdatePageDataPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	 //declaration
	@FindBy(xpath="//select[@name='menu1']")
	private WebElement selectPageDropdown;
	
	@FindBy(xpath="//div[@contenteditable='true']")
	private WebElement packageDetailsText;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement submitBtn;
	
	 @FindBy(xpath="//i[@class='fa fa-angle-down']")
	 private WebElement administratorLink;
	 
	 @FindBy(xpath="//i[@class='fa fa-sign-out']")
	 private WebElement logoutLink;


	
	//utilization
	
	public WebElement getAdministratorLink() {
		return administratorLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getPackageDetailsText() {
		return packageDetailsText;
	}

	public WebElement getSelectPageDropdown() {
		return selectPageDropdown;
	}
	
	public void SelectPageDropdown(String value){
		selectDropDownByVtext(selectPageDropdown, value);
	}
	
	public void packageDetailsText(String text)
	{
		packageDetailsText.clear();
		packageDetailsText.sendKeys(text);
	}
	
}
