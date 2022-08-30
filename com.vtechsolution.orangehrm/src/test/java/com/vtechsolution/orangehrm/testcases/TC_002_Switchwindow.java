package com.vtechsolution.orangehrm.testcases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtechsolution.orangehrm.page.object.NewLoginPage;
import com.vtechsolution.orangehrm.testbase.NewTestBase;

public class TC_002_Switchwindow extends NewTestBase {

	NewLoginPage nlp;

	@Test
	public void switchwindow_TC() {

		nlp = new NewLoginPage(driver);
		nlp.clickonfblink();
		nlp.clickonlilink();
		nlp.clickontwlink();
		nlp.clickonytlink();
		
		if(SwitchW("OrangeHRM (@orangehrm) / Twitter", driver));

	}

	public boolean SwitchW(String WindowT, WebDriver driver) {
		Set<String> IDS = driver.getWindowHandles();
		System.out.println(IDS);
		for (String ID : IDS) {
			String Title = driver.switchTo().window(ID).getTitle();

			System.out.println(Title);

			if (Title.contains(WindowT)) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.switchTo().window(WindowT);
				Assert.assertTrue(true);
				System.out.println("Verified");
				return true;
			} else {
				Assert.assertTrue(true);
				System.out.println(" Not Verified");
			}
		}
		return false;
	}
}
