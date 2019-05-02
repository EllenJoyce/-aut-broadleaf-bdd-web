package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement campoUsuario;

	@FindBy(name = "password")
	WebElement campoPassword;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement botaoSign;

	@FindBy(xpath = "//div[@class='alert alert-danger']//div")
	WebElement msgLoginIncorreto;

	public boolean checkPage() {
		return botaoSign.isDisplayed();

	}

	public void realizarLogin(String user, String pass) {
		campoUsuario.sendKeys(user);
		campoPassword.sendKeys(pass);
		botaoSign.click();
	}

	public boolean checkMsgLoginIncorreto(String mensagem) {
		return msgLoginIncorreto.getText().equals(mensagem);

	}

}