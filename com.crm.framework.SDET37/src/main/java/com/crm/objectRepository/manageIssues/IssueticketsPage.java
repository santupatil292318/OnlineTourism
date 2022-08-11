package com.crm.objectRepository.manageIssues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author santu
 *
 */
public class IssueticketsPage {

	//declaration
	@FindBy(xpath = "//form[@name='chngpwd']")
	private WebElement formissuepage;
	
	//initialization
	public IssueticketsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getFormissuepage() {
		return formissuepage;
	}
	
	
}
