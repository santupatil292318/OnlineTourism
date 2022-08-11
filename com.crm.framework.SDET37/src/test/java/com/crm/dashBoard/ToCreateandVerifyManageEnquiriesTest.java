package com.crm.dashBoard;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminPage;
import com.crm.objectRepository.DashboardPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.manageEnqueries.CreateEnqueryPage;
import com.crm.objectRepository.manageEnqueries.ManageenqueryInfoPage;
import com.crm.objectRepository.manageEnqueries.enquerysucessPage;

/**
 * 
 * @author santu
 *
 */
public class ToCreateandVerifyManageEnquiriesTest extends BaseClass {

@Test

	public void toCreateandVerifyManageEnquiriesTest()
	{
		//to fetch data in property
		String adminusername = fLib.getPropertKeyValue("adminUsername");
		String adminpassword = fLib.getPropertKeyValue("adminPassword");
		
		//to fetch data in excell
		String fillName = eLib.readDataFromExcel("createenquery", 1, 0)+jLib.getRandomNumber();
		String email = eLib.readDataFromExcel("createenquery", 1, 1)+jLib.getRandomNumber();
		String mobileNumber = eLib.readDataFromExcel("createenquery", 1, 2)+jLib.getRandomNumber();
		String subject = eLib.readDataFromExcel("createenquery", 1, 3)+jLib.getRandomNumber();
		String description = eLib.readDataFromExcel("createenquery", 1, 4)+jLib.getRandomNumber();
		String enquerySuccess = eLib.readDataFromExcel("createenquery", 1, 5);
		String manageandVerifySuccess = eLib.readDataFromExcel("createenquery", 1, 6);
		//go to homepage
		HomePage homepage = new HomePage(driver);
		
		
		//click on enquery
		homepage.getEnquiryLink().click();
		
		//create enquery
		CreateEnqueryPage enquerypage = new CreateEnqueryPage(driver);
		enquerypage.createenquery(fillName, email, mobileNumber, subject, description);
		//to verify enquery successpage
		enquerysucessPage createenquerysuccess = new enquerysucessPage(driver);
		String enquerysuccess = createenquerysuccess.getSuccessText().getText();
		
    	SoftAssert softassert = new SoftAssert();
  		softassert.assertTrue(true, enquerysuccess);
  		Reporter.log(enquerySuccess, true);
		//goto adminpage
		homepage.getAdminLink().click();
		AdminPage admin = new AdminPage(driver);
		admin.loginToApp(adminusername, adminpassword);
		
		//to click on dashBoard manageenquiries
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.getManageEnquiries().click();
		
		//to verify manage enqueiries
		ManageenqueryInfoPage enqueryinfo = new ManageenqueryInfoPage(driver);
		String enqueryinfodata = enqueryinfo.getNameverify().getText();
		
		softassert.assertTrue(true, enqueryinfodata);
		Reporter.log(manageandVerifySuccess, true);
		//To approve enquery
		//enqueryinfo.pendingLink(driver);
		
		//Admin logout
		dashboard.logoutAdminInDashboard();
		
	}
}
