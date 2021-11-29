package base;

import com.sun.source.tree.TryTree;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObject.*;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BasePage
{
    public static WebDriver driver;
    public static final String AUTOMATE_USERNAME = "rashmi_OCRM3N";
    public static final String AUTOMATE_ACCESS_KEY = "KHryvyEhM3SXYyTi25B5";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static Properties prop;
    public static HomePage homePage;
    public static RegisterPage registerPage;
    public static LoginPage loginPage;
    public static JewelryPage jewelryPage;
    //public static SearchProduct searchProduct;
    public static ElegantGemstoneNecklaceRentalPage elegantGemstoneNecklaceRentalPage;

    public static void setup() throws MalformedURLException {
        prop = new Properties();
        try
        {
            FileInputStream fs = new FileInputStream("src/main/java/config/data.properties");
            prop.load(fs);
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "Monterey");
        caps.setCapability("resolution", "1920x1080");
        caps.setCapability("browser", "Edge");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("os", "OS X");
        caps.setCapability("name", "Browser Stack Test"); // test name
        caps.setCapability("build", "BStack Build Number 3"); // CI/CD job or build name
        driver = new RemoteWebDriver(new URL(URL), caps);


        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        jewelryPage = new JewelryPage(driver);
        elegantGemstoneNecklaceRentalPage = new ElegantGemstoneNecklaceRentalPage(driver);
        //searchProduct = new SearchProduct(driver);


    }

    public static void tearDown()
    {
        driver.quit();
    }

    public static void nevigateToUrl(String url)
    {
        driver.navigate().to(url);
    }

    public static String getPageTitle()
    {
        return driver.getTitle();
    }

    public static void load()
    {
        driver.navigate().to(prop.getProperty("url"));
    }


}
