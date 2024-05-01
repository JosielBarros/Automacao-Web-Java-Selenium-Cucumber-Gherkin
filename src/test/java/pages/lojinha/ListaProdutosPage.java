package pages.lojinha;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListaProdutosPage extends BasePage{
    @FindBy(css = "#nav-mobile > li > a")
    private WebElement nomeUsuario;

    public String capturarNomeUsuarioNaPaginaSecreta(){
        return capturarTextoDoElemento(nomeUsuario);
    }
}
