package pages.lojinha;

import core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected String PATH = "http://165.227.93.41/lojinha-web/v2/";
    public BasePage(){
        PageFactory.initElements(Driver.getBrowser(), this);
    }
    public String capturarTextoDoElemento(WebElement elemento){
        return elemento.getText();
    }
}
