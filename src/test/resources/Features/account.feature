Feature: Account page

  Background:
    Given I am on the homepage
    When I click on login


  Scenario: Creating Account
    Given I click on create account
    When I click Mr social title button
    And I fill out the information table
    | First Name | |
    | Last Name  | |
    | Email | |
    | Password  | |
    | Birthdate | |

