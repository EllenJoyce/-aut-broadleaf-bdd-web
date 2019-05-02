package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;


public class ItensMenuSteps {

	private HomePage homePage = new HomePage(Hooks.getDriver());
	private MenuPage menuPage = new MenuPage(Hooks.getDriver());
	
	@Dado("^que eu esteja na tela Home$")
	public void queEuEstejaNaTelaHome()  {
		
		Assert.assertTrue("Tela Home não apresentada.", homePage.checkAposLogin());
	  
	}

	@Quando("^acesso o menu Catalog$")
	public void acessoOMenuCatalog()  {
		menuPage.clicarMenuCatalog();
	}

	@Então("^são apresentados os itens \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
	public void saoApresentadosOsItensdoMenuCatalog(String catalogs, String categories, String baseProduct, String allProducts, 
			String productBundles, String addOnProducts, String productGroups, String productOptions, String cartRules, String manageInventory, String locations)  {
		
		
		Assert.assertTrue("Menu Catalogs não foi apresentado.", menuPage.subMenuCatalog.getText().equals(catalogs) );
		
		
		
		
		
	}
	
}