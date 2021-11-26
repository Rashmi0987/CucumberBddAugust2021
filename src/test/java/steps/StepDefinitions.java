package steps;
import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pageObject.HomePage;

public class StepDefinitions
{

    String homePageExpetedTitle = "nopCommerce demo store";
    String homePageActualTitle;

    String registerPageExpetedTitle = "nopCommerce demo store. Register";
    String registerPageActualTitle;

    String loginPageExpetedTitle = "nopCommerce demo store. Login";
    String loginPageActualTitle;

    String jewelryPageExpetedTitle = "nopCommerce demo store. Jewelry";
    String jewelryPageActualTitle;

    String elegantGemstoneNecklaceRentalPageExpetedTitle = "nopCommerce demo store. Elegant Gemstone Necklace (rental)";
    String elegantGemstoneNecklaceRentalPageActualTitle;

    String searchProductExpetedPageTitle = "nopCommerce demo store. Search";
    String searchProductActualPageTitle;

    @Given("i nevigate to url {string}")
    public void i_nevigate_to_url(String url)
    {
        BasePage.nevigateToUrl(url);
    }

    @Then("i should be navigate to home page")
    public void i_should_be_navigate_to_home_page()
    {
        //Assertions
//       homePageActualTitle  = BasePage.getPageTitle();
//       Assertions.assertEquals(homePageExpetedTitle, homePageActualTitle);
    }

    // register

    @When("i click on register link from the navbar")
    public void i_click_on_register_link_from_the_navbar()
    {
        BasePage.homePage.clickRegisterLink();

    }

    @Then("i should be nevigate to register page")
    public void i_should_be_nevigate_to_register_page()
    {
        //Assertions
//        registerPageActualTitle = BasePage.getPageTitle();
//        Assertions.assertEquals(registerPageExpetedTitle, registerPageActualTitle);
    }



    @When("i enter firstName  as {string}")
    public void i_enter_first_name_as(String firstName)
    {
        BasePage.registerPage.enterFirstName(firstName);
    }

    @When("i enter lastName  as {string}")
    public void i_enter_last_name_as(String lastName)
    {
        BasePage.registerPage.enterLastName(lastName);
    }


    @When("i enter Email as {string}")
    public void i_enter_email_as(String email)
    {
        BasePage.registerPage.enterEmail(email);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String pw)
    {
        BasePage.registerPage.enterPassword(pw);
    }

    @When("i enter confirmPassword as {string}")
    public void i_enter_confirm_password_as(String confpw)
    {
        BasePage.registerPage.enterConfirmPassword(confpw);
    }

    @When("i click on register Button")
    public void i_click_on_register_button()
    {
        BasePage.registerPage.clickRegisterBtn();
    }

    @Then("i should be registered successfully")
    public void i_should_be_registered_successfully()
    {

    }


    //login

    @When("i click on login link from the navbar")
    public void i_click_on_login_link_from_the_navbar()
    {
        BasePage.homePage.clickLoginLink();
    }

