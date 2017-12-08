package com.eduardo.csCart.common.enums;

public enum Constants {
	
	ERROR_LOAD_FILE("Erro ao carregar arquivos. Por favor, verifique a instala��o do projeto."),
	LOCATORS_FILE("locators/locators.properties"), 
	CHROME_DRIVER_LOCATION("lib/chromedriver.exe"),
	ERROR_WRONG_BROWSER("Browser n�o suportado para esta demonstra��o.");
	
	private final String string;

	Constants(String string) {
		this.string = string;
	}

	public String get() {
		return string;
	}

}
