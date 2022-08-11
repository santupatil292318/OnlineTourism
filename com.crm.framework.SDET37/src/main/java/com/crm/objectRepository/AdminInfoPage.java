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
public class AdminInfoPage {
	//declaration
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashboardEdt;
	
	@FindBy(xpath = "//span[text()=' Tour Packages']")
	private WebElement tourPackageEdt;
	
	@FindBy(xpath = "//span[text()='Manage Users']")
	private WebElement manageUsersEdt;
	
	@FindBy(xpath = "//span[text()='Manage Booking']")
	private WebElement manageBookingEdt;
	
	@FindBy(xpath = "//span[text()='Manage Issues']")
	private WebElement manageIssueEdt;
	
	@FindBy(xpath = "//span[text()='Manage Enquiries']")
	private WebElement manageEnquriesEdt;
	
	@FindBy(xpath = "//span[text()='Manage Pages']")
	private WebElement managePagesEdt;
	
	@FindBy(xpath = "//span[text()='Administrator']")
	private WebElement administratorEdt;
	
	//initialization
	public AdminInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization

	public WebElement getDashboardEdt() {
		return dashboardEdt;
	}

	public WebElement getTourPackageEdt() {
		return tourPackageEdt;
	}

	public WebElement getManageUsersEdt() {
		return manageUsersEdt;
	}

	public WebElement getManageBookingEdt() {
		return manageBookingEdt;
	}

	public WebElement getManageIssueEdt() {
		return manageIssueEdt;
	}

	public WebElement getManageEnquriesEdt() {
		return manageEnquriesEdt;
	}

	public WebElement getManagePagesEdt() {
		return managePagesEdt;
	}
	
	public WebElement getAdministratorEdt() {
		return administratorEdt;
	}

}
