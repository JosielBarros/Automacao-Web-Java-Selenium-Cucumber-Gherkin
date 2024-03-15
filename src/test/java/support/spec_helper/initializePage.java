package support.spec_helper;

import features.pages.lojinha.ListaProdutosPage;
import features.pages.lojinha.LoginPage;

public class initializePage {
    public static LoginPage paginaLogin(){
        return new LoginPage();
    }
    public static ListaProdutosPage paginaListaProduto(){
        return new ListaProdutosPage();
    }
}
