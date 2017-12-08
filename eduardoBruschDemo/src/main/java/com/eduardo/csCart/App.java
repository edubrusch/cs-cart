package com.eduardo.csCart;

import com.eduardo.csCart.selenium.driver.WebDriverManager;
import com.eduardo.csCart.selenium.paginas.PaginaCarrinho;
import com.eduardo.csCart.selenium.paginas.PaginaDrillDown;
import com.eduardo.csCart.selenium.paginas.PaginaHome;
import com.eduardo.csCart.selenium.paginas.PaginaPesquisa;

import junit.framework.Assert;

/**
 * Passo a passo:
 * 1.Acessar o site: http://demo.cs-cart.com/. 
 * 2.No campo  “Procurar Produtos” pesquise usando o valor “Batman”. 
 * 3.No resultado da pesquisa clique em um dos resultados apresentados. 
 * 4.Na tela do produto pressione o botão “Adicionar ao carrinho”.
 * 5.Repita os passos 2 a 4, pesquisando pelo item “PS3”.
 * 6.Valide no carrinho de compras se os produtos foram adicionados com sucesso.
 */

public class App 
{
    public static void main( String[] args )
    {
    
    	final String jogo_batman = "Lego Batman (Wii)";
    	final String jogo_ps3 = "Lord of the Rings: War in the North(PS3)";
    	final String search_key_1 = "batman";
    	final String search_key_2 = "PS3";    	
    	
    	
    	WebDriverManager driver = new WebDriverManager("chrome");
    	PaginaHome home = new PaginaHome(driver);
    	PaginaPesquisa pesquisa = new PaginaPesquisa(driver);
    	PaginaDrillDown drillDown = new PaginaDrillDown(driver);
    	PaginaCarrinho carrinho = new PaginaCarrinho(driver);
    	
    	home.abrirHomePage();
    	home.pesquisarProduto(search_key_1);
    	pesquisa.selecionarPorNome(jogo_batman);
    	drillDown.adicionarCarrinho();
    	drillDown.pesquisarProduto(search_key_2);
    	pesquisa.selecionarPorNome(jogo_ps3);
    	drillDown.adicionarCarrinho();    	
    	drillDown.clicarCarrinhoCompras();    	
    	Assert.assertTrue(carrinho.existeProdutoNome(jogo_batman));
    	Assert.assertTrue(carrinho.existeProdutoNome(jogo_ps3));
        
    }
    
	

}



