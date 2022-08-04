package com.crm.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

	//declaration
	@FindBy(xpath = "//a[@class='sidebar-icon']")
	private WebElement sideBarMenu;
	
	@FindBy(xpath = "images/User-icon.png")
	private WebElement Administration;
	
	@FindBy(linkText = "Dashboard")
	private WebElement Dashboard;
	
	@FindBy(linkText = " Tour Packages")
	private WebElement TourPackages;
	
	@FindBy(linkText = "Manage Users")
	private WebElement ManageUsers;
	
	@FindBy(linkText = "Manage Booking")
	private WebElement ManageBooking;
	
	@FindBy(linkText = "Manage Issues")
	private WebElement ManageIssues;
	
	@FindBy(linkText = "Manage Enquiries")
	private WebElement ManageEnquiries;
	
	@FindBy(linkText = "Manage Pages")
	private WebElement ManagePages;

	//initialization
	
	
	public WebElement getDashboard() {
		return Dashboard;
	}

	public WebElement getAdministration() {
		return Administration;
	}

	public WebElement getSideBarMenu() {
		return sideBarMenu;
	}

	public WebElement getTourPackages() {
		return TourPackages;
	}

	public WebElement getManageUsers() {
		return ManageUsers;
	}

	public WebElement getManageBooking() {
		return ManageBooking;
	}

	public WebElement getManageIssues() {
		return ManageIssues;
	}

	public WebElement getManageEnquiries() {
		return ManageEnquiries;
	}

	public WebElement getManagePages() {
		return ManagePages;
	}
	
	
}
