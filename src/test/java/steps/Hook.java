package steps;

import base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObject.HomePage;

import java.net.MalformedURLException;

public class Hook
{

    @Before
    public void driverSetup() throws MalformedURLException {
        BasePage.setup();
    }

    @After
    public void closeDriver()
    {
        BasePage.tearDown();
    }


}
