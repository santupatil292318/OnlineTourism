package com.crm.createUser;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.BookAPackageInAdminInfoPage;
import com.crm.objectRepository.BookAPackageInHomePage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.UserPage;

/**
 * 
 * @author syed zeeshan
 *
 */

public class BookAPackageInHomeTest extends BaseClass{
	@Test
	public void bookAPackageInHomeTest() {
		
		//fetch data user name from properties file
		String USERNAME = fLib.getPropertKeyValue("username");
		
		//fetch data password from properties file
		String PASSWORD = fLib.getPropertKeyValue("userPassword");
		
		//fetch the comment from excel sheet
		String comment = eLib.readDataFromExcel("BookUserInHome", 1, 0);
		
		//fetch the confirm text from excel sheet
		String confirmText = eLib.readDataFromExcel("BookUserInHome", 1, 1);
		
		//click on view package in home page
		HomePage homePage = new HomePage(driver);
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
		userPage.signInApp(USERNAME, PASSWORD);
		
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
		String actualText = bookAPackageInfo.getconfirmText().getText();
		SoftAssert Assert=new SoftAssert();
		Assert.assertTrue(actualText.contains(confirmText));
		Reporter.log("pass package is booked",true);
		
		//logout 
		userPage.getUserLogout().click();
		
		
	}

}
