Feature: Basket

  Scenario: Increasing quantity of item in basket
    Given I am on the homepage
    When I select an item
    And Click add to cart button and proceed to checkout
    And I increase the quantity of item
    Then I will have another item
