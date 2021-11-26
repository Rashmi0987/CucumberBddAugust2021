package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;

    //locator
    @FindBy(id = "Email")
    public WebElement loginEmailTextBox;

    @FindBy(id = "Password")
    public WebElement loginPassTextBox;

    @FindBy(className = "login-button")
    public WebElement loginButton;


    //constructor
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //actions

    public void enterLoginEmail(String email)
    {
        loginEmailTextBox.sendKeys(email);
    }

    public void enterLoginPassword(String pw)
    {
        loginPassTextBox.sendKeys(pw);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

}
