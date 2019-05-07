/*Author: Ellen Joyce
Desenvolvimento projeto Home Work*/

package curso.treinamento.steps;

import java.awt.Menu;

import org.junit.Assert;

import com.google.common.base.Predicate;

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
	public void queEuEstejaNaTelaHome() {

		Assert.assertTrue("Tela Home não apresentada.", homePage.checkAposLogin());

	}

	@Quando("^acesso o menu Catalog$")
	public void acessoOMenuCatalog() {
		menuPage.clicarMenuCatalog();
	}

	@Quando("^acesso o menu Pricing$")
	public void acessoOMenuPricing() {
		menuPage.clicarMenuPricing();

	}

	@Então("^são apresentados os itens \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
	public void saoApresentadosOsItensdoMenuCatalog(String catalogs, String categories, String baseProduct,
			String allProducts, String productBundles, String addOnProducts, String productGroups,
			String productOptions, String cartRules, String manageInventory, String locations) {

		Assert.assertTrue("Menu Catalogs não foi apresentado.", 
				menuPage.subMenuCatalog.getText().equals(catalogs));
		Assert.assertTrue("Menu Categories não foi apresentado.",
				menuPage.subMenuCategories.getText().equals(categories));
		Assert.assertTrue("Menu Base Produc não foi apresentado.",
				menuPage.subMenuBaseProduct.getText().equals(baseProduct));
		Assert.assertTrue("Menu All Products não foi apresentado.",
				menuPage.subMenuAllProducts.getText().equals(allProducts));
		Assert.assertTrue("Menu Product Bundles não foi apresentado.",
				menuPage.subMenuProductBundles.getText().equals(productBundles));
		Assert.assertTrue("Menu Add On Products não foi apresentado.",
				menuPage.subMenuAddOnProducts.getText().equals(addOnProducts));
		Assert.assertTrue("Menu Product Groups não foi apresentado.",
				menuPage.subMenuProductGroups.getText().equals(productGroups));
		Assert.assertTrue("Menu Product Options não foi apresentado.",
				menuPage.subMenuProductOptions.getText().equals(productOptions));
		Assert.assertTrue("Menu Cart Rules não foi apresentado.",
				menuPage.subMenuCartRules.getText().equals(cartRules));
		Assert.assertTrue("Menu Manage Inventory não foi apresentado.",
				menuPage.subMenuManageInventory.getText().equals(manageInventory));
		Assert.assertTrue("Menu Locations não foi apresentado.", 
				menuPage.subMenuLocations.getText().equals(locations));
		
	}
		
		@Então("^sao apresentados os itens do menu \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" e \"([^\"]*)\"$")
		public void saoApresentadosOsItensDoMenu(String offers, String priceLists, String contracts, String sales, String offerCodes) {
		   Assert.assertTrue("Menu offers não foi apresentado.", menuPage.subMenuOffers.getText().equals(offers));
		   Assert.assertTrue("Menu Price lists não foi apresentado.",menuPage.subMenuPriceLists.getText().equals(priceLists));
		   Assert.assertTrue("Menu Contracts não foi apresentado.",menuPage.subMenuSales.getText().equals(sales));
		   Assert.assertTrue("Menu Offer Codes não foi apresentado.",menuPage.subOfferCodes.getText().equals(offerCodes));

	}

}
