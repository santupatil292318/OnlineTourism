package enquiryForm;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Srimanth
 *
 */

public class EnquirySuccessCreatedPage 
{
	public  EnquirySuccessCreatedPage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//strong[text()='SUCCESS']")
	private WebElement verifysuccessMsgEdt;


	public WebElement getverifysuccessMsgEdt() 
	{
		return verifysuccessMsgEdt;	
	}
}

