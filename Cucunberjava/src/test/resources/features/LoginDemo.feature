
Feature: feature to test login functionality
  
  Scenario: Check login is successful with valid credentials
    Given broser is open
    And user is on login page
    When user enters username and password
    Then user is navigated to home page
