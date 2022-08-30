package com.vtechsolution.orangehrm.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;

	@BeforeTest
	@Parameters({ "brname", "appUrl" })
	public void setup(@Optional("chrome") String browser,
			@Optional("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login") String url) {
		if (browser.equals("chrome")) {

//			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {

//			System.setProperty("webdriver.gecko.driver", "./Divers/geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {

			System.out.println("Browser exe doesnt match with required Browser");
		}

		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@AfterTest
	public void TearDown() throws InterruptedException {
		
		Thread.sleep(5000);

		driver.quit();

	}

}
