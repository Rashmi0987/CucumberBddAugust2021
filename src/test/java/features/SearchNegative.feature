Feature: Search product of nopCommerce

  @ui
  Scenario: Verify search product without enter any text
    Given i nevigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigate to home page
    When  i click on search button
    Then  i should be able to see the message "Please enter some search keyword"