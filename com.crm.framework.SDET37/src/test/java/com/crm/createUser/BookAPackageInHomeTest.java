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

		String USERNAME = fLib.getPropertKeyValue("username");
		String PASSWORD = fLib.getPropertKeyValue("userPassword");
		
		//fetch the comment from excel sheet
		String comment = eLib.readDataFromExcel("BookUserInHome", 1, 0);
		
		//fetch the confirm text from excel sheet
		String confirmText = eLib.readDataFromExcel("BookUserInHome", 1, 1);
		
		HomePage homePage = new HomePage(driver);
		homePage.getViewPackage().click();
		
		wLib.scrollBarAction(driver);
		driver.findElement(By.xpath("//h4[text()='Package Name: Kerla']/../..//a")).click();
		BookAPackageInHomePage bookPackage = new BookAPackageInHomePage(driver);
		bookPackage.getBookbtnEdt().click();

		UserPage userPage = new UserPage(driver);
		userPage.signInApp(USERNAME, PASSWORD);
		
		driver.findElement(By.xpath("//h4[text()='Package Name: Kerla']/../..//a")).click();
		
		wLib.scrollBarAction(driver);
		bookPackage.getStartDateEdt().click();
		bookPackage.getStartDate().click();
		bookPackage.getEndDateEdt().click();
		bookPackage.getEndDate().click();
		
		BookAPackageInAdminInfoPage bookAPackageInfo = new BookAPackageInAdminInfoPage(driver);
		bookAPackageInfo.commentEdt(comment);
		bookAPackageInfo.getBookButton().click();
		String actualText = bookAPackageInfo.getconfirmText().getText();
		SoftAssert Assert=new SoftAssert();
		Assert.assertTrue(actualText.contains(confirmText));
		Reporter.log("pass package is booked",true);
		
//		if(actualText.contains(confirmText)) {
//			System.out.println("pass package is booked");
//		}
//		else
//		{
//			System.out.println("fail package is not booked");
//		}
	}

}
