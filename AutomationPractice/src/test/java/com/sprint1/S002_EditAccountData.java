package com.sprint1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.util.TestBase;

public class S002_EditAccountData extends TestBase{

	@BeforeMethod
	public void setp() {
		intilizeBrowser();
	}
	
	
	@Test
	public void editAccountWithMandatoryFields() {
		
	}
	
	@Test
	public void editAccountWithOptionalFields() {
		
	}
}
