package com.crm.createUser;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminInfoPage;
import com.crm.objectRepository.AdminPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.ManageUserPage;
import com.crm.objectRepository.UserSignUpInfoPage;
import com.crm.objectRepository.UserSignUpPage;

public class CreateAUserAndVerifyInAdminTest extends BaseClass{
	@Test
	public void createAUserAndVerifyTest() {
		
		String USERNAME = fLib.getPropertKeyValue("adminUsername");
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

		//click on signup link
		HomePage homePage = new HomePage(driver);
		homePage.getSignUpLink().click();

		//enter user details
		UserSignUpPage signUp = new UserSignUpPage(driver);
		signUp.signUpToApp(newUserName, phoneNum, emailID, passWord);

		//verify confirmation message
		UserSignUpInfoPage signUpInfo = new UserSignUpInfoPage(driver);
		String actualText = signUpInfo.getConformationText().getText();
		if(actualText.contains(confirmationText)) {
			System.out.println("user is created");
		}
		else
		{
			System.out.println("user is not created");
		}
		
		homePage.getAdminLink().click();
		AdminPage adminPage=new AdminPage(driver);
		adminPage.loginToApp(USERNAME, PASSWORD);
		
		AdminInfoPage adminInfo=new AdminInfoPage(driver);
		adminInfo.getManageUsersEdt().click();
		
		ManageUserPage manageUser = new ManageUserPage(driver);
		String actualName=manageUser.getManageUserText().getText();
		System.out.println(actualName);
		if(actualName.contains("testing")) {
			System.out.println("user is created and verified in admin page");
		}
		else
		{
			System.out.println("user is not created and verified in admin page");
		}

	}

}
