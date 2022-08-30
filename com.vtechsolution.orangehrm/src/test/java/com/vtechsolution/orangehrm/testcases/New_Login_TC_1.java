
package com.vtechsolution.orangehrm.testcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution.orangehrm.page.object.NewLoginPage;
import com.vtechsolution.orangehrm.testbase.NewTestBase;

public class New_Login_TC_1 extends NewTestBase {

	NewLoginPage lp;

	@Test(priority=1)
	public void verifyurl_TC1() {

		if (driver.getTitle().equals("OrangeHRM")) {

			Assert.assertTrue(true);
			System.out.println("Url is verified");

		} else {
			Assert.assertTrue(false);
			System.out.println("url is not veridied");
		}

	}
	
	@Test(priority=3,enabled=false)
	public void verifylogin_TC2() {
		
		lp = new NewLoginPage(driver);
		lp.enterusername(username);
		lp.enterpassword(password);
		lp.clickonbtn();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		if ((driver.findElement(By.className("oxd-userdropdown-img")).isDisplayed())){
			
			Assert.assertTrue(true);
			System.out.println("Sucessfully Login");
			
		} else {
			Assert.assertTrue(false);
			System.out.println("Not Sucessfully Login");
		}
		
		
	}
	
	@Test(priority=4,enabled=false)
	public void verifyloginpage_TC3() {
		
		if (driver.getTitle().equals("OrangeHRM")) {
			
			Assert.assertTrue(true);
			System.out.println("U r on Homepage");
			
		} else {
			Assert.assertTrue(false);
			System.out.println("U r not on Homepage");
		}
	}
	
	
	@Test(priority=2)
	public void verifylinks_TC4() {
		lp = new NewLoginPage(driver);
		lp.verifyfblink();
		lp.verifylilink();
		lp.verifytwlink();
		lp.verifyytlink();
	}
	
	
}
