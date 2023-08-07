@smoke
Feature: F01_Register
  As a guest user
  I want to register for a new account
  So that I can access the website's features

  Scenario: Guest user could register with valid data successfully
    Given the user is on the registration page
    When the user selects their gender
    And enters their first name "automation" and last name "tester"
    And  enters their birthday
    And enters their email address test@example.com
    And enters a password and confirms it with
    And clicks on the register button
    Then a success message is displayed