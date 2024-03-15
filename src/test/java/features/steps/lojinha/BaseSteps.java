package features.steps.lojinha;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import support.hooks.Environment;

import static support.hooks.Environment.browser;
import static support.hooks.Environment.initializeDriver;

public class BaseSteps {
    @Before
    public void setUp(){
        initializeDriver();
    }
    @After
    public void tearDown(){
        browser.quit();
    }
}
