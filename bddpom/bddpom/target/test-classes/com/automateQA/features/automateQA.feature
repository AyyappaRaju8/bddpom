@tagOne
Feature: Login into awesomeqa application
  Login into awesomeqa application

  @tag1
  Scenario: Check login for correct details
    Given I am at the login page
    When I enter my correct email
    And I enter my correct password
    And I click on login button
    Then I would be navigated to home page