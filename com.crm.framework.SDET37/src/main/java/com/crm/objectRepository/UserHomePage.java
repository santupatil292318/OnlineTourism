package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class UserHomePage extends WebDriverUtility{
	
	//initialization
	 public UserHomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
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


		@FindBy(linkText = " Enquiry ")
		private WebElement enquiryLink;
		
		@FindBy(xpath="//a[text()='My Profile']")
		private WebElement myProfileLink;
		
		@FindBy(linkText="Change Password")
		private WebElement changePasswordLink;
		
		@FindBy(linkText="My Tour History")
		private WebElement myTourHistoryLink;
		
		@FindBy(linkText="Issue Tickets")
		private WebElement issueTicketsLink;
		
		@FindBy(xpath="//a[text()='/ Logout']")
		private WebElement logoutLink;
		
		@FindBy(xpath="//h4[text()='Package Name: Manali Trip']/../..//a[@class='view']")
		private WebElement manaliTripDetailsLink;
		
		@FindBy(xpath="//input[@id='datepicker']")
		private WebElement fromDatecalenderPopupLink;
		
		@FindBy(xpath="//input[@id='datepicker1']")
		private WebElement toDatecalenderPopupLink;
		
		@FindBy(xpath="//a[text()='10']")
		private WebElement selectFromDate;
		
		@FindBy(xpath="//a[text()='30']")
		private WebElement selectToDate;
		
		@FindBy(xpath="//button[@name='submit2']")
		private WebElement bookBtn;
		
		@FindBy(xpath="//input[@name='comment']")
		private WebElement commentTextArea;


		//Utilization
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

		public WebElement getPrivacyPolicyLink() {
			return privacyPolicyLink;
		}

		public WebElement getTermsofUseLink() {
			return termsofUseLink;
		}

		public WebElement getContactUsLink() {
			return contactUsLink;
		}

		public WebElement getEnquiryLink() {
			return enquiryLink;
		}

		public WebElement getMyProfileLink() {
			return myProfileLink;
		}

		public WebElement getChangePasswordLink() {
			return changePasswordLink;
		}

		public WebElement getMyTourHistoryLink() {
			return myTourHistoryLink;
		}

		public WebElement getIssueTicketsLink() {
			return issueTicketsLink;
		}

		public WebElement getLogoutLink() {
			return logoutLink;
		}

		public WebElement getManaliTripDetailsLink() {
			return manaliTripDetailsLink;
		}

		public WebElement getFromDatecalenderPopupLink() {
			return fromDatecalenderPopupLink;
		}

		public WebElement getToDatecalenderPopupLink() {
			return toDatecalenderPopupLink;
		}
		
		public WebElement getSelectFromDate() {
			return selectFromDate;
		}

		public WebElement getSelectToDate() {
			return selectToDate;
		}
        
		public WebElement getBookBtn() {
			return bookBtn;
		}
		
		public WebElement getCommentTextArea() {
			return commentTextArea;
		}


		
}
