package com.crm.verifyTripTest;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminPage;
import com.crm.objectRepository.DashboardPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.ManageBookingPage;
import com.crm.objectRepository.UserHomePage;
import com.crm.objectRepository.UserPage;
/**
 * 
 * @author akshay
 *
 */

public class VerifyBookedTripFromAdminTest extends BaseClass {
	@Test

	public void verifyBookedTripFromAdminTest(){
		
		String USERNAME=fLib.getPropertKeyValue("username");
		String USERPASS=fLib.getPropertKeyValue("userPassword");
		HomePage homePage=new HomePage(driver);
		homePage.getSignInLink().click();

		//sign in to user account
		UserPage userPage =new UserPage(driver);

		
		userPage.signInApp(USERNAME,USERPASS);

		//click on details link of manali trip from package list
		UserHomePage userHomePage=new UserHomePage(driver);
		userHomePage.getManaliTripDetailsLink().click();
		
		wLib.scrollBarAction(driver);
		//choose FROM date from calender popup
		userHomePage.getFromDatecalenderPopupLink().click();
		userHomePage.getSelectFromDate().click();

		//choose TO date from calender popup
		userHomePage.getToDatecalenderPopupLink().click();
		userHomePage.getSelectToDate().click();

		//give comments in comment text area section
		String comment=eLib.readDataFromExcel("manageBooking", 1, 3);
		userHomePage.getCommentTextArea().sendKeys(comment);

		//click on book button
		userHomePage.getBookBtn().click();

		//click on logout link
		userHomePage.getLogoutLink().click();

		//click on admin login link
		homePage.getAdminLink().click();

		//enter the credentials in admin login page
		AdminPage adminPage=new AdminPage(driver);

		String ADUSERNAME=fLib.getPropertKeyValue("adminUsername");
		String ADPASS=fLib.getPropertKeyValue("adminPassword");
		adminPage.loginToApp(ADUSERNAME, ADPASS);

		//click on manage booking in admin dashboard page
		DashboardPage dashBoardPage=new DashboardPage(driver);
		dashBoardPage.getManageBooking().click();

		//get the content from manage booking table
		ManageBookingPage manageBookingPage=new ManageBookingPage(driver);
		String bookingListContent = manageBookingPage.getManageBookingTable().getText();

		//verify the user booked details created in manage booking table or not
		String bookingName=eLib.readDataFromExcel("manageBooking", 1, 0);
		if(bookingListContent.contains(bookingName))
		{
			System.out.println("Booking created");
		}
		else
		{
			System.out.println("Booking not created");
		}

		//logout from admin dashboard page
		manageBookingPage.getAdministratorLink().click();
		manageBookingPage.getLogoutLink().click();



	}

}	

