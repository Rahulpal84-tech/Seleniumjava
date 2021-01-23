
@SmokeFeature
Feature: test login functionality
  @smoketest
  Scenario: Check login is successful with valid credentials
    Given browser is open
    And  is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to login page
