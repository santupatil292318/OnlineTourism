package createTourPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.IConstants;
import com.crm.genericUtilities.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author Srimanth
 *
 */
public class CreatePackagePage extends WebDriverUtility
{
	public CreatePackagePage(WebDriver driver)
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

	// click on create package link
	@FindBy(xpath = "//a[text()='Create']")
	public WebElement createPkgLinkEdt;

	public void clickOnCreatePkg()
	{
		createPkgLinkEdt.click();
	}
	// click TMS link to scroll upward in page

	@FindBy(xpath = "//a[text()='TMS']")
	public WebElement tmsEdt;

	public void clickOnTms()
	{
		tmsEdt.click();
	}

	//elements found using for all text fields in create package page

	@FindBy(id = "packagename")
	public WebElement packagenameEdt;

	@FindBy(id = "packagetype")
	public WebElement packagetypeEdt;

	@FindBy(id = "packagelocation")
	public WebElement packagelocationEdt;

	@FindBy(id = "packageprice")
	public WebElement packagepriceEdt;

	@FindBy(id = "packagefeatures")
	public WebElement packagefeaturesEdt;

	@FindBy(id = "packagedetails")
	public WebElement packagedetailsEdt;

	@FindBy(id = "packageimage")
	public WebElement packageimageChooseFilebtnEdt;

	@FindBy(name = "submit")
	public WebElement createbtnEdt;

	@FindBy(xpath = "//button[text()='Reset']")
	public WebElement resetbtnEdt;

	// getters method for all the found elements

	public WebElement getCreatePkgLinkEdt() 
	{
		return createPkgLinkEdt;
	}

	public WebElement getPackagenameEdt() 
	{
		return packagenameEdt;
	}

	public WebElement getPackagetypeEdt() 
	{
		return packagetypeEdt;
	}

	public WebElement getpackagelocationEdt() 
	{
		return packagelocationEdt;
	}

	public WebElement getPackagepriceEdt() {
		return packagepriceEdt;
	}



	public WebElement getPackagefeaturesEdt() {
		return packagefeaturesEdt;
	}

	public WebElement getPackagedetailsEdt() {
		return packagedetailsEdt;
	}

	public WebElement getPackageimageChooseFilebtnEdt() 
	{
		return packageimageChooseFilebtnEdt;
	}

	public WebElement getcreatebtn() 
	{
		return createbtnEdt;
	}
	public WebElement getresetbtnEdt() 
	{
		return resetbtnEdt;
	}

	//method implementation for create tour package page

	public void createTourPackage(String packagename, String packagetype,String packagelocation, String packageprice, String packagefeatures) 
	{
		
		packagenameEdt.sendKeys(packagename);
		packagetypeEdt.sendKeys(packagetype);
		
		packagelocationEdt.sendKeys(packagelocation);
		packagepriceEdt.sendKeys(packageprice);
		packagefeaturesEdt.sendKeys(packagefeatures);
	}
	public void scl(String packagedetail) 
	{	
		packagedetailsEdt.sendKeys(packagedetail);
	    packageimageChooseFilebtnEdt.sendKeys(IConstants.imagepath);
		createbtnEdt.click();
	}

	//method implementation for reset create tour package page

	public void resetTourPackage(String packagename, String packagetype,String packagelocation, String packageprice, String packagefeatures, String packagedetails) 
	{
		packagenameEdt.sendKeys(packagename);
		packagetypeEdt.sendKeys(packagetype);
		packagelocationEdt.sendKeys(packagetype);
		packagelocationEdt.sendKeys(packagelocation);
		packagepriceEdt.sendKeys(packageprice);
		packagefeaturesEdt.sendKeys(packagefeatures);
		packagedetailsEdt.sendKeys(packagedetails);
		packageimageChooseFilebtnEdt.sendKeys(IConstants.imagepath);
		resetbtnEdt.click();
	}
}
