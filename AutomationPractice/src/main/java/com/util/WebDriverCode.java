package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCode {

	WebDriver driver;
	
	public WebDriverCode(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		driver.findElement(prop).sendKeys(testData);
	}
	
	public void selectValue(By prop,String label) {
		new Select(driver.findElement(prop)).selectByValue(label);
	}
	
	public String getAttribute(By prop,String key) {
		return driver.findElement(prop).getAttribute(key);
	}
}
