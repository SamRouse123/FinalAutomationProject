Feature: Basket
  Scenario: Removing Items From Basket

Given I am on the homepage
  When I click on the item of purchase
  And I add the item to the cart and I proceed to checkout
  Then the current basket will be empty