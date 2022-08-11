package manageBook;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AdminInfoPage;
import com.crm.objectRepository.AdminPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.ManageBookingsPage;
import com.crm.objectRepository.UpdatePackagePage;

/**
 * 
 * @author neetha
 *
 */
public class ManageBookingTest extends BaseClass
{
	@Test
public void ManageBooking() {
	
	//after opening application click on admin link
	HomePage homePage = new HomePage(driver);
	homePage.getAdminLink().click();
	
	//fetch the login credential form
	String username = fLib.getPropertKeyValue("adminUsername");
	String password = fLib.getPropertKeyValue("adminPassword");
    AdminPage adminPage= new AdminPage(driver);
    adminPage.loginToApp(username, password);
    
    AdminInfoPage adminInfoPage= new AdminInfoPage(driver);
    adminInfoPage.getManageBookingEdt().click();
    
    ManageBookingsPage manageBookingsPage = new ManageBookingsPage(driver);
    manageBookingsPage.getUpdateTripLinkEdt().click();
    
    UpdatePackagePage updateBookingpage = new UpdatePackagePage(driver);
    String PkgName= eLib.readDataFromExcel("updatePackage", 1, 0);
    updateBookingpage.packageNameEDT(PkgName);
    String PkgType= eLib.readDataFromExcel("updatePackage", 1, 1);
    updateBookingpage.packageTypeEDT(PkgType);
    String PkgLoc= eLib.readDataFromExcel("updatePackage", 1, 2);
    updateBookingpage.packageLocationEDT(PkgLoc);
    String PkgPrice= eLib.readDataFromExcel("updatePackage", 1, 3);
    updateBookingpage.PackagepriceEDT(PkgPrice);
    String PkgFeature= eLib.readDataFromExcel("updatePackage", 1, 4);
    updateBookingpage.PackagefeatureEDT(PkgFeature);
    String PkgDetails= eLib.readDataFromExcel("updatePackage", 1, 5);
    updateBookingpage.PackagedetailsEDT(PkgDetails);
    updateBookingpage.getUpdateBtn().click();
    }
}
