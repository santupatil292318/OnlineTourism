package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author santu
 *
 */
public class DashboardPage {
	
	//declaration
	@FindBy(xpath = "//a[@class='sidebar-icon']")
	private WebElement sideBarMenu;
	
	@FindBy(xpath = "//img[@src='images/User-icon.png']")
	private WebElement Administration;
	
	@FindBy(xpath = "//a[@href='logout.php']")
	private WebElement logoutBtn;
	
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
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
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

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	public void logoutAdminInDashboard()
	{
		Administration.click();
		logoutBtn.click();
	}
	
}
