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
public class enquerysucessPage {

	//declaration
	@FindBy(xpath = "//strong[text()='SUCCESS']")
	private WebElement successText;
	
	//initialization
	public enquerysucessPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getSuccessText() {
		return successText;
	}
	
	
}
