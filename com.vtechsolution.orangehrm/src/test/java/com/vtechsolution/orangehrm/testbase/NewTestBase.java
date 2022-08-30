package com.vtechsolution.orangehrm.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.vtechsolution.orangehrm.utility.Readconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestBase {

	static Readconfig readconfig = new Readconfig();
	public static WebDriver driver;
	public static String url = readconfig.geturl();
	public String username = readconfig.enterusername();
	public String password = readconfig.enterpassword();
	
	
	
	
	@BeforeMethod
	public static void Launchbrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public static void closethebrowser() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
}
