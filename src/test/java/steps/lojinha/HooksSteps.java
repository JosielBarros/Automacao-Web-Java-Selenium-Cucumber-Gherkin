package steps.lojinha;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static core.Driver.initializeDriver;

public class HooksSteps {
    @Before
    public void setUp() throws Exception {
        initializeDriver();
    }
    @After
    public void tearDown(){
        Driver.getBrowser().quit();
    }
}
