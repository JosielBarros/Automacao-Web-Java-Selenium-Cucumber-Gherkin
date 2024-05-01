package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver browser;

    public static WebDriver getBrowser() {
        return browser;
    }
    public static void initializeDriver(){
        browser = new ChromeDriver();
        browser.manage().window().setSize(new Dimension(1366, 768));
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

}
