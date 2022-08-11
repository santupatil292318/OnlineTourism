package managePackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.IConstants;

public class UpdatePackagePage 
{
	public UpdatePackagePage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}
	//locate all text field elements
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

	@FindBy(xpath = "//a[text()='Change Image']")
	public WebElement changeImgLink;
	
	@FindBy(xpath = "//button[text()='Update']")
	public WebElement updatebtn;

	// getters method for all the found elements


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
	public WebElement getchangeImgLink()
	{
		return changeImgLink;
	}


	//method implementation for create tour package page

	public void updatePackagePage(String packagename, String packagetype,String packagelocation, String packageprice, String packagefeatures) 
	{
		packagenameEdt.clear();
		packagenameEdt.sendKeys(packagename);

		packagetypeEdt.clear();
		packagetypeEdt.sendKeys(packagetype);

		packagelocationEdt.clear();
		packagelocationEdt.sendKeys(packagelocation);

		packagepriceEdt.clear();
		packagepriceEdt.sendKeys(packageprice);

		packagefeaturesEdt.clear();
		packagefeaturesEdt.sendKeys(packagefeatures);
	}
	public void scl(String packagedetail) 
	{	
		packagedetailsEdt.clear();
		packagedetailsEdt.sendKeys(packagedetail);
		 
		changeImgLink.click();


		packageimageChooseFilebtnEdt.sendKeys(IConstants.imgpat);
		updatebtn.click();
	}


}
