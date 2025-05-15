@tagThree
Feature: Edit into account settings
  Edit into account settings

  @tag1
  Scenario Outline: Edit into account settings
    Given I am at the homepage
    When I click onto edit account settings
    And I go to the account setting page
    And I change <lastname>
    And I click on continue
    Then I would be navigated to home page
    
    Examples:
    |lastname	|
    |Rahul M	|
    |Test Name|
    |Sunitha P|
    
    
   