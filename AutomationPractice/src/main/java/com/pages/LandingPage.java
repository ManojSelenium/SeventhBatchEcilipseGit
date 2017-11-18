package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objrepo.LanidngPageProperty;
import com.util.WebDriverCode;

public class LandingPage extends WebDriverCode implements LanidngPageProperty{

	WebDriver driver;
	
	//Supply TestBase Driver Object into Landing Page
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickSignIn() {
		click(signinLocator);
	}
	
	
	
	public void clickContactus() {
		click(By.xpath(""));
	}
	
	public void searchForItem() {
		
	}
}
