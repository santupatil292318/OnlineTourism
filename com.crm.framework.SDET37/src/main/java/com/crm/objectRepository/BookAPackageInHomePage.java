package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAPackageInHomePage {
	//declaration
	@FindBy(xpath = "//a[text()=' Book']")
	private WebElement bookbtnEdt;
	@FindBy(id = "datepicker")
	private WebElement startDateEdt;
	
	@FindBy(xpath = "//a[text()='15']")
	private WebElement startDate;
	
	@FindBy(id = "datepicker1")
	private WebElement endDateEdt;
	
	@FindBy(xpath = "//a[text()='15']")
	private WebElement endDate;
	
	//initialization
	public BookAPackageInHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getBookbtnEdt() {
		return bookbtnEdt;
	}
	public WebElement getStartDateEdt() {
		return startDateEdt;
	}

	public WebElement getStartDate() {
		return startDate;
	}

	public WebElement getEndDateEdt() {
		return endDateEdt;
	}

	public WebElement getEndDate() {
		return endDate;
	}

}
