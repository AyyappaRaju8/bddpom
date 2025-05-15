@tagTwo
Feature: Extract info from home page
  After login we would be in home page where we should extract info

  @tag2
  Scenario: Check head text is there
    Given I am at the home page
    And I extract text from the page
    Then I would do nothing