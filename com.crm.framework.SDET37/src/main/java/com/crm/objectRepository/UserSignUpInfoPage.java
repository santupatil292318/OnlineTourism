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
public class UserSignUpInfoPage {
	//declaration
	@FindBy(xpath = "//h3[text()=' Confirmation']")
	private WebElement conformationText;
	
	//initialization
	public  UserSignUpInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getConformationText() {
		return conformationText;
	}

}
