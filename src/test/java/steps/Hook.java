package steps;

import base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObject.HomePage;

public class Hook
{

    @Before
    public void driverSetup()
    {
        BasePage.setup();
    }

    @After
    public void closeDriver()
    {
        BasePage.tearDown();
    }


}
