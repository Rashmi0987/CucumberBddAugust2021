package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage
{
    WebDriver driver;

    //locator
    @FindBy(xpath = "//button[@class='button-2 product-box-add-to-cart-button'][1]")
    public WebElement jewelryRentBtn;




    //constructor
    public JewelryPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //actions
    public void clickJewelryElegantGemstoneNecklaceBtn()
    {
        jewelryRentBtn.click();
        driver.navigate().refresh();
        String getPageName = driver.getPageSource();
        System.out.println("Page Name " + getPageName);
    }



}
