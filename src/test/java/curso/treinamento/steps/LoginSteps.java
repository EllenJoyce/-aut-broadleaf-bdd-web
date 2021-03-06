package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.LoginPage;
import curso.treinamento.setup.Hooks;


public class LoginSteps {

	private LoginPage loginPage = new LoginPage(Hooks.getDriver());

	@Dado("^que eu esteja na tela de login​$")
	public void queEuEstejaNaTelaDeLogin​() {
	
		Assert.assertTrue("Página Login não foi apresentada", loginPage.checkPage());
	}

	@Quando("^faço login com o usuário \"([^\"]*)\" e senha \"([^\"]*)\" ​$")
	public void façoLoginComOUsuárioESenha​(String user, String pass){
		
		loginPage.realizarLogin(user, pass);
		
	}

	@Então("^sou autenticado com sucesso$")
	public void sou_autenticado_com_sucesso() {
		
		
	}

}
