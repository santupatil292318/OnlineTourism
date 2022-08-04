package com.crm.createUser;

import com.crm.genericUtilities.BaseClass;

public class CreateAUserAndVerifyTest extends BaseClass{
	
	public void createAUserAndVerifyTest() {
		String newUSerName = eLib.readDataFromExcel("NewUser", 1, 0)+jLib.getRandomNumber();
		String phNum = eLib.readDataFromExcel("NewUser", 1, 1);
		String emailID = eLib.readDataFromExcel("NewUser", 1, 2)+jLib.getRandomNumber();
		String passWord = eLib.readDataFromExcel("NewUser", 1, 2);
		
		
		
		
	}
	

}
