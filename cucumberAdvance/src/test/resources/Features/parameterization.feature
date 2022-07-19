#Parameterization and data drive
Feature: feature to test functionality with parameter

  Scenario Outline: Check login is successfull with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login page
    Then user is navigated to the home page <country>

    Examples: 
      | username | password | country |
      | shweta   |    12345 | Russia  |
      | arun     |    12345 | India   |
