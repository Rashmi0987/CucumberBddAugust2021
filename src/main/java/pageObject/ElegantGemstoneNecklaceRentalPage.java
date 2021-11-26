package pageObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElegantGemstoneNecklaceRentalPage
{

    WebDriver driver;
    // locators


    @FindBy(xpath = "//input[@id='rental_start_date_40']")
    public WebElement renterStartDate;

    @FindBy(className = "ui-state-default ui-state-active ui-state-hover")
    public WebElement selectRenterStartDate;

    @FindBy(xpath = "//input[@class='datepicker hasDatepicker']")
    public WebElement renterEndDate;

    @FindBy(className = "ui-state-active")
    public WebElement selectRenterEndDate;

    @FindBy(xpath = "//button[@id='add-to-cart-button-40']")
    public WebElement rentBtn;

    @FindBy(xpath = "//p[@class='content']")
    public WebElement confMsg;

    //constructor
    public ElegantGemstoneNecklaceRentalPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    // actions

    public void clickRenterStartDate()
    {
        renterStartDate.click();
    }

    public void setSelectRenterStartDate()
    {
        selectRenterStartDate.click();
    }

    public void clickRenterEndtDate()
    {
        renterEndDate.click();
    }

    public void setSelectRenterEndDate()
    {
        selectRenterEndDate.click();
    }

    public void clickRentBtn()
    {
        rentBtn.click();
    }

    public void getConfirmMsg()
    {
        confMsg.getText();
    }


}
