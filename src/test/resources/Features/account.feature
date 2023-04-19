Feature: Account page

  Background:
    Given I am on the homepage
    When I click on login


  Scenario: Creating Account
    Given I click on create account
    When I click Mr social title button
    And I fill out the information table
      | First name | Samuel              |
      | Last name  | Rouse               |
      | Email      | Test5@test.gmail.com |
      | Password   | test123             |
      | Birthday   | 01/01/1990          |
    Then I will be logged in as a new user

