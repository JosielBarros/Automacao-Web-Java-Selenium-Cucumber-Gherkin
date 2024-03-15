package features.pages.lojinha;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static support.hooks.Environment.browser;

public class BasePage {
    protected String PATH = "http://165.227.93.41/lojinha-web/v2/";
    public BasePage(){
        PageFactory.initElements(browser, this);
    }
    public String capturarTextoDoElemento(WebElement elemento){
        return elemento.getText();
    }
}
