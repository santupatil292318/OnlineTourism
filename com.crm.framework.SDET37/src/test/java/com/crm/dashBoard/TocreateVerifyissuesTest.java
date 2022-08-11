package com.crm.dashBoard;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.UserLoginHomeaPage;
import com.crm.objectRepository.UserPage;
import com.crm.objectRepository.manageIssues.IssueticketsPage;
import com.crm.objectRepository.manageIssues.writeUsPage;

/**
 * 
 * @author santu
 *
 */
public class TocreateVerifyissuesTest extends BaseClass {
	@Test
	
	public void tocreateVerifyissuesInUserTest()
	{
		//to fetch data in property
		String username = fLib.getPropertKeyValue("username");
		String userpassword = fLib.getPropertKeyValue("userPassword");
		
		//to fetch the date in excel sheet
		String selectIssues = eLib.readDataFromExcel("writeUs", 2, 0);
		String discription = eLib.readDataFromExcel("writeUs", 1, 1);
		String expectedissue = eLib.readDataFromExcel("writeUs", 1, 3);
		
		//go to homepage
		HomePage homepage = new HomePage(driver);
		homepage.getSignInLink().click();
		
		//go to user
		UserPage user = new UserPage(driver);
		user.signInApp(username, userpassword);
		
		//userLoginhome
		UserLoginHomeaPage userHome = new UserLoginHomeaPage(driver);
		userHome.getWriteusLink().click();
		
		//writeuspage
		writeUsPage writeus = new writeUsPage(driver);
		writeus.writeUsPageEdt(selectIssues);
		writeus.writeUsPagedescription(discription);
		writeus.getSubmitBtn().click();
		
		//click and verify issuetickets
		userHome.getIssuticketLink().click();
		IssueticketsPage verifyissueTicket = new IssueticketsPage(driver);
		String actualissues = verifyissueTicket.getFormissuepage().getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(actualissues.contains(expectedissue));
		Reporter.log(actualissues, true);
		
		//User logout
		userHome.getLogoutLink();
	}	
	
}
