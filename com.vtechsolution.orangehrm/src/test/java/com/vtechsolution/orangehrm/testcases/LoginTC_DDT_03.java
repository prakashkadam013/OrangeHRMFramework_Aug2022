package com.vtechsolution.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtechsolution.orangehrm.page.object.NewLoginPage;
import com.vtechsolution.orangehrm.testbase.NewTestBase;
import com.vtechsolution.orangehrm.utility.ExcelDataProvider;

public class LoginTC_DDT_03 extends NewTestBase {
	
	NewLoginPage nlp;
	public static ExcelDataProvider exceldataprovider = new ExcelDataProvider("./TestData/Data.xlsx");
	
	@Test(dataProvider="getData")
	public void Login_DDT_TC(String username, String password) {
		nlp = new NewLoginPage(driver);
		
		
		nlp.enterusername(username);
		nlp.enterpassword(password);
		nlp.clickonbtn();
		 
		if(driver.getPageSource().contains("Dashboard")) {
			
			Assert.assertTrue(true);
			System.out.println("Login success");
		} else if(driver.getPageSource().contains("Invalid credentials")) {
			Assert.assertTrue(true);
			System.out.println("Invalid Credential Login fail");
		} else {
			Assert.assertTrue(false);
			System.out.println("Login fail");
		}
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = ExcelDataProvider.getExcelData("Sheet1");
		return data;
	}
	
		
	

}
