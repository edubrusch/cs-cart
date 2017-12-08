package com.eduardo.csCart.selenium.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eduardo.csCart.selenium.driver.WebDriverManager;
import com.eduardo.csCart.selenium.enums.Locators;

public class PaginaPesquisa extends PaginaGenerica {

	public PaginaPesquisa(WebDriverManager driver) {
		super(driver);
		
	}

	public void selecionarPorNome(String string) {
		WebElement linkProd = getDriver().findElement(By.linkText(string));
		linkProd.click();
		waitElementVisible(By.xpath(Locators.ITEM_DRILLDOWN_LOADED.get()));
		
	}

}
