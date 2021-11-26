Feature: Registration of nopCommerce application

@ui
  Scenario: Verify the registration by filling data in all the mandatory fields
    Given i nevigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigate to home page
    When  i click on register link from the navbar
    Then  i should be nevigate to register page
    When  i enter firstName  as "Sara"
    And   i enter lastName  as "Verma"
    And   i enter Email as "sarav2@nop.com"
    And   i enter password as "12345678"
    And   i enter confirmPassword as "12345678"
    And   i click on register Button
    Then  i should be registered successfully

