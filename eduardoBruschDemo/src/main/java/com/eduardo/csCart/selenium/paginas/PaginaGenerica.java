package com.eduardo.csCart.selenium.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.eduardo.csCart.selenium.driver.WebDriverManager;

public class PaginaGenerica {
	
	private WebDriverManager driver = null;
	
	public PaginaGenerica(WebDriverManager driver) {
		this.driver = driver;		
	}
	
	public void waitElementVisible(By locator) {
		driver.waitElementVisible(locator);
	}
	
	
	protected WebDriver getDriver() {
		return driver.getDriver();
	}
	
	
	public void clicaElemento(WebElement elemento) {
//		getDriver().
	}

}
