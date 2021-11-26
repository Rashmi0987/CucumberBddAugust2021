Feature:  Community Poll of nopCommerce application

  Scenario:  verify Community Poll
    Given i nevigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigate to home page
    When  i should be select community poll excellent radio button
    And   i click on vote button
    When  i should be select community poll good radio button
    And   i click on vote button
    When  i should be select community poll poor radio button
    And   i click on vote button
    When  i should be select community poll very poor radio button
    And   i click on vote button
    Then  i should be voted successfully


