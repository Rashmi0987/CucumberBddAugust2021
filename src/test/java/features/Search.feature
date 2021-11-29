Feature: Search product of nopCommerce

  @ui
  Scenario: Verify search product
    Given i nevigate to url "https://demo.nopcommerce.com/"
    Then  i should be navigate to home page
    When  i enter text in search text box as "mac"
    And   i click on search button
    Then  i should be able to see the search result as per search query