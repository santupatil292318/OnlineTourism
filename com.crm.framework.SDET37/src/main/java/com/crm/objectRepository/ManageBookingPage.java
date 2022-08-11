package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageBookingPage {
	
	//initialization
		 public ManageBookingPage(WebDriver driver)
		 {
			 PageFactory.initElements(driver,this);
		 }
		 
		 //declaration
		 @FindBy(xpath= "//div[@class='w3l-table-info']")
			private WebElement manageBookingTable;
		 
		 @FindBy(xpath="//i[@class='fa fa-angle-down']")
		 private WebElement administratorLink;
		 
		 @FindBy(xpath="//i[@class='fa fa-sign-out']")
		 private WebElement logoutLink;

		
		 
	
		//Utilization
		 public WebElement getManageBookingTable() {
				return manageBookingTable;
			}
		 
		 public WebElement getAdministratorLink() {
				return administratorLink;
			}



		public WebElement getLogoutLink() {
				return logoutLink;
			}



			 
		 

}
