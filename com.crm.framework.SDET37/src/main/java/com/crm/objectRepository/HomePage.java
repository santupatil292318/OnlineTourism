package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
/**
 * 
 * @author Santosh Patil 
 *
 */
public class HomePage extends WebDriverUtility{
	//WebDriver driver;
	//declaration
	@FindBy(linkText = "Admin Login")
	private WebElement adminLink;

	@FindBy(linkText = "Sign Up")
	private WebElement signUpLink;

	@FindBy(linkText = "/ Sign In")
	private WebElement signInLink;
	
	@FindBy(linkText = "Home")
	private WebElement homeLink;
	
	@FindBy(linkText = "About")
	private WebElement aboutLink;

	@FindBy(linkText = "Tour Packages")
	private WebElement tourPackageLink;
	
	@FindBy(linkText = "Privacy Policy")
	private WebElement privacyPolicyLink;
	
	@FindBy(linkText = "Terms of Use")
	private WebElement termsofUseLink;
	
	@FindBy(linkText = "Contact Us")
	private WebElement contactUsLink;


	@FindBy(xpath  = "//a[text()=' Enquiry ']")
	private WebElement enquiryLink;
	
	@FindBy(xpath = "//a[text()='View More Packages']")
	private WebElement viewPackage;
//
//	@FindBy(linkText = "Sign Out")
//	private WebElement signoutLnk;

	//initialization
	public HomePage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//utilization
	public WebElement getAdminLink() {
		return adminLink;
	}

	public WebElement getSignUpLink() {
		return signUpLink;
	}
	
	public WebElement getSignInLink() {
		return signInLink;
	}
	
	public WebElement getHomeLink() {
		return homeLink;
	}
	
	public WebElement getAboutLink() {
		return aboutLink;
	}
	
	public WebElement getTourPackageLink() {
		return tourPackageLink;
	}

	public WebElement getEnquiryLink() {
		return enquiryLink;
	}


	public WebElement getPrivacyPolicyLink() {
		return privacyPolicyLink;
	}


	public WebElement getTermsofUseLink() {
		return termsofUseLink;
	}


	public WebElement getContactUsLink() {
		return contactUsLink;
	}
	
	public WebElement getViewPackage() {
		return viewPackage;
	}
	
}
