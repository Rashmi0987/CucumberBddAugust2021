package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
    WebDriver driver;

    //locators
    @FindBy(id = "FirstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "LastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "Email")
    public WebElement emailTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPasswordTextBox;

    @FindBy(id = "register-button")
    public WebElement registerBtn;


    //constructor
    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    //actions
    public void enterFirstName(String firstName)
    {
        firstNameTextBox.sendKeys(firstName);
    }

    public void enterLastName(String lastName)
    {
        lastNameTextBox.sendKeys(lastName);
    }

    public void enterEmail(String em)
    {
        emailTextBox.sendKeys(em);
    }

    public void enterPassword(String pw)
    {
        passwordTextBox.sendKeys(pw);
    }

    public void enterConfirmPassword(String confpw)
    {
        confirmPasswordTextBox.sendKeys(confpw);
    }

    public void clickRegisterBtn()
    {
        registerBtn.click();
    }



}
