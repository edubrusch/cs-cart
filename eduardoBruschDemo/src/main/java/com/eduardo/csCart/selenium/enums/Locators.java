package com.eduardo.csCart.selenium.enums;

import java.util.Properties;

import com.eduardo.csCart.common.enums.Constants;

public enum Locators {

	HOME_LOADED_XPATH,
	HOME_FIELD_SEARCH_XPATH,
	HOME_BUTTON_SEARCH_XPATH,
	PRODUCT_SEARCH_LOADED,
	ITEM_DRILLDOWN_LOADED,
	ITEM_DRILLDOWN_ADDCART_XPATH,
	HOME_PAGE_ADDRESS, ITEM_DRILLDOWN_CONFIRM_CART_XPATH, ITEM_DRILLDOWN_CONFIRM_CLOSE, ITEM_DRILLDOWN_CART_BUTTON_XPATH,ITEM_DRILLDOWN_CART_VER_XPATH, BUY_CAR_LOADED, ITEM_DRILLDOWN_CART_SHOW_XPATH, ;

	public String get() {
		Properties locators = new Properties();

		try {
			locators.load(ClassLoader.getSystemResourceAsStream(Constants.LOCATORS_FILE.get()));

		} catch (Exception e) {
			throw new RuntimeException(Constants.ERROR_LOAD_FILE.get(), e);
		}
		return locators.getProperty(this.name());
	}

}
