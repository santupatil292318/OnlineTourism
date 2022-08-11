package com.crm.objectRepository.manageIssues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manageissuesAdminPage {

	//declaration
	@FindBy(xpath = "//h2[text()='Manage Issues']")
	private WebElement manageissueText;
	
	//initialization
	public manageissuesAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	//utilization
	public WebElement getManageissueText() {
		return manageissueText;
	}
}
