Feature:  Login of nopCommerce application

  @ui
  Scenario:  verify login with valid credentials
    Given i nevigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigate to home page
    When  i click on login link from the navbar
    Then  i should be nevigate to login page
    When  i enter Email as "sarav@nop.com"
    And   i enter password as "12345678"
    And   i click on login Button
    Then  i should be logged in successfully