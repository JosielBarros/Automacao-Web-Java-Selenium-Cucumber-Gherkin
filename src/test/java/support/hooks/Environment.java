package support.hooks;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Environment {
    public static WebDriver browser;
    public static void initializeDriver(){
        browser = new ChromeDriver();
        browser.manage().window().setSize(new Dimension(1366, 768));
        browser.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
}
