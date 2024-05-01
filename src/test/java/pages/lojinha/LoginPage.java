package pages.lojinha;

import core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "usuario")
    private WebElement campoUsuario;
    @FindBy(id = "senha")
    private WebElement campoSenha;
    @FindBy(css = "button[type=submit]")
    private WebElement botaoEntrar;

    public void abrirPaginaLogin(){
        Driver.getBrowser().get(PATH);
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
