package managePagesTest;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminPage;
import com.crm.objectRepository.DashboardPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.UpdatePageDataPage;

public class ManagePagesInAdminDashboard extends BaseClass {
	@Test
	public void managePagesInAdminDashboard()
	{
		//click on admin login link
		HomePage homePage=new HomePage(driver);
		homePage.getAdminLink().click();
		
		//enter the credentials in admin login page
		AdminPage adminPage=new AdminPage(driver);
		
		String ADUSERNAME=fLib.getPropertKeyValue("adminUsername");
		String ADPASS=fLib.getPropertKeyValue("adminPassword");
		adminPage.loginToApp(ADUSERNAME, ADPASS);
		
		//click on manage pages in admin dashboard page
		DashboardPage dashBoardPage=new DashboardPage(driver);
		dashBoardPage.getManagePages().click();
		
		//click on select page drop down
		UpdatePageDataPage updatePageDataPage=new UpdatePageDataPage(driver);
		String aboutUs=eLib.readDataFromExcel("updatePage", 3, 0);
		updatePageDataPage.SelectPageDropdown(aboutUs);
		
		
		//enter the updated text in package details text area
		String contactUs=eLib.readDataFromExcel("updatePage", 2, 1);
		updatePageDataPage.packageDetailsText(contactUs);
		
		//click on submit button
		updatePageDataPage.getSubmitBtn().click();
		
		//click on administrator link
		updatePageDataPage.getAdministratorLink().click();
		
		//click on logout link
		updatePageDataPage.getLogoutLink().click();
		
		
		
	}

}
