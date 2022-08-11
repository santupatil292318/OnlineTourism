package com.crm.createUser;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminInfoPage;
import com.crm.objectRepository.AdminPage;
import com.crm.objectRepository.BookAPackageInAdminInfoPage;
import com.crm.objectRepository.BookAPackageInHomePage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.ManageUserPage;
import com.crm.objectRepository.UserPage;
import com.crm.objectRepository.UserSignUpInfoPage;
import com.crm.objectRepository.UserSignUpPage;

public class CreateAUserAndBookPackageTest extends BaseClass{
	@Test
	public void createAUserAndBookPackageTest() {
		//fetch admin user name from properties file
		String USERNAME = fLib.getPropertKeyValue("adminUsername");

		//fetch admin password from properties file
		String PASSWORD = fLib.getPropertKeyValue("adminPassword");

		//fetch the newUserName from excel sheet
		String newUserName = eLib.readDataFromExcel("NewUser", 1, 0)+jLib.getRandomNumber();

		//fetch the phone Number from excel sheet
		String phoneNum = eLib.readDataFromExcel("NewUser", 1, 1);

		//fetch the emailID from excel sheet
		String emailID = eLib.readDataFromExcel("NewUser", 1, 2)+jLib.getRandomNumber();

		//fetch the passWord from excel sheet
		String passWord = eLib.readDataFromExcel("NewUser", 1, 2);

		//fetch the phone Number from excel sheet
		String confirmationText = eLib.readDataFromExcel("NewUser", 1, 4);

		//fetch user status from excel
		String userStatus = eLib.readDataFromExcel("NewUser", 1, 5);

		//fetch admin status from excel
		String adminStatus = eLib.readDataFromExcel("NewUser", 1, 6);

		//fetch user  from excel		
		String user = eLib.readDataFromExcel("NewUser", 1, 7);

		//fetch the comment from excel sheet
		String comment = eLib.readDataFromExcel("BookUserInHome", 1, 0);

		//fetch the confirm text from excel sheet
		String confirmText = eLib.readDataFromExcel("BookUserInHome", 1, 1);

		//fetch status 
		String status = eLib.readDataFromExcel("BookUserInHome", 1, 2);

		//click on signup link
		HomePage homePage = new HomePage(driver);
		homePage.getSignUpLink().click();

		//enter user details
		UserSignUpPage signUp = new UserSignUpPage(driver);
		signUp.signUpToApp(newUserName, phoneNum, emailID, passWord);

		//verify confirmation message
		UserSignUpInfoPage signUpInfo = new UserSignUpInfoPage(driver);
		String actualText = signUpInfo.getConformationText().getText();
		SoftAssert Assert=new SoftAssert();
		Assert.assertTrue(actualText.contains(confirmationText));
		Reporter.log(userStatus,true);

		//click on admin link
		homePage.getAdminLink().click();

		//login as admin
		AdminPage adminPage=new AdminPage(driver);
		adminPage.loginToApp(USERNAME, PASSWORD);

		//click on manage users
		AdminInfoPage adminInfo=new AdminInfoPage(driver);
		adminInfo.getManageUsersEdt().click();

		//verify the user is created in admin page
		ManageUserPage manageUser = new ManageUserPage(driver);
		String actualName=manageUser.getManageUserText().getText();
		System.out.println(actualName);

		Assert.assertTrue(actualText.contains(user));
		Reporter.log(adminStatus,true);

		//logout from app
		adminInfo.getAdministratorEdt().click();
		adminPage.getAdminLogout().click();
		adminPage.getBackToPage().click();

		//click on view package in home page
		homePage.getViewPackage().click();

		// scroll the window
		wLib.scrollBarAction(driver);

		//click on details of a package
		driver.findElement(By.xpath("//h4[text()='Package Name: Kerla']/../..//a")).click();

		//click on book button in home page
		BookAPackageInHomePage bookPackage = new BookAPackageInHomePage(driver);
		bookPackage.getBookbtnEdt().click();

		//login as user
		UserPage userPage = new UserPage(driver);
		userPage.signInApp(emailID, passWord);

		//scroll the window
		wLib.scrollBarAction(driver);

		//click on details
		driver.findElement(By.xpath("//h4[text()='Package Name: Kerla']/../..//a")).click();

		//scroll the window
		wLib.scrollBarAction(driver);

		//click on  start date
		bookPackage.getStartDateEdt().click();

		//select start date
		bookPackage.getStartDate().click();

		//click on  end date
		bookPackage.getEndDateEdt().click();

		//select end date
		bookPackage.getEndDate().click();

		//enter comment
		BookAPackageInAdminInfoPage bookAPackageInfo = new BookAPackageInAdminInfoPage(driver);
		bookAPackageInfo.commentEdt(comment);

		//click on book button
		bookAPackageInfo.getBookButton().click();

		//verify package is booked or not
		String actualText1 = bookAPackageInfo.getconfirmText().getText();
		Assert.assertTrue(actualText1.contains(confirmText));
		Reporter.log(status,true);

		//logout 
		userPage.getUserLogout().click();
	}

}
