package com.crm.objectRepository.manageIssues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class writeUsPage extends WebDriverUtility{

	//declaration
	@FindBy(name = "issue")
	private WebElement selectDropdown;
	
	@FindBy(name = "description")
	private WebElement descrption;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement submitBtn;
	//initialization
	public writeUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getSelectDropdown() {
		return selectDropdown;
	}

	public WebElement getDescrption() {
		return descrption;
	}
	
	
	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	/**
	 * to select dropdown writeUs Page
	 * @param dropdownText
	 */
	public void writeUsPageEdt(String dropdownText)
	{
		selectDropDownByVtext(selectDropdown, dropdownText);
	}
	/**
	 * To pass value to description
	 * @param Description
	 */
	public void writeUsPagedescription(String Description)
	{
		descrption.sendKeys(Description);;
	}
	
	
}
