package steps.lojinha;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;

import static core.InitializePage.paginaListaProduto;
import static core.InitializePage.paginaLogin;

public class LoginSteps {

    @Dado("que acesso a pagina de login")
    public void que_acesso_a_pagina_de_login() {
        paginaLogin().abrirPaginaLogin();
    }
    @Quando("submeto meus dados de autenticacao")
    public void submeto_meus_dados_de_autenticacao() {
        paginaLogin().preencherFormularioLogin("jhon", "123")
            .submeterFormulario();
    }
    @Entao("valido que acessei a minha pagina de usuario")
    public void valido_que_acessei_a_minha_pagina_de_usuario() {
        Assertions.assertEquals("Boas vindas, Jhon!", paginaListaProduto().capturarNomeUsuarioNaPaginaSecreta());
    }
}
