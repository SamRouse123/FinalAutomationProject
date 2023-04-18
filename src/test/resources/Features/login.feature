Feature: Login Page

  Scenario: Logging into Ten10 store
    Given I am on the homepage
    When I click on Sign In
    And I use credentials email "test@tester1.com" and password "test123" to sign in
    Then I will be logged in as "test tester"