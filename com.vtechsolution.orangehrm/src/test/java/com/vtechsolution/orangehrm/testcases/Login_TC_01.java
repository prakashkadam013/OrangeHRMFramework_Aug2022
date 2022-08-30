
package com.vtechsolution.orangehrm.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution.orangehrm.page.object.LoginPage;
import com.vtechsolution.orangehrm.testbase.TestBase;

public class Login_TC_01 extends TestBase {

	LoginPage lp;
	
	@Test(priority=3)
	public void loginTestTC1() {

		lp = new LoginPage(driver);
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickonLoginbutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		if (driver.findElement(By.className("oxd-userdropdown-img")).isDisplayed()) {

			Assert.assertTrue(true);

			System.out.println("Login is successful");
			
		} else {
			Assert.assertTrue(false);
			System.out.println("Login is not successful");

		}

	}
	
	
	@Test(priority=2)
	public void verifylogoTC2() {
		
		lp = new LoginPage(driver);
		
		if(lp.verifylogo()) {
			
			Assert.assertTrue(true);
			System.out.println("Logo is displayed ");
			
		}else {
			Assert.assertTrue(false);
			System.out.println("Logo is not display");
			
			
		}
		
	}
	
	
	@Test(priority=1)
	public void verifyLoginPageTitleTC3() {
		
		if(driver.getTitle().equals("OrangeHRM")) {
			
			Assert.assertTrue(true);
			System.out.println("Login page Title is verify");
			
		} else {
			
			Assert.assertTrue(false);
			
		System.out.println("Title is not verify");
		}
		
		
	}
}
