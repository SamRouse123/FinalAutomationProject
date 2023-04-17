Feature: checkout successfully

  Scenario: Going to checkout from store
    Given I am on the Shopping Cart Page and I proceed to checkout
    When I fill in my personal information,
    And I fill in my address, address and shipping method
    Then I can make my payment

