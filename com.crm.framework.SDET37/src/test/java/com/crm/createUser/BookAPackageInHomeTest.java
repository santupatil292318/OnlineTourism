package com.crm.createUser;

import org.openqa.selenium.By;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.BookAPackageInHomePage;

public class BookAPackageInHomeTest extends BaseClass{
	public void bookAPackageInHomeTest() {
		
	BookAPackageInHomePage bookPackage = new BookAPackageInHomePage(driver);
	driver.findElement(By.xpath("//h4[text()='Package Name: Kerla']/../..//a")).click();
	
	
	
	}

}
