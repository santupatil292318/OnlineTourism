package managePackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class ManagePackagePage extends WebDriverUtility
{
	public ManagePackagePage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
	//mousehover on tour package element

	@FindBy(xpath = " //span[text()=' Tour Packages']")
	private WebElement hoverOnTPEdt;

	public WebElement gethoverOnTPEdt() 
	{
		return 	hoverOnTPEdt;
	}

	public void tourPkg(WebDriver driver)
	{
		mouseOverAnElement(driver, hoverOnTPEdt);
	}
	//click on manage link
	@FindBy(xpath = "//a[text()='Manage']")
	private WebElement managePkgLinkEdt;

	public WebElement getmanagePkgLinkEdt()
	{
		return managePkgLinkEdt;
	}

	public void clickOnManagePkg()
	{
		managePkgLinkEdt.click();
	}

	@FindBy(xpath = "//a[@href='update-package.php?pid=1']")
	private WebElement viewDetailsEt;

	public WebElement getviewDetailsEt()
	{
		return viewDetailsEt;
	}


	public void clickViewDetails()
	{
		viewDetailsEt.click();
	}
}
