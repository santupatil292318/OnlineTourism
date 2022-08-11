package managePackages;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminPage;
import com.crm.objectRepository.HomePage;

import managePackages.ManagePackagePage;

public class ManagePackageTest extends BaseClass
{
	@Test
	public void managePackageTest()
	{	
		//after opening application click on admin link
		HomePage homePage = new HomePage(driver);
		homePage.getAdminLink().click();
		//fetch the login credentials from 

		String username= fLib.getPropertKeyValue("adminUsername");
		String password= fLib.getPropertKeyValue("adminPassword");
		AdminPage lpage=new AdminPage(driver);
		lpage.loginToApp(username, password);
		System.out.println("Login successful");

		ManagePackagePage mngPkgPage = new ManagePackagePage(driver);
		mngPkgPage.tourPkg(driver);
		mngPkgPage.clickOnManagePkg();
		
		mngPkgPage.clickViewDetails();
		String packagename = eLib.readDataFromExcel("managepkg", 1, 0);
		String packagetype = eLib.readDataFromExcel("managepkg", 1, 1);
		String packagelocation = eLib.readDataFromExcel("managepkg", 1, 2);
		String packageprice=eLib.readDataFromExcel("managepkg", 1, 3);
		String packagefeatures=eLib.readDataFromExcel("managepkg", 1, 4);
		String packagedetails=eLib.readDataFromExcel("managepkg", 1, 5);
		String verifymessage=eLib.readDataFromExcel("managepkg", 1, 6);
		UpdatePackagePage updtPkg = new UpdatePackagePage(driver);
		updtPkg.updatePackagePage(packagename,packagetype,packagelocation, packageprice, packagefeatures);
		wLib.scrollBarAction(driver);
		updtPkg.scl(packagedetails);
		ManagePkgVerify verifyMsg = new ManagePkgVerify(driver);
		String actualMsg=verifyMsg.getverifyPkgMsgEdt().getText();
		String expectedtext=verifymessage;
		if(actualMsg.contains(expectedtext))
		{
			System.out.println("package is updated");
		}
		else
		{
			System.out.println("package is not updated");
		}



	}}
