package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author neetha
 *
 */
public class UpdatePackagePage {
	
	//declaration
	@FindBy(id = "packagename")
	private WebElement packageNameEdt;
	
	@FindBy(id = "packagetype")
	private WebElement packageTypeEdt;
	
	@FindBy(id = "packagelocation")
	private WebElement packageLocationEdt;
	
	@FindBy(id = "packageprice")
	private WebElement packagepriceEdt;
	
	@FindBy(id = "packagefeatures")
	private WebElement packagefeaturesEdt;
	
	@FindBy(id = "packagedetails")
	private WebElement packagedetalsEdt;
	
	@FindBy(linkText = "Change Image")
	private WebElement changeImage;
	
	@FindBy(name = "submit")
	private WebElement updateBtn;
	
	//initialization
	public UpdatePackagePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	
	public WebElement getPackageNameEdt() {
		return packageNameEdt;
	}

	public WebElement getPackageTypeEdt() {
		return packageTypeEdt;
	}

	public WebElement getPackageLocationEdt() {
		return packageLocationEdt;
	}

	public WebElement getPackagepriceEdt() {
		return packagepriceEdt;
	}

	public WebElement getPackagefeaturesEdt() {
		return packagefeaturesEdt;
	}

	public WebElement getPackagedetalsEdt() {
		return packagedetalsEdt;
	}

	public WebElement getChangeImage() {
		return changeImage;
	}

	public WebElement getUpdateBtn() {
		return updateBtn;
	}
	public void packageNameEDT(String pkgName) {
		packageNameEdt.clear();
		packageNameEdt.sendKeys(pkgName);
		
	}
	public void packageTypeEDT(String PkgType) {
		packageTypeEdt.clear();
		packageTypeEdt.sendKeys(PkgType);
	}
	
	public void packageLocationEDT( String PkgLoc) 
	{
		packageLocationEdt.clear();
		packageLocationEdt.sendKeys(PkgLoc);
	}
	public void PackagepriceEDT(String PkgPrice) {
		packagepriceEdt.clear();
		packagepriceEdt.sendKeys(PkgPrice);
	}
	public void PackagefeatureEDT(String PkgFeature) {
		packagefeaturesEdt.clear();
		packagefeaturesEdt.sendKeys(PkgFeature);
	}
	public void PackagedetailsEDT(String PkgDetails) {
	    packagedetalsEdt.clear();
	    packagedetalsEdt.sendKeys(PkgDetails);
	}
}
	