    @Then("i should be nevigate to login page")
    public void i_should_be_nevigate_to_login_page()
    {
        loginPageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(loginPageExpetedTitle, loginPageActualTitle);
    }
    @When("i click on login Button")
    public void i_click_on_login_button()
    {
        BasePage.loginPage.clickLoginButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {

    }

    //Subscribe

    @When("i enter subscribe Email as {string}")
    public void i_enter_subscribe_email_as(String subEmail)
    {
       BasePage.homePage.entersubscribeText(subEmail);
    }

    @When("i click on subscribe button")
    public void i_click_on_subscribe_button()
    {
        BasePage.homePage.clicksubscribeBtn();
    }

    @Then("i should be subscribed successfully")
    public void i_should_be_subscribed_successfully()
    {

    }

    //for community poll


    @When("i should be select community poll excellent radio button")
    public void i_should_be_select_community_poll_excellent_radio_button()
    {
        BasePage.homePage.selectExcellentVoteRadoiBtn();
    }

    @When("i should be select community poll good radio button")
    public void i_should_be_select_community_poll_good_radio_button()
    {
//        BasePage.homePage.selectGoodVoteRadoiBtn();
    }

    @When("i should be select community poll poor radio button")
    public void i_should_be_select_community_poll_poor_radio_button()
    {
//        BasePage.homePage.selectPoorVoteRadoiBtn();
    }

    @When("i should be select community poll very poor radio button")
    public void i_should_be_select_community_poll_very_poor_radio_button()
    {
//        BasePage.homePage.selectVeryPoorVoteRadoiBtn();
    }



    @When("i click on vote button")
    public void i_click_on_vote_button()
    {
        BasePage.homePage.clickVoteButton();
    }

    @Then("i should be voted successfully")
    public void i_should_be_voted_successfully()
    {

    }

    //for jewelry link

    @When("i click on jewelry link from the secondary navbar")
    public void i_click_on_jewelry_link_from_the_secondary_navbar()
    {
        BasePage.homePage.clickJewelryLink();
    }

    @Then("i should be nevigate to jewelry page")
    public void i_should_be_nevigate_to_jewelry_page()
    {
        jewelryPageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(jewelryPageExpetedTitle, jewelryPageActualTitle);
    }


    @When("i click on rent button of Elegant Gemstone Necklace")
    public void i_click_on_rent_button_of_elegant_gemstone_necklace()
    {
        BasePage.jewelryPage.clickJewelryElegantGemstoneNecklaceBtn();
    }


    @Then("i should be nevigate to Elegant Gemstone Necklace rental page ssuccessfully")
    public void i_should_be_nevigate_to_elegant_gemstone_necklace_rental_page_ssuccessfully()
    {
        elegantGemstoneNecklaceRentalPageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(elegantGemstoneNecklaceRentalPageExpetedTitle, elegantGemstoneNecklaceRentalPageActualTitle);
    }


    // for Elegant Gemstone Necklace Rental


    // search product

    @When("i enter text in search text box as {string}")
    public void i_enter_text_in_search_text_box_as(String search)
    {
         BasePage.homePage.enterSearchText(search);

    }

    @When("i click on search button")
    public void i_click_on_search_button()
    {
        BasePage.homePage.clickSearchBtn();
    }

    @Then("i should be able to see the search result as per search query")
    public void i_should_be_able_to_see_the_search_result_as_per_search_query()
    {
        searchProductActualPageTitle = BasePage.getPageTitle();
        Assertions.assertEquals(searchProductExpetedPageTitle, searchProductActualPageTitle);
    }

    // search product negative scenario

    @Then("i should be able to see the message {string}")
    public void i_should_be_able_to_see_the_message(String string)
    {
       BasePage.homePage.clickWithoutTextSearch();
    }

// Register1


    @Given("i am on the nopCommerce home page get page title")
    public void i_am_on_the_nop_commerce_home_page_get_page_title()
    {
        BasePage.load();
        homePageActualTitle  = BasePage.getPageTitle();
        Assertions.assertEquals(homePageExpetedTitle, homePageActualTitle);

    }

    @When("i click on register link from the navbar and get page title")
    public void i_click_on_register_link_from_the_navbar_and_get_page_title()
    {
        BasePage.homePage.clickRegisterLink();
        registerPageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(registerPageExpetedTitle, registerPageActualTitle);

    }

    @When("i select gender as male")
    public void i_select_gender_as_male() {

    }

    @When("i enter firstName lastName email password confPassword")
    public void i_enter_first_name_last_name_email_password_conf_password(io.cucumber.datatable.DataTable dataTable)
    {

    }

    @When("i enter date of birth")
    public void i_enter_date_of_birth()
    {

    }
  /*  @When("i click on register button")
    public void i_click_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


   */


}
