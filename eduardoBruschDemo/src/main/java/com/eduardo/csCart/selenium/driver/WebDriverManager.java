package com.eduardo.csCart.selenium.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eduardo.csCart.common.enums.Constants;

public class WebDriverManager {

	private final String CHROME_DRIVER = "webdriver.chrome.driver";
	private String BROWSER = null;
	private WebDriver CURRENT_DRIVER = null;
	
	public WebDriverManager(String browser) {
		BROWSER = browser;
	}
	
	public void bootBrowser() {
		if(BROWSER.toLowerCase().equals("chrome")) {
			bootChrome();
		} else {
			throw new RuntimeException(Constants.ERROR_WRONG_BROWSER.get()); 
		}
	}
	
	private void bootChrome() {
		System.setProperty(CHROME_DRIVER,Constants.CHROME_DRIVER_LOCATION.get());
		CURRENT_DRIVER = new ChromeDriver();
		CURRENT_DRIVER.manage().window().maximize(); 
	}
	
	
	public WebDriver getDriver() {
		if(CURRENT_DRIVER == null) {
			bootBrowser();
		}
		return CURRENT_DRIVER;
	}
	
	public void waitElementVisible(By locator) {
		WebElement element = (new WebDriverWait(getDriver(), 10)).until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	
	
	
	
	


}
