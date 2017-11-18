package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase implements SetUp{

	public WebDriver driver;
	/** Creating WebDriver Object and returning the same
	 * @return WebDriver Object
	 */
	public WebDriver intilizeBrowser() {
		System.setProperty(CHROMEKEY, CHROMEPATH);
		 driver=new ChromeDriver();
		 System.out.println("TestBase ::: "+driver);
		 return driver;
	}
	
	
	public void enterURL(String sURL) {
		driver.get(sURL);
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
