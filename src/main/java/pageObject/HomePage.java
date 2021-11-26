package pageObject;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    WebDriver driver;

    //locators
    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(linkText = "Log in")
    public WebElement loginLink;


    //locator for subscribe

    @FindBy(className = "newsletter-subscribe-text")
    public WebElement subscribeTextBox;

    @FindBy(id = "newsletter-subscribe-button")
    public WebElement subscribeBtn;

    // locators for community poll radio buttons

    @FindBy(xpath = "//input[@id='pollanswers-1']")
    public WebElement voteExcellentRadioBtn;

    @FindBy(xpath = "//input[@id='pollanswers-2']")
    public WebElement voteGoodRadioBtn;

    @FindBy(xpath = "//input[@id='pollanswers-3']")
    public WebElement votePoorRadioBtn;

    @FindBy(xpath = "//input[@id='pollanswers-4']")
    public WebElement voteVeryPoorRadioBtn;

    @FindBy(className = "vote-poll-button")
    public WebElement voteButton;

    //locator for jewelry secondary navbar
    @FindBy(linkText = "Jewelry")
    public WebElement jewelryLink;

    //locator for search
    @FindBy(className = "ui-autocomplete-input")
    public WebElement searchTextBox;

    @FindBy(className = "search-box-button")
    public WebElement searchBtn;

    //search Product negative scenario




    //constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //actions
    public void clickRegisterLink()
    {
        registerLink.click();
    }


    public void clickLoginLink()
    {
        loginLink.click();
    }


    //action for subscribe

    public void entersubscribeText(String subEmail)
    {
        subscribeTextBox.sendKeys(subEmail);
    }

    public void clicksubscribeBtn()
    {
        subscribeBtn.click();
    }

    //action for Community poll

    public void selectExcellentVoteRadoiBtn()
    {
        voteExcellentRadioBtn.click();
    }

    public void selectGoodVoteRadoiBtn()
    {
        voteGoodRadioBtn.click();
    }

    public void selectPoorVoteRadoiBtn()
    {
        votePoorRadioBtn.click();
    }

    public void selectVeryPoorVoteRadoiBtn()
    {
        voteVeryPoorRadioBtn.click();
    }

    public void clickVoteButton()
    {
        voteButton.click();
    }

    //action for jewelry secondary navbar
    public void clickJewelryLink()
    {
        jewelryLink.click();
    }

    //action for search

    public void enterSearchText(String search)
    {
        searchTextBox.sendKeys(search);
    }

    public void clickSearchBtn()
    {
        searchBtn.click();
    }

    //action for search Product negative scenario

    public void clickWithoutTextSearch()
    {
        driver.switchTo().alert().getText();
    }



}
