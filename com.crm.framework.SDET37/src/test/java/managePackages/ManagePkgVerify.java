package managePackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePkgVerify 
{
	public ManagePkgVerify(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//strong[text()='SUCCESS']")
	private WebElement verifyPkgMsgEdt;


	public WebElement getverifyPkgMsgEdt() 
	{
		return verifyPkgMsgEdt;	
	}
}
