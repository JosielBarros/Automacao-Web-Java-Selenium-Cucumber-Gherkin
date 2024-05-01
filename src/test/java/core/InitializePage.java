package core;

import pages.lojinha.ListaProdutosPage;
import pages.lojinha.LoginPage;

public class InitializePage {
    public static LoginPage paginaLogin(){
        return new LoginPage();
    }
    public static ListaProdutosPage paginaListaProduto(){
        return new ListaProdutosPage();
    }
}
