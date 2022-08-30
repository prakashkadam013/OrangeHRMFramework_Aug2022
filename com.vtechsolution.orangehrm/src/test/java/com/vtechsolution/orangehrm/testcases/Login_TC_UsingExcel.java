package com.vtechsolution.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution.orangehrm.page.object.NewLoginPage;
import com.vtechsolution.orangehrm.testbase.TestBase;
import com.vtechsolution.orangehrm.utility.ExcelDataProvider;

public class Login_TC_UsingExcel extends TestBase{

	NewLoginPage nlp;
	static ExcelDataProvider exceldataprovider;
	
	
	@Test
	public void LoginTC_002() {
		
		NewLoginPage nlp = new NewLoginPage(driver);
		
		exceldataprovider = new ExcelDataProvider("./TestData/Data.xlsx");
		
		nlp.enterusername(ExcelDataProvider.getStringCellData(0, 1, 1));
		nlp.enterpassword(ExcelDataProvider.getStringCellData(0, 1, 2));
		
		nlp.clickonbtn();
		
		if(driver.getPageSource().contains("Dashboard")) {
			Assert.assertTrue(true);
			System.out.println("Login is success");
		} else {
			Assert.assertTrue(false);
			System.out.println("Login is fail");
		}
	}
}
