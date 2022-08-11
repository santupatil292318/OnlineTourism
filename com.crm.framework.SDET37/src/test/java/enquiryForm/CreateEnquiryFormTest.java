package enquiryForm;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.HomePage;
/**
 * 
 * @author Srimanth
 *
 */
public class CreateEnquiryFormTest extends BaseClass
{
	@Test
	public void CreateEnquiryForm()
	{	
		//after opening application click on Enquiry link
		HomePage homePage = new HomePage(driver);
		homePage.getEnquiryLink().click();

		String Fullname= eLib.readDataFromExcel("enquiryform", 1, 0);
		String email= eLib.readDataFromExcel("enquiryform", 1, 1);
		String number= eLib.readDataFromExcel("enquiryform", 1, 2);
		String Subject= eLib.readDataFromExcel("enquiryform", 1, 3);
		String Description= eLib.readDataFromExcel("enquiryform", 1, 4);
		String verifiedmessage=eLib.readDataFromExcel("enquiryform", 1, 5);
		//create enquire POM page object
		CreateEnquiryPage createEnquiryPage = new CreateEnquiryPage(driver);
		createEnquiryPage.enquiryForm(Fullname,email,number, Subject, Description);
		EnquirySuccessCreatedPage enquirySuccessCreatedPage = new EnquirySuccessCreatedPage(driver);
		String actualText = enquirySuccessCreatedPage.getverifysuccessMsgEdt().getText();
		String expectedtext=verifiedmessage;
		if(actualText.contains(expectedtext))
		{
			System.out.println("enquiryform is created");
		}
		else
		{
			System.out.println("enquiryform is not created");
		}




	}}

