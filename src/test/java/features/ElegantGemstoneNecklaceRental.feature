Feature:  ElegantGemstoneNecklaceRental of nopCommerce application


  Scenario:  verify ElegantGemstoneNecklaceRental feature
    Given  i click on jewelry link from the secondary navbar
    Then  i should be nevigate to jewelry page
    When  i click on rent button of Elegant Gemstone Necklace
    Then  i should be nevigate to Elegant Gemstone Necklace (rental) page
    When  i should be select the rented starting date of jewelry
    And   i should be select the rented ending date of jewelry
    And   i click on rent button
    Then  i should be added jewelry in cart successfully

