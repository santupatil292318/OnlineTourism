package com.crm.createUser;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.UserSignUpPage;

public class CreateAUserAndVerifyTest extends BaseClass{
	
	public void createAUserAndVerifyTest() {
		
		//fetch the newUserName from excel sheet
		String newUserName = eLib.readDataFromExcel("NewUser", 1, 0)+jLib.getRandomNumber();
		
		//fetch the phone Number from excel sheet
		String phoneNum = eLib.readDataFromExcel("NewUser", 1, 1);
		
		//fetch the emailID from excel sheet
		String emailID = eLib.readDataFromExcel("NewUser", 1, 2)+jLib.getRandomNumber();
		
		//fetch the passWord from excel sheet
		String passWord = eLib.readDataFromExcel("NewUser", 1, 2);
		
		//click on signup link
		HomePage homePage = new HomePage(driver);
		homePage.getSignUpLink().click();
		
		//enter user details
		UserSignUpPage signUp = new UserSignUpPage(driver);
		signUp.signUpToApp(newUserName, phoneNum, emailID, passWord);
		
		
		
		
	}
	

}
