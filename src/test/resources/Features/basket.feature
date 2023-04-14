Feature: Basket page

  Scenario: Adding items to cart
    Given I am on the category page
    When I click blouse
    And I click add 1 blouse to cart
    Then I will see a pop up confirming ive added 1 item to the basket