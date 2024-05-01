package core;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver browser;

    public static WebDriver getBrowser() {
        return browser;
    }
    public static void initializeDriver() throws Exception {
        String navegador = System.getProperty("browser");

        if (navegador == null){navegador = "chrome";}

        switch (navegador){
            case "chrome":
                browser = new ChromeDriver();
                break;
            case "chrome-ci":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                browser = new ChromeDriver(chromeOptions);
                break;
            case "edge":
                browser = new EdgeDriver();
                break;
            case "firefox":
                browser = new FirefoxDriver();
                break;
            default:
                throw new Exception("Não há implementação para o navegador " + navegador + ".");
        }

        String screen = System.getProperty("screen");
        if (screen == null) { screen = "desktop";}

        int width = screen.equals("mobile") ? 390 : 1366;
        int height = screen.equals("mobile") ? 844 : 768;

        browser.manage().window().setSize(new Dimension(width, height));
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
