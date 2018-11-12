@e2e @delete
Feature: Checking feature of deleting computer

  @deleteComputer
  Scenario: As a user I want to delete computer
    Given User click on Add a new computer button
    When User enters computer name "DELETE-APTECH"
    And User enters Introduced date
    And User enters discontinued date
    And User selects a company name "Thinking Machines"
    And User submit the form
    And Users is notified with success alert message
    And User enters computer name "DELETE-APTECH" in search box
    And User submit search button
    And User click on searched computer
    When User clicks on Delete This computer
    Then Users is notified with success alert message