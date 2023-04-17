Feature: checkout successfully

  Scenario: Going to checkout from store
    Given I am on the Shopping Cart Page and I proceed to checkout
    When I fill in my personal information
      | First name            | Testing            |
      | Last name             | Tester             |
      | Email                 | Tester11@test.com  |
    And provide my address and shipping method

      | Address 1             | 123 Test St        |
      | City                  | San Francisco      |
      | Postcode              | 12345              |

#    Then I can make my payment

