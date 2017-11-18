package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.objrepo.SignInPageProperty;
import com.util.WebDriverCode;

public class SignInPage extends WebDriverCode implements SignInPageProperty{
	
	WebDriver driver;
	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public void enterEmailAddrss_CreateAccount(String testData) {
		
		enterText(emailAddress_CALocator,testData);
	}

	public void enterEmailAddrss_RegistredUser() {

	}
	
	public void click_CreateAccountButton() {
		click(createAccountLocator);
	}
	
	public void clickSignIn(){
		
	}
	
	public void click_ForgotPassword() {
		
	}
}
