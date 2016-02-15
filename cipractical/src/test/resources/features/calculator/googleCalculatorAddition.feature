Feature: Check addition in Google calculator
  In order to verify that google calculator works correctly
  As a user of google
  I should be able to get correct addition results

  Scenario: Standard addition
    Given I open google
    When I enter "2+2" in search textbox
    Then I should get result as "4"
  
  Scenario: Addition of negative numbers
    Given I open google
    When I enter "2+-2" in search textbox
    Then I should get result as "0"