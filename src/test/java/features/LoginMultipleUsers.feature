Feature:  Login of nopCommerce application

  Scenario Outline:  verify login with valid credentials
    Given i nevigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigate to home page
    When  i click on login link from the navbar
    Then  i should be nevigate to login page
    When  i enter Email as "<email>"
    And   i enter password as "<password>"
    And   i click on login Button
    Then  i should be logged in successfully

    Examples:
      | email          | password |
      | abc1@gmail.com | 12345678 |
      | abc2@gmail.com | 12345678 |
      | abc3@gmail.com | 12345678 |
