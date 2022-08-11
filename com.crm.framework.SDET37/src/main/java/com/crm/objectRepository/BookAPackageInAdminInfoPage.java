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

public class BookAPackageInAdminInfoPage {
	//declaration
	@FindBy(name = "comment")
	private WebElement commentedt;
	
	@FindBy(xpath = "//button[text()='Book']")
	private WebElement bookButton;
	
	@FindBy(xpath = "//strong[text()='SUCCESS']")
	private WebElement confirmText;
	
	//initialization
	public BookAPackageInAdminInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public WebElement getCommentedt() {
		return commentedt;
	}

	public WebElement getconfirmText() {
		return confirmText;
	}
	
	public WebElement getBookButton() {
		return bookButton;
	}
	
	public void commentEdt(String comment) {
		commentedt.sendKeys(comment);
	}
	

}
