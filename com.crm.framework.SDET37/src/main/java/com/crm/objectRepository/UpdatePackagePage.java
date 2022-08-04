package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author santu
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
	
}
