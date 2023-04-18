<<<<<<< HEAD
Feature: Basket page

  Scenario: Adding items to cart
    Given I am on the category page
    When I click blouse
    And I click add 1 blouse to cart
    Then I will see a pop up confirming ive added 1 item to the basket
=======
Feature: Basket

  Scenario: Increasing quantity of item in basket
    Given I am on the homepage
    When I select an item
    And Click add to cart button and proceed to checkout
    And I increase the quantity of item
    Then I will have another item
>>>>>>> origin/master
