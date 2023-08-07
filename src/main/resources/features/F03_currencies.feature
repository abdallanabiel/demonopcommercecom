@smoke
Feature: F02_currencies | users could change to Euro

  Scenario: users could change to Euro

    When user click on dropdown list of currencies
    And user choose euro
    Then verify euro symbol