package com.vtechsolution.orangehrm.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver ;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username' or @placeholder='Username']")
	WebElement txtUsername;

	@FindBy(xpath = "//input[@type='password' or @placeholder='password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@type='submit' or @text()='Login']")
	WebElement btnLogin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")
	WebElement Logo;
	

	
	public boolean verifylogo() {
		
		if(Logo.isDisplayed()) {
			
			return true;
			
		} else {
			
			return false;
		}
	}
	                                               
	public void enterUsername(String username) {   
		                                           
		try {                                      
			txtUsername.sendKeys(username);

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void enterPassword(String password) {
		
		try {
			
			txtPassword.sendKeys(password);
		
		} catch(Exception e) {
			e.getStackTrace();
		}
	}

	public void clickonLoginbutton() {
		
		try {
			btnLogin.click();
			
		} catch(Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
