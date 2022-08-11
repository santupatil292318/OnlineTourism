package createTourPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Srimanth
 *
 */


public class CreatePackageInfo 
{
	public CreatePackageInfo(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//strong[text()='SUCCESS']")
	private WebElement verifyMsgEdt;
     
	
	public WebElement getVerifyMsgEdt() 
	{
	return verifyMsgEdt;	
	}
}
