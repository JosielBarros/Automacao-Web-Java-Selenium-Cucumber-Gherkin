package features.pages.lojinha;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static support.hooks.Environment.browser;

public class LoginPage extends BasePage{
    @FindBy(id = "usuario")
    private WebElement campoUsuario;
    @FindBy(id = "senha")
    private WebElement campoSenha;
    @FindBy(css = "button[type=submit]")
    private WebElement botaoEntrar;

    public void abrirPaginaLogin(){
        browser.get(PATH);
    }
    public LoginPage preencherFormularioLogin(String usuario, String senha) {
        campoUsuario.sendKeys(usuario);
        campoSenha.sendKeys(senha);
        return this;
    }
    public void submeterFormulario(){
        botaoEntrar.click();
    }
}
