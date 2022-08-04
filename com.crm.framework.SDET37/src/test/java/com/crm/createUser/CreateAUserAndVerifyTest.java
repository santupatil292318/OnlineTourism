package com.crm.createUser;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.UserSignUpInfoPage;
import com.crm.objectRepository.UserSignUpPage;

/**
 * create a user 
 * @author syed zeeshan
 *
 */

public class CreateAUserAndVerifyTest extends BaseClass{
	@Test
	public void createAUserAndVerifyTest() {
		
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
			
	}
	

}
