Feature:  Newsletter Subscription of nopCommerce application

  Scenario:  verify Newsletter Subscription with valid credentials
    Given i nevigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigate to home page
    When  i enter subscribe Email as "abc@nop.com"
    And   i click on subscribe button
    Then  i should be subscribed successfully
