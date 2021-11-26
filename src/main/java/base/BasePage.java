package base;

import com.sun.source.tree.TryTree;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pageObject.*;

import java.io.FileInputStream;
import java.util.Properties;

public class BasePage
{
    public static WebDriver driver;
    public static Properties prop;
    public static HomePage homePage;
    public static RegisterPage registerPage;
    public static LoginPage loginPage;
    public static JewelryPage jewelryPage;
    //public static SearchProduct searchProduct;
    public static ElegantGemstoneNecklaceRentalPage elegantGemstoneNecklaceRentalPage;

    public static void setup()
    {
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

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
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
