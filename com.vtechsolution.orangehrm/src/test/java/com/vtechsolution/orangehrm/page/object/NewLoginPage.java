package com.vtechsolution.orangehrm.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLoginPage {
	
	public WebDriver driver;
	
	public NewLoginPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//input[@name='username']")
	WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;

	@FindBy(xpath= "//button[@type='submit']")
	WebElement btn;
	
	@FindBy(xpath="//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	WebElement li;
	
	@FindBy(xpath="//a[@href='https://www.facebook.com/OrangeHRM/']")
	WebElement fb;
	
	@FindBy(xpath="//a[@href='https://twitter.com/orangehrm?lang=en']")
	WebElement tw;
	
	@FindBy(xpath="//a[@href='https://www.youtube.com/c/OrangeHRMInc']")
	WebElement yt;
	
	public void enterusername(String username) {
		
		uname.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		
		pwd.sendKeys(password);
	}
	
	public void clickonbtn() {
		
		btn.click();
	}
	
	public boolean verifylilink() {
		
		if(li.isDisplayed()) {
			System.out.println("Li link is displayed");
			return true;
		
		}else {
			System.out.println("Li link is not displayed");
			return false;
		}
	}
		
	public boolean verifyfblink() {
	
		if (fb.isDisplayed()) {
			System.out.println("Fb link is displayed");
			return true;
		} else {
			System.out.println("Fb link is not displayed");
			return false;
		}
	}
	
	public boolean verifytwlink() {
		if (tw.isDisplayed()) {
			System.out.println("Tw link is displayed");
			return true;
		} else {
			System.out.println("Tw link is not displayed");
			return false;
		}
	}
	
	public boolean verifyytlink() {
		if (yt.isDisplayed()) {
			System.out.println("Yt link is displayed");
			return true;
		} else {
			System.out.println("Yt link is not displayed");
			return false;
		}
	}
	
	public void clickonlilink(){
		
		li.click();
	}
	
	public void clickonfblink(){
		
		fb.click();
	}
	
	public void clickontwlink(){
		
		tw.click();
	}
	
	public void clickonytlink(){
		
		yt.click();
	}
}
