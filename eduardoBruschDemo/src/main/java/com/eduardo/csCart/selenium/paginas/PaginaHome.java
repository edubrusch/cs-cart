package com.eduardo.csCart.selenium.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eduardo.csCart.selenium.driver.WebDriverManager;
import com.eduardo.csCart.selenium.enums.Locators;

public class PaginaHome extends PaginaGenerica {
	
	private final String HOME_PAGE_LINK = "http://demo.cs-cart.com/"; 

	public PaginaHome(WebDriverManager driver) {
		super(driver);
	}

	public void abrirHomePage() {
		
		getDriver().get(HOME_PAGE_LINK);
		waitElementVisible(By.xpath(Locators.HOME_LOADED_XPATH.get()));
		//getDriver().findElement(By.xpath(Locators.HOME_FIELD_SEARCH_XPATH.get())).click();
		
	}
	

	public void pesquisarProduto(String string) {
		
		WebElement searchfi = getDriver().findElement(By.xpath(Locators.HOME_FIELD_SEARCH_XPATH.get()));
		WebElement searchbt = getDriver().findElement(By.xpath(Locators.HOME_BUTTON_SEARCH_XPATH.get()));
		
		searchfi.click();
		searchfi.sendKeys(string);
		searchbt.click();
		waitElementVisible(By.xpath(Locators.PRODUCT_SEARCH_LOADED.get()));
		
	}

}
