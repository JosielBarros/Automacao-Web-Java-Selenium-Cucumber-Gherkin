package steps.lojinha;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static core.InitializePage.paginaListaProduto;
import static core.InitializePage.paginaLogin;

public class LoginSteps {

    @Dado("que acesso a pagina de login")
    public void queAcessoAPaginaDeLogin() {
        paginaLogin().abrirPaginaLogin();
    }
    @Quando("submeto meus dados de usuario {string} e senha {string}")
    public void submetoMeusDadosDeUsuarioComESenhaCom(String usuario, String senha) {
        paginaLogin().preencherFormularioLogin(usuario, senha)
            .submeterFormulario();
    }
    @Entao("valido que acessei a minha pagina de usuario")
    public void validoQueAcesseiAMinhaPaginaDeUsuario() {
        Assertions.assertEquals("Boas vindas, Jhon!", paginaListaProduto().capturarNomeUsuarioNaPaginaSecreta());
    }
    @Entao("valido que exibicao da mensagem de erro")
    public void validoQueExibicaoDaMensagemDeErro() {
        String mensagemDeErro = paginaListaProduto().capturarMensagem();
        Assert.assertEquals("Falha ao fazer o login", mensagemDeErro);
    }
}
