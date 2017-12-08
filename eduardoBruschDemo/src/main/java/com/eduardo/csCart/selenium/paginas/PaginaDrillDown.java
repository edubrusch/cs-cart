package com.eduardo.csCart.selenium.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.eduardo.csCart.selenium.driver.WebDriverManager;
import com.eduardo.csCart.selenium.enums.Locators;

public class PaginaDrillDown extends PaginaGenerica {

	public PaginaDrillDown(WebDriverManager driver) {
		super(driver);
		
	}

	public void adicionarCarrinho() {
		WebElement carrinhoAdd = getDriver().findElement(By.xpath(Locators.ITEM_DRILLDOWN_ADDCART_XPATH.get()));
		carrinhoAdd.click();
		waitElementVisible(By.xpath(Locators.ITEM_DRILLDOWN_CONFIRM_CART_XPATH.get()));
		WebElement carrinhoConfirm = getDriver().findElement(By.xpath(Locators.ITEM_DRILLDOWN_CONFIRM_CLOSE.get()));
		carrinhoConfirm.click();
		waitElementVisible(By.xpath(Locators.ITEM_DRILLDOWN_ADDCART_XPATH.get()));
		
	}

	public void pesquisarProduto(String string) {
		
		WebElement searchfi = getDriver().findElement(By.xpath(Locators.HOME_FIELD_SEARCH_XPATH.get()));
		Actions actions = new Actions(getDriver());
		actions.moveToElement(searchfi).click().build().perform();		
		WebElement searchbt = getDriver().findElement(By.xpath(Locators.HOME_BUTTON_SEARCH_XPATH.get()));
		
		searchfi.click();
		searchfi.sendKeys(string);
		searchbt.click();
		waitElementVisible(By.xpath(Locators.PRODUCT_SEARCH_LOADED.get()));
		
	}

	public void clicarCarrinhoCompras() {
		getDriver().switchTo().defaultContent();
		WebElement carrinhoShow = getDriver().findElement(By.xpath(Locators.ITEM_DRILLDOWN_CART_SHOW_XPATH.get()));
		carrinhoShow.click();
		waitElementVisible(By.xpath(Locators.ITEM_DRILLDOWN_CART_VER_XPATH.get()));
		WebElement carrinhobt = getDriver().findElement(By.xpath(Locators.ITEM_DRILLDOWN_CART_VER_XPATH.get()));
		carrinhobt.click();
		waitElementVisible(By.xpath(Locators.BUY_CAR_LOADED.get()));
	}

}
