package com.sprint1;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.CreateAccountPage;
import com.pages.LandingPage;
import com.pages.SignInPage;
import com.util.TestBase;

public class S001_CreateAccountTest extends TestBase{
LandingPage landingPage;
SignInPage signinPage;
CreateAccountPage createaccountPage;
	@BeforeMethod
	public void setUp() {
		driver=intilizeBrowser();
		enterURL("http://automationpractice.com/index.php");
		landingPage=new LandingPage(driver);
		signinPage=new SignInPage(driver);
		createaccountPage=new CreateAccountPage(driver);
	}
	
	
	@Test
	public void createAccount_MandatoryFields() throws InterruptedException {
		
		String firstNameData=RandomStringUtils.randomAlphabetic(5);
		String lastNameData=RandomStringUtils.randomAlphabetic(5);
		landingPage.clickSignIn();
		Thread.sleep(6000);
		signinPage.enterEmailAddrss_CreateAccount(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
		signinPage.click_CreateAccountButton();
		Thread.sleep(6000);
		createaccountPage.clickTitle();
		createaccountPage.enter_PI_FirstName(firstNameData);
		createaccountPage.enter_PI_LastName(lastNameData);
		createaccountPage.enter_PI_Password("selenium");
		System.out.println("Expected FirstName and LastName ::: "+firstNameData+" "+lastNameData);
		
		String firstName=createaccountPage.getFirstNameValue();
		System.out.println("FirstName : "+firstName);
		String lastName=createaccountPage.getLastNameValue();
		System.out.println("LastName : "+lastName);
		Assert.assertEquals(firstName, firstNameData);
		Assert.assertEquals(lastName, lastNameData);
	}
	
	@Test
	public void createAccount_OptinalFields() throws InterruptedException {
		landingPage.clickSignIn();
		Thread.sleep(6000);
		signinPage.enterEmailAddrss_CreateAccount(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
	}
	
	//@AfterMethod()
	public void browserQuit() {
		closeBrowser();
	}
}
