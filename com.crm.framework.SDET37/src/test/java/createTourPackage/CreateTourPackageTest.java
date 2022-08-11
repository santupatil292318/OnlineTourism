package createTourPackage;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminPage;

import com.crm.objectRepository.HomePage;
/**
 * 
 * @author Srimanth
 *
 */


public class CreateTourPackageTest extends BaseClass
{


	@Test
	public void createTourPackage()
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

		CreatePackagePage createPkgPage = new CreatePackagePage(driver);
		createPkgPage.tourPkg(driver);
		createPkgPage.clickOnCreatePkg();
		//fetch the data from properties file



		String packagename = eLib.readDataFromExcel("createpackagedetails", 1, 0);
		String packagetype = eLib.readDataFromExcel("createpackagedetails", 1, 1);
		String packagelocation = eLib.readDataFromExcel("createpackagedetails", 1, 2);
		String packageprice=eLib.readDataFromExcel("createpackagedetails", 1, 3);
		String packagefeatures=eLib.readDataFromExcel("createpackagedetails", 1, 4);
		String packagedetails=eLib.readDataFromExcel("createpackagedetails", 1, 5);
		String verifymessage=eLib.readDataFromExcel("createpackagedetails", 1, 6);
		createPkgPage.createTourPackage(packagename, packagetype, packagelocation, packageprice, packagefeatures);
		wLib.scrollBarAction(driver);
		createPkgPage.scl(packagedetails);
		CreatePackageInfo createPackageInfo = new CreatePackageInfo(driver);
		String actualText = createPackageInfo.getVerifyMsgEdt().getText();
		String expectedtext=verifymessage;
		if(actualText.contains(expectedtext))
		{
			System.out.println("package is created");
		}
		else
		{
			System.out.println("package is not created");
		}

	}}


