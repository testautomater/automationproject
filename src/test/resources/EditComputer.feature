@e2e @edit
Feature: Checking feature of updating computer

  @editComputer
  Scenario: As a user I want to edit computer
    Given User click on Add a new computer button
    When User enters computer name "APTECH"
    And User enters Introduced date
    And User enters discontinued date
    And User selects a company name "Thinking Machines"
    And User submit the form
    And Users is notified with success alert message
    And User enters computer name "APTECH" in search box
    And User submit search button
    And User click on searched computer
    When User edits the computer name to "APTECHEDITED"
    And User Click on Save this Computer button
    Then Users is notified with success alert message