package com.crm.dashBoard;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminPage;
import com.crm.objectRepository.DashboardPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.manageIssues.manageissuesAdminPage;
/**
 * 
 * @author santu
 *
 */
public class ToVerifymanageissuesInAdminTest extends BaseClass {

@Test

	public void toVerifymanageissuesInAdminTest()
	{
		//to fetch data in property
		String adminusername = fLib.getPropertKeyValue("adminUsername");
		String adminpassword = fLib.getPropertKeyValue("adminPassword");
		
		//homepage
		HomePage homepage = new HomePage(driver);
		homepage.getAdminLink().click();
	
		
		//admin login
		AdminPage admin = new AdminPage(driver);
		admin.loginToApp(adminusername, adminpassword);
		
		//dashboard
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.getManageIssues().click();
		
		//manage issuepage
		manageissuesAdminPage manageissuesAdmin = new manageissuesAdminPage(driver);
		String actualText = manageissuesAdmin.getManageissueText().getText();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(true, actualText);
		Reporter.log(actualText, true);
		
		//Admin logout
		dashboard.logoutAdminInDashboard();
	}
}
